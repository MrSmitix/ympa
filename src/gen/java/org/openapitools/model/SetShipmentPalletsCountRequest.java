package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Запрос на передачу количества упаковок в отгрузке.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetShipmentPalletsCountRequest   {
  
  private Integer placesCount;

  /**
   * Количество упаковок в отгрузке.
   * minimum: 0
   **/
  
  @ApiModelProperty(required = true, value = "Количество упаковок в отгрузке.")
  @JsonProperty("placesCount")
  @NotNull
 @Min(0)  public Integer getPlacesCount() {
    return placesCount;
  }
  public void setPlacesCount(Integer placesCount) {
    this.placesCount = placesCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetShipmentPalletsCountRequest setShipmentPalletsCountRequest = (SetShipmentPalletsCountRequest) o;
    return Objects.equals(this.placesCount, setShipmentPalletsCountRequest.placesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetShipmentPalletsCountRequest {\n");
    
    sb.append("    placesCount: ").append(toIndentedString(placesCount)).append("\n");
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

