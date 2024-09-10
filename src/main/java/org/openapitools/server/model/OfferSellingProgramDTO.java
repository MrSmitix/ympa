package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.OfferSellingProgramStatusType;
import org.openapitools.server.model.SellingProgramType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 */
public class OfferSellingProgramDTO   {

    private SellingProgramType sellingProgram;
    private OfferSellingProgramStatusType status;

    /**
     * Default constructor.
     */
    public OfferSellingProgramDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferSellingProgramDTO.
     *
     * @param sellingProgram sellingProgram
     * @param status status
     */
    public OfferSellingProgramDTO(
        SellingProgramType sellingProgram, 
        OfferSellingProgramStatusType status
    ) {
        this.sellingProgram = sellingProgram;
        this.status = status;
    }



    /**
     * Get sellingProgram
     * @return sellingProgram
     */
    public SellingProgramType getSellingProgram() {
        return sellingProgram;
    }

    public void setSellingProgram(SellingProgramType sellingProgram) {
        this.sellingProgram = sellingProgram;
    }

    /**
     * Get status
     * @return status
     */
    public OfferSellingProgramStatusType getStatus() {
        return status;
    }

    public void setStatus(OfferSellingProgramStatusType status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferSellingProgramDTO {\n");
        
        sb.append("    sellingProgram: ").append(toIndentedString(sellingProgram)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

