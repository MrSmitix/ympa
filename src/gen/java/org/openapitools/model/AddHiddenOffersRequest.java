package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.HiddenOfferDTO;



/**
 * Запрос на скрытие оферов.
 **/

@ApiModel(description = "Запрос на скрытие оферов.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AddHiddenOffersRequest   {
  @JsonProperty("hiddenOffers")
  private List<HiddenOfferDTO> hiddenOffers = new ArrayList<>();

  /**
   * Список скрытых товаров. 
   **/
  public AddHiddenOffersRequest hiddenOffers(List<HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список скрытых товаров. ")
  @JsonProperty("hiddenOffers")
  public List<HiddenOfferDTO> getHiddenOffers() {
    return hiddenOffers;
  }
  public void setHiddenOffers(List<HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddHiddenOffersRequest addHiddenOffersRequest = (AddHiddenOffersRequest) o;
    return Objects.equals(hiddenOffers, addHiddenOffersRequest.hiddenOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hiddenOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddHiddenOffersRequest {\n");
    
    sb.append("    hiddenOffers: ").append(toIndentedString(hiddenOffers)).append("\n");
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

