package com.example.demo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Movie {

    private String title;
    private int minutes;
    private String genre;
    private float rating;
    private int metascore;
    private String description;
    private int votes;
    private float gross;

    @JsonProperty("Year")
    private String year;
    @JsonProperty("Credits")
    private Cast[] credits;

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("Minutes")
    public int getMinutes() {
        return minutes;
    }

    @JsonProperty("minutes")
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @JsonProperty("Genre")
    public String getGenre() {
        return genre;
    }

    @JsonProperty("genre")
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @JsonProperty("Rating")
    public float getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(float rating) {
        this.rating = rating;
    }

    @JsonProperty("Metascore")
    public int getMetascore() {
        return metascore;
    }

    @JsonProperty("metaScore")
    public void setMetascore(int metascore) {
        this.metascore = metascore;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("Votes")
    public int getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(int votes) {
        this.votes = votes;
    }

    @JsonProperty("Gross")
    public float getGross() {
        return gross;
    }

    @JsonProperty("gross")
    public void setGross(float gross) {
        this.gross = gross;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Cast[] getCredits() {
        return credits;
    }

    public void setCredits(Cast[] credits) {
        this.credits = credits;
    }
    @JsonInclude(JsonInclude.Include.NON_NULL)
    static class Cast {

        @JsonProperty("Person")
        private Person person;

        public Person getPerson() {
            return person;
        }

        public void setPerson(Person person) {
            this.person = person;
        }

        @JsonInclude(JsonInclude.Include.NON_NULL)
        static class Person {

            private String role;
            @JsonProperty("FirstName")
            private String firstName;
            @JsonProperty("LastName")
            private String lastName;

            @JsonProperty("Role")
            public String getRole() {
                return role;
            }
            @JsonProperty("role")
            public void setRole(String role) {
                this.role = role;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }
        }
    }

}
