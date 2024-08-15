package br.com.lucas.seriesefilmess.service;

public interface IConverteDados {
   <T> T obterDados(String json, Class<T> classe);
}
