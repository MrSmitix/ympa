package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.QualityRatingComponentType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Составляющая индекса качества.
 **/
@ApiModel(description="Составляющая индекса качества.")

public class QualityRatingComponentDTO  {
  
  @ApiModelProperty(required = true, value = "Значение составляющей в процентах.")
 /**
   * Значение составляющей в процентах.
  **/
  private Double value;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private QualityRatingComponentType componentType;
 /**
   * Значение составляющей в процентах.
   * minimum: 0
   * maximum: 100
   * @return value
  **/
  @JsonProperty("value")
  @NotNull
 @DecimalMin("0") @DecimalMax("100")  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public QualityRatingComponentDTO value(Double value) {
    this.value = value;
    return this;
  }

 /**
   * Get componentType
   * @return componentType
  **/
  @JsonProperty("componentType")
  @NotNull
  public QualityRatingComponentType getComponentType() {
    return componentType;
  }

  public void setComponentType(QualityRatingComponentType componentType) {
    this.componentType = componentType;
  }

  public QualityRatingComponentDTO componentType(QualityRatingComponentType componentType) {
    this.componentType = componentType;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

