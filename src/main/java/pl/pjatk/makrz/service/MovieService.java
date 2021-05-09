package pl.pjatk.makrz.service;

import org.springframework.stereotype.Service;
import pl.pjatk.makrz.model.Category;
import pl.pjatk.makrz.model.Movie;

import java.util.Date;
import java.util.List;

@Service
public class MovieService {
    public List<Movie> findAll(){
        return List.of(new Movie(1L, Category.Akcja,"testowy",new Date(),5));
    }

    public Movie findById(long id){
        return new Movie(id,Category.Dramat,"nowy",new Date(),4);
    }

    public Movie addMovie(Movie movie){
        return movie;
    }

    public Movie updateMovie(long id,Movie movie){
        return movie;
    }

    public void deleteMovie(long id){

    }

}
