package ex06;

import ex06.practice.Animal;
import ex06.practice.Cat;
import ex06.practice.Dog;

public class Application {
    public static void main(String[] args) {
        Animal[] animalArr = new Animal[5];
        // 랜덤한 값을 추출후 짝수or홀수 인지 판단해서
        // animalArr[0] = new Cat();
        // animalArr[0] = new Cat();
        // animalArr[0] = new Cat();
        // animalArr[0] = new Cat();
        // animalArr[0] = new Cat();

        for(int i = 0; i<animalArr.length; i++){
            int num = (int)(Math.random() * 10) + 1;
            if(num%2 == 0){
                animalArr[i] = new Cat();
            }else {
                animalArr[i] = new Dog();
            }

        }

        for(Animal a : animalArr){
            a.speak();
        }
    }

}
