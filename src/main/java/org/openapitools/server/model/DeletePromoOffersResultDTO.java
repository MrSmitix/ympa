package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.RejectedPromoOfferDeleteDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. 
 */
public class DeletePromoOffersResultDTO   {

    private List<@Valid RejectedPromoOfferDeleteDTO> rejectedOffers;

    /**
     * Default constructor.
     */
    public DeletePromoOffersResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create DeletePromoOffersResultDTO.
     *
     * @param rejectedOffers Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
     */
    public DeletePromoOffersResultDTO(
        List<@Valid RejectedPromoOfferDeleteDTO> rejectedOffers
    ) {
        this.rejectedOffers = rejectedOffers;
    }



    /**
     * Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
     * @return rejectedOffers
     */
    public List<@Valid RejectedPromoOfferDeleteDTO> getRejectedOffers() {
        return rejectedOffers;
    }

    public void setRejectedOffers(List<@Valid RejectedPromoOfferDeleteDTO> rejectedOffers) {
        this.rejectedOffers = rejectedOffers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePromoOffersResultDTO {\n");
        
        sb.append("    rejectedOffers: ").append(toIndentedString(rejectedOffers)).append("\n");
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

