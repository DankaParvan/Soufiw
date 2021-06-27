package Soufiw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Eztk{
    private int uuid;
    private String nickname;
    private int inviter;

    public Eztk(int uuid, String nickname, int inviter) {
        this.uuid = uuid;
        this.nickname = nickname;
        this.inviter = inviter;
    }
    public Eztk(String nickname, int uuid, int inviter) {
        this.nickname = nickname;
        this.uuid = uuid;
        this.inviter = inviter;
    }


    public int getUuid() {
        return uuid;
    }

    public String getNickname() {
        return nickname;
    }

    public int getInviter() {
        return inviter;
    }
}
