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
import org.openapitools.model.WarehouseStockType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Информация об остатках товара.
 */
@Schema(name = "WarehouseStockDTO", description = "Информация об остатках товара.")
@JsonPropertyOrder({
  WarehouseStockDTO.JSON_PROPERTY_TYPE,
  WarehouseStockDTO.JSON_PROPERTY_COUNT
})
@JsonTypeName("WarehouseStockDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class WarehouseStockDTO {
    public static final String JSON_PROPERTY_TYPE = "type";
    private WarehouseStockType type;

    public static final String JSON_PROPERTY_COUNT = "count";
    private Long count;

    public WarehouseStockDTO(WarehouseStockType type, Long count) {
        this.type = type;
        this.count = count;
    }

    public WarehouseStockDTO type(WarehouseStockType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public WarehouseStockType getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(WarehouseStockType type) {
        this.type = type;
    }

    public WarehouseStockDTO count(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Значение остатков.
     * @return count
     */
    @NotNull
    @Schema(name = "count", description = "Значение остатков.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_COUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Long getCount() {
        return count;
    }

    @JsonProperty(JSON_PROPERTY_COUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WarehouseStockDTO warehouseStockDTO = (WarehouseStockDTO) o;
        return Objects.equals(this.type, warehouseStockDTO.type) &&
            Objects.equals(this.count, warehouseStockDTO.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarehouseStockDTO {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

