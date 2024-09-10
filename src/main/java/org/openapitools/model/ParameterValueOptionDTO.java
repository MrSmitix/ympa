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
 * Значение характеристики.
 */

@Schema(name = "ParameterValueOptionDTO", description = "Значение характеристики.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ParameterValueOptionDTO {

  private Long id;

  private String value;

  private String description;

  public ParameterValueOptionDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ParameterValueOptionDTO(Long id, String value) {
    this.id = id;
    this.value = value;
  }

  public ParameterValueOptionDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор значения.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор значения.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ParameterValueOptionDTO value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Значение.
   * @return value
   */
  @NotNull 
  @Schema(name = "value", description = "Значение.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ParameterValueOptionDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание значения.
   * @return description
   */
  
  @Schema(name = "description", description = "Описание значения.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterValueOptionDTO parameterValueOptionDTO = (ParameterValueOptionDTO) o;
    return Objects.equals(this.id, parameterValueOptionDTO.id) &&
        Objects.equals(this.value, parameterValueOptionDTO.value) &&
        Objects.equals(this.description, parameterValueOptionDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterValueOptionDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

