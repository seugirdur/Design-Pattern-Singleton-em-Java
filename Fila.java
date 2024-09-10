package org.example;

public class Fila {

    private static Fila instance;

    private Fila() {
    }


    public static Fila getInstance() {
        if (instance == null) {
            instance = new Fila();
        }

        return instance;
    }

    public void ImprimeDocumento() {
        System.out.println("Imprimindo");
    }

    public void RemoveDocumento() {
        System.out.println("Removendo");
    }

    public void RemoveTodosDocumentos() {
        System.out.println("Removendo tudo");
    }


}
