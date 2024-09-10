package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * description.
 */
@ApiModel(description="description.")

public class GetBidsRecommendationsRequest  {
  
 /**
  * Список товаров, для которых нужно получить рекомендации по ставкам. 
  */
  @ApiModelProperty(required = true, value = "Список товаров, для которых нужно получить рекомендации по ставкам. ")
  private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> skus = new ArrayList<>();
 /**
  * Список товаров, для которых нужно получить рекомендации по ставкам. 
  * @return skus
  */
  @JsonProperty("skus")
  @NotNull
 @Size(min=1,max=1500)  public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getSkus() {
    return skus;
  }

  /**
   * Sets the <code>skus</code> property.
   */
 public void setSkus(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> skus) {
    this.skus = skus;
  }

  /**
   * Sets the <code>skus</code> property.
   */
  public GetBidsRecommendationsRequest skus(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> skus) {
    this.skus = skus;
    return this;
  }

  /**
   * Adds a new item to the <code>skus</code> list.
   */
  public GetBidsRecommendationsRequest addSkusItem(String skusItem) {
    this.skus.add(skusItem);
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
    GetBidsRecommendationsRequest getBidsRecommendationsRequest = (GetBidsRecommendationsRequest) o;
    return Objects.equals(this.skus, getBidsRecommendationsRequest.skus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBidsRecommendationsRequest {\n");
    
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

