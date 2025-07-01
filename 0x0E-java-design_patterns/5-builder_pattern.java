/**
 * @file 5-builder_pattern.java
 * @brief Builder Pattern Implementation
 *
 * Separates the construction of a complex object from its representation so that the same construction process can create various representations.
 */

class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private boolean hasGraphicsCard;
    private boolean hasBluetooth;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage +
               ", Graphics Card=" + hasGraphicsCard + ", Bluetooth=" + hasBluetooth + "]";
    }

    static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private boolean hasGraphicsCard;
        private boolean hasBluetooth;

        public Builder setCPU(String cpu) {
            this.CPU = cpu;
            return this;
        }

        public Builder setRAM(String ram) {
            this.RAM = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

public class MainBuilder {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard(true)
                .setBluetooth(true)
                .build();

        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("512GB SSD")
                .setGraphicsCard(false)
                .setBluetooth(false)
                .build();

        System.out.println(gamingPC);
        System.out.println(officePC);
    }
}
