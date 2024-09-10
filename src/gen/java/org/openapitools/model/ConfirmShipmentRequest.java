package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Запрос для подтверждения отгрузки.
 **/
@ApiModel(description="Запрос для подтверждения отгрузки.")

public class ConfirmShipmentRequest  {
  
  @ApiModelProperty(value = "Идентификатор отгрузки в системе поставщика.")
 /**
   * Идентификатор отгрузки в системе поставщика.
  **/
  private String externalShipmentId;
 /**
   * Идентификатор отгрузки в системе поставщика.
   * @return externalShipmentId
  **/
  @JsonProperty("externalShipmentId")
  public String getExternalShipmentId() {
    return externalShipmentId;
  }

  public void setExternalShipmentId(String externalShipmentId) {
    this.externalShipmentId = externalShipmentId;
  }

  public ConfirmShipmentRequest externalShipmentId(String externalShipmentId) {
    this.externalShipmentId = externalShipmentId;
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
    ConfirmShipmentRequest confirmShipmentRequest = (ConfirmShipmentRequest) o;
    return Objects.equals(this.externalShipmentId, confirmShipmentRequest.externalShipmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalShipmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmShipmentRequest {\n");
    
    sb.append("    externalShipmentId: ").append(toIndentedString(externalShipmentId)).append("\n");
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

