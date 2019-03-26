//外观类
public class CookFacade {

    private ElectricCooker electricCooker;
    private RiceMeasureContainer riceMeasureContainer;
    private WaterContainer waterContainer;
    public CookFacade(ElectricCooker electricCooker,RiceMeasureContainer riceMeasureContainer,WaterContainer waterContainer){
        this.electricCooker = electricCooker;
        this.riceMeasureContainer = riceMeasureContainer;
        this.waterContainer = waterContainer;
    }

    public void cookRice(){
        electricCooker.takeOutPot(); //把锅从电饭煲中拿出来
        riceMeasureContainer.measureRice();//用量米器量吃的米
        riceMeasureContainer.pourIntoContainer(electricCooker); //把量好的米倒入锅中
        waterContainer.measureWater();//用装水容器装水
        waterContainer.pourOutWater(electricCooker);//把水倒入锅中
        electricCooker.washRice();//开始洗米
        electricCooker.pourOutWater();//把米水倒出
        waterContainer.measureWater();//用装水容器装水
        waterContainer.pourOutWater(electricCooker);//把水倒入锅中
        electricCooker.putBackPot();//把锅入回电饭煲中
        electricCooker.startCook();//开始煮饭

        electricCooker.endCook();//饭已做
    }

}

