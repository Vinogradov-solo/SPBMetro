package core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StationTest
{
    Line line;
    Station station;

    @BeforeEach
    public void createObjects()
    {
        line = new Line(2, "Московско-Петроградская");
        station = new Station("Московская", line);
    }

    @Test
    void testGetLine()
    {
        assertEquals(new Line(2, "Московско-Петроградская"), station.getLine());
    }

    @Test
    void testGetName()
    {
        assertEquals("Московская", station.getName());
    }

    @Test
    void testCompareTo()
    {
        Line line1 = new Line(2, "Московско-Петроградская");
        Station station1 = new Station("Московская", line1);
        int lineComparison = line.compareTo(station1.getLine());
        assertEquals(0, lineComparison);
    }

    @Test
    void testEquals()
    {
        Line line1 = new Line(2, "Московско-Петроградская");
        Station station1 = new Station("Московская", line1);
        assertEquals(0, station.compareTo(station1));
    }
}