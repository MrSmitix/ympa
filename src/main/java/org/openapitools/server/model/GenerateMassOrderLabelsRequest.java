package org.openapitools.server.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Данные, необходимые для генерации файла. 
 */
public class GenerateMassOrderLabelsRequest   {

    private Long businessId;
    private Set<Long> orderIds = new LinkedHashSet<>();

    /**
     * Default constructor.
     */
    public GenerateMassOrderLabelsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GenerateMassOrderLabelsRequest.
     *
     * @param businessId Идентификатор кабинета.
     * @param orderIds Список идентификаторов заказов.
     */
    public GenerateMassOrderLabelsRequest(
        Long businessId, 
        Set<Long> orderIds
    ) {
        this.businessId = businessId;
        this.orderIds = orderIds;
    }



    /**
     * Идентификатор кабинета.
     * @return businessId
     */
    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    /**
     * Список идентификаторов заказов.
     * @return orderIds
     */
    public Set<Long> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(Set<Long> orderIds) {
        this.orderIds = orderIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateMassOrderLabelsRequest {\n");
        
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
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

