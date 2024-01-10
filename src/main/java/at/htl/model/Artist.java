package at.htl.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "ARTIST")
@NamedQuery(name = Artist.QUERY_FIND_ALL, query = "SELECT a FROM Artist a WHERE :year BETWEEN a.yearBorn AND a.yearDied ORDER BY a.name")
@NamedQuery(name = Artist.QUERY_FIND_BY_ID, query = "SELECT a FROM Artist a WHERE a.id = :id")
public class Artist {
    public static final String QUERY_FIND_ALL = "Artist.GET.ALL.BY(YEAR)";
    public static final String QUERY_FIND_BY_ID = "Artist.GET.ONE.BY(ID)";

    @Id
    private Long id;

    @OneToMany(mappedBy = "artist")
    @JsonIgnoreProperties({"artist"})
    private List<GreatWork> greatWorks = new LinkedList<>();

    private String name;
    @Column(name = "year_born")
    private int yearBorn;
    @Column(name = "year_died")
    private int yearDied;

    public Long getId() {
        return id;
    }

    public List<GreatWork> getGreatWorks() {
        return greatWorks;
    }

    public String getName() {
        return name;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public int getYearDied() {
        return yearDied;
    }
}
