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
 * Запрос на подтверждение цены. 
 **/

@ApiModel(description = "Запрос на подтверждение цены. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ConfirmPricesRequest   {
  @JsonProperty("offerIds")
  private List<String> offerIds = new ArrayList<>();

  /**
   * Идентификаторы товаров, у которых подтверждается цена.
   **/
  public ConfirmPricesRequest offerIds(List<String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификаторы товаров, у которых подтверждается цена.")
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
    ConfirmPricesRequest confirmPricesRequest = (ConfirmPricesRequest) o;
    return Objects.equals(offerIds, confirmPricesRequest.offerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmPricesRequest {\n");
    
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

