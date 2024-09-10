package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.GetPromoDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об акциях Маркета.
 */
public class GetPromosResultDTO   {

    private List<@Valid GetPromoDTO> promos = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GetPromosResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetPromosResultDTO.
     *
     * @param promos Акции Маркета.
     */
    public GetPromosResultDTO(
        List<@Valid GetPromoDTO> promos
    ) {
        this.promos = promos;
    }



    /**
     * Акции Маркета.
     * @return promos
     */
    public List<@Valid GetPromoDTO> getPromos() {
        return promos;
    }

    public void setPromos(List<@Valid GetPromoDTO> promos) {
        this.promos = promos;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPromosResultDTO {\n");
        
        sb.append("    promos: ").append(toIndentedString(promos)).append("\n");
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

