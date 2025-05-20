package com.example.android.testing.espresso.BasicSample.test;

import org.junit.runner.RunWith;

import io.cucumber.android.runner.CucumberAndroidJUnitRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"}
)
public class Instrumentation extends CucumberAndroidJUnitRunner {
}
