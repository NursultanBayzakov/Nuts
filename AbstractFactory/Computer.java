package AbstractFactory;

public abstract class Computer {

    public abstract String getRAM();  // declare abstract variable

    public abstract String getHDD(); // declare abstract variable

    public abstract String getCPU(); // declare abstract variable

    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ",CPU=" + this.getCPU(); //return getting values 
    }
}
