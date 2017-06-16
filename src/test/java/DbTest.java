import com.surenpi.autotest.report.PersistenceContext;
import com.surenpi.autotest.report.dao.ReportDao;
import com.surenpi.autotest.report.entity.Report;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author suren
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersistenceContext.class)
public class DbTest
{
    @Autowired
    private ReportDao reportDao;

    @Test
    public void save()
    {
        Assert.assertNotNull(reportDao);

        Report report = new Report();
        report.setId((int) System.currentTimeMillis());
        reportDao.save(report);
    }
}
