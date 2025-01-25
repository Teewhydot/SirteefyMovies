package ng.com.sirteefyapps.sirteefymovies.services.navigation

enum class AppScreens {
    HOME,
    DETAILS;
    companion object {
        fun fromRoute(route: String?): AppScreens {
            return when (route?.substringBefore("/")) {
                HOME.name -> HOME
                DETAILS.name -> DETAILS
                else -> HOME
            }
        }
    }
}