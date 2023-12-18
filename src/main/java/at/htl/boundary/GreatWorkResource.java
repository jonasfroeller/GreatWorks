package at.htl.boundary;

import at.htl.model.GreatWork;
import at.htl.model.Literature;
import at.htl.model.VisualArtwork;
import at.htl.repository.GreatWorkRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/api/great-work/")
public class GreatWorkResource {
    @Inject
    GreatWorkRepository greatWorkRepository;

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<GreatWork> getAllGreatWorksSortedAscendingByYearFinished() {
        return greatWorkRepository.getAllGreatWorksSortedAscendingByYearFinished();
    }

    @GET
    @Path("list/visual-artworks/by-medium/{medium}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<VisualArtwork> getAllVisualArtworksByMedium(@PathParam("medium") String medium) {
        return greatWorkRepository.getAllVisualArtworksByMedium(medium);
    }

    @GET
    @Path("list/books")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Literature> getAllLiteratureSortedAscendingByPageNumber() {
        return this.greatWorkRepository.getAllLiteratureSortedAscendingByPageNumber();
    }
}