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
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.OrdersShipmentInfoDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * GetShipmentOrdersInfoResponse
 */
@JsonPropertyOrder({
  GetShipmentOrdersInfoResponse.JSON_PROPERTY_STATUS,
  GetShipmentOrdersInfoResponse.JSON_PROPERTY_RESULT
})
@JsonTypeName("GetShipmentOrdersInfoResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class GetShipmentOrdersInfoResponse {
    public static final String JSON_PROPERTY_STATUS = "status";
    private ApiResponseStatusType status;

    public static final String JSON_PROPERTY_RESULT = "result";
    private OrdersShipmentInfoDTO result;

    public GetShipmentOrdersInfoResponse() {
    }

    public GetShipmentOrdersInfoResponse status(ApiResponseStatusType status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @Nullable
    @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ApiResponseStatusType getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(ApiResponseStatusType status) {
        this.status = status;
    }

    public GetShipmentOrdersInfoResponse result(OrdersShipmentInfoDTO result) {
        this.result = result;
        return this;
    }

    /**
     * Get result
     * @return result
     */
    @Valid
    @Nullable
    @Schema(name = "result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_RESULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OrdersShipmentInfoDTO getResult() {
        return result;
    }

    @JsonProperty(JSON_PROPERTY_RESULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResult(OrdersShipmentInfoDTO result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse = (GetShipmentOrdersInfoResponse) o;
        return Objects.equals(this.status, getShipmentOrdersInfoResponse.status) &&
            Objects.equals(this.result, getShipmentOrdersInfoResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetShipmentOrdersInfoResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

