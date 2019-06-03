package Fighting;

import java.util.Random;
import java.util.Scanner;

public class Fighting {
    public static void main(String[] args) {
        System.out.println("Give you attck value: ");
        Scanner sc = new Scanner(System.in);
        int attack = sc.nextInt();
        System.out.println("Give your defense value:  ");
        int defence = sc.nextInt();
        System.out.println();
        System.out.println("Give your Life points: ");
        int lifePoints = sc.nextInt();

        System.out.println("Monester attack: ");
        int monsterAttack = sc.nextInt();
        System.out.println("Monester defence: ");
        int monsterDefence = sc.nextInt();
        System.out.println("Monester life: ");
        int monsterLife = sc.nextInt();


        Random randomGenerate = new Random();
        boolean randomStart = randomGenerate.nextBoolean();
        if (randomStart) {
            System.out.println("You start the game!! ");
            int damage = randomGenerate.nextInt(6) + 1 + randomGenerate.nextInt(6) + 1;
            System.out.println("Rolled values of damage: " + damage);
            int hurt = attack + damage;
            System.out.println("Your attack value is " + attack + " Total harm : " + hurt + " The monster defence is equal to " + monsterDefence);

            if (monsterDefence > hurt
            ) {
                int monsterHurt = monsterDefence - hurt;
                System.out.println("Monster is alive and has " + monsterHurt + " defence left");
            } else {
                monsterLife = monsterLife - 1;
                System.out.println("Your attack was successfull, Monster has " + monsterLife + " life left");

            }
        } else {
            System.out.println("Potwór zaczyna grę :  ");
            int damage = randomGenerate.nextInt(6) + 1 + randomGenerate.nextInt(6) + 1;
            System.out.println("Rolled values of damage: " + damage);
            int hurt = monsterAttack + damage;
            System.out.println("Monster attack value is " + monsterAttack + " The total harm : " + hurt + " and you have " + defence + " defence points");

            if (defence > hurt
            ) {
                int myHurt = defence - hurt;
                System.out.println("You are lucky " + myHurt + "defence left");
            } else {
                lifePoints = lifePoints - 1;
                System.out.println("Monster attack you and you lost your life, you still have " + lifePoints + " life left");

            }

        }


    }


//        int randomStart = randomGenerate.nextInt();


}

