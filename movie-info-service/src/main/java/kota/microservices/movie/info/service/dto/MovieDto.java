package kota.microservices.movie.info.service.dto;

import java.util.Date;

public class MovieDto {
    private String name;
    private String lang;
    private String releaseDate;

    public MovieDto(String name, String lang, String releaseDate) {
        this.name = name;
        this.lang = lang;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
