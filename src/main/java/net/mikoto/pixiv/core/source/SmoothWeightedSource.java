package net.mikoto.pixiv.core.source;

import net.mikoto.pixiv.core.model.CurrentWeighted;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author mikoto
 * @date 2022/6/12 3:47
 */
public class SmoothWeightedSource<S extends CurrentWeighted> implements Source<S> {
    private final Set<S> SOURCE_SET = new HashSet<>();

    /**
     * Add a server.
     *
     * @param server The server.
     */
    @Override
    public void addServer(S server) {
        SOURCE_SET.add(server);
    }

    /**
     * Get the server.
     *
     * @return The server.
     */
    @Override
    public Object[] getServers() {
        return SOURCE_SET.toArray();
    }

    /**
     * Get the server.
     *
     * @return The server.
     */
    @Override
    public S getServer() {
        if (!SOURCE_SET.isEmpty()) {
            Iterator<S> sourceSetIterator = SOURCE_SET.iterator();

            S resultSource = sourceSetIterator.next();
            resultSource.setCurrentWeight(resultSource.getWeight() + resultSource.getCurrentWeight());
            int currentWeightSum = resultSource.getCurrentWeight();

            while (sourceSetIterator.hasNext()) {
                S source = sourceSetIterator.next();
                source.setCurrentWeight(source.getWeight() + source.getCurrentWeight());
                if (source.getCurrentWeight() > resultSource.getCurrentWeight()) {
                    resultSource = source;
                }
                currentWeightSum += source.getCurrentWeight();
            }

            resultSource.setCurrentWeight(resultSource.getCurrentWeight() - currentWeightSum);

            return resultSource;
        } else {
            return null;
        }
    }
}
