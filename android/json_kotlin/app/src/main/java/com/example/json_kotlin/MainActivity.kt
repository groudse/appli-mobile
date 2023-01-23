package com.example.json_kotlin


import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.DatePicker
import android.widget.ImageView
import android.widget.TimePicker
import android.widget.Toast
import androidx.core.view.isVisible
import com.example.json_kotlin.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

private const val MENU_TIME_PICKER = 56
private const val MENU_DATE_PICKER = 57
private const val MENU_ALERT_DIALOG = 58
val SDF = SimpleDateFormat("dd/MM/yy HH:mm")
private val MENU_ID_WEATHER = 60

class MainActivity : AppCompatActivity(), View.OnClickListener, TimePickerDialog.OnTimeSetListener,
    DatePickerDialog.OnDateSetListener {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)




        binding.btValider.setOnClickListener(this)
        binding.btCancel.setOnClickListener(this)


        //PROBLEME
//        binding.imageView.setColorFilter(Color.CYAN);
//        binding.imageView.setColorFilter(getResources().getColor(R.color.MaCouleur ,getTheme()));

    }

    val calendar = Calendar.getInstance();
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.add(0, MENU_TIME_PICKER, 0, "Horloge")
        menu.add(0, MENU_DATE_PICKER, 0, "Calendrier")
        menu.add(0, MENU_ALERT_DIALOG, 0, "alerte")
        menu.add(0, MENU_ID_WEATHER, 0, "Meteo")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == MENU_TIME_PICKER) {
            TimePickerDialog(
                this,
                this,
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                true
            ).show()
        } else if (item.itemId == MENU_DATE_PICKER) {
            DatePickerDialog(
                this,
                this,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ).show()

        } else if (item.itemId == MENU_ALERT_DIALOG) {

            val adb = AlertDialog.Builder(this)
            //Message / titre
            adb.setMessage("Mon message").setTitle("Mon titre")
            //bouton ok
            adb.setPositiveButton("ok") { dialog, which ->
                //Affiche un toast apres le clic sur le bouton ok
                Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show()
            }
            //Icone
            adb.setIcon(R.mipmap.ic_launcher);
            //Afficher la fenêtre
            adb.show();


        } else if (item.itemId == MENU_ID_WEATHER) {
            //redirection vers WeatherActivty
            val intent = Intent(this, WeatherActivity::class.java)
            //Passage de paramètre
            intent.putExtra("toto", binding.editTexte.text.toString())
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onClick(v: View?) {
        if (v == binding.btValider) {
//            binding.deleteForeverId.isVisible = false
//            binding.flagId.isVisible = true
            if (binding.rbLike.isChecked) {
                binding.editTexte.setText(binding.rbLike.text)

            } else if (binding.rbDislike.isChecked) {
                binding.editTexte.setText(binding.rbDislike.text)

            }
        } else if (v == binding.btCancel) {
//            binding.deleteForeverId.isVisible = true
//            binding.flagId.isVisible = false
            binding.editTexte.setText("")
            binding.rbGroup.clearCheck()

        }
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
        calendar.set(Calendar.MINUTE, minute)

        Toast.makeText(this, SDF.format(calendar.time), Toast.LENGTH_SHORT).show()
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        calendar.set(year, month, dayOfMonth)
        Toast.makeText(this, SDF.format(calendar.time), Toast.LENGTH_SHORT).show()
    }


}