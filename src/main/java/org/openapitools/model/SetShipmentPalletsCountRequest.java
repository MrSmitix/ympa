package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Запрос на передачу количества упаковок в отгрузке.
 */

@Schema(name = "SetShipmentPalletsCountRequest", description = "Запрос на передачу количества упаковок в отгрузке.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetShipmentPalletsCountRequest {

  private Integer placesCount;

  public SetShipmentPalletsCountRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SetShipmentPalletsCountRequest(Integer placesCount) {
    this.placesCount = placesCount;
  }

  public SetShipmentPalletsCountRequest placesCount(Integer placesCount) {
    this.placesCount = placesCount;
    return this;
  }

  /**
   * Количество упаковок в отгрузке.
   * minimum: 0
   * @return placesCount
   */
  @NotNull @Min(0) 
  @Schema(name = "placesCount", description = "Количество упаковок в отгрузке.", requiredMode = Schema.RequiredMode.REQUIRED)
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

