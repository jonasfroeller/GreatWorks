package at.htl.repository;

import at.htl.model.GreatWork;
import at.htl.model.Literature;
import at.htl.model.VisualArtwork;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

@ApplicationScoped
public class GreatWorkRepository {
    @Inject
    EntityManager entityManager;

    public List<GreatWork> getAllGreatWorksSortedAscendingByYearFinished() {
        return entityManager.createNamedQuery(GreatWork.QUERY_FIND_ALL_SORTED_BY_YEAR_FINISHED_ASC, GreatWork.class).getResultList();
    }

    public List<VisualArtwork> getAllVisualArtworksByMedium(String medium) {
        TypedQuery<VisualArtwork> query = entityManager.createNamedQuery(GreatWork.QUERY_FIND_ALL_VISUAL_ARTWORKS_BY_MEDIUM, VisualArtwork.class);
        query.setParameter("medium", medium);

        return query.getResultList(); // list is empty if there are no results
    }

    public List<Literature> getAllLiteratureSortedAscendingByPageNumber() {
        return entityManager.createNamedQuery(GreatWork.QUERY_FIND_ALL_LITERATURE_SORTED_BY_PAGE_NUMBER_ASC, Literature.class).getResultList();
    }
}
