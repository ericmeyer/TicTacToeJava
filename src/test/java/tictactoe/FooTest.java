package tictactoe;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class FooTest {
    @Test
    public void FooExists() {
        Foo foo = new Foo();
        assertThat(foo, is(notNullValue()));
    }
}
