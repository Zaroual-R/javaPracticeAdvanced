package HeapAndStack;

public class Practice {
    public static void main(String[] args) {
        Practice p = new Practice();
        p.start();
    }

    public void start() {
        String last="z";
        Container container=new Container();
        container.setIntial("C");
        another(container,last);
        System.out.println(container.getIntial());
    }

    public void another(Container initialHolder,String newInitial) {
        newInitial.toLowerCase();
        initialHolder.setIntial("B");
        Container initial2 =new Container();
        initialHolder=initial2;
        System.out.println(initialHolder.getIntial());
        System.out.println(newInitial);
    }
}
