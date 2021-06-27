package Soufiw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoufiwReaderZapasnoy implements Soufiw{

    private List<Eztk> eztks = new ArrayList<>();

    @Override
    public void read(File file) throws FileNotFoundException {

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            eztks.add(new Eztk(scanner.next(), Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next())));
        }
        for (int i = 0; i < eztks.size(); i++) {
            System.out.print("Nickname: " + eztks.get(i).getNickname());
            System.out.print(" UUID: " + eztks.get(i).getUuid());
            System.out.print(" Inviter: " + eztks.get(i).getInviter() + "\n");

        }


    }
}
