public class Director {
    public Computer createComputer(IBuildComputer bc){
        bc.buildCpu();
        bc.buildGraphicsCard();
        bc.buildMotherboard();
        bc.buildMemoryBar();
        bc.buildHardDisk();
        bc.buildPowerSupply();
        bc.buildChassis();
        return bc.createComputer();
    }
}
