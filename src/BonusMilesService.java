public class BonusMilesService {
    public int calculate (int cost) {
        int rublesPerMile = 20;
        int bonusMiles = cost / rublesPerMile;
        return bonusMiles;
    }
}
