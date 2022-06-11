package net.mikoto.pixiv.api.model;

import java.util.Arrays;

/**
 * @author mikoto
 * @date 2022/6/11 17:07
 */
public class AuthorProfile {
    Integer[] artworks;
    Series[] series;
    Artwork[] pickUpArtworks;

    public Integer[] getArtworks() {
        return artworks;
    }

    public void setArtworks(Integer[] artworks) {
        this.artworks = artworks;
    }

    public Series[] getSeries() {
        return series;
    }

    public void setSeries(Series[] series) {
        this.series = series;
    }

    public Artwork[] getPickUpArtworks() {
        return pickUpArtworks;
    }

    public void setPickUpArtworks(Artwork[] pickUpArtworks) {
        this.pickUpArtworks = pickUpArtworks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorProfile that = (AuthorProfile) o;
        return Arrays.equals(artworks, that.artworks) && Arrays.equals(series, that.series) && Arrays.equals(pickUpArtworks, that.pickUpArtworks);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(artworks);
        result = 31 * result + Arrays.hashCode(series);
        result = 31 * result + Arrays.hashCode(pickUpArtworks);
        return result;
    }

    @Override
    public String toString() {
        return "Mikoto-Pixiv-Generic-Data-Type[" + this.getClass().getPackage().getName() + this.getClass().getName() + "]:\nAuthorProfile{" +
                "artworks=" + Arrays.toString(artworks) +
                ", series=" + Arrays.toString(series) +
                ", pickUpArtworks=" + Arrays.toString(pickUpArtworks) +
                '}';
    }
}
