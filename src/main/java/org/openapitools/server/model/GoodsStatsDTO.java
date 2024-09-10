package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.GoodsStatsGoodsDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Отчет по товарам.
 */
public class GoodsStatsDTO   {

    private List<@Valid GoodsStatsGoodsDTO> shopSkus = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GoodsStatsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GoodsStatsDTO.
     *
     * @param shopSkus Список товаров.
     */
    public GoodsStatsDTO(
        List<@Valid GoodsStatsGoodsDTO> shopSkus
    ) {
        this.shopSkus = shopSkus;
    }



    /**
     * Список товаров.
     * @return shopSkus
     */
    public List<@Valid GoodsStatsGoodsDTO> getShopSkus() {
        return shopSkus;
    }

    public void setShopSkus(List<@Valid GoodsStatsGoodsDTO> shopSkus) {
        this.shopSkus = shopSkus;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoodsStatsDTO {\n");
        
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

