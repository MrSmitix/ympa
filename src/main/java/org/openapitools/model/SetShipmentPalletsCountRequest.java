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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Запрос на передачу количества упаковок в отгрузке.
 */
@JsonPropertyOrder({
  SetShipmentPalletsCountRequest.JSON_PROPERTY_PLACES_COUNT
})
@JsonTypeName("SetShipmentPalletsCountRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class SetShipmentPalletsCountRequest {
    public static final String JSON_PROPERTY_PLACES_COUNT = "placesCount";
    private Integer placesCount;

    public SetShipmentPalletsCountRequest(Integer placesCount) {
        this.placesCount = placesCount;
    }

    public SetShipmentPalletsCountRequest placesCount(Integer placesCount) {
        this.placesCount = placesCount;
        return this;
    }

    /**
     * Количество упаковок в отгрузке.
     * minimum: 0
     * @return placesCount
     */
    @NotNull
    @Min(0)
    @JsonProperty(JSON_PROPERTY_PLACES_COUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getPlacesCount() {
        return placesCount;
    }

    @JsonProperty(JSON_PROPERTY_PLACES_COUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPlacesCount(Integer placesCount) {
        this.placesCount = placesCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetShipmentPalletsCountRequest setShipmentPalletsCountRequest = (SetShipmentPalletsCountRequest) o;
        return Objects.equals(this.placesCount, setShipmentPalletsCountRequest.placesCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placesCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetShipmentPalletsCountRequest {\n");
        sb.append("    placesCount: ").append(toIndentedString(placesCount)).append("\n");
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

