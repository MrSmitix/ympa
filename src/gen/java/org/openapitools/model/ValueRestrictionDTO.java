package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OptionValuesLimitedDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`. 
 */
@ApiModel(description="Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`. ")

public class ValueRestrictionDTO  {
  
 /**
  * Идентификатор ограничивающей характеристики.
  */
  @ApiModelProperty(required = true, value = "Идентификатор ограничивающей характеристики.")
  private Long limitingParameterId;

 /**
  * Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
  */
  @ApiModelProperty(required = true, value = "Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.")
  @Valid
  private List<@Valid OptionValuesLimitedDTO> limitedValues = new ArrayList<>();
 /**
  * Идентификатор ограничивающей характеристики.
  * @return limitingParameterId
  */
  @JsonProperty("limitingParameterId")
  @NotNull
  public Long getLimitingParameterId() {
    return limitingParameterId;
  }

  /**
   * Sets the <code>limitingParameterId</code> property.
   */
 public void setLimitingParameterId(Long limitingParameterId) {
    this.limitingParameterId = limitingParameterId;
  }

  /**
   * Sets the <code>limitingParameterId</code> property.
   */
  public ValueRestrictionDTO limitingParameterId(Long limitingParameterId) {
    this.limitingParameterId = limitingParameterId;
    return this;
  }

 /**
  * Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
  * @return limitedValues
  */
  @JsonProperty("limitedValues")
  @NotNull
  public List<@Valid OptionValuesLimitedDTO> getLimitedValues() {
    return limitedValues;
  }

  /**
   * Sets the <code>limitedValues</code> property.
   */
 public void setLimitedValues(List<@Valid OptionValuesLimitedDTO> limitedValues) {
    this.limitedValues = limitedValues;
  }

  /**
   * Sets the <code>limitedValues</code> property.
   */
  public ValueRestrictionDTO limitedValues(List<@Valid OptionValuesLimitedDTO> limitedValues) {
    this.limitedValues = limitedValues;
    return this;
  }

  /**
   * Adds a new item to the <code>limitedValues</code> list.
   */
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

