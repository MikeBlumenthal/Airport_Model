public enum PlaneType {
    BOEING747(400),
    BOEING767(200),
    BOEING737(100),
    DOUGLASDC9(80),
    LEARJET40(10);

    private final int capacity;

    PlaneType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }
}
