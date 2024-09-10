package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.DeliveryServicesDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ответ на запрос списка служб доставки.
 */
@ApiModel(description="Ответ на запрос списка служб доставки.")

public class GetDeliveryServicesResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private DeliveryServicesDTO result;
 /**
  * Get result
  * @return result
  */
  @JsonProperty("result")
  public DeliveryServicesDTO getResult() {
    return result;
  }

  /**
   * Sets the <code>result</code> property.
   */
 public void setResult(DeliveryServicesDTO result) {
    this.result = result;
  }

  /**
   * Sets the <code>result</code> property.
   */
  public GetDeliveryServicesResponse result(DeliveryServicesDTO result) {
    this.result = result;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

