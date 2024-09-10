package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OfferContentDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос на установку новых значений для параметров.
 */
public class UpdateOfferContentRequest   {

    private List<@Valid OfferContentDTO> offersContent = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UpdateOfferContentRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateOfferContentRequest.
     *
     * @param offersContent Список товаров с указанными характеристиками.
     */
    public UpdateOfferContentRequest(
        List<@Valid OfferContentDTO> offersContent
    ) {
        this.offersContent = offersContent;
    }



    /**
     * Список товаров с указанными характеристиками.
     * @return offersContent
     */
    public List<@Valid OfferContentDTO> getOffersContent() {
        return offersContent;
    }

    public void setOffersContent(List<@Valid OfferContentDTO> offersContent) {
        this.offersContent = offersContent;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOfferContentRequest {\n");
        
        sb.append("    offersContent: ").append(toIndentedString(offersContent)).append("\n");
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

