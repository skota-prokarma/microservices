package kota.microservices.ratings.info.service.dto;

public class RatingDto {
    private int rating;

    public RatingDto(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
