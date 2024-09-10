package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * Фильтрации удаляемых товаров по offerIds. 
 **/

@ApiModel(description = "Фильтрации удаляемых товаров по offerIds. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeleteOffersRequest   {
  @JsonProperty("offerIds")
  private List<String> offerIds = new ArrayList<>();

  /**
   * Список SKU товаров, которые нужно удалить.
   **/
  public DeleteOffersRequest offerIds(List<String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список SKU товаров, которые нужно удалить.")
  @JsonProperty("offerIds")
  public List<String> getOfferIds() {
    return offerIds;
  }
  public void setOfferIds(List<String> offerIds) {
    this.offerIds = offerIds;
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
    return Objects.equals(offerIds, deleteOffersRequest.offerIds);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

