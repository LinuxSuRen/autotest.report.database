import com.surenpi.autotest.report.ReportDatabaseContext;
import com.surenpi.autotest.report.dao.ProjectDao;
import com.surenpi.autotest.report.dao.ReportDao;
import com.surenpi.autotest.report.entity.Project;
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
@ContextConfiguration(classes = ReportDatabaseContext.class)
public class DbTest
{
    @Autowired
    private ReportDao reportDao;
    @Autowired
    private ProjectDao projectDao;

    @Test
    public void crud()
    {
        Assert.assertNotNull(reportDao);
        Assert.assertNotNull(projectDao);

        Project project = new Project();
        projectDao.save(project);

        Assert.assertNotNull(project.getId());

        Report report = new Report();
        report.setProjectId(project.getId());
        reportDao.save(report);
    }
}
