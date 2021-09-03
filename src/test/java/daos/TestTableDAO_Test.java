package daos;

import exceptions.NoSQLResultsException;
import models.TestTable;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
    For every unit test you will follow a similar procedure:
    You will identify the unit under test, and mock anything else.

     Our unit tests will follow the pattern of the 3 A's.
     Arrange - set up the test, identify the SUT, 'mock' and 'stub' any 'collaborators'
     Act - invoke the SUT, preform the actual test
     Assert - check to make sure the expected result holds true
 */


@RunWith(MockitoJUnitRunner.class)
public class TestTableDAO_Test {

    TestTableDAO sut;

    @Mock
    Connection mockConn;

    @Mock
    PreparedStatement mockStatement;

    @Mock
    ResultSet mockResults;



    @Before
    public void setUp() {
        sut = new TestTableDAO(mockConn);
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void test_getTestTableEntryByIdSuccess() throws SQLException, NoSQLResultsException {
        //Arrange
        int id = 1;
        String str = "This is our string.";
        String sql = "Select * FROM test_table WHERE string_id = ? LIMIT 1";
        Mockito.when(mockConn.prepareStatement(sql)).thenReturn(mockStatement);
        Mockito.doNothing().when(mockStatement).setInt(1, id);
        Mockito.when(mockStatement.executeQuery()).thenReturn(mockResults);
        Mockito.when(mockResults.next()).thenReturn(true);
        Mockito.when(mockResults.getInt("string_id")).thenReturn(id);
        Mockito.when(mockResults.getString("string")).thenReturn(str);

        //Act
        TestTable row = sut.get(1);

        //Assert
        //check equality, assert that the thing is what we want
        Assert.assertEquals(id, row.getStringId());
        Assert.assertEquals(str, row.getString());
        //check invocation, assert that the method was invoked exactly the desired number of times
        verify(mockStatement, times(1)).executeQuery();

        //verify an exception is thrown, see @Rule annotation above class
        //we aren't expecting this, but just for example
        //exceptionRule.expect(NoSQLResultsException.class);
    }


}
