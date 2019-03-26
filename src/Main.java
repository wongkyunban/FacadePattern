public class Main {

    public static void main(String[] args) {
        ElectricCooker electricCooker = new ElectricCooker();
        RiceMeasureContainer riceMeasureContainer = new RiceMeasureContainer();
        WaterContainer waterContainer = new WaterContainer();
        CookFacade cookFacade = new CookFacade(electricCooker,riceMeasureContainer,waterContainer);

        cookFacade.cookRice();  //煮饭
    }
}
