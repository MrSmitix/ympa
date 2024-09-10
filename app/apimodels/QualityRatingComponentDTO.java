package apimodels;

import apimodels.QualityRatingComponentType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Составляющая индекса качества.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class QualityRatingComponentDTO   {
  @JsonProperty("value")
  @NotNull
@DecimalMin("0")
@DecimalMax("100")

  private Double value;

  @JsonProperty("componentType")
  @NotNull
@Valid

  private QualityRatingComponentType componentType;

  public QualityRatingComponentDTO value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Значение составляющей в процентах.
   * minimum: 0
   * maximum: 100
   * @return value
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

