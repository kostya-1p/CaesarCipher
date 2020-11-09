package service;

import repository.ShiftRepository;

public class ShiftService {
    ShiftRepository shiftRepository = new ShiftRepository();

    public ShiftService() {
        int RussianAlphabetSize = 33;
        shiftRepository.fillShiftArray(RussianAlphabetSize);
    }

    public int[] getShiftArray() {
        return shiftRepository.getShiftArray();
    }
}
