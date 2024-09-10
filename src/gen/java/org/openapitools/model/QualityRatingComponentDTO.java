package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.QualityRatingComponentType;



/**
 * Составляющая индекса качества.
 **/

@ApiModel(description = "Составляющая индекса качества.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QualityRatingComponentDTO   {
  @JsonProperty("value")
  private Double value;

  @JsonProperty("componentType")
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
  public Double getValue() {
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
    return Objects.equals(value, qualityRatingComponentDTO.value) &&
        Objects.equals(componentType, qualityRatingComponentDTO.componentType);
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

