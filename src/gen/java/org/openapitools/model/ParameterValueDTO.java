package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — `ENUM`. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле `multivalue` имеет значение `true`.  Для этого в `parameterValues` передавайте каждое значение отдельно — несколько объектов с параметрами `parameterId`, `valueId` и `value`. Параметр `parameterId` должен быть одинаковым. 
 */
@ApiModel(description="Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — `ENUM`. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле `multivalue` имеет значение `true`.  Для этого в `parameterValues` передавайте каждое значение отдельно — несколько объектов с параметрами `parameterId`, `valueId` и `value`. Параметр `parameterId` должен быть одинаковым. ")

public class ParameterValueDTO  {
  
 /**
  * Идентификатор характеристики.
  */
  @ApiModelProperty(required = true, value = "Идентификатор характеристики.")
  private Long parameterId;

 /**
  * Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.
  */
  @ApiModelProperty(value = "Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.")
  private Long unitId;

 /**
  * Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. 
  */
  @ApiModelProperty(value = "Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. ")
  private Long valueId;

 /**
  * Значение.
  */
  @ApiModelProperty(value = "Значение.")
  private String value;
 /**
  * Идентификатор характеристики.
  * @return parameterId
  */
  @JsonProperty("parameterId")
  @NotNull
  public Long getParameterId() {
    return parameterId;
  }

  /**
   * Sets the <code>parameterId</code> property.
   */
 public void setParameterId(Long parameterId) {
    this.parameterId = parameterId;
  }

  /**
   * Sets the <code>parameterId</code> property.
   */
  public ParameterValueDTO parameterId(Long parameterId) {
    this.parameterId = parameterId;
    return this;
  }

 /**
  * Идентификатор единицы измерения. Если вы не передали параметр &#x60;unitId&#x60;, используется единица измерения по умолчанию.
  * @return unitId
  */
  @JsonProperty("unitId")
  public Long getUnitId() {
    return unitId;
  }

  /**
   * Sets the <code>unitId</code> property.
   */
 public void setUnitId(Long unitId) {
    this.unitId = unitId;
  }

  /**
   * Sets the <code>unitId</code> property.
   */
  public ParameterValueDTO unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

 /**
  * Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа &#x60;ENUM&#x60;. 
  * @return valueId
  */
  @JsonProperty("valueId")
  public Long getValueId() {
    return valueId;
  }

  /**
   * Sets the <code>valueId</code> property.
   */
 public void setValueId(Long valueId) {
    this.valueId = valueId;
  }

  /**
   * Sets the <code>valueId</code> property.
   */
  public ParameterValueDTO valueId(Long valueId) {
    this.valueId = valueId;
    return this;
  }

 /**
  * Значение.
  * @return value
  */
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(String value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
  public ParameterValueDTO value(String value) {
    this.value = value;
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
    ParameterValueDTO parameterValueDTO = (ParameterValueDTO) o;
    return Objects.equals(this.parameterId, parameterValueDTO.parameterId) &&
        Objects.equals(this.unitId, parameterValueDTO.unitId) &&
        Objects.equals(this.valueId, parameterValueDTO.valueId) &&
        Objects.equals(this.value, parameterValueDTO.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterId, unitId, valueId, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterValueDTO {\n");
    
    sb.append("    parameterId: ").append(toIndentedString(parameterId)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    valueId: ").append(toIndentedString(valueId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

