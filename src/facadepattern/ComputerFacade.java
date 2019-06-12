package facadepattern;

public class ComputerFacade {
    private static final long BOOT_ADDRESS = 64; // Endereços fictícios
    private static final long BOOT_SECTOR = 128; // Endereços fictícios
    private static final int SECTOR_SIZE = 16; // Endereços fictícios

    private Cpu cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        System.out.println("ComputerFacade: Iniciando boot");
        cpu.freeze();
        System.out.println("ComputerFacade: Carregando bootloader");
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
        System.out.println("ComputerFacade: Boot finalizado");
    }
}
