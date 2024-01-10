package at.htl.model;

import jakarta.persistence.*;

@Entity
@Table(name = "GREAT_WORK")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "work_type", discriminatorType = DiscriminatorType.STRING)
@NamedQuery(name = GreatWork.QUERY_FIND_ALL_SORTED_BY_YEAR_FINISHED_ASC, query = "SELECT gw FROM GreatWork gw ORDER BY gw.yearFinished ASC")
public abstract class GreatWork {
    public static final String QUERY_FIND_ALL_SORTED_BY_YEAR_FINISHED_ASC = "GreatWork.GET.ALL.BY(YEAR_FINISHED.ASC)";
    public static final String QUERY_FIND_ALL_VISUAL_ARTWORKS_BY_MEDIUM = "GreatWork.GET.ALL.VISUAL_ARTWORKS.BY(MEDIUM)";
    public static final String QUERY_FIND_ALL_LITERATURE_SORTED_BY_PAGE_NUMBER_ASC = "GreatWork.GET.ALL.LITERATURE.BY(PAGE_NUMBER.ASC)";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Artist artist;

    private String name;
    @Column(name = "year_finished")
    private int yearFinished;

    public Long getId() {
        return id;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getYearFinished() {
        return yearFinished;
    }
}
