package apimodels;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetCategoriesMaxSaleQuantumRequest   {
  @JsonProperty("marketCategoryIds")
  @NotNull
@Size(min=1,max=1500)

  private Set<Long> marketCategoryIds = new LinkedHashSet<>();

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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

