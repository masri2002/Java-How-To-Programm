package TowersOfHanoi;

public class Main {
    public static void solveTowers(int disks ,int sourcePeg ,int destinationPeg ,int tempPeg){
        if(disks==1){
            System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);
             return;
        }
        solveTowers(disks - 1, sourcePeg, tempPeg, destinationPeg);
        System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);
        solveTowers(disks - 1, sourcePeg, tempPeg, destinationPeg);
    }
    public static void main(String[] args) {
        solveTowers(5, 1, 3, 2);
    }
}
