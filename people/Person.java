package people;

public class Person {
    private String player_name;
    private int money;

    public Person(){
        player_name = null;
        money = 0;
    }
    public Person(String input_name){
        player_name = input_name;
        money = 0;
    }
    public Person(String input_name, int input_money){
        player_name = input_name;
        money = input_money;
    }

    public String getName(){
        return player_name;
    }

    public int getMoney(){
        return money;
    }

    public int addMoney(int amount) throws PersonException {
        if ( amount < 0 ){
            throw new PersonException();
        }
        money = money + amount;
        return money;
    }

    public int subtractMoney(int amount) throws PersonException {
        if (( amount < 0 ) || ( amount > money )){
            throw new PersonException();
        }
        money = money - amount;
        return money;
    }
}
