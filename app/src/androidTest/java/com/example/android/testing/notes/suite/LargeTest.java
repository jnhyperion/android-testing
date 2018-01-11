package com.example.android.testing.notes.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by jnhuang on 1/11/2018.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                com.example.android.testing.notes.notes.NotesScreenTest.class,
                com.example.android.testing.notes.notes.AppNavigationTest.class
        }
)

public class LargeTest {
}
