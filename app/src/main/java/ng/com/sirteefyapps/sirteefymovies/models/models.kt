

package ng.com.sirteefyapps.sirteefymovies.models
data class Movie (
    val title: String,
    val year: String,
    val rated: String,
    val released: String,
    val runtime: String,
    val genre: String,
    val director: String,
    val writer: String,
    val actors: String,
    val plot: String,
    val language: String,
    val country: String,
    val awards: String,
    val poster: String,
    val metaScore: String,
    val imdbRating: String,
    val imdbVotes: String,
    val imdbID: String,
    val type: Type,
    val response: Response,
    val images: List<String>,
    val totalSeasons: String? = null,
    val comingSoon: Boolean? = null
)

enum class Response {
    True
}

enum class Type {
    Movie,
    Series
}
