package compositions;

public enum FamiliarType {

    LIZARD(1),
    OWL(2),
    CAT(3),
    CEREBERUS(4);


    private final int absorption;

    FamiliarType(int absorption){
        this.absorption = absorption;
    }

    public int getAbsorption() {
        return this.absorption;
    }

}
