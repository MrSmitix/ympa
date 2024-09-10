package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCategoriesMaxSaleQuantumRequest   {
  
  private Set<Long> marketCategoryIds = new LinkedHashSet<>();

  public GetCategoriesMaxSaleQuantumRequest () {

  }

  public GetCategoriesMaxSaleQuantumRequest (Set<Long> marketCategoryIds) {
    this.marketCategoryIds = marketCategoryIds;
  }

    
  @JsonProperty("marketCategoryIds")
  public Set<Long> getMarketCategoryIds() {
    return marketCategoryIds;
  }
  public void setMarketCategoryIds(Set<Long> marketCategoryIds) {
    this.marketCategoryIds = marketCategoryIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest = (GetCategoriesMaxSaleQuantumRequest) o;
    return Objects.equals(marketCategoryIds, getCategoriesMaxSaleQuantumRequest.marketCategoryIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketCategoryIds);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
