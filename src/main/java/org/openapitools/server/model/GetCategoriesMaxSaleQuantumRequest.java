package org.openapitools.server.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 */
public class GetCategoriesMaxSaleQuantumRequest   {

    private Set<Long> marketCategoryIds = new LinkedHashSet<>();

    /**
     * Default constructor.
     */
    public GetCategoriesMaxSaleQuantumRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetCategoriesMaxSaleQuantumRequest.
     *
     * @param marketCategoryIds Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
     */
    public GetCategoriesMaxSaleQuantumRequest(
        Set<Long> marketCategoryIds
    ) {
        this.marketCategoryIds = marketCategoryIds;
    }



    /**
     * Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
     * @return marketCategoryIds
     */
    public Set<Long> getMarketCategoryIds() {
        return marketCategoryIds;
    }

    public void setMarketCategoryIds(Set<Long> marketCategoryIds) {
        this.marketCategoryIds = marketCategoryIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCategoriesMaxSaleQuantumRequest {\n");
        
        sb.append("    marketCategoryIds: ").append(toIndentedString(marketCategoryIds)).append("\n");
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

