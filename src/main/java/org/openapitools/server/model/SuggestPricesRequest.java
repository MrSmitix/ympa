package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.SuggestOfferPriceDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос на получение списка цен для продвижения.
 */
public class SuggestPricesRequest   {

    private List<@Valid SuggestOfferPriceDTO> offers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public SuggestPricesRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create SuggestPricesRequest.
     *
     * @param offers Список товаров.
     */
    public SuggestPricesRequest(
        List<@Valid SuggestOfferPriceDTO> offers
    ) {
        this.offers = offers;
    }



    /**
     * Список товаров.
     * @return offers
     */
    public List<@Valid SuggestOfferPriceDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid SuggestOfferPriceDTO> offers) {
        this.offers = offers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SuggestPricesRequest {\n");
        
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

