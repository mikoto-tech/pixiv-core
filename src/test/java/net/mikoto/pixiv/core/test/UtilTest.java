package net.mikoto.pixiv.core.test;

import net.mikoto.pixiv.core.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static net.mikoto.pixiv.core.util.ReflectionUtil.getForbiddenField;
import static net.mikoto.pixiv.core.util.Sha256Util.getSha256;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilTest {
    @Test
    void Sha256UtilTest() {
        String sha256 = getSha256("LOVE YOU FOREVER, Lin.");
        assertEquals("8D410532F44ED09A0DA38F1A970E9559C3ABEFA83A376B9CB5DDEB8A045A8BA2", sha256);
    }

    @Test
    void ReflectionUtilTest() {
        List<String> forbiddenField = getForbiddenField(User.class);
        assertTrue(forbiddenField.contains("userPassword"));
    }
}
