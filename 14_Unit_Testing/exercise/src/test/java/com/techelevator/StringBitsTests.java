package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringBitsTests {

     @Test
     public void AnimalGroupNameTest(){
         AnimalGroupName group = new AnimalGroupName();

         // Testing Input to output
         assertEquals("getHerd(\"rhino\") should return Crash", "Crash", group.getHerd("rhino"));
         assertEquals("getHerd(\"giraffe\") should return Crash", "Tower", group.getHerd("giraffe"));
         assertEquals("getHerd(\"elephant\") should return Crash", "Herd", group.getHerd("elephant"));
         assertEquals("getHerd(null) should return Crash", "unknown", group.getHerd(null));

         // Testing case-insensitive
         assertEquals("getHerd(\"Rhino\") should return Crash", "Crash", group.getHerd("Rhino"));
         assertEquals("getHerd(\"Giraffe\") should return Crash", "Tower", group.getHerd("Giraffe"));
         assertEquals("getHerd(\"Elephant\") should return Crash", "Herd", group.getHerd("Elephant"));
     }

     @Test
    public void CigarPartyTest(){
         CigarParty party = new CigarParty();

         // test number of cigars with false
         assertEquals("haveParty(30, false) should return false", false, party.haveParty(30, false));
         assertEquals("haveParty(50, false) should return false", true, party.haveParty(50, false));
         assertEquals("haveParty(70, false) should return false", false, party.haveParty(70, false));

         // test upper bound if weekend is true
         assertEquals("haveParty(30, false) should return false", false, party.haveParty(30, false));
         assertEquals("haveParty(50, true) should return true", true, party.haveParty(50, true));
         assertEquals("haveParty(70, true) should return true", true, party.haveParty(70, true));
     }

     @Test
     public void DateFashionTest(){
         DateFashion fashion = new DateFashion();

         assertEquals("getATable(5, 10) should return 2", 2, fashion.getATable(5, 10));
         assertEquals("getATable(5, 2) should return 0", 0, fashion.getATable(5, 2));
         assertEquals("getATable(5, 5) should return 1", 1, fashion.getATable(5, 5));
         assertEquals("getATable(8, 8) should return 2", 2, fashion.getATable(8, 8));
         assertEquals("getATable(3, 3) should return 1", 1, fashion.getATable(3, 3));
     }

     @Test
     public void FrontTimesTest(){
         FrontTimes font = new FrontTimes();
         // Test Number of times
         assertEquals("generateString(\"Chocolate\", 3) should return ChoChoCho", "ChoChoCho", font.generateString("Chocolate", 3));
         assertEquals("generateString(\"Chocolate\", 2) should return ChoCho", "ChoCho", font.generateString("Chocolate", 2));

         // Less character test
         assertEquals("generateString(\"At\", 2) should return AtAt", "AtAt", font.generateString("At", 2));
         assertEquals("generateString(\"\", 2) should return ", "", font.generateString("", 2));

         // null test
         assertEquals("generateString(null, 2) should return null", "", font.generateString(null, 2));
     }

     @Test
     public void Less20Test(){
         Less20 less = new Less20();

         assertEquals("isLessThanMultipleOf20(18) should return true", true, less.isLessThanMultipleOf20(18));
         assertEquals("isLessThanMultipleOf20(19) should return true", true, less.isLessThanMultipleOf20(19));
         assertEquals("isLessThanMultipleOf20(20) should return false", false, less.isLessThanMultipleOf20(20));
         assertEquals("isLessThanMultipleOf20(15) should return false", false, less.isLessThanMultipleOf20(15));
         assertEquals("isLessThanMultipleOf20(25) should return false", false, less.isLessThanMultipleOf20(25));
         assertEquals("isLessThanMultipleOf20(38) should return true", true, less.isLessThanMultipleOf20(38));
         assertEquals("isLessThanMultipleOf20(39) should return true", true, less.isLessThanMultipleOf20(39));
     }

     @Test
     public void Lucky13Test(){

         Lucky13 luck = new Lucky13();

         // true value test
         assertEquals("getLucky([0, 2, 4]) should return true",true, luck.getLucky(new int[]{0, 2, 4}));
         assertEquals("getLucky([0, 5, 7]) should return true",true, luck.getLucky(new int[]{0, 5, 7}));

         // false value test
         assertEquals("getLucky([1, 2, 3]) should return false",false, luck.getLucky(new int[]{1, 2, 3}));
         assertEquals("getLucky([0, 2, 3]) should return false",false, luck.getLucky(new int[]{0, 2, 3}));
         assertEquals("getLucky([1, 2, 4]) should return false",false, luck.getLucky(new int[]{1, 2, 4}));

         // null value test
         assertEquals("getLucky(null) should return true",true, luck.getLucky(null));
     }

     @Test
     public void MaxEnd3Test(){
         MaxEnd3 maxEnd = new MaxEnd3();

         assertArrayEquals("makeArray([1, 2, 3]) should return [3, 3, 3]", new int[]{3, 3, 3}, maxEnd.makeArray(new int[]{1, 2, 3}));
         assertArrayEquals("makeArray([11, 5, 9]) should return [11, 11, 11]", new int[]{11, 11, 11}, maxEnd.makeArray(new int[]{11, 5, 9}));
         assertArrayEquals("makeArray([7, 13, 12]) should return [12, 12, 12]", new int[]{12, 12, 12}, maxEnd.makeArray(new int[]{7, 13, 12}));
     }

     @Test
    public void nonStartTest(){

         //testing String values
         NonStart start = new NonStart();
         assertEquals("getPartialString(\"Hello\", \"There\") should return \"ellohere\"","ellohere", start.getPartialString("Hello", "There"));
         assertEquals("getPartialString(\"java\", \"code\") should return \"avaode\"","avaode", start.getPartialString("java", "code"));

         //testing null values
         assertEquals("getPartialString(null, \"java\") should return \"ava\"","ava", start.getPartialString(null, "java"));
         assertEquals("getPartialString(null, null) should return \"\"","", start.getPartialString(null, null));
     }

     @Test
    public void SameFirstLastTest(){
         SameFirstLast same = new SameFirstLast();
         //testing input values
         assertEquals("isItTheSame([1, 2, 3]) should return false",false, same.isItTheSame(new int[] {1, 2, 3}));
         assertEquals("isItTheSame([1, 2, 3, 1]) should return true",true, same.isItTheSame(new int[] {1, 2, 3, 1}));
         assertEquals("isItTheSame([1, 2, 1]) should return true",true, same.isItTheSame(new int[] {1, 2, 1}));

         //testing null value
         assertEquals("isItTheSame(null) should return false",false, same.isItTheSame(null));
     }

     @Test
    public void StringBitsTest(){
         StringBits stringBit = new StringBits();

         assertEquals("getBits(\"Hello\") should return \"Hlo\"","Hlo", stringBit.getBits("Hello"));
         assertEquals("getBits(\"Heeololeo\") should return \"Hello\"","Hello", stringBit.getBits("Heeololeo"));
         assertEquals("getBits(\"The set\") should return \"Test\"","Test", stringBit.getBits("The set"));

         //testing null values
         assertEquals("getBits(null) should return \"\"","", stringBit.getBits(null));

    }

    @Test
    public void WordCount(){
         WordCount word = new WordCount();
         Map<String, Integer> words= new HashMap<String, Integer>();

        words.put("ba", 2);
        words.put("black", 1);
        words.put("sheep", 1);
        assertEquals("getCount({\"ba\", \"ba\", \"black\", \"sheep\"}) should return {\"ba\": 2, \"black\": 1, \"sheep\": 1}", words, word.getCount(new String[]{"ba", "ba", "black", "sheep"}));

        words = new HashMap<String, Integer>();
        words.put("a", 1);
        words.put("b", 1);
        words.put("c", 1);
        assertEquals("getCount({\"c\", \"b\", \"a\"}) should return {\"a\": 1, \"b\": 1, \"c\": 1}", words, word.getCount(new String[]{"c", "b", "a"}));

        //testing null values
        words = new HashMap<String, Integer>();
        assertEquals("getCount(null) should return {}", words, word.getCount(null));

    }
     

}
