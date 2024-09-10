package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.LinkedHashSet;
import java.util.Set;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 **/
@ApiModel(description="Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. ")

public class GetCategoriesMaxSaleQuantumRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.")
 /**
   * Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
  **/
  private Set<Long> marketCategoryIds = new LinkedHashSet<>();
 /**
   * Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
   * @return marketCategoryIds
  **/
  @JsonProperty("marketCategoryIds")
  public Set<Long> getMarketCategoryIds() {
    return marketCategoryIds;
  }

  public void setMarketCategoryIds(Set<Long> marketCategoryIds) {
    this.marketCategoryIds = marketCategoryIds;
  }

  public GetCategoriesMaxSaleQuantumRequest marketCategoryIds(Set<Long> marketCategoryIds) {
    this.marketCategoryIds = marketCategoryIds;
    return this;
  }

  public GetCategoriesMaxSaleQuantumRequest addMarketCategoryIdsItem(Long marketCategoryIdsItem) {
    this.marketCategoryIds.add(marketCategoryIdsItem);
    return this;
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
    return Objects.equals(this.marketCategoryIds, getCategoriesMaxSaleQuantumRequest.marketCategoryIds);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

