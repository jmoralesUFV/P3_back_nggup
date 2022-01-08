package com.ufv.restservice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.util.Iterator;

public class JsonReader {
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        try
        {

            // Declaramos el objeto parser para preparar el fichero json
            JSONParser jsonParser = new JSONParser();

            // Con la clase FILEREADER leeemos el archivo json de su carpeta
            FileReader reader = new FileReader("json\\myJSON.json");
            // Object obj = jsonParser.parse(new FileReader("json\\myJSON.json"));

            // Creamos un objeto java para meter el archivo parseado
            Object obj = jsonParser.parse(reader);
            // Almacenamos ese objeto en un JSON object para terminar de almacenarlo correctamente.
            JSONObject jsonObject = (JSONObject) obj;

            // Imprimimos el json object para ver si está bien.
            System.out.println(jsonObject);
            System.out.println(" ");

            // Creamos una clase gson donde almacenamos en job de json object de nuevo pero pasado a un string el anterior
            Gson gson = new GsonBuilder().create();
            JsonObject job = gson.fromJson(jsonObject.toString(), JsonObject.class);

            // imprimimos usuarios
            // Buscamos de la rama empresa -> usuarios y -> array usuario
            JsonElement entryUSER=job.getAsJsonObject("empresa").getAsJsonObject("usuarios").getAsJsonArray("usuario");

            String strU = entryUSER.toString();

            System.out.println(strU);
            System.out.println("");

            // imprimimos equipos
            // Buscamos de la rama empresa -> equipos y -> array equipos
            JsonElement entryEQUIPOS=job.getAsJsonObject("empresa").getAsJsonObject("equipos").getAsJsonArray("equipo");

            String strE = entryEQUIPOS.toString();

            System.out.println(strE);
            System.out.println("");

            // imprimimos prestamos
            // Buscamos de la rama empresa -> prestamos y -> array prestamo
            JsonElement entryPREST=job.getAsJsonObject("empresa").getAsJsonObject("prestamos").getAsJsonArray("prestamo");

            String strP = entryPREST.toString();

            System.out.println(strP);
            System.out.println("");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
