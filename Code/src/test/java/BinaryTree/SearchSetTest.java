package BinaryTree;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SearchSetTest{
    @Test
    public void SearchSet_getNumbersElementTest(){
        SearchSet searchset = new SearchSet();
        searchset.insert(3);
        searchset.insert(4);
        searchset.insert(5);
        searchset.insert(6);
        int x = searchset.getNumbersElement();
        assertThat(x).isEqualTo(4);
    }
    @Test
    public void SearchSet_containsTest_forAllElements(){
        SearchSet searchset = new SearchSet();
        searchset.insert(3);
        searchset.insert(4);
        searchset.insert(5);
        searchset.insert(6);
        searchset.insert(7);
        for(int x = 3; x <= 7; x++){
            assertThat(searchset.contains(x)).isTrue();
        }
    }

    @Test
    public void SearchSet_containsTest_falseForElementNotExisting(){
        SearchSet searchset = new SearchSet();
        searchset.insert(3);
        searchset.insert(4);
        searchset.insert(5);
        searchset.insert(6);
        assertThat(searchset.contains(2)).isFalse();
        assertThat(searchset.contains(7)).isFalse();
    }
}