/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author kiplagat
 */
public class RatingRegister {

    private Map<Film, List<Rating>> ratings;
    private Map<Person, Map<Film, Rating>> personalRatings;

    public RatingRegister() {
        this.ratings = new HashMap<Film, List<Rating>>();
        this.personalRatings = new HashMap<Person, Map<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!this.ratings.containsKey(film)) {
            this.ratings.put(film, new ArrayList<Rating>());
        }
        this.ratings.get(film).add(rating);
    }

    public List<Rating> getRatings(Film film) {
        return this.ratings.get(film);
    }

    public Map<Film, List<Rating>> filmRatings() {
        return this.ratings;
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!this.personalRatings.containsKey(person)) {
            this.personalRatings.put(person, new HashMap<Film, Rating>());
            this.personalRatings.get(person).put(film, rating);
            addRating(film, rating);
        } else if (!this.personalRatings.get(person).containsKey(film)) {
            this.personalRatings.get(person).put(film, rating);
            addRating(film, rating);
        }
    }

    public Rating getRating(Person person, Film film) {
        if (!this.personalRatings.containsKey(person)) {
            return Rating.NOT_WATCHED;
        } else if (!this.personalRatings.get(person).containsKey(film)) {
            return Rating.NOT_WATCHED;
        }

        return this.personalRatings.get(person).get(film);
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (!this.personalRatings.containsKey(person)) {
            return new HashMap();
        }
        return this.personalRatings.get(person);
    }

    public List<Person> reviewers() {
        return new ArrayList<Person>(personalRatings.keySet());
    }

}
