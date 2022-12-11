import core.Line;
import core.Station;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

class StationIndexTest
{
    HashMap<Integer, Line> number2line;
    TreeSet<Station> stations;
    TreeMap<Station, TreeSet<Station>> connections;
    Line line;
    Station station;

    @BeforeEach
    public void createObjects()
    {
        number2line = new HashMap<>();
        stations = new TreeSet<>();
        connections = new TreeMap<>();

        line = new Line(2, "Московско-Петроградская");
        station = new Station("Московская", line);
    }

    @Test
    void testAddStation()
    {
        stations.add(station);
        assertEquals(1, stations.size());
    }

    @Test
    void testAddLine()
    {
        number2line.put(line.getNumber(), line);
        assertEquals(1, number2line.size());
    }

    @Test
    void testGetLine()
    {
    }

    @Test
    void testGetStation()
    {
    }

    @Test
    void testGetConnectedStations()
    {
    }
}