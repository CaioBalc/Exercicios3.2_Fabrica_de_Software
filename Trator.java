public class Trator {
    public static void main(String[] args) {
        Trator meuTrator = new Trator();
        meuTrator.mostrarCarac();
        meuTrator.desligar();
        meuTrator.ligar();
        meuTrator.subirMarcha();
        meuTrator.andar();
        meuTrator.subirMarcha();
        meuTrator.subirMarcha();
        meuTrator.subirMarcha();
        meuTrator.reduzirMarcha();
        meuTrator.reduzirMarcha();
        meuTrator.reduzirMarcha();
        meuTrator.ligar();
        meuTrator.desligar();
    }

    public String cor = "vermelho";
    private String marca = "Ford";
    private int marcha = 0;
    protected String revisado = "Revisado";
    protected String ligado = "Desligado";

    public void mostrarCarac(){
        System.out.println(cor + ", " + marca + ", " + marcha + ", " + revisado + ", " + ligado);
    }

    public void ligar(){
        if (ligado.equals("Ligado")) {
            System.out.println("O carro já está ligado");
        } else {
            ligado = "Ligado";
            System.out.println("Ligado");
        }
    }

    public void andar(){
        if (ligado.equals("Ligado")) {
           System.out.println("Andando");
        } else if (ligado.equals("Desligado")){
           System.out.println("Ligue o carro, primeiro");
        }
    }

    public void reduzirMarcha(){
        marcha -= 1;
        if (marcha < 0) {
            marcha = 0;
        }
        System.out.println(marcha);
    }

    public void subirMarcha(){
        marcha += 1;
        if (marcha > 3) {
            marcha = 3;
            System.out.println("Chegou na última marcha");
        }
        System.out.println(marcha);
    }

    public void desligar(){
        if (ligado.equals("Ligado")) {
            ligado = "Desligado";
            System.out.println("Desligado");
        } else {
            System.out.println("O carro já está desligado");
        }
    }

}