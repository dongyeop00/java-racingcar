package racingcar.Model;

import racingcar.Service.Exception1;

public class Car {
    private String name;

    private int position = 0;

    public Car(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void ToMove(int RandomNumber){
        if(RandomNumber >= 4){
            position++;
        }
    }

    public String ShowRound(){
        return this.name + " : " + "-".repeat(position);
    }

}
