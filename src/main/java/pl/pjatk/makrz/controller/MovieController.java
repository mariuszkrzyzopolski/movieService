package pl.pjatk.makrz.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.makrz.model.Movie;
import pl.pjatk.makrz.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> findAllMovies(){
        return ResponseEntity.ok(movieService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> findMovie(@PathVariable long id){
        return ResponseEntity.ok(movieService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        return ResponseEntity.ok(movieService.addMovie(movie));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable long id,@RequestBody Movie movie){
        return ResponseEntity.ok(movieService.updateMovie(id,movie));
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> delete(@PathVariable long id){
        movieService.deleteMovie(id);
        return ResponseEntity.noContent().build();
    }
}
