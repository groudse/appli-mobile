package com.example.json_kotlin.exoKotlin

import com.example.json_kotlin.PokemonBeans
import com.example.json_kotlin.WeatherBean
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request

const val URL_API_WEATHER =
    "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=b80967f0a6bd10d23e44848547b26550&units=metric&lang=fr"

const val URL_API_POKEMON =
    "https://www.amonteiro.fr/api/pokemonN1"

object RequestUtils {

    val client = OkHttpClient()
    val gson = Gson()


    fun loadWeather(city: String): WeatherBean {
        val json = sendGet(URL_API_WEATHER.format(city))
        return gson.fromJson(json, WeatherBean::class.java)
    }

    fun loadPokemon(pokemon: String): PokemonBeans {
        val json = sendGet(URL_API_POKEMON.format(pokemon) )
        return gson.fromJson(json, PokemonBeans::class.java)
    }

    fun sendGet(url: String): String {
        println("url : $url")
        //Création de la requête
        val request = Request.Builder().url(url).build()
        //Execution de la requête
        return client.newCall(request).execute().use {
            //Analyse du code retour
            if (!it.isSuccessful) {
                throw Exception("Réponse du serveur incorrect :${it.code}")
            }
            //Résultat de la requête
            it.body.string()
        }
    }
}
