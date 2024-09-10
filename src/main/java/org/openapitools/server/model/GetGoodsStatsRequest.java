package org.openapitools.server.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос отчета по товарам.
 */
public class GetGoodsStatsRequest   {

    private Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSkus = new LinkedHashSet<>();

    /**
     * Default constructor.
     */
    public GetGoodsStatsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetGoodsStatsRequest.
     *
     * @param shopSkus Список ваших идентификаторов SKU. 
     */
    public GetGoodsStatsRequest(
        Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSkus
    ) {
        this.shopSkus = shopSkus;
    }



    /**
     * Список ваших идентификаторов SKU. 
     * @return shopSkus
     */
    public Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getShopSkus() {
        return shopSkus;
    }

    public void setShopSkus(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSkus) {
        this.shopSkus = shopSkus;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

