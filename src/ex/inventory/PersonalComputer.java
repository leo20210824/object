package ex.inventory;
//PC情報
public class PersonalComputer {
    private String name;
    private int pcNo;
    private int storageNo;
    private int memory;
    private int bit;
    private String os;

    public PersonalComputer(String name, int pcNo, int storageNo, int memory, int bit, String os) {
        this.name = name;
        this.pcNo = pcNo;
        this.storageNo = storageNo;
        this.memory = memory;
        this.bit = bit;
        this.os = os;
    }

    public String getName() {
        return name;
    }

    public int getPcNo() {
        return pcNo;
    }

    public int getStorageNo() {
        return storageNo;
    }

    public int getMemory() {
        return memory;
    }

    public int getBit() {
        return bit;
    }

    public String getOs() {
        return os;
    }

    @Override
    public String toString() {
        return String.format("%s %i %i %i %i %s",name,pcNo,storageNo,memory,bit,os);
    }
}
