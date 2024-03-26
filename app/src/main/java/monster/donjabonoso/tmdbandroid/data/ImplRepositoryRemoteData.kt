package monster.donjabonoso.tmdbandroid.data

import monster.donjabonoso.tmdbandroid.domain.RepositoryRemoteData
import monster.donjabonoso.tmdbandroid.domain.models.ModelMovieDetails
import monster.donjabonoso.tmdbandroid.domain.models.ModelMoviesResponse
import monster.donjabonoso.tmdbandroid.utils.Resource
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ImplRepositoryRemoteData @Inject constructor(
    private val apiData: ApiData,
) : RepositoryRemoteData {
    override suspend fun getMovieDetails(movieId: Int): Resource<ModelMovieDetails> {
        return try {
            val response = apiData.getMovieDetails(movieId)
            Resource.Success(response.toModelMovieDetails())
        } catch (e: IOException) {
            e.printStackTrace()
            Resource.Error(
                e.message!!
            )
        } catch (e: HttpException) {
            e.printStackTrace()
            Resource.Error(e.message())
        }
    }

    override suspend fun getPopularMovies(): Resource<ModelMoviesResponse> {
        return try {
            val response = apiData.getPopularMovies()
            Resource.Success(response.toModelMoviesResponse())
        } catch (e: IOException) {
            e.printStackTrace()
            Resource.Error(e.message!!)
        } catch (e: HttpException) {
            e.printStackTrace()
            Resource.Error(e.message())
        }
    }

    override suspend fun getTopRatedMovies(): Resource<ModelMoviesResponse> {
        return try {
            val response = apiData.getTopRatedMovies()
            Resource.Success(response.toModelMoviesResponse())
        } catch (e: IOException) {
            e.printStackTrace()
            Resource.Error(e.message!!)
        } catch (e: HttpException) {
            e.printStackTrace()
            Resource.Error(e.message())
        }
    }

    override suspend fun getUpcomingMovies(): Resource<ModelMoviesResponse> {
        return try {
            val response = apiData.getUpcomingMovies()
            Resource.Success(response.toModelMoviesResponse())
        } catch (e: IOException) {
            e.printStackTrace()
            Resource.Error(e.message!!)
        } catch (e: HttpException) {
            e.printStackTrace()
            Resource.Error(e.message())
        }
    }

    override suspend fun getNowPlayingMovies(): Resource<ModelMoviesResponse> {
        return try {
            val response = apiData.getNowPlayingMovies()
            Resource.Success(response.toModelMoviesResponse())
        } catch (e: IOException) {
            e.printStackTrace()
            Resource.Error(e.message!!)
        } catch (e: HttpException) {
            e.printStackTrace()
            Resource.Error(e.message())
        }
    }


}