package tech.henriquedev.simulator.domain.data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import tech.henriquedev.simulator.domain.Match;

public interface MatchesAPI {

    @GET("matches")
    Call<List<Match>> getMatches();
}
