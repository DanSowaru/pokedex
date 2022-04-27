package br.com.letscode.pokedex;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PokemonController {

    @GetMapping("/pokemons")
    public ResponseEntity<PokemonResponse> buscarPokemon() {

    }
}

// Controller é quem expõe o endpoint pra consulta da aplicação.
// Client se comunica com os endpoints de outras aplicações.
