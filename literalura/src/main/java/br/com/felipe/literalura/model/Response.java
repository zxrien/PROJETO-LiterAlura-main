package br.com.felipe.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    @JsonAlias("results")
    private List<DadosLivros> results;

    public List<DadosLivros> getResults() {
        return results;
    }

    public void setResults(List<DadosLivros> results) {
        this.results = results;
    }
}