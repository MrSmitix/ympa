package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.HiddenOfferDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос на возобновление показа оферов.
 */
public class DeleteHiddenOffersRequest   {

    private List<@Valid HiddenOfferDTO> hiddenOffers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public DeleteHiddenOffersRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create DeleteHiddenOffersRequest.
     *
     * @param hiddenOffers Список скрытых товаров. 
     */
    public DeleteHiddenOffersRequest(
        List<@Valid HiddenOfferDTO> hiddenOffers
    ) {
        this.hiddenOffers = hiddenOffers;
    }



    /**
     * Список скрытых товаров. 
     * @return hiddenOffers
     */
    public List<@Valid HiddenOfferDTO> getHiddenOffers() {
        return hiddenOffers;
    }

    public void setHiddenOffers(List<@Valid HiddenOfferDTO> hiddenOffers) {
        this.hiddenOffers = hiddenOffers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteHiddenOffersRequest {\n");
        
        sb.append("    hiddenOffers: ").append(toIndentedString(hiddenOffers)).append("\n");
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

