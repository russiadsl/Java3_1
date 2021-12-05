public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonusSum10000 = service.calculate( 10000);
        System.out.println(bonusSum10000);

        int bonusSum10 = service.calculate( 10);
        System.out.println(bonusSum10);

        int bonusSum0 = service.calculate( 0);
        System.out.println(bonusSum0);

        int bonusSum50 = service.calculate( 50);
        System.out.println(bonusSum50);
    }
}