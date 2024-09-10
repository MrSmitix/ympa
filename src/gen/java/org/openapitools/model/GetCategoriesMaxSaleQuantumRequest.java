package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;



/**
 * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 **/

@ApiModel(description = "Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCategoriesMaxSaleQuantumRequest   {
  @JsonProperty("marketCategoryIds")
  private Set<Long> marketCategoryIds = new LinkedHashSet<>();

  /**
   * Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
   **/
  public GetCategoriesMaxSaleQuantumRequest marketCategoryIds(Set<Long> marketCategoryIds) {
    this.marketCategoryIds = marketCategoryIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.")
  @JsonProperty("marketCategoryIds")
  public Set<Long> getMarketCategoryIds() {
    return marketCategoryIds;
  }
  @JsonDeserialize(as = LinkedHashSet.class)
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

