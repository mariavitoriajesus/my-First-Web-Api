package com.primeiroprojeto.myFirstWebApi.Handler;

public class CampoObrigatorio extends BusinessException{
    public CampoObrigatorio(String campo) {
        super("O campo %s é obrigatorio!");
    }
}
