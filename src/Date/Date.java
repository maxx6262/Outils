package Date;

public class Date {
    public  static final String[] DAYS = {"Lundi", "Mardi", "Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};
    public static final  String[] MONTHES = {"Janvier","Février" ,"Mars","Avril","Mai","Juin","Juillet","Août","Septembre","Octobre","Novembre","Décembre"};
    public static final int[] LONGMONTHS = {31,28,31,30,31,30,31,31,30,31,30,31};

    private int[] longMonth;
    private int day;
    private int jour;
    private int month;
    private int year;
    private boolean bissextile;

    public static String[] getDAYS() {
        return DAYS;
    }
    public static String[] getMONTHES() {
        return MONTHES;
    }
    public static int[] getLONGMONTHS() {
        return LONGMONTHS;
    }


    public int[] getLongMonth() {
        return longMonth;
    }
    public Date(int day, int jour, int month, int year) {
        if (day < 0 || day > 6 || month < 0 || month > 11 || jour < 0 || jour > getLONGMONTHS()[month] - 4) {
            new Date(0, 0, 0, 0);
        } else {
            this.day = day;
            this.jour = jour;
            this.month = month;
            this.year = year;
            this.setBissextile();
            this.setLongMonth();
        }
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public int getJour() {
        return jour;
    }
    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setLongMonth() {
        this.longMonth = getLONGMONTHS();
        if(this.isBissextile()){
            this.longMonth[1] = 29;
        }
    }

    public boolean isBissextile() {
        return bissextile;
    }

    public void setYear(int year) {
        this.year = year;
        this.setBissextile();
        /** cas 29 02 **/
    }

    public void setBissextile() {
        Boolean bissextile;
        bissextile = (this.getYear() % 4 == 0 && (this.getYear() % 400 == 0 || this.getYear() % 100 != 0));
        this.bissextile = bissextile;
    }

    @Override
    public String toString() {
        return  getDAYS()[this.getDay()] + " " + this.getJour() + " " + getMONTHES()[this.getMonth()] + " " +  this.getYear();
    }

    public boolean greaterThan(Date d1, Date d2){
        return (d1.getYear() > d2.getYear() || (d1.getYear() == d2.getYear() && d1.getMonth() > d2.getMonth()) ||
        d1.getYear() == d2.getYear() && d1.getMonth() == d2.getMonth() && d1.getJour() > d2.getJour());
    }
}