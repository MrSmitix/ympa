package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OfferDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Найденные предложения магазина.
 */
public class OffersDTO   {

    private List<@Valid OfferDTO> offers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public OffersDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OffersDTO.
     *
     * @param offers Список предложений магазина.
     */
    public OffersDTO(
        List<@Valid OfferDTO> offers
    ) {
        this.offers = offers;
    }



    /**
     * Список предложений магазина.
     * @return offers
     */
    public List<@Valid OfferDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid OfferDTO> offers) {
        this.offers = offers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OffersDTO {\n");
        
        sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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

