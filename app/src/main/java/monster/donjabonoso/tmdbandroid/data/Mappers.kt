package monster.donjabonoso.tmdbandroid.data

import monster.donjabonoso.tmdbandroid.data.dto.DTODates
import monster.donjabonoso.tmdbandroid.data.dto.DTOMovie
import monster.donjabonoso.tmdbandroid.data.dto.DTOMovieDetails
import monster.donjabonoso.tmdbandroid.data.dto.DTOMoviesResponse
import monster.donjabonoso.tmdbandroid.domain.models.ModelDates
import monster.donjabonoso.tmdbandroid.domain.models.ModelMovie
import monster.donjabonoso.tmdbandroid.domain.models.ModelMovieDetails
import monster.donjabonoso.tmdbandroid.domain.models.ModelMoviesResponse

fun DTODates.toModelDates(): ModelDates {
    return ModelDates(maximum = this.maximum,
    minimum = this.minimum
    )
}

fun DTOMovie.toModelMovie(): ModelMovie {
    return ModelMovie(
        adult = this.adult,
        backdropPath = this.backdropPath,
        id = this.id,
        originalLanguage = this.originalLanguage,
        originalTitle = this.originalTitle,
        overview = this.overview,
        popularity = this.popularity,
        posterPath = this.posterPath,
        releaseDate = this.releaseDate,
        title = this.title,
        video = this.video,
        voteAverage = this.voteAverage,
        voteCount = this.voteCount
    )
}

fun DTOMoviesResponse.toModelMoviesResponse(): ModelMoviesResponse {
    return ModelMoviesResponse(
        dates = this.dates.toModelDates(),
        page = this.page,
        results = this.results.map { it.toModelMovie() },
        totalPages = this.totalPages,
        totalResults = this.totalResults
    )
}

fun DTOMovieDetails.toModelMovieDetails(): ModelMovieDetails {
    return ModelMovieDetails(
        adult = this.adult,
        backdropPath = this.backdropPath,
        belongsToCollection = this.belongsToCollection,
        budget = this.budget,
        homepage = this.homepage,
        id = this.id,
        imdbId = this.imdbId,
        originalLanguage = this.originalLanguage,
        originalTitle = this.originalTitle,
        overview = this.overview,
        popularity = this.popularity,
        posterPath = this.posterPath,
        releaseDate = this.releaseDate,
        revenue = this.revenue,
        runtime = this.runtime,
        status = this.status,
        tagline = this.tagline,
        title = this.title,
        video = this.video,
        voteAverage = this.voteAverage,
        voteCount = this.voteCount
        )
}