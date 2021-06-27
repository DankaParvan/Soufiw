package Soufiw;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/daniil/IdeaProjects/Craft/nn's");
        File file1 = new File("/Users/daniil/IdeaProjects/Craft/nn's eztk");
        SoufiwReader soufiwReader = new SoufiwReader();
        soufiwReader.read(file);
        System.out.println("♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂");
        SoufiwReaderZapasnoy soufiwReaderZapasnoy = new SoufiwReaderZapasnoy();
        soufiwReaderZapasnoy.read(file1);


    }
}
