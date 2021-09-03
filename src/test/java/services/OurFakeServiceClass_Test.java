package services;

import models.TestTable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OurFakeServiceClass_Test {
    OurFakeServiceClass sut;

    @Mock
    TestTable mockTestTable;

    @Before
    public void startUp() {
        sut = new OurFakeServiceClass();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void test_testOurFakeClassDoesTheThingSuccess() {
        //arrange
        //act
        //assert

    }
}
