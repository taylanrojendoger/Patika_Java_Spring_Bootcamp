package com.example.bootcampweekthree.service.movie;

import com.example.bootcampweekthree.repository.movie.MovieDao;
import com.example.bootcampweekthree.repository.movie.MovieEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieServiceImplementation implements MovieService {
    private final MovieDao movieDao;

    @Override
    public Integer create(Movie movie) {
        MovieEntity movieEntity = movie.convertToMovieEntity();
        return movieDao.save(movieEntity);
    }

    @Override
    public Movie retrieve(Integer id) {
        MovieEntity entity = movieDao.retrieve(id);
        return Movie.convertFrom(entity);
    }

}
