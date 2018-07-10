package Date;

import java.security.DigestInputStream;

public class Duree {
     private int opt;
     private int[] data;

    public int getOpt() {
        return opt;
    }
    public void setOpt(int opt) {
        this.opt = opt;
    }

    public int[] getData() {
        return data;
    }
    public void setData(int[] data) {
        this.data = data;
    }

    public Duree(int[] data) {
        this.opt = data.length;
        this.data = data;
    }
    public Duree(Date d1, Date d2, int opt = 1){
        if (opt < 1){
            opt = 1;
        }
        else if (opt > 3){
            opt = 3;
        }
        this.opt = opt;
        while (opt > 0){
            switch (opt){
                case 1:
                    this.data[opt - 1] = fj
            }
        }
    }

    public int ecartJours(Date d1, Date d2){
        y
    }
}
