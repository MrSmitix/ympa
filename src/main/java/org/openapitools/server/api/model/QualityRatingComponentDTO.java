package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.QualityRatingComponentType;

/**
 * Составляющая индекса качества.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QualityRatingComponentDTO   {
  
  private Double value;
  private QualityRatingComponentType componentType;

  public QualityRatingComponentDTO () {

  }

  public QualityRatingComponentDTO (Double value, QualityRatingComponentType componentType) {
    this.value = value;
    this.componentType = componentType;
  }

    
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

    
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
