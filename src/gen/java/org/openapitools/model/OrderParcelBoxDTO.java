package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о грузоместе.
 **/
@ApiModel(description="Информация о грузоместе.")

public class OrderParcelBoxDTO  {
  
  @ApiModelProperty(value = "Идентификатор грузоместа.")
 /**
   * Идентификатор грузоместа.
  **/
  private Long id;

  @ApiModelProperty(value = "Идентификатор грузового места в информационной системе магазина.")
 /**
   * Идентификатор грузового места в информационной системе магазина.
  **/
  private String fulfilmentId;
 /**
   * Идентификатор грузоместа.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderParcelBoxDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Идентификатор грузового места в информационной системе магазина.
   * @return fulfilmentId
  **/
  @JsonProperty("fulfilmentId")
  public String getFulfilmentId() {
    return fulfilmentId;
  }

  public void setFulfilmentId(String fulfilmentId) {
    this.fulfilmentId = fulfilmentId;
  }

  public OrderParcelBoxDTO fulfilmentId(String fulfilmentId) {
    this.fulfilmentId = fulfilmentId;
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
    OrderParcelBoxDTO orderParcelBoxDTO = (OrderParcelBoxDTO) o;
    return Objects.equals(this.id, orderParcelBoxDTO.id) &&
        Objects.equals(this.fulfilmentId, orderParcelBoxDTO.fulfilmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fulfilmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderParcelBoxDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fulfilmentId: ").append(toIndentedString(fulfilmentId)).append("\n");
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

