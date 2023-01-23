import androidx.lifecycle.ViewModel
import com.example.json_kotlin.WeatherBean
import com.example.json_kotlin.exoKotlin.RequestUtils

class WeatherViewModel : ViewModel() {

    var data : WeatherBean? = null
    var errorMessage = ""

    fun loadData() {

        //reset donnée
        data = null
        errorMessage = ""
        try {
            data = RequestUtils.loadWeather(cityName)
        }
        catch(e:Exception){
            e.printStackTrace()
            errorMessage = "Une erreur est survenue : ${e.message}"
        }
    }
}
        