package br.com.letscode.pokedex;

// responsável por fazer a chamada na API externa
// pokeapi.co

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url="https://pokeapi.co/api/v2/pokemon?limit=3&offset=0")
public interface PokemonClient {

    @GetMapping
    PokemonResponse buscar();

}




// OpenFeign pra fazer requisições de HTTP, Rest Template é outra.
// Java tem uma nativa. É o Java HttpURLConnection
