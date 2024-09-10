package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.QualityRatingComponentType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Составляющая индекса качества.
 */

@Schema(name = "QualityRatingComponentDTO", description = "Составляющая индекса качества.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QualityRatingComponentDTO {

  private Double value;

  private QualityRatingComponentType componentType;

  public QualityRatingComponentDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QualityRatingComponentDTO(Double value, QualityRatingComponentType componentType) {
    this.value = value;
    this.componentType = componentType;
  }

  public QualityRatingComponentDTO value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Значение составляющей в процентах.
   * minimum: 0
   * maximum: 100
   * @return value
   */
  @NotNull @DecimalMin("0") @DecimalMax("100") 
  @Schema(name = "value", description = "Значение составляющей в процентах.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public QualityRatingComponentDTO componentType(QualityRatingComponentType componentType) {
    this.componentType = componentType;
    return this;
  }

  /**
   * Get componentType
   * @return componentType
   */
  @NotNull @Valid 
  @Schema(name = "componentType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("componentType")
  public QualityRatingComponentType getComponentType() {
    return componentType;
  }

  public void setComponentType(QualityRatingComponentType componentType) {
    this.componentType = componentType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualityRatingComponentDTO qualityRatingComponentDTO = (QualityRatingComponentDTO) o;
    return Objects.equals(this.value, qualityRatingComponentDTO.value) &&
        Objects.equals(this.componentType, qualityRatingComponentDTO.componentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, componentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityRatingComponentDTO {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
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

