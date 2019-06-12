package facadepattern;

public class Memory {
    public void load(long position, byte[] data) {
        String dataString = "";
        for(int x = 0; x < data.length; x++){
            dataString += (char) data[x];
        }
        System.out.println("Memory: Carregando " + dataString + " no endereço " + position);
    }
}