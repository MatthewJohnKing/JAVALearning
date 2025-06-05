package Course3;

import java.awt.Color;

public class Tree {
    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType; // creating as an enum
    protected static Color TRUNK_COLOR = new Color(102,51,0);

    // An enum is a special type that represents a group of constants.
    // only types that can exist are in the class.


    public double getHeightFt() {
        return heightFt;
    }
    public void setHeightFt(double heightFt) {
        this.heightFt = heightFt;
    }
    public double getTrunkDiameterInches() {
        return trunkDiameterInches;
    }
    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }
    public TreeType getTreeType() {
        return treeType;
    }
    // No setter for the TreeType because it wants to be fixed.

    public Tree(TreeType treeType, double trunkDiameterInches, double heightFt) {
        this.treeType = treeType;
        this.trunkDiameterInches = trunkDiameterInches;
        this.heightFt = heightFt;
    }

    public void grow(){
        this.heightFt+=10;
        this.trunkDiameterInches+=1;
    }

    public void isTall(){
        if (this.heightFt>100){
            System.out.println("That is a tall" + this.treeType +"Tree!");
        }
    }

    public static void announceTree(){
        System.out.println("Look out for that Tree!");
    }
}
