package tech.henriquedev.simulator.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import tech.henriquedev.simulator.databinding.ActivityMainBinding;
import tech.henriquedev.simulator.domain.Team;
import tech.henriquedev.simulator.domain.data.MatchesAPI;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MatchesAPI matchesApi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupHttpClient();
        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();
    }

    private void setupHttpClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:3000/matches")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        matchesApi = retrofit.create(MatchesAPI.class);
    }

    private void setupFloatingActionButton() {
        // TODO: Criar evento de clique e simulacao de partidas
    }

    private void setupMatchesRefresh() {
        // TODO: Atualizar as partidas na acao de swipe
    }

    private void setupMatchesList() {
        // TODO: Listar as partidas consumindo a nossa API
    }
}
