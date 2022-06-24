package tech.henriquedev.simulator.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import tech.henriquedev.simulator.databinding.ActivityMainBinding;
import tech.henriquedev.simulator.domain.Team;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();
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
