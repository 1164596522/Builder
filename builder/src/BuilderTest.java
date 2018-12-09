public class BuilderTest {
    public static void main(String[] args) {
        Director director = new Director();
        Computer computer = director.createComputer(new ComputerBuild());
        System.out.println("中央处理器："+computer.getCpu());
        System.out.println("显卡："+computer.getGraphicsCard());
        System.out.println("主板："+computer.getMotherboard());
        System.out.println("内存条："+computer.getMemoryBar());
        System.out.println("硬盘："+computer.getHardDisk());
        System.out.println("电源："+computer.getPowerSupply());
        System.out.println("机箱："+computer.getChassis());
    }
}
