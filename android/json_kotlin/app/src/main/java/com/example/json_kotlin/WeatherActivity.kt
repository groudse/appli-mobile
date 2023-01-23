import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import com.example.json_kotlin.databinding.ActivityWeatherBinding
import kotlin.concurrent.thread
import com.squareup.picasso.Picasso

class WeatherActivity : AppCompatActivity() {

    val binding by lazy { ActivityWeatherBinding.inflate(layoutInflater)}
    val model by lazy { ViewModelProvider(this).get(WeatherViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //Permet si l'écran est recréé d'afficher la donnée qui a été sauvegardée
        refreshScreen()

        binding.btLoad.setOnClickListener {

            binding.progressBar.isVisible = true

            thread {
                //Chargement des données
                model.loadData()

                runOnUiThread {
                    //Mise à jours des composants graphiques
                    refreshScreen()
                    //Masquer la progressBar
                    binding.progressBar.isVisible = false
                }
            }
        }
    }

    fun refreshScreen(){

        //Data
        binding.tv.text = model.data?.name ?: "-"
        binding.tvTemp.text = model.data?.main?.temp?.toString() ?: "-"
        binding.tvWind.text = model.data?.wind?.speed?.toString() ?: "-"

        if(model.data == null) {
            binding.tvMinMax.text = "-"
        }
        else {
            binding.tvMinMax.text = "(${model.data?.main?.temp_min}°/${model.data?.main?.temp_max}°)"
        }

        if(model.data != null && !model.data?.weather.isNullOrEmpty()) {
            binding.tvDesc.text = model.data?.weather?.get(0)?.description
            Picasso.get().load("https://openweathermap.org/img/wn/${model.data?.weather?.get(0)?.icon}@4x.png").into(binding.ivTemp)
        }
        else {
            binding.tvDesc.text = "-"
        }

        //gestion du message d'erreur
        if(model.errorMessage.isNotBlank()) {
            binding.tvError.text = model.errorMessage;
            binding.tvError.isVisible = true
        }
        else {
            binding.tvError.isVisible = false
        }
    }
}
            