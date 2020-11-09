package service;

import repository.FileRepository;

public class DecryptionService {

    private ConsoleService consoleService = new ConsoleService();
    private ShiftService shiftService = new ShiftService();
    private FileRepository fileRepository = new FileRepository();

    private String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public String decrypt(int shift, StringBuilder encryptedText) {

        for (int i = 0; i < encryptedText.length(); i++) {
            char currentSymbol = encryptedText.charAt(i);
            int alphabetPosition = alphabet.indexOf(currentSymbol);

            if (alphabetPosition != -1) {

                if (alphabetPosition + shift >= alphabet.length()) {
                    encryptedText.setCharAt(i, alphabet.charAt((shift - (alphabet.length() - alphabetPosition))));
                } else {
                    encryptedText.setCharAt(i, alphabet.charAt(alphabetPosition + shift));
                }
            }
        }
        return encryptedText.toString();
    }

    public void iterateDecryption() {
        StringBuilder encryptedText = fileRepository.readFile("text.txt");

        int[] shiftArray = shiftService.getShiftArray();
        consoleService.printEncryptedText(encryptedText.toString());

        for (int shift : shiftArray) {
            String decryptedText = decrypt(shift, new StringBuilder(encryptedText));
            consoleService.printDecryptionResult(shift, decryptedText);
        }
    }

}
