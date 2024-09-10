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
 * Информация о службе доставки.
 */

@Schema(name = "DeliveryServiceInfoDTO", description = "Информация о службе доставки.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeliveryServiceInfoDTO {

  private Long id;

  private String name;

  public DeliveryServiceInfoDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DeliveryServiceInfoDTO(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public DeliveryServiceInfoDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор службы доставки.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор службы доставки.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
  @NotNull 
  @Schema(name = "name", description = "Наименование службы доставки.", requiredMode = Schema.RequiredMode.REQUIRED)
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

