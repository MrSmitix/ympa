/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OptionValuesLimitedDTO;



/**
 * Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`. 
 */

@ApiModel(description = "Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ValueRestrictionDTO   {
  
  private Long limitingParameterId;
  private List<OptionValuesLimitedDTO> limitedValues = new ArrayList<>();

  /**
   * Идентификатор ограничивающей характеристики.
   */
  public ValueRestrictionDTO limitingParameterId(Long limitingParameterId) {
    this.limitingParameterId = limitingParameterId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор ограничивающей характеристики.")
  @JsonProperty("limitingParameterId")
  public Long getLimitingParameterId() {
    return limitingParameterId;
  }
  public void setLimitingParameterId(Long limitingParameterId) {
    this.limitingParameterId = limitingParameterId;
  }

  /**
   * Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
   */
  public ValueRestrictionDTO limitedValues(List<OptionValuesLimitedDTO> limitedValues) {
    this.limitedValues = limitedValues;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.")
  @JsonProperty("limitedValues")
  public List<OptionValuesLimitedDTO> getLimitedValues() {
    return limitedValues;
  }
  public void setLimitedValues(List<OptionValuesLimitedDTO> limitedValues) {
    this.limitedValues = limitedValues;
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
    return Objects.equals(limitingParameterId, valueRestrictionDTO.limitingParameterId) &&
        Objects.equals(limitedValues, valueRestrictionDTO.limitedValues);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

