package com.example.weatherapp.models

import java.io.Serializable

data class WeatherResponse (
    /**
     *  JSON
     *  Example of API response
     *  https://openweathermap.org/current
     */

    /**
     *  Tool to display JSON objects as diagram format
     *  https://jsonviewer.stack.hu/
     */


    val coord: Coord,
    val weather: List<Weather>,
    val base: String,
    val main: Main,
    val wind: Wind,
    val clouds: Clouds,
    val dt: Int,
    val sys: Sys,
    val id: Int,
    val name: String,
    val cod: Int

    /**
     * Serialization is the process of converting data used by an application
     * to a format that can be transferred over a network or stored in a
     * database or a file.
     *
     * Because we want to be able to store a weather response on a phone as
     * a string, so we need to make it serializable
     *
     */


) : Serializable