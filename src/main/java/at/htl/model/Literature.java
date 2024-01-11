package at.htl.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;

@Entity
@DiscriminatorValue("LITERATURE")
@NamedQuery(name = GreatWork.QUERY_FIND_ALL_LITERATURE_SORTED_BY_PAGE_NUMBER_ASC, query = "SELECT l FROM Literature l ORDER BY l.pages ASC")
public class Literature extends GreatWork {
    @Column(length = 7)
    private int pages;

    public int getPages() {
        return pages;
    }
}
