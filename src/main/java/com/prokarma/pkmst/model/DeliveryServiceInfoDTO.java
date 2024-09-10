package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о службе доставки.
 */
@ApiModel(description = "Информация о службе доставки.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeliveryServiceInfoDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  public DeliveryServiceInfoDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор службы доставки.
   * @return id
   */
  @ApiModelProperty(required = true, value = "Идентификатор службы доставки.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DeliveryServiceInfoDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Наименование службы доставки.
   * @return name
   */
  @ApiModelProperty(required = true, value = "Наименование службы доставки.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

