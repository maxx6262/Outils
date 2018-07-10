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

    public Duree(Date d1, Date d2 ) {
        this(d1, d2, 1);
    }

    public Duree(Date d1, Date d2, int opt1) {
        /* revoir cond GT */
        if(! d1.greaterThan(d1,d2)) {
            Date tmp = d1;
            d1 = d2;
            d2 = tmp;
        }
        if (opt < 1){
            opt = 1;
        }
        else if (opt > 3){
            opt = 3;
        }
        this.opt = opt;
        int tmp = -1;
        while (opt > 0){
            switch (opt){
                case 1:
                    tmp = d1.getMonth() - d2.getMonth();
                    if (tmp == 0) {
                        tmp += (d1.getJour() - d2.getJour());
                    }
                    if(tmp < 0 ){
                        tmp = -1;
                    }
                    else {
                        tmp = 0;
                    }
                    tmp = d1.getYear() - d2.getYear() + tmp;
                case 2:
                   tmp = d1.getMonth() - d2.getMonth();
                case 3:
                    tmp = d1.getJour() - d2.getJour();
            }
            this.data[opt - 1] = tmp;
            opt--;
        }
    }

    public int ecartJours(Date d1, Date d2){
        int rep = 0;
        Date tmp = d1;
        for(int y = d1.getYear(); y <d2.getYear(); y++ ){
            tmp.setYear(y);
            if(tmp.isBissextile()){
                rep++;
            }
            rep += 365;
        }
        for (int m = d1.getMonth(); m < d2.getMonth();m++){
            tmp.setMonth(m);
            rep += tmp.getLongMonth()[m];
            /** gestion des mois a revoir */
        }
        for (int d = d1.getJour(); d < d2.getDay();d++){
            tmp.setDay(d);
            rep++;
        }
        return rep;
    }

}
