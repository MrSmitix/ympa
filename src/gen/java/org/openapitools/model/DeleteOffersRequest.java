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
 * Фильтрации удаляемых товаров по offerIds. 
 */
@ApiModel(description="Фильтрации удаляемых товаров по offerIds. ")

public class DeleteOffersRequest  {
  
 /**
  * Список SKU товаров, которые нужно удалить.
  */
  @ApiModelProperty(required = true, value = "Список SKU товаров, которые нужно удалить.")
  private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds = new ArrayList<>();
 /**
  * Список SKU товаров, которые нужно удалить.
  * @return offerIds
  */
  @JsonProperty("offerIds")
  @NotNull
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
    return offerIds;
  }

  /**
   * Sets the <code>offerIds</code> property.
   */
 public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
  }

  /**
   * Sets the <code>offerIds</code> property.
   */
  public DeleteOffersRequest offerIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  /**
   * Adds a new item to the <code>offerIds</code> list.
   */
  public DeleteOffersRequest addOfferIdsItem(String offerIdsItem) {
    this.offerIds.add(offerIdsItem);
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
    DeleteOffersRequest deleteOffersRequest = (DeleteOffersRequest) o;
    return Objects.equals(this.offerIds, deleteOffersRequest.offerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteOffersRequest {\n");
    
    sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
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

