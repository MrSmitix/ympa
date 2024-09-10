package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Запрос для подтверждения отгрузки.
 **/
@ApiModel(description = "Запрос для подтверждения отгрузки.")
@JsonTypeName("ConfirmShipmentRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ConfirmShipmentRequest   {
  private String externalShipmentId;

  /**
   * Идентификатор отгрузки в системе поставщика.
   **/
  public ConfirmShipmentRequest externalShipmentId(String externalShipmentId) {
    this.externalShipmentId = externalShipmentId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор отгрузки в системе поставщика.")
  @JsonProperty("externalShipmentId")
  public String getExternalShipmentId() {
    return externalShipmentId;
  }

  @JsonProperty("externalShipmentId")
  public void setExternalShipmentId(String externalShipmentId) {
    this.externalShipmentId = externalShipmentId;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

