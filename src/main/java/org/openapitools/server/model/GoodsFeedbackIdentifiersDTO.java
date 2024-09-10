package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Идентификаторы, которые связаны с отзывом.
 */
public class GoodsFeedbackIdentifiersDTO   {

    private Long orderId;
    private Long modelId;

    /**
     * Default constructor.
     */
    public GoodsFeedbackIdentifiersDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GoodsFeedbackIdentifiersDTO.
     *
     * @param orderId Идентификатор заказа на Маркете.
     * @param modelId Идентификатор модели товара.
     */
    public GoodsFeedbackIdentifiersDTO(
        Long orderId, 
        Long modelId
    ) {
        this.orderId = orderId;
        this.modelId = modelId;
    }



    /**
     * Идентификатор заказа на Маркете.
     * @return orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * Идентификатор модели товара.
     * @return modelId
     */
    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoodsFeedbackIdentifiersDTO {\n");
        
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
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

