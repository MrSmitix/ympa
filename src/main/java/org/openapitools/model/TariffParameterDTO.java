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
 * Детали расчета конкретной услуги Маркета.
 */

@Schema(name = "TariffParameterDTO", description = "Детали расчета конкретной услуги Маркета.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TariffParameterDTO {

  private String name;

  private String value;

  public TariffParameterDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TariffParameterDTO(String name, String value) {
    this.name = name;
    this.value = value;
  }

  public TariffParameterDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название параметра.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "Название параметра.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TariffParameterDTO value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Значение параметра.
   * @return value
   */
  @NotNull 
  @Schema(name = "value", description = "Значение параметра.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TariffParameterDTO tariffParameterDTO = (TariffParameterDTO) o;
    return Objects.equals(this.name, tariffParameterDTO.name) &&
        Objects.equals(this.value, tariffParameterDTO.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffParameterDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

