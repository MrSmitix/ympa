package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Ограничения на значения характеристик.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ParameterValueConstraintsDTO   {
  @JsonProperty("minValue")
  
  private Double minValue;

  @JsonProperty("maxValue")
  
  private Double maxValue;

  @JsonProperty("maxLength")
  
  private Integer maxLength;

  public ParameterValueConstraintsDTO minValue(Double minValue) {
    this.minValue = minValue;
    return this;
  }

   /**
   * Минимальное число.
   * @return minValue
  **/
  public Double getMinValue() {
    return minValue;
  }

  public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }

  public ParameterValueConstraintsDTO maxValue(Double maxValue) {
    this.maxValue = maxValue;
    return this;
  }

   /**
   * Максимальное число.
   * @return maxValue
  **/
  public Double getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }

  public ParameterValueConstraintsDTO maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Максимальная длина текста.
   * @return maxLength
  **/
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterValueConstraintsDTO parameterValueConstraintsDTO = (ParameterValueConstraintsDTO) o;
    return Objects.equals(minValue, parameterValueConstraintsDTO.minValue) &&
        Objects.equals(maxValue, parameterValueConstraintsDTO.maxValue) &&
        Objects.equals(maxLength, parameterValueConstraintsDTO.maxLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minValue, maxValue, maxLength);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterValueConstraintsDTO {\n");
    
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
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

