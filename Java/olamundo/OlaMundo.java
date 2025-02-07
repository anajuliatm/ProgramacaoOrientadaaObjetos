package Java.olamundo;

public class OlaMundo {

    public static void main(String[] args) {
        System.out.println("\nOla, Mundo!");
    }
}
 /*
  * O Que é um objeto?
        Coisa material ou abstrata  que pode ser percebida
        pelos sentidos e descrita por meio das suas caract.,
        comportamentos e estado atual.
        Ex: Controle Remoto - Caract: fabricante, cor,2 botoes, telinha, etc.
                              Comportamentos: ligar, desligar, pausar, etc.
                              Estado: ligado, desligado, sem bateria, procurando rede e etc.
  *     Atributo - caracteristicas do obj
        Métodos/Rotinas - comportamento do obj
        Estado - características Atuais do obj

        Caneta
        Atributos - modelo
                    cor
                    ponta
                    carga
                    tampada
        Métodos -   escrever
                    rabiscar
                    pintar
                    tampar
                    destampar
        Estado -    destampada
                    azul
                    90% de carga
    
    Todo objeto tem que vir de uma classe, e quando eu tenho uma classe
    e quero transformar ela num objeto, eu instancio.
    Instanciar - gero um objeto a partir de uma classe.
    ex: c1 = nova Caneta
        c1.cor = "Azul"
        c1.ponta = 0.5
        c1.tampada = falso
        c1.rabiscar()

        c2 = nova Caneta
        c2.cor = "Vermelho"
        c2.ponta = 1.0
        c2.tampada = falso
        c2.tampar()

    Visibilidade de um objeto:
    (+) Publico - A classe atual e qqr outra tem acesso e pode usar
    (-) Privado - Somente a classe atual tem acesso
    (#) Protegido -  A classe atual e suas sub-classes tem acesso
 */ 