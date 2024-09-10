package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.QualityRatingComponentType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Составляющая индекса качества.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Составляющая индекса качества.")
public class QualityRatingComponentDTO   {
  
  private Double value;

  private QualityRatingComponentType componentType;

  /**
   * Значение составляющей в процентах.
   * minimum: 0
   * maximum: 100
   **/
  public QualityRatingComponentDTO value(Double value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Значение составляющей в процентах.")
  @JsonProperty("value")
  @NotNull
 @DecimalMin("0") @DecimalMax("100")  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }


  /**
   **/
  public QualityRatingComponentDTO componentType(QualityRatingComponentType componentType) {
    this.componentType = componentType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("componentType")
  @NotNull
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

