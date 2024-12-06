public class App {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.setStrategy(new StrategyImpl1());
        ctx.perform();
        ctx.setStrategy(new StrategyImpl2());
        ctx.perform();
        ctx.setStrategy(new StrategyImpl3());
        ctx.perform();
    }
}
