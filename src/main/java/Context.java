public class Context {
    private Strategy strategy=new DefaultStrategyImpl();
    public void perform (){
        System.out.println("###### Début de l'opération ######");
        System.out.println("****** Initialisation ******");
        strategy.apply();
        System.out.println("###### Opération non définie : version par défaut ######");
        System.out.println("###### Fin de l'opération ######");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
