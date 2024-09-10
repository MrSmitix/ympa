package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OptionValuesLimitedDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`. 
 **/
@ApiModel(description="Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`. ")

public class ValueRestrictionDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор ограничивающей характеристики.")
 /**
   * Идентификатор ограничивающей характеристики.
  **/
  private Long limitingParameterId;

  @ApiModelProperty(required = true, value = "Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.")
 /**
   * Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
  **/
  private List<OptionValuesLimitedDTO> limitedValues = new ArrayList<>();
 /**
   * Идентификатор ограничивающей характеристики.
   * @return limitingParameterId
  **/
  @JsonProperty("limitingParameterId")
  public Long getLimitingParameterId() {
    return limitingParameterId;
  }

  public void setLimitingParameterId(Long limitingParameterId) {
    this.limitingParameterId = limitingParameterId;
  }

  public ValueRestrictionDTO limitingParameterId(Long limitingParameterId) {
    this.limitingParameterId = limitingParameterId;
    return this;
  }

 /**
   * Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
   * @return limitedValues
  **/
  @JsonProperty("limitedValues")
  public List<OptionValuesLimitedDTO> getLimitedValues() {
    return limitedValues;
  }

  public void setLimitedValues(List<OptionValuesLimitedDTO> limitedValues) {
    this.limitedValues = limitedValues;
  }

  public ValueRestrictionDTO limitedValues(List<OptionValuesLimitedDTO> limitedValues) {
    this.limitedValues = limitedValues;
    return this;
  }

  public ValueRestrictionDTO addLimitedValuesItem(OptionValuesLimitedDTO limitedValuesItem) {
    this.limitedValues.add(limitedValuesItem);
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
    ValueRestrictionDTO valueRestrictionDTO = (ValueRestrictionDTO) o;
    return Objects.equals(this.limitingParameterId, valueRestrictionDTO.limitingParameterId) &&
        Objects.equals(this.limitedValues, valueRestrictionDTO.limitedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitingParameterId, limitedValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueRestrictionDTO {\n");
    
    sb.append("    limitingParameterId: ").append(toIndentedString(limitingParameterId)).append("\n");
    sb.append("    limitedValues: ").append(toIndentedString(limitedValues)).append("\n");
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

