package net.mikoto.pixiv.core.model;

/**
 * @author mikoto
 * Created at 2022/7/9, 上午8:55
 * For pixiv-core
 */
public enum Grade {
    /**
     * The general grade is for all people.
     */
    General(0),

    /**
     * The R-18 grade is for a person who is over 18 years old.
     */
    R18(1),

    /**
     * The R-18G grade is for a person who is over 18 years old and have good mental ability.
     */
    R18G(2);

    private final int grading;

    Grade(int grading) {
        this.grading = grading;
    }

    public int getGrading() {
        return grading;
    }
}
