package facadepattern;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("HardDrive: Lendo setor " + lba + ", de tamanho " + size);

        return new byte[]{'a', 'b', 'c'};
    }
}