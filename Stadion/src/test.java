import bO.Gewaltbereitschaft;
import bO.Zuschauer;
import dao.ZuschauerVorhandenException;
import dao.zuschauerDao;

public class test {
    public static void main(String[] args) {
        new test().doWork();
    }

    public void doWork() {
    zuschauerDao instance = zuschauerDao.getInstance();

    try{
        instance.Insert(new Zuschauer("Lisa Müller", 30, "987654321", Gewaltbereitschaft.FRIEDLICH));
    } catch (ZuschauerVorhandenException e)
    {
        System.out.println(e.getMessage());
    }
        System.out.println(instance.findAll());
    }
}