public class BonusMilesService {
    public int calculate(int cost) {
        int bonus = 5;
        int bonusSum = cost * bonus / 100;
        return bonusSum; // возвращаемрассчитанный bonus
    }
}