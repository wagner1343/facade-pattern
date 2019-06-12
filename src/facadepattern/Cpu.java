package facadepattern;

public class Cpu {
    public void freeze() {
        System.out.println("Cpu: Parando");
    }
    public void jump(long position) {
        System.out.println("Cpu: Movendo Program Counter para o endereço " + position);
    }
    public void execute() {
        System.out.println("Cpu: Executando");
    }
}