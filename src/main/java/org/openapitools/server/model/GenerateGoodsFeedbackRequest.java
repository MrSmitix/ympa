package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Данные, необходимые для генерации отчета. 
 */
public class GenerateGoodsFeedbackRequest   {

    private Long businessId;

    /**
     * Default constructor.
     */
    public GenerateGoodsFeedbackRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GenerateGoodsFeedbackRequest.
     *
     * @param businessId Идентификатор бизнеса.
     */
    public GenerateGoodsFeedbackRequest(
        Long businessId
    ) {
        this.businessId = businessId;
    }



    /**
     * Идентификатор бизнеса.
     * @return businessId
     */
    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateGoodsFeedbackRequest {\n");
        
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
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

