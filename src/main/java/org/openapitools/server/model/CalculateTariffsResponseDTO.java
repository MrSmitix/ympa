package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CalculateTariffsOfferInfoDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Расчет стоимости услуг.
 */
public class CalculateTariffsResponseDTO   {

    private List<@Valid CalculateTariffsOfferInfoDTO> offers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CalculateTariffsResponseDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CalculateTariffsResponseDTO.
     *
     * @param offers Стоимость услуг.
     */
    public CalculateTariffsResponseDTO(
        List<@Valid CalculateTariffsOfferInfoDTO> offers
    ) {
        this.offers = offers;
    }



    /**
     * Стоимость услуг.
     * @return offers
     */
    public List<@Valid CalculateTariffsOfferInfoDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid CalculateTariffsOfferInfoDTO> offers) {
        this.offers = offers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CalculateTariffsResponseDTO {\n");
        
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

