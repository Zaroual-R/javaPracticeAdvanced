package design_pattern.builder;

public class MainBuilder {
    public static void main(String[] args) {
        Computer comp=new Computer.Builder()
                .setCpu("cpu")
                .setGamingPC(true)
                .setRam("djfsdkj")
                .build();
    }
}
