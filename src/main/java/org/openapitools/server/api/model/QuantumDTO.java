package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр &#x60;quantum&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json {   \&quot;offers\&quot;: [     {       \&quot;offerId\&quot;: \&quot;08e35dc1-89a2-11e3-8055-0015e9b8c48d\&quot;,       \&quot;quantum\&quot;: {}     }   ] } &#x60;&#x60;&#x60;  {% endcut %} 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuantumDTO   {
  
  private Integer minQuantity;
  private Integer stepQuantity;

  public QuantumDTO () {

  }

  public QuantumDTO (Integer minQuantity, Integer stepQuantity) {
    this.minQuantity = minQuantity;
    this.stepQuantity = stepQuantity;
  }

    
  @JsonProperty("minQuantity")
  public Integer getMinQuantity() {
    return minQuantity;
  }
  public void setMinQuantity(Integer minQuantity) {
    this.minQuantity = minQuantity;
  }

    
  @JsonProperty("stepQuantity")
  public Integer getStepQuantity() {
    return stepQuantity;
  }
  public void setStepQuantity(Integer stepQuantity) {
    this.stepQuantity = stepQuantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuantumDTO quantumDTO = (QuantumDTO) o;
    return Objects.equals(minQuantity, quantumDTO.minQuantity) &&
        Objects.equals(stepQuantity, quantumDTO.stepQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minQuantity, stepQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuantumDTO {\n");
    
    sb.append("    minQuantity: ").append(toIndentedString(minQuantity)).append("\n");
    sb.append("    stepQuantity: ").append(toIndentedString(stepQuantity)).append("\n");
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
