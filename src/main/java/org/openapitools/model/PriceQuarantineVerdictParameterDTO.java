package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.PriceQuarantineVerdictParamNameType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Параметр карантина.
 */

@Schema(name = "PriceQuarantineVerdictParameterDTO", description = "Параметр карантина.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PriceQuarantineVerdictParameterDTO {

  private PriceQuarantineVerdictParamNameType name;

  private String value;

  public PriceQuarantineVerdictParameterDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PriceQuarantineVerdictParameterDTO(PriceQuarantineVerdictParamNameType name, String value) {
    this.name = name;
    this.value = value;
  }

  public PriceQuarantineVerdictParameterDTO name(PriceQuarantineVerdictParamNameType name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull @Valid 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public PriceQuarantineVerdictParamNameType getName() {
    return name;
  }

  public void setName(PriceQuarantineVerdictParamNameType name) {
    this.name = name;
  }

  public PriceQuarantineVerdictParameterDTO value(String value) {
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
    PriceQuarantineVerdictParameterDTO priceQuarantineVerdictParameterDTO = (PriceQuarantineVerdictParameterDTO) o;
    return Objects.equals(this.name, priceQuarantineVerdictParameterDTO.name) &&
        Objects.equals(this.value, priceQuarantineVerdictParameterDTO.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceQuarantineVerdictParameterDTO {\n");
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

