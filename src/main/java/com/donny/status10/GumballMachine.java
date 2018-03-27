package com.donny.status10;

/**
 * 糖果机
 */
public class GumballMachine {
    final static int SOLD_OUT = 0;//售罄
    final static int NO_QUARTER = 1;//未投
    final static int HAS_QUARTER = 2;//已投
    final static int SOLD = 3;//在售

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count){
        this.count = count;
        if (count > 0){
            state = NO_QUARTER;
        }
    }

    /**
     * 当有25分钱投进来，就会执行这里
     */
    public void insertQuarter(){
        if (state == HAS_QUARTER){//如果已投入过25分钱，我们就告诉顾客
            System.out.println("You can't insert another quarter");
        } else if (state == NO_QUARTER){//如果是"没有25分钱"，我们就接受25分钱，并转换到"有25分钱"
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        } else if (state == SOLD_OUT){//如果糖果已经售罄，我们就拒绝收钱
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if (state == SOLD){//如果顾客刚买了糖果，就需要稍等一下，好让状态转换完毕，恢复到“没有25分钱”
            System.out.println("Please wait, we're already giving you a gumball");
        }
    }

    /**
     * 现在，如果顾客试着退回25分钱
     */
    public void ejectQuarter(){
        if (state == HAS_QUARTER){//如果有25分钱，就把钱退出来，回到”没有25分钱“
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER){//如果没有25分钱，当然不能退出
            System.out.println("You haven't inserted a quarter");
        } else if (state == SOLD){//如果顾客已经转动曲柄，就不能退钱了，他已经拿到糖果了
            System.out.println("Sorry, you already turned the crank");
        } else if (state == SOLD_OUT){//如果糖果售罄，就不可接受25分钱，当然也不可退钱
            System.out.println("You can't eject, you haven't inserted a quarter yet");
        }
    }

    /**
     * 顾客试着转动曲柄
     */
    public void turnCrank(){
        if (state == SOLD){//别再想骗机器拿两次糖果
            System.out.println("Thrning twice doesn't get you another gumball!");
        } else if (state == NO_QUARTER){//我们需要先投入25分钱
            System.out.println("You turned but there's no quarter");
        } else if (state == SOLD_OUT){//我们不能给谈过
            System.out.println("You turned, but there are no gumballs");
        } else if (state == HAS_QUARTER){//成功！他们拿到糖果了。
            System.out.println("You turned...");
            state = SOLD;//改变状态到”售出糖果”，
            dispense();//然后调用机器的dispense()
        }
    }

    /**
     * 发放糖果
     */
    public void dispense() {
        if (state == SOLD){//我们正在“售出糖果”状态;给他们糖果！
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count == 0){//如果是最后一颗糖果，设置到“糖果售罄”
                System.out.println("Oops, out of gumballs!");
                state = SOLD_OUT;
            } else {//否则，就回到“没有25分钱”
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER){//剩余都是错误消息
            System.out.println("You need to pay first");
        } else if (state == SOLD_OUT){
            System.out.println("No gumball dispensed");
        } else if (state == HAS_QUARTER){
            System.out.println("No gumball dispensed");
        }
    }
}
