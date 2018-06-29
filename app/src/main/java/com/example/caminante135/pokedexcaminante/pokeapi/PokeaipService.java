package com.example.caminante135.pokedexcaminante.pokeapi;

import com.example.caminante135.pokedexcaminante.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokeaipService {
    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit")int limit, @Query("offset")int offset);

}
