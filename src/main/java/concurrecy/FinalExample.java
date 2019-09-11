package concurrecy;

import lombok.Data;

/**
 * @Auther DRevelation
 * @Date 2019-08-29 15:02
 * @Desc
 */
public class FinalExample {
    private final static Person person = new Person(24, 170);

    public static void main(String[] args) {
        person.age = 22;
        System.out.println(person.toString());
    }

    @Data
    static class Person {
        private int age;
        private int height;

        public Person(int age, int height) {
            this.age = age;
            this.height = height;
        }
    }
}


