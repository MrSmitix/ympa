package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Данные, необходимые для генерации документа. 
 */
public class GenerateShipmentListDocumentReportRequest   {

    private Long campaignId;
    private Long shipmentId;
    private List<Long> orderIds;

    /**
     * Default constructor.
     */
    public GenerateShipmentListDocumentReportRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GenerateShipmentListDocumentReportRequest.
     *
     * @param campaignId Идентификатор кампании.
     * @param shipmentId Идентификатор отгрузки.
     * @param orderIds Фильтр по идентификаторам заказа в отгрузке.
     */
    public GenerateShipmentListDocumentReportRequest(
        Long campaignId, 
        Long shipmentId, 
        List<Long> orderIds
    ) {
        this.campaignId = campaignId;
        this.shipmentId = shipmentId;
        this.orderIds = orderIds;
    }



    /**
     * Идентификатор кампании.
     * @return campaignId
     */
    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Идентификатор отгрузки.
     * @return shipmentId
     */
    public Long getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
    }

    /**
     * Фильтр по идентификаторам заказа в отгрузке.
     * @return orderIds
     */
    public List<Long> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<Long> orderIds) {
        this.orderIds = orderIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateShipmentListDocumentReportRequest {\n");
        
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
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

