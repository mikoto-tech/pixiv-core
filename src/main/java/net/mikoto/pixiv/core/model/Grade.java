package net.mikoto.pixiv.core.model;

/**
 * @author mikoto
 * Created at 2022/7/9, 上午8:55
 * For pixiv-core
 */
public enum Grade {
    General(0),
    R18(1),
    R18G(2);

    private final int grading;

    Grade(int grading) {
        this.grading = grading;
    }

    public int getGrading() {
        return grading;
    }
}
