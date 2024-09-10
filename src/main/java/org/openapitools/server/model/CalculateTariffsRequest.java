package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CalculateTariffsOfferDTO;
import org.openapitools.server.model.CalculateTariffsParametersDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CalculateTariffsRequest   {

    private CalculateTariffsParametersDTO parameters;
    private List<@Valid CalculateTariffsOfferDTO> offers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CalculateTariffsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CalculateTariffsRequest.
     *
     * @param parameters parameters
     * @param offers Товары, для которых нужно рассчитать стоимость услуг.
     */
    public CalculateTariffsRequest(
        CalculateTariffsParametersDTO parameters, 
        List<@Valid CalculateTariffsOfferDTO> offers
    ) {
        this.parameters = parameters;
        this.offers = offers;
    }



    /**
     * Get parameters
     * @return parameters
     */
    public CalculateTariffsParametersDTO getParameters() {
        return parameters;
    }

    public void setParameters(CalculateTariffsParametersDTO parameters) {
        this.parameters = parameters;
    }

    /**
     * Товары, для которых нужно рассчитать стоимость услуг.
     * @return offers
     */
    public List<@Valid CalculateTariffsOfferDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid CalculateTariffsOfferDTO> offers) {
        this.offers = offers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CalculateTariffsRequest {\n");
        
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

