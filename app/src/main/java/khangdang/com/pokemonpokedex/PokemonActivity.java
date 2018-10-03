package khangdang.com.pokemonpokedex;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

import java.util.UUID;

public class PokemonActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        UUID pokemonId = (UUID)getIntent()
                .getSerializableExtra(PokemonFragment.EXTRA_POKEMON_ID);
        return PokemonFragment.newInstance(pokemonId);
    }
}