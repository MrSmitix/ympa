package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Запрос на передачу количества упаковок в отгрузке.
 */
@ApiModel(description = "Запрос на передачу количества упаковок в отгрузке.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetShipmentPalletsCountRequest   {
  @JsonProperty("placesCount")
  private Integer placesCount;

  public SetShipmentPalletsCountRequest placesCount(Integer placesCount) {
    this.placesCount = placesCount;
    return this;
  }

   /**
   * Количество упаковок в отгрузке.
   * minimum: 0
   * @return placesCount
  **/
  @ApiModelProperty(required = true, value = "Количество упаковок в отгрузке.")
  public Integer getPlacesCount() {
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

