package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о трек-номере посылки (DBS).
 */
public class OrderTrackDTO   {

    private String trackCode;
    private Long deliveryServiceId;

    /**
     * Default constructor.
     */
    public OrderTrackDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderTrackDTO.
     *
     * @param trackCode Трек‑номер посылки.
     * @param deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
     */
    public OrderTrackDTO(
        String trackCode, 
        Long deliveryServiceId
    ) {
        this.trackCode = trackCode;
        this.deliveryServiceId = deliveryServiceId;
    }



    /**
     * Трек‑номер посылки.
     * @return trackCode
     */
    public String getTrackCode() {
        return trackCode;
    }

    public void setTrackCode(String trackCode) {
        this.trackCode = trackCode;
    }

    /**
     * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
     * @return deliveryServiceId
     */
    public Long getDeliveryServiceId() {
        return deliveryServiceId;
    }

    public void setDeliveryServiceId(Long deliveryServiceId) {
        this.deliveryServiceId = deliveryServiceId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderTrackDTO {\n");
        
        sb.append("    trackCode: ").append(toIndentedString(trackCode)).append("\n");
        sb.append("    deliveryServiceId: ").append(toIndentedString(deliveryServiceId)).append("\n");
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

