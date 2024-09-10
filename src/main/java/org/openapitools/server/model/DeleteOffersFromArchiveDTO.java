package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Товары, которые не удалось восстановить из архива.
 */
public class DeleteOffersFromArchiveDTO   {

    private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notUnarchivedOfferIds;

    /**
     * Default constructor.
     */
    public DeleteOffersFromArchiveDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create DeleteOffersFromArchiveDTO.
     *
     * @param notUnarchivedOfferIds Список товаров, которые не удалось восстановить из архива.
     */
    public DeleteOffersFromArchiveDTO(
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notUnarchivedOfferIds
    ) {
        this.notUnarchivedOfferIds = notUnarchivedOfferIds;
    }



    /**
     * Список товаров, которые не удалось восстановить из архива.
     * @return notUnarchivedOfferIds
     */
    public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getNotUnarchivedOfferIds() {
        return notUnarchivedOfferIds;
    }

    public void setNotUnarchivedOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notUnarchivedOfferIds) {
        this.notUnarchivedOfferIds = notUnarchivedOfferIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteOffersFromArchiveDTO {\n");
        
        sb.append("    notUnarchivedOfferIds: ").append(toIndentedString(notUnarchivedOfferIds)).append("\n");
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

