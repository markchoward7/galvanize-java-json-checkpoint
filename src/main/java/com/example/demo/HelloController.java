package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() { return "home"; }

    @GetMapping("/movies/movie")
    public Movie getMovie() {
        Movie godfather = new Movie();
        godfather.setTitle("The Godfather");
        godfather.setMinutes(175);
        godfather.setGenre("Crime, Drama");
        godfather.setRating(9.2f);
        godfather.setMetascore(100);
        godfather.setDescription("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.");
        godfather.setVotes(1561591);
        godfather.setGross(134.97f);
        godfather.setYear("1972");

        Movie.Cast[] cast = new Movie.Cast[5];

        Movie.Cast.Person person1 = new Movie.Cast.Person();
        person1.setRole("Director");
        person1.setFirstName("Francis Ford");
        person1.setLastName("Copolla");

        Movie.Cast.Person person2 = new Movie.Cast.Person();
        person2.setRole("Star");
        person2.setFirstName("Marlon");
        person2.setLastName("Brando");

        Movie.Cast.Person person3 = new Movie.Cast.Person();
        person3.setRole("Star");
        person3.setFirstName("Al");
        person3.setLastName("Pacino");

        Movie.Cast.Person person4 = new Movie.Cast.Person();
        person4.setRole("Star");
        person4.setFirstName("James");
        person4.setLastName("Caan");

        Movie.Cast.Person person5 = new Movie.Cast.Person();
        person5.setRole("Star");
        person5.setFirstName("Diane");
        person5.setLastName("Keaton");

        cast[0] = new Movie.Cast();
        cast[1] = new Movie.Cast();
        cast[2] = new Movie.Cast();
        cast[3] = new Movie.Cast();
        cast[4] = new Movie.Cast();
        cast[0].setPerson(person1);
        cast[1].setPerson(person2);
        cast[2].setPerson(person3);
        cast[3].setPerson(person4);
        cast[4].setPerson(person5);
        godfather.setCredits(cast);

        return godfather;
    }

    @PostMapping("/movies/gross/total")
    public Map<String, Float> calcTotal(@RequestBody Movie[] movies) {
        Map<String, Float> total = new HashMap<>();
        float sum = 0f;
        for (Movie movie : movies) {
            sum += movie.getGross();
        }
        total.put("result", sum);
        return total;
    }
}
