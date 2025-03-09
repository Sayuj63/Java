//Q2. ii. Rename a file


import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        String oldFileName = "example.txt";
        String newFileName = "updated_example.txt";

        File oldFile = new File(oldFileName);
        File newFile = new File(newFileName);

        if (oldFile.exists() && !newFile.exists()) {
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed to: " + newFileName);
            } else {
                System.out.println("Renaming failed");
            }
        } else {
            System.out.println("File does not exist or new file name already taken");
        }
    }
}
