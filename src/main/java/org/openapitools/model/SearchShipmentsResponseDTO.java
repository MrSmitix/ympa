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
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.ShipmentInfoDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Информация об отгрузках.
 */
@Schema(name = "SearchShipmentsResponseDTO", description = "Информация об отгрузках.")
@JsonPropertyOrder({
  SearchShipmentsResponseDTO.JSON_PROPERTY_SHIPMENTS,
  SearchShipmentsResponseDTO.JSON_PROPERTY_PAGING
})
@JsonTypeName("SearchShipmentsResponseDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class SearchShipmentsResponseDTO {
    public static final String JSON_PROPERTY_SHIPMENTS = "shipments";
    private List<@Valid ShipmentInfoDTO> shipments = new ArrayList<>();

    public static final String JSON_PROPERTY_PAGING = "paging";
    private ForwardScrollingPagerDTO paging;

    public SearchShipmentsResponseDTO(List<@Valid ShipmentInfoDTO> shipments) {
        this.shipments = shipments;
    }

    public SearchShipmentsResponseDTO shipments(List<@Valid ShipmentInfoDTO> shipments) {
        this.shipments = shipments;
        return this;
    }

    public SearchShipmentsResponseDTO addShipmentsItem(ShipmentInfoDTO shipmentsItem) {
        this.shipments.add(shipmentsItem);
        return this;
    }

    /**
     * Список с информацией об отгрузках.
     * @return shipments
     */
    @NotNull
    @Schema(name = "shipments", description = "Список с информацией об отгрузках.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_SHIPMENTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid ShipmentInfoDTO> getShipments() {
        return shipments;
    }

    @JsonProperty(JSON_PROPERTY_SHIPMENTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setShipments(List<@Valid ShipmentInfoDTO> shipments) {
        this.shipments = shipments;
    }

    public SearchShipmentsResponseDTO paging(ForwardScrollingPagerDTO paging) {
        this.paging = paging;
        return this;
    }

    /**
     * Get paging
     * @return paging
     */
    @Valid
    @Nullable
    @Schema(name = "paging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_PAGING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ForwardScrollingPagerDTO getPaging() {
        return paging;
    }

    @JsonProperty(JSON_PROPERTY_PAGING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPaging(ForwardScrollingPagerDTO paging) {
        this.paging = paging;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchShipmentsResponseDTO searchShipmentsResponseDTO = (SearchShipmentsResponseDTO) o;
        return Objects.equals(this.shipments, searchShipmentsResponseDTO.shipments) &&
            Objects.equals(this.paging, searchShipmentsResponseDTO.paging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipments, paging);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchShipmentsResponseDTO {\n");
        sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

