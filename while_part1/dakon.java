package Step.while_part1;

import java.util.Scanner;

/**
 * Created by Mebius on 22.03.2016.
 */
public class dakon {
    public static void main(String[] args) {
        task17();
    }

    public static void task17() {
        /*
        17.	Королю нужно убить дракона, но средства его казны – ограничены.  Нужно создать программу,
        которая поможет рассчитать минимальное количество копейщиков,
        которое необходимо, чтобы убить дракона. Данные очков здоровья и атаки дракона и одного копейщика вводятся с клавиатуры. Защиту, удачу, мораль, меткость и т.п. не учитывать. Копейщики наносят удар первыми (общий нанесённый урон – это сумма атак всех живых копейщиков). Если атака дракона превышает значение очков здоровья копейщика (например, у копейщика хп 10, а атака дракона - 15),  то копейщик погибает, а оставшийся урон действует на оставшихся в живых копейщиков. Например, жизнь дракона 500, атака 55, жизнь одного копейщика 10, атака 10, а количество копейщиков - 20. Лог боя для данного примера должен выглядеть так:
•	Копейщики атакуют (урон 200) – у дракона осталось 300 очков здоровья.
•	Дракон атакует (урон 55) – осталось 15 копейщиков, один из которых ранен (осталось 5 очков здоровья).
•	Копейщики атакуют (урон 150) – у дракона осталось 150 очков здоровья.
•	Дракон атакует (урон 55) – осталось 9 копейщиков.
•	Копейщики атакуют (урон 90) – у дракона осталось 60 очков здоровья.
•	Дракон атакует (урон 55) – осталось 4 копейщика, один из которых ранен (осталось 5 жизней).
•	Копейщики атакуют (урон 40) – у дракона осталось 20 очков здоровья.
•	Дракон атакует  и побеждает.

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите здоровье Дракона");
        int dragonMaxHP = sc.nextInt();
        System.out.println("Введите силу дракона");
        int dragonSTR = sc.nextInt();
        System.out.println("Введите здоровье одного копейщика");
        int knightMaxHP = sc.nextInt();
        System.out.println("Введите силу одного копейщика");
        int knightSTR = sc.nextInt();
        boolean dragonDie = false;
        int knightsMaxCount = 0;
        int knightsCount;
        int dragonHP;
        int knightsHP;
        int knightsDamage;
        do {
            knightsMaxCount++;
            dragonHP = dragonMaxHP;
            knightsHP = knightMaxHP * knightsMaxCount;
            knightsCount = knightsMaxCount;
            System.out.println(knightsMaxCount + " копейщиков пробуют убить дракона");
            do {

                knightsDamage = knightsCount * knightSTR;
                System.out.print(knightsCount + " копейщиков атакуют дракона (" + knightsDamage + " урон) - ");
                dragonHP -= knightsDamage;
                if (dragonHP > 0) {
                    System.out.println("У дракона осталось " + dragonHP + " здоровья");
                } else {
                    System.out.println("Дракон умер");
                    dragonDie = true;
                    break;
                }

                System.out.print("Дракон атакует копейщиков и наносит  (" + dragonSTR + " урона) - ");
                knightsHP -= dragonSTR;
                if (knightsHP > 0) {
                    knightsCount = knightsHP / knightMaxHP + (knightsHP % knightMaxHP > 0 ? 1 : 0);
                    System.out.print(knightsCount + " копейщиков осталось");
                    if (knightsHP % knightMaxHP > 0) {
                        System.out.println(", один из которых ранен (осталось " + knightsHP % knightMaxHP + " здоровья)");
                    } else {
                        System.out.println();
                    }
                } else {
                    System.out.println("все копейщики умерли");
                    break;
                }

            } while (dragonHP > 0 && knightsHP > 0);

        } while (!dragonDie);

        System.out.println(knightsMaxCount + " копейщиков понадобилось для убийства дракона");
    }
}



