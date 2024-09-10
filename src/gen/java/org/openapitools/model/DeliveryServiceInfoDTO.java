package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о службе доставки.
 **/
@ApiModel(description="Информация о службе доставки.")

public class DeliveryServiceInfoDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор службы доставки.")
 /**
   * Идентификатор службы доставки.
  **/
  private Long id;

  @ApiModelProperty(required = true, value = "Наименование службы доставки.")
 /**
   * Наименование службы доставки.
  **/
  private String name;
 /**
   * Идентификатор службы доставки.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DeliveryServiceInfoDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Наименование службы доставки.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeliveryServiceInfoDTO name(String name) {
    this.name = name;
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
    DeliveryServiceInfoDTO deliveryServiceInfoDTO = (DeliveryServiceInfoDTO) o;
    return Objects.equals(this.id, deliveryServiceInfoDTO.id) &&
        Objects.equals(this.name, deliveryServiceInfoDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryServiceInfoDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

