package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
 */
public class DeleteOffersDTO   {

    private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notDeletedOfferIds;

    /**
     * Default constructor.
     */
    public DeleteOffersDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create DeleteOffersDTO.
     *
     * @param notDeletedOfferIds Список SKU товаров, которые не удалось удалить.
     */
    public DeleteOffersDTO(
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notDeletedOfferIds
    ) {
        this.notDeletedOfferIds = notDeletedOfferIds;
    }



    /**
     * Список SKU товаров, которые не удалось удалить.
     * @return notDeletedOfferIds
     */
    public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getNotDeletedOfferIds() {
        return notDeletedOfferIds;
    }

    public void setNotDeletedOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notDeletedOfferIds) {
        this.notDeletedOfferIds = notDeletedOfferIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteOffersDTO {\n");
        
        sb.append("    notDeletedOfferIds: ").append(toIndentedString(notDeletedOfferIds)).append("\n");
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

