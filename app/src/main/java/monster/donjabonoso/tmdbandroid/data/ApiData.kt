package monster.donjabonoso.tmdbandroid.data

import monster.donjabonoso.tmdbandroid.BuildConfig
import monster.donjabonoso.tmdbandroid.data.dto.DTOMovieDetails
import monster.donjabonoso.tmdbandroid.data.dto.DTOMoviesResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiData {
    @GET("/movie/{id}")
    suspend fun getMovieDetails(
        @Path("id") movieId: Int,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY
    ): DTOMovieDetails

    @GET("/movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
    ) : DTOMoviesResponse

    @GET("/movie/top_rated")
    suspend fun getTopRatedMovies(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
    ) : DTOMoviesResponse

    @GET("/movie/upcoming")
    suspend fun getUpcomingMovies(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
    ) : DTOMoviesResponse

    @GET("/movie/now_playing")
    suspend fun getNowPlayingMovies(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
    ) : DTOMoviesResponse
}