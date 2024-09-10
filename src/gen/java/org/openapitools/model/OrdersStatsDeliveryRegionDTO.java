package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о регионе доставки.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация о регионе доставки.")
public class OrdersStatsDeliveryRegionDTO   {
  
  private Long id;

  private String name;

  /**
   * Идентификатор региона доставки.
   **/
  public OrdersStatsDeliveryRegionDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор региона доставки.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Название региона доставки.
   **/
  public OrdersStatsDeliveryRegionDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Название региона доставки.")
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

