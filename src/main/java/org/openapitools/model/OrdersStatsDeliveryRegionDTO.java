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
 * Информация о регионе доставки.
 */

@Schema(name = "OrdersStatsDeliveryRegionDTO", description = "Информация о регионе доставки.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsDeliveryRegionDTO {

  private Long id;

  private String name;

  public OrdersStatsDeliveryRegionDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор региона доставки.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор региона доставки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrdersStatsDeliveryRegionDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название региона доставки.
   * @return name
   */
  
  @Schema(name = "name", description = "Название региона доставки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO = (OrdersStatsDeliveryRegionDTO) o;
    return Objects.equals(this.id, ordersStatsDeliveryRegionDTO.id) &&
        Objects.equals(this.name, ordersStatsDeliveryRegionDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersStatsDeliveryRegionDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

