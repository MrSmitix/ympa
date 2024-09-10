package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PriceSuggestOfferDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Результат запроса цен для продвижения.
 */
public class SuggestPricesResultDTO   {

    private List<@Valid PriceSuggestOfferDTO> offers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public SuggestPricesResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create SuggestPricesResultDTO.
     *
     * @param offers Список товаров с ценами для продвижения.
     */
    public SuggestPricesResultDTO(
        List<@Valid PriceSuggestOfferDTO> offers
    ) {
        this.offers = offers;
    }



    /**
     * Список товаров с ценами для продвижения.
     * @return offers
     */
    public List<@Valid PriceSuggestOfferDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid PriceSuggestOfferDTO> offers) {
        this.offers = offers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SuggestPricesResultDTO {\n");
        
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

