package br.com.laura.floricultura.dominio;

public enum TipoFlor {
    ORNAMENTAL ("Ornamental"),
    FRUTIFERA ("Frutifera"),
    SUCULENTA ("Suculenta");

    public final String TIPO_FLOR;

    TipoFlor(String tipoFlor) {
        this.TIPO_FLOR = tipoFlor;
    }

    public static TipoFlor tipoFlorPorNomeFlor (String TIPO_FLOR) { //o metodo precisa pertencer à classe para que eu possa acessá-lo nos testes, pois a partir do static ele pertence à classe, e não ao objeto

        for (TipoFlor tipoFlor : values()) {
            if(tipoFlor.getTIPO_FLOR().equals(TIPO_FLOR)) {
                return tipoFlor;
            }
        }
        return null;
    }

    public String getTIPO_FLOR() {
        return TIPO_FLOR;
    }


}
