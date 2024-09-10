package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.UpdateBusinessOfferPriceDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос на установку базовых цен на товары.
 */
public class UpdateBusinessPricesRequest   {

    private List<@Valid UpdateBusinessOfferPriceDTO> offers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UpdateBusinessPricesRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateBusinessPricesRequest.
     *
     * @param offers Список товаров с ценами.
     */
    public UpdateBusinessPricesRequest(
        List<@Valid UpdateBusinessOfferPriceDTO> offers
    ) {
        this.offers = offers;
    }



    /**
     * Список товаров с ценами.
     * @return offers
     */
    public List<@Valid UpdateBusinessOfferPriceDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid UpdateBusinessOfferPriceDTO> offers) {
        this.offers = offers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBusinessPricesRequest {\n");
        
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

