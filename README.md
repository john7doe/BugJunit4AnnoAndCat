# BugJunit4AnnoAndCat
Small project to show that current Junit4 annotation filter does not work when combined with Suites

# Not working

`adb shell am instrument -w -r   -e debug false -e annotation 'com.john7doe.junitfilter.MyAnnotation'  com.john7doe.junitfilter.test/androidx.test.runner.AndroidJUnitRunner`

# Workaround

Use suite directly:

`adb shell am instrument -w -r   -e debug false -e class 'com.john7doe.junitfilter.FeatureSuiteOfSuites' com.john7doe.junitfilter.test/androidx.test.runner.AndroidJUnitRunner
`

Or if multible suites are tagged with `@MyAnnotation`, create a suite of suites: 

adb shell am instrument -w -r   -e debug false -e class 'com.john7doe.junitfilter.FeatureSuiteOfSuites' com.john7doe.junitfilter.test/androidx.test.runner.AndroidJUnitRunner
