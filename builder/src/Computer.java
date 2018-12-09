public class Computer {
    private String cpu;
    private String graphicsCard;
    private String motherboard;
    private String memoryBar;
    private String hardDisk;
    private String powerSupply;
    private String chassis;

    public Computer(String cpu, String graphicsCard, String motherboard, String memoryBar, String hardDisk, String powerSupply, String chassis) {
        this.cpu = cpu;
        this.graphicsCard = graphicsCard;
        this.motherboard = motherboard;
        this.memoryBar = memoryBar;
        this.hardDisk = hardDisk;
        this.powerSupply = powerSupply;
        this.chassis = chassis;
    }

    public Computer() {
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getMemoryBar() {
        return memoryBar;
    }

    public void setMemoryBar(String memoryBar) {
        this.memoryBar = memoryBar;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }
}
