package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.DeliveryServiceInfoDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о службах доставки.
 */
public class DeliveryServicesDTO   {

    private List<@Valid DeliveryServiceInfoDTO> deliveryService = new ArrayList<>();

    /**
     * Default constructor.
     */
    public DeliveryServicesDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create DeliveryServicesDTO.
     *
     * @param deliveryService Информация о службе доставки.
     */
    public DeliveryServicesDTO(
        List<@Valid DeliveryServiceInfoDTO> deliveryService
    ) {
        this.deliveryService = deliveryService;
    }



    /**
     * Информация о службе доставки.
     * @return deliveryService
     */
    public List<@Valid DeliveryServiceInfoDTO> getDeliveryService() {
        return deliveryService;
    }

    public void setDeliveryService(List<@Valid DeliveryServiceInfoDTO> deliveryService) {
        this.deliveryService = deliveryService;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeliveryServicesDTO {\n");
        
        sb.append("    deliveryService: ").append(toIndentedString(deliveryService)).append("\n");
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

