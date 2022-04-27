package br.com.letscode.pokedex;

// responsável por fazer a chamada na API externa
// pokeapi.co

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "pokemons", url="https://pokeapi.co/api/v2/pokemon")
public interface PokemonClient {

//    @GetMapping("?limit=10&offset=0")
//    PokemonResponse buscar();

    @GetMapping()
    PokemonResponse buscar(@RequestParam Integer limit, @RequestParam Integer offset);

    @GetMapping("/{nome}")
    PokemonDetailResponse buscar(@PathVariable String nome);

}

/**     Notes
 * OpenFeign pra fazer requisições de HTTP, Rest Template é outra.
 * Java tem uma nativa. É o Java HttpURLConnection
 */


