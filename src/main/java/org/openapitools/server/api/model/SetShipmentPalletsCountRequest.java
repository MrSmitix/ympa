package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Запрос на передачу количества упаковок в отгрузке.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetShipmentPalletsCountRequest   {
  
  private Integer placesCount;

  public SetShipmentPalletsCountRequest () {

  }

  public SetShipmentPalletsCountRequest (Integer placesCount) {
    this.placesCount = placesCount;
  }

    
  @JsonProperty("placesCount")
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
    return Objects.equals(placesCount, setShipmentPalletsCountRequest.placesCount);
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
