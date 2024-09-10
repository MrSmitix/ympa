package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.UpdateOfferMappingDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class UpdateOfferMappingsRequest   {

    private List<@Valid UpdateOfferMappingDTO> offerMappings = new ArrayList<>();
    private Boolean onlyPartnerMediaContent;

    /**
     * Default constructor.
     */
    public UpdateOfferMappingsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateOfferMappingsRequest.
     *
     * @param offerMappings Перечень товаров, которые нужно добавить или обновить.
     * @param onlyPartnerMediaContent Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — &#x60;false&#x60;. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение &#x60;true&#x60;. 
     */
    public UpdateOfferMappingsRequest(
        List<@Valid UpdateOfferMappingDTO> offerMappings, 
        Boolean onlyPartnerMediaContent
    ) {
        this.offerMappings = offerMappings;
        this.onlyPartnerMediaContent = onlyPartnerMediaContent;
    }



    /**
     * Перечень товаров, которые нужно добавить или обновить.
     * @return offerMappings
     */
    public List<@Valid UpdateOfferMappingDTO> getOfferMappings() {
        return offerMappings;
    }

    public void setOfferMappings(List<@Valid UpdateOfferMappingDTO> offerMappings) {
        this.offerMappings = offerMappings;
    }

    /**
     * Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. 
     * @return onlyPartnerMediaContent
     */
    public Boolean getOnlyPartnerMediaContent() {
        return onlyPartnerMediaContent;
    }

    public void setOnlyPartnerMediaContent(Boolean onlyPartnerMediaContent) {
        this.onlyPartnerMediaContent = onlyPartnerMediaContent;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOfferMappingsRequest {\n");
        
        sb.append("    offerMappings: ").append(toIndentedString(offerMappings)).append("\n");
        sb.append("    onlyPartnerMediaContent: ").append(toIndentedString(onlyPartnerMediaContent)).append("\n");
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

