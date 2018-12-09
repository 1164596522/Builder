public interface IBuildComputer {
    public void buildCpu();

    public void buildGraphicsCard();

    public void buildMotherboard();

    public void buildMemoryBar();

    public void buildHardDisk();

    public void buildPowerSupply();

    public void buildChassis();

    public Computer createComputer();
}
