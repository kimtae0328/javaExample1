package ex06.practice;

public abstract class Animal {
    private String name;
    private String Kinds;

    protected Animal(){


    }
    protected Animal(String name, String Kinds){
        this.name = name;
        this.Kinds = Kinds;        
    }

    @Override
    public String toString(){
        String str = "저의 이름은" + name + "이고, 종류는 "
                            + Kinds + "입니다";
        return str;
    }

    public abstract void speak();

}
