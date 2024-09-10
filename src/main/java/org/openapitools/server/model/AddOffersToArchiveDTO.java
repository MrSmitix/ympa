package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AddOffersToArchiveErrorDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Товары, которые не удалось поместить в архив.
 */
public class AddOffersToArchiveDTO   {

    private List<@Valid AddOffersToArchiveErrorDTO> notArchivedOffers;

    /**
     * Default constructor.
     */
    public AddOffersToArchiveDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create AddOffersToArchiveDTO.
     *
     * @param notArchivedOffers Список товаров, которые не удалось поместить в архив.
     */
    public AddOffersToArchiveDTO(
        List<@Valid AddOffersToArchiveErrorDTO> notArchivedOffers
    ) {
        this.notArchivedOffers = notArchivedOffers;
    }



    /**
     * Список товаров, которые не удалось поместить в архив.
     * @return notArchivedOffers
     */
    public List<@Valid AddOffersToArchiveErrorDTO> getNotArchivedOffers() {
        return notArchivedOffers;
    }

    public void setNotArchivedOffers(List<@Valid AddOffersToArchiveErrorDTO> notArchivedOffers) {
        this.notArchivedOffers = notArchivedOffers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOffersToArchiveDTO {\n");
        
        sb.append("    notArchivedOffers: ").append(toIndentedString(notArchivedOffers)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

