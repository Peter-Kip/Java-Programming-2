/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author kiplagat
 */
public class FilmComparator implements Comparator<Film>{
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        int o1Ratings = 0;
        int o2Ratings = 0;
        
        //ratings of film o1
        for(Rating r : ratings.get(o1)){
            o1Ratings += r.getValue();
        }
        
        //ratings of film o2
        for(Rating r : ratings.get(o2)){
            o2Ratings += r.getValue();
        }
        
        int o1averageRatings = o1Ratings / ratings.size();
        int o2averageRatings = o2Ratings / ratings.size();
        
        if(o1averageRatings == o2averageRatings){
            return 0;
        }else if(o1averageRatings > o2averageRatings){
            return -1;
        }else
            return 1;   
    }
    
}
