package at.htl.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;

@Entity
@DiscriminatorValue("VISUAL_ARTWORK")
@NamedQuery(name = GreatWork.QUERY_FIND_ALL_VISUAL_ARTWORKS_BY_MEDIUM, query = "SELECT va FROM VisualArtwork va WHERE va.medium = :medium")
public class VisualArtwork extends GreatWork {
    @Column(length = 30)
    private String medium; // (i.e. the material used to create artwork)

    public String getMedium() {
        return medium;
    }
}
