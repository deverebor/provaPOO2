public class App {
    public static void main(String[] args) throws Exception {
        Calc c = new Calc();

        c.setOverdue(true);
        c.setValue(5.5);

        c.fees();
    }
}
