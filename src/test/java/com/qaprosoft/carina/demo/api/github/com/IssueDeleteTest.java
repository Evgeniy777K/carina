package com.qaprosoft.carina.demo.api.github.com;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.methods.api.DeleteIssueMethod;
import com.qaprosoft.carina.demo.methods.api.DeleteRepoMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class IssueDeleteTest extends AbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());


    @Test(description = "JIRA#DEMO-004")
    @MethodOwner(owner = "qpsdemo")
    public void deleteCurrentRepoTest() {
        DeleteIssueMethod issueMethod = new DeleteIssueMethod();
        issueMethod.expectResponseStatus(HttpResponseStatusType.NO_CONTENT_204);
        issueMethod.callAPI();
        issueMethod.validateResponse();
        LOGGER.info("Issue deleted");
    }
}
