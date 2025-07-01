/**
 * @file 7-facade_pattern.java
 * @brief Facade Pattern Implementation
 *
 * Provides a simplified interface to a set of interfaces in a subsystem.
 */

class CPU {
    public void freeze() { System.out.println("CPU freezing..."); }
    public void jump(long position) { System.out.println("Jumping to address " + position); }
    public void execute() { System.out.println("Executing instructions..."); }
}

class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Loading data into memory at position " + position);
    }
}

class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Reading " + size + " bytes from LBA " + lba);
        return new byte[0];
    }
}

class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        byte[] biosData = hd.read(0, 512);
        ram.load(0, biosData);
        processor.jump(0);
        processor.execute();
    }
}

public class MainFacade {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
