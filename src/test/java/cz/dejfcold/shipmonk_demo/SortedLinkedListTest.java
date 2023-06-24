package cz.dejfcold.shipmonk_demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SortedLinkedListTest {

    @Test
    void when_createdWithUnsortedIntList_then_sorted() {
        var list = SortedLinkedList.ofInts(List.of(3, 2, 1));

        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
    }

    @Test
    void when_createdWithUnsortedIntVarArgs_then_sorted() {
        var list = SortedLinkedList.ofInts(3, 2, 1);

        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
    }

    @Test
    void when_createdWithUnsortedStringList_then_sorted() {
        var list = SortedLinkedList.ofStrings(List.of("C", "B", "A"));

        Assertions.assertEquals("A", list.get(0));
        Assertions.assertEquals("B", list.get(1));
        Assertions.assertEquals("C", list.get(2));
    }

    @Test
    void when_createdWithUnsortedStringVarArgs_then_sorted() {
        var list = SortedLinkedList.ofStrings("C", "B", "A");

        Assertions.assertEquals("A", list.get(0));
        Assertions.assertEquals("B", list.get(1));
        Assertions.assertEquals("C", list.get(2));
    }

    @Test
    void when_addingMiddleValue_then_sorted() {
        var list = SortedLinkedList.ofInts(1, 3);
        list.add(2);

        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
    }

    @Test
    void when_addingMiddleValueWithIndex_then_sortedAndIndexIgnored() {
        var list = SortedLinkedList.ofInts(1, 3);
        list.add(0, 2);

        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
    }

    @Test
    void when_offeredMiddleValue_then_sorted() {
        var list = SortedLinkedList.ofInts(1, 3);
        list.offer(2);

        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
    }

    @Test
    void when_offeredFirstMiddleValue_then_sorted() {
        var list = SortedLinkedList.ofInts(1, 3);
        list.offerFirst(2);
        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
    }

    @Test
    void when_offeredLastMiddleValue_then_sorted() {
        var list = SortedLinkedList.ofInts(1, 3);
        list.offerLast(2);

        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
    }

    @Test
    void when_pushedMiddleValue_then_sorted() {
        var list = SortedLinkedList.ofInts(1, 3);
        list.push(2);

        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
    }

    @Test
    void when_addingMultipleMiddleValues_then_sorted() {
        var list = SortedLinkedList.ofInts(1, 4);
        list.addAll(List.of(3, 2));

        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
        Assertions.assertEquals(4, list.get(3));
    }

    @Test
    void when_addingMultipleMiddleValuesWithIndex_then_sortedAndIndexIgnored() {
        var list = SortedLinkedList.ofInts(1, 4);
        list.addAll(0, List.of(3, 2));

        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
        Assertions.assertEquals(4, list.get(3));
    }

    @Test
    void when_addingFirstMiddleValue_then_sorted() {
        var list = SortedLinkedList.ofInts(1, 3);
        list.addFirst(2);

        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
    }

    @Test
    void when_addingLastMiddleValue_then_sorted() {
        var list = SortedLinkedList.ofInts(1, 3);
        list.addLast(2);

        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
    }
}