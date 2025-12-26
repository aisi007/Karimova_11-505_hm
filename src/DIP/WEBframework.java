package DIP;

public class WEBframework {
    public void save(Iform flm){
        DIP.MySQL db = new MySQL();
        db.save(flm);
    }
}
