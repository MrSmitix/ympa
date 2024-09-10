/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Данные, необходимые для генерации документа. 
 */
@JsonPropertyOrder({
  GenerateShipmentListDocumentReportRequest.JSON_PROPERTY_CAMPAIGN_ID,
  GenerateShipmentListDocumentReportRequest.JSON_PROPERTY_SHIPMENT_ID,
  GenerateShipmentListDocumentReportRequest.JSON_PROPERTY_ORDER_IDS
})
@JsonTypeName("GenerateShipmentListDocumentReportRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class GenerateShipmentListDocumentReportRequest {
    public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
    private Long campaignId;

    public static final String JSON_PROPERTY_SHIPMENT_ID = "shipmentId";
    private Long shipmentId;

    public static final String JSON_PROPERTY_ORDER_IDS = "orderIds";
    private List<Long> orderIds = null;

    public GenerateShipmentListDocumentReportRequest(Long campaignId) {
        this.campaignId = campaignId;
    }

    public GenerateShipmentListDocumentReportRequest campaignId(Long campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * Идентификатор кампании.
     * @return campaignId
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Long getCampaignId() {
        return campaignId;
    }

    @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public GenerateShipmentListDocumentReportRequest shipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * Идентификатор отгрузки.
     * @return shipmentId
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_SHIPMENT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getShipmentId() {
        return shipmentId;
    }

    @JsonProperty(JSON_PROPERTY_SHIPMENT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setShipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
    }

    public GenerateShipmentListDocumentReportRequest orderIds(List<Long> orderIds) {
        this.orderIds = orderIds;
        return this;
    }

    public GenerateShipmentListDocumentReportRequest addOrderIdsItem(Long orderIdsItem) {
        if (this.orderIds == null) {
            this.orderIds = new ArrayList<>();
        }
        this.orderIds.add(orderIdsItem);
        return this;
    }

    /**
     * Фильтр по идентификаторам заказа в отгрузке.
     * @return orderIds
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_ORDER_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<Long> getOrderIds() {
        return orderIds;
    }

    @JsonProperty(JSON_PROPERTY_ORDER_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOrderIds(List<Long> orderIds) {
        this.orderIds = orderIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest = (GenerateShipmentListDocumentReportRequest) o;
        return Objects.equals(this.campaignId, generateShipmentListDocumentReportRequest.campaignId) &&
            Objects.equals(this.shipmentId, generateShipmentListDocumentReportRequest.shipmentId) &&
            Objects.equals(this.orderIds, generateShipmentListDocumentReportRequest.orderIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaignId, shipmentId, orderIds);
    }

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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

