import dao.ConnectionUtil;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;

public class communication {
    @Test
    public void connectiontoBD(){

       ConnectionUtil.getFactory();

    }

}
