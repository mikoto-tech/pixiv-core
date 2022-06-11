package net.mikoto.pixiv.api.model;

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
}
