package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Количество палет в отгрузке.
 */
public class PalletsCountDTO   {

    private Integer planned;
    private Integer fact;

    /**
     * Default constructor.
     */
    public PalletsCountDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create PalletsCountDTO.
     *
     * @param planned Количество палет, которое заявил продавец.
     * @param fact Количество палет, которое приняли в сортировочном центре.
     */
    public PalletsCountDTO(
        Integer planned, 
        Integer fact
    ) {
        this.planned = planned;
        this.fact = fact;
    }



    /**
     * Количество палет, которое заявил продавец.
     * @return planned
     */
    public Integer getPlanned() {
        return planned;
    }

    public void setPlanned(Integer planned) {
        this.planned = planned;
    }

    /**
     * Количество палет, которое приняли в сортировочном центре.
     * @return fact
     */
    public Integer getFact() {
        return fact;
    }

    public void setFact(Integer fact) {
        this.fact = fact;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PalletsCountDTO {\n");
        
        sb.append("    planned: ").append(toIndentedString(planned)).append("\n");
        sb.append("    fact: ").append(toIndentedString(fact)).append("\n");
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

