package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.FeedbackDeliveryType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о заказе, указанная в отзыве.
 */
public class FeedbackOrderDTO   {

    private String shopOrderId;
    private FeedbackDeliveryType delivery;

    /**
     * Default constructor.
     */
    public FeedbackOrderDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedbackOrderDTO.
     *
     * @param shopOrderId Номер заказа, указанный в отзыве.
     * @param delivery delivery
     */
    public FeedbackOrderDTO(
        String shopOrderId, 
        FeedbackDeliveryType delivery
    ) {
        this.shopOrderId = shopOrderId;
        this.delivery = delivery;
    }



    /**
     * Номер заказа, указанный в отзыве.
     * @return shopOrderId
     */
    public String getShopOrderId() {
        return shopOrderId;
    }

    public void setShopOrderId(String shopOrderId) {
        this.shopOrderId = shopOrderId;
    }

    /**
     * Get delivery
     * @return delivery
     */
    public FeedbackDeliveryType getDelivery() {
        return delivery;
    }

    public void setDelivery(FeedbackDeliveryType delivery) {
        this.delivery = delivery;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedbackOrderDTO {\n");
        
        sb.append("    shopOrderId: ").append(toIndentedString(shopOrderId)).append("\n");
        sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
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

