package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 */

@Schema(name = "GetCategoriesMaxSaleQuantumRequest", description = "Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCategoriesMaxSaleQuantumRequest {

  @Valid
  private Set<Long> marketCategoryIds = new LinkedHashSet<>();

  public GetCategoriesMaxSaleQuantumRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetCategoriesMaxSaleQuantumRequest(Set<Long> marketCategoryIds) {
    this.marketCategoryIds = marketCategoryIds;
  }

  public GetCategoriesMaxSaleQuantumRequest marketCategoryIds(Set<Long> marketCategoryIds) {
    this.marketCategoryIds = marketCategoryIds;
    return this;
  }

  public GetCategoriesMaxSaleQuantumRequest addMarketCategoryIdsItem(Long marketCategoryIdsItem) {
    if (this.marketCategoryIds == null) {
      this.marketCategoryIds = new LinkedHashSet<>();
    }
    this.marketCategoryIds.add(marketCategoryIdsItem);
    return this;
  }

  /**
   * Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
   * @return marketCategoryIds
   */
  @NotNull @Size(min = 1, max = 1500) 
  @Schema(name = "marketCategoryIds", description = "Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.", requiredMode = Schema.RequiredMode.REQUIRED)
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

