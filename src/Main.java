public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.SHOTGUN, "МОЗГА ПО СТЕНКЕ");
        Boss boss = new Boss("Боссяра", 400, 80, bossWeapon);

        System.out.println("информация о боссе:");
        System.out.println("имя: " + boss.getName());
        System.out.println("здоровье: " + boss.getHealth());
        System.out.println("урон: " + boss.getDamage());
        System.out.println("оружие: " + boss.getWeapon().getName() + " (" + boss.getWeapon().getType() + ")");
    }
}
