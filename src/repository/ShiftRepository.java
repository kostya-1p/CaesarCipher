package repository;

public class ShiftRepository {

    private int[] shiftArray;

    public void fillShiftArray(int alphabetSize) {
        shiftArray = new int[alphabetSize];

        for (int i = 0; i < alphabetSize; i++) {
            shiftArray[i] = i;
        }
    }

    public int[] getShiftArray() {
        return shiftArray;
    }
}
