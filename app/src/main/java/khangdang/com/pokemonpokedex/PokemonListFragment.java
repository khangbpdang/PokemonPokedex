package khangdang.com.pokemonpokedex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class PokemonListFragment extends ListFragment {
    private static final String TAG = "CrimeListFragment";
    private ArrayList<Pokemon> mPokemons;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivity().setTitle(R.string.pokemon_titles);
        mPokemons = PokemonCollection.get(getActivity()).getPokemons();

        PokemonAdapter adapter = new PokemonAdapter(mPokemons);
        setListAdapter(adapter);
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Pokemon p = ((PokemonAdapter)getListAdapter()).getItem(position);
        // Start PokemonActivity
        Intent i = new Intent(getActivity(), PokemonActivity.class);
        i.putExtra(PokemonFragment.EXTRA_POKEMON_ID, p.getID());
        startActivity(i);
    }

    @Override
    public void onResume() {
        super.onResume();
        ((PokemonAdapter)getListAdapter()).notifyDataSetChanged();
    }

    private class PokemonAdapter extends ArrayAdapter<Pokemon> {
        public PokemonAdapter(ArrayList<Pokemon> pokemons) {
            super(getActivity(), 0, pokemons);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // If we weren't given a view, inflate one
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater()
                        .inflate(R.layout.list_item_pokemon, null);
            }
            // Configure the view for this Pokemon
            Pokemon p = getItem(position);
            ImageView PokemonImage = (ImageView) convertView.findViewById(R.id.pokemon_list_item_pokemonImage);
            PokemonImage.setImageResource(p.getImage());
            TextView NameTextView = (TextView)convertView.findViewById(R.id.pokemon_list_item_titleTextView);
            NameTextView.setText(p.getPokemonName());

            return convertView;
        }
    }
}
