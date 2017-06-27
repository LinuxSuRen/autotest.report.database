import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.surenpi.autotest.report.database.dao.ProjectDao;
import com.surenpi.autotest.report.database.dao.ReportDao;
import com.surenpi.autotest.report.database.entity.Project;
import com.surenpi.autotest.report.database.entity.Report;
import com.surenpi.autotest.report.database.writer.ReportDataBaseContext;

/**
 * @author suren
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Rollback
@Transactional
@ContextConfiguration(classes = ReportDataBaseContext.class)
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
