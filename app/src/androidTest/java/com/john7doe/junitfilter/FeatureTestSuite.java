package com.john7doe.junitfilter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@MyAnnotation()
@RunWith(Suite.class)
@Suite.SuiteClasses({ ParaTest.class})

public class FeatureTestSuite {
}
