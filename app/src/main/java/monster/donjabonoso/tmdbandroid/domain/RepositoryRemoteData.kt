package monster.donjabonoso.tmdbandroid.domain

import monster.donjabonoso.tmdbandroid.domain.models.ModelMovieDetails
import monster.donjabonoso.tmdbandroid.domain.models.ModelMoviesResponse
import monster.donjabonoso.tmdbandroid.utils.Resource

interface RepositoryRemoteData {
    suspend fun getMovieDetails(movieId: Int): Resource<ModelMovieDetails>

    suspend fun getPopularMovies(): Resource<ModelMoviesResponse>

    suspend fun getTopRatedMovies(): Resource<ModelMoviesResponse>

    suspend fun getUpcomingMovies(): Resource<ModelMoviesResponse>

    suspend fun getNowPlayingMovies(): Resource<ModelMoviesResponse>

}