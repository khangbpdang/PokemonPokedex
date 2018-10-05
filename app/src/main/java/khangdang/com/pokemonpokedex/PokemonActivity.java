package khangdang.com.pokemonpokedex;


import android.support.v4.app.Fragment;


import java.util.UUID;

public class PokemonActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        UUID pokemonId = (UUID)getIntent()
                .getSerializableExtra(PokemonFragment.EXTRA_POKEMON_ID);
        return PokemonFragment.newInstance(pokemonId);
    }
}