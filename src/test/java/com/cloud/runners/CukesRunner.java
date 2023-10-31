package com.cloud.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "html:target/cucumber-reports.json"
        },
        features = "src/test/resources/features",
        glue = "com/cloud/step_definitions",
        dryRun = true,
        tags = " @wip",
        publish = true //generating a report with public link
)
public class CukesRunner {}


