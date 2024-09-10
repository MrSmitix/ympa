package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DeliveryServicesDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Ответ на запрос списка служб доставки.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Ответ на запрос списка служб доставки.")
public class GetDeliveryServicesResponse   {
  
  private DeliveryServicesDTO result;

  /**
   **/
  public GetDeliveryServicesResponse result(DeliveryServicesDTO result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("result")
  public DeliveryServicesDTO getResult() {
    return result;
  }
  public void setResult(DeliveryServicesDTO result) {
    this.result = result;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDeliveryServicesResponse getDeliveryServicesResponse = (GetDeliveryServicesResponse) o;
    return Objects.equals(this.result, getDeliveryServicesResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDeliveryServicesResponse {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

