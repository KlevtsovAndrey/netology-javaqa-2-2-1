public class BonusMilesService {
    public int calculate(int cost) {
        int amount_for_one_bonus_mile = 20;
        return cost / amount_for_one_bonus_mile;
    }
}
