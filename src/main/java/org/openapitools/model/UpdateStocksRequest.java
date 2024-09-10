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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.UpdateStockDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Запрос на изменение информации по остаткам товаров.
 */
@Schema(name = "UpdateStocksRequest", description = "Запрос на изменение информации по остаткам товаров.")
@JsonPropertyOrder({
  UpdateStocksRequest.JSON_PROPERTY_SKUS
})
@JsonTypeName("UpdateStocksRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class UpdateStocksRequest {
    public static final String JSON_PROPERTY_SKUS = "skus";
    private Set<@Valid UpdateStockDTO> skus = new LinkedHashSet<>();

    public UpdateStocksRequest(Set<@Valid UpdateStockDTO> skus) {
        this.skus = skus;
    }

    public UpdateStocksRequest skus(Set<@Valid UpdateStockDTO> skus) {
        this.skus = skus;
        return this;
    }

    public UpdateStocksRequest addSkusItem(UpdateStockDTO skusItem) {
        this.skus.add(skusItem);
        return this;
    }

    /**
     * Данные об остатках товаров. 
     * @return skus
     */
    @NotNull
    @Size(min=1, max=2000)
    @Schema(name = "skus", description = "Данные об остатках товаров. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_SKUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Set<@Valid UpdateStockDTO> getSkus() {
        return skus;
    }

    @JsonProperty(JSON_PROPERTY_SKUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
       @JsonDeserialize(as = LinkedHashSet.class)
    public void setSkus(Set<@Valid UpdateStockDTO> skus) {
        this.skus = skus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateStocksRequest updateStocksRequest = (UpdateStocksRequest) o;
        return Objects.equals(this.skus, updateStocksRequest.skus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStocksRequest {\n");
        sb.append("    skus: ").append(toIndentedString(skus)).append("\n");
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

