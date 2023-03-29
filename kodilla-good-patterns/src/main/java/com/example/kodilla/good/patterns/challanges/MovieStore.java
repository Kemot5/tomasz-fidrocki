package com.example.kodilla.good.patterns.challanges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class MovieStore {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        String ShowTitleMovies ;

        ShowTitleMovies = movieStore.getMovies().entrySet().stream()
                .map(movie -> movie.getKey() + movie.getValue())
                .map(m ->m.substring(3))
                .map(a->a.replace(']','!'))
                .map(z ->z.replace(',','!'))
                .collect(Collectors.joining());
        System.out.println("All Title Movie:");
        System.out.println(ShowTitleMovies);

    }
    public Map<String, List<String>> getMovies() {
        final List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Zelazny Czlowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Msciciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Blyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }


}
