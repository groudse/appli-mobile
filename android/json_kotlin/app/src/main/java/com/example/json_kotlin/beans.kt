data class WeatherBean(
    var main: TempBean,
    var name: String,
    var wind: WindBean,
    var weather: List<DescriptionBean>,
)

data class DescriptionBean(
    var description: String,
    var icon: String,
)

data class WindBean(
    var speed: Double
)

data class TempBean(
    var temp: Double,
    var temp_max: Double,
    var temp_min: Double
)