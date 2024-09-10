package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. ")
public class GetCategoriesMaxSaleQuantumRequest   {
  
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
  @NotNull
 @Size(min=1,max=1500)  public Set<Long> getMarketCategoryIds() {
    return marketCategoryIds;
  }
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setMarketCategoryIds(Set<Long> marketCategoryIds) {
    this.marketCategoryIds = marketCategoryIds;
  }

  public GetCategoriesMaxSaleQuantumRequest addMarketCategoryIdsItem(Long marketCategoryIdsItem) {
    if (this.marketCategoryIds == null) {
      this.marketCategoryIds = new LinkedHashSet<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

