package dal;

import be.Movie;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IMovieDataAccess {

    public List<Movie> getAllMovies() throws Exception;

    public Movie createMovie(String title, int year) throws Exception;

    public void updateMovie(Movie movie) throws Exception;

    public void deleteMovie(Movie movie) throws Exception;

}
