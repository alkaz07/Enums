public enum Direction {
    NORTH, SOUTH, EAST, WEST;


    @Override
    public String toString() {
        if (this == EAST)
            return "Восток";
        return name();
    }
}
