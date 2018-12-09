public class ComputerBuild implements IBuildComputer{

    Computer computer;

    public ComputerBuild() {
        computer = new Computer();
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Intel 酷睿i9 7900X");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("华硕ROG STRIX-RTX 2080Ti-O11G-GAMING");
    }

    @Override
    public void buildMotherboard() {
        computer.setMotherboard("华硕ROG ZENITH EXTREME");
    }

    @Override
    public void buildMemoryBar() {
        computer.setMemoryBar("海盗船复仇者LPX 16GB DDR4 2400（CMK16GX4M1A2400C16）");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("三星970 EVO NVMe M.2（2TB）");
    }

    @Override
    public void buildPowerSupply() {
        computer.setPowerSupply("振华LEADEX P2000");
    }

    @Override
    public void buildChassis() {
        computer.setChassis("联力PC-D600");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
