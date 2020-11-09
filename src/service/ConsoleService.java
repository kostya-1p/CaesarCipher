package service;

public class ConsoleService {

    public void printEncryptedText(String encryptedText) {
        System.out.println("Исходный текст:");
        System.out.println(encryptedText);
        System.out.println();
    }

    public void printDecryptionResult(int shift, String decryptedText) {
        System.out.println("Сдвиг = " + shift + ". Расшифрованный текст: ");
        System.out.println(decryptedText);
        System.out.println();
    }
}
