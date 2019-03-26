//电饭煲
public class ElectricCooker implements MyCantainer {
    public void takeOutPot(){//取出锅
        System.out.println("take out the pot the electric cooker");
    }

    public void washRice(){//洗米
        System.out.println("wash rice");

    }

    public void pourOutWater(){//倒出水
        System.out.println("pour out water ");

    }

    public void putBackPot(){//把锅放回原位
        System.out.println("put back the pot ");
    }

    public void startCook(){//开始煮饭
        System.out.println("start to cook rice ");

    }

    public void endCook(){ //停止煮饭
        System.out.println("end cooking rice，Rice is ready ");

    }



}
