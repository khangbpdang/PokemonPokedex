package khangdang.com.pokemonpokedex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.UUID;

public class PokemonFragment extends Fragment {
    public static final String EXTRA_POKEMON_ID = "com.khangdang.pokemonpokedex.pokemon_id";
    private Pokemon mPokemon;
    private ImageView mImageView;
    private TextView mNameField;
    private TextView mHWField;
    private TextView mTypeField;
    private TextView mHPField;
    private TextView mAttField;
    private TextView mDefField;
    private TextView mSpAttField;
    private TextView mSpDefField;
    private TextView mSpeedField;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UUID pokemonId = (UUID)getArguments().getSerializable(EXTRA_POKEMON_ID);
        mPokemon = PokemonCollection.get(getActivity()).getPokemon(pokemonId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pokemon, parent, false);

        mImageView = (ImageView) v.findViewById(R.id.pokemon_photo);
        mImageView.setImageResource(mPokemon.getImage());

        mNameField = (TextView) v.findViewById(R.id.pokemon_name);
        mNameField.setText(mPokemon.getPokemonName());
        mNameField.setTextColor(getResources().getColor(R.color.textViewColor));

        mHWField = (TextView) v.findViewById(R.id.pokemon_hw);
        mHWField.setText("Height: " + mPokemon.getHeight() + ". Weight: " + mPokemon.getWeight());

        mTypeField = (TextView) v.findViewById(R.id.pokemonType);
        mTypeField.setText("Type: " + mPokemon.getCategory());

        mHPField = (TextView) v.findViewById(R.id.pokemon_HP);
        mHPField.setText("HP: " + mPokemon.getHP());

        mAttField = (TextView) v.findViewById(R.id.pokemon_Attack);
        mAttField.setText("Attack: " + mPokemon.getAttack());

        mDefField = (TextView) v.findViewById(R.id.pokemon_Defense);
        mDefField.setText("Defense: " + mPokemon.getDefense());

        mSpAttField = (TextView) v.findViewById(R.id.pokemon_SpAtt);
        mSpAttField.setText("Sp.Attack: " + mPokemon.getSpAttack());

        mSpDefField = (TextView) v.findViewById(R.id.pokemon_SpDef);
        mSpDefField.setText("Sp.Defense: " + mPokemon.getSpDefense());

        mSpeedField = (TextView) v.findViewById(R.id.pokemon_Speed);
        mSpeedField.setText("Speed: " + mPokemon.getSpeed());

        return v;
    }


    public static PokemonFragment newInstance(UUID pokemonId) {
        Bundle args = new Bundle();
        args.putSerializable(EXTRA_POKEMON_ID, pokemonId);
        PokemonFragment fragment = new PokemonFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
