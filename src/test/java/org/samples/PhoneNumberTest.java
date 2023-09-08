package org.samples;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneNumberTest {
    @Test
    public void test1() {

        PhoneNumber ph = new PhoneNumber("+1(858)775-2868");

        assertEquals("+1(858)775-2868", ph.getOriginalText());
        assertEquals("+18587752868", ph.getStrippedNumber());
        assertEquals("(858)775-2868", ph.getValueAsNorthAmerican());
        assertEquals("+1.858.775.2868", ph.getValueAsInternational());
    }

    @Test
    public void test2() {
        PhoneNumber ph = new PhoneNumber("+1(858)775-2868x123");

        assertEquals("+1(858)775-2868x123", ph.getOriginalText());
        assertEquals("+18587752868x123", ph.getStrippedNumber());
        assertEquals("(858)775-2868x123", ph.getValueAsNorthAmerican());
        assertEquals("+1(858)775-2868x123", ph.getValueAsInternational());
    }

    @Test
    public void test3() {
        PhoneNumber ph = new PhoneNumber("+598.123.4567x858");

        assertEquals("+598.123.4567x858", ph.getOriginalText());
        assertEquals("+5981234567x858", ph.getStrippedNumber());
        assertEquals(null, ph.getValueAsNorthAmerican());
        assertEquals("+598.123.456.7x858", ph.getValueAsInternational());
    }

    @Test
    public void test4() {
        PhoneNumber ph = new PhoneNumber("+27 1234 5678 ext 4");

        assertEquals("+27 1234 5678 ext 4", ph.getOriginalText());
        assertEquals("+2712345678x4", ph.getStrippedNumber());
        assertEquals(null, ph.getValueAsNorthAmerican());
        assertEquals("+27 1234 5678 ext 4", ph.getValueAsInternational());
    }

    @Test
    public void test5() {
        PhoneNumber ph = new PhoneNumber("858-775-2868");

        assertEquals("858-775-2868", ph.getOriginalText());
        assertEquals("+18587752868", ph.getStrippedNumber());
        assertEquals("(858)775-2868", ph.getValueAsNorthAmerican());
        assertEquals("+1.858.775.2868", ph.getValueAsInternational());
    }
}