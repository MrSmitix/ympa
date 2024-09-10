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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Запрос отчета по товарам.
 */
@Schema(name = "GetGoodsStatsRequest", description = "Запрос отчета по товарам.")
@JsonPropertyOrder({
  GetGoodsStatsRequest.JSON_PROPERTY_SHOP_SKUS
})
@JsonTypeName("GetGoodsStatsRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class GetGoodsStatsRequest {
    public static final String JSON_PROPERTY_SHOP_SKUS = "shopSkus";
    private Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSkus = new LinkedHashSet<>();

    public GetGoodsStatsRequest(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSkus) {
        this.shopSkus = shopSkus;
    }

    public GetGoodsStatsRequest shopSkus(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSkus) {
        this.shopSkus = shopSkus;
        return this;
    }

    public GetGoodsStatsRequest addShopSkusItem(String shopSkusItem) {
        this.shopSkus.add(shopSkusItem);
        return this;
    }

    /**
     * Список ваших идентификаторов SKU. 
     * @return shopSkus
     */
    @NotNull
    @Size(min=1, max=500)
    @Schema(name = "shopSkus", description = "Список ваших идентификаторов SKU. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_SHOP_SKUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getShopSkus() {
        return shopSkus;
    }

    @JsonProperty(JSON_PROPERTY_SHOP_SKUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
       @JsonDeserialize(as = LinkedHashSet.class)
    public void setShopSkus(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSkus) {
        this.shopSkus = shopSkus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetGoodsStatsRequest getGoodsStatsRequest = (GetGoodsStatsRequest) o;
        return Objects.equals(this.shopSkus, getGoodsStatsRequest.shopSkus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopSkus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetGoodsStatsRequest {\n");
        sb.append("    shopSkus: ").append(toIndentedString(shopSkus)).append("\n");
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

