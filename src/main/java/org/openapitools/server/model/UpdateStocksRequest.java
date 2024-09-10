package org.openapitools.server.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.server.model.UpdateStockDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос на изменение информации по остаткам товаров.
 */
public class UpdateStocksRequest   {

    private Set<@Valid UpdateStockDTO> skus = new LinkedHashSet<>();

    /**
     * Default constructor.
     */
    public UpdateStocksRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateStocksRequest.
     *
     * @param skus Данные об остатках товаров. 
     */
    public UpdateStocksRequest(
        Set<@Valid UpdateStockDTO> skus
    ) {
        this.skus = skus;
    }



    /**
     * Данные об остатках товаров. 
     * @return skus
     */
    public Set<@Valid UpdateStockDTO> getSkus() {
        return skus;
    }

    public void setSkus(Set<@Valid UpdateStockDTO> skus) {
        this.skus = skus;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

