package org.openapitools.server.model;

import org.openapitools.server.model.DeliveryServicesDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ответ на запрос списка служб доставки.
 */
public class GetDeliveryServicesResponse   {

    private DeliveryServicesDTO result;

    /**
     * Default constructor.
     */
    public GetDeliveryServicesResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetDeliveryServicesResponse.
     *
     * @param result result
     */
    public GetDeliveryServicesResponse(
        DeliveryServicesDTO result
    ) {
        this.result = result;
    }



    /**
     * Get result
     * @return result
     */
    public DeliveryServicesDTO getResult() {
        return result;
    }

    public void setResult(DeliveryServicesDTO result) {
        this.result = result;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDeliveryServicesResponse {\n");
        
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

