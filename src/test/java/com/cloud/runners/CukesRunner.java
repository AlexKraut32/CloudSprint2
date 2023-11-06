package com.cloud.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber-reports.json"
        },
        features = "src/test/resources/features",
        glue = "com/cloud/step_definitions",
        dryRun = false,
 B30G8-80_US-001DashboardFunctionality_Eugene
        tags = "",

        tags = "@B30G8-108",
master
        publish = true //generating a report with public link
)
public class CukesRunner {}


