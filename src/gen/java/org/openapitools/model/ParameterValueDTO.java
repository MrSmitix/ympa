package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — `ENUM`. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле `multivalue` имеет значение `true`.  Для этого в `parameterValues` передавайте каждое значение отдельно — несколько объектов с параметрами `parameterId`, `valueId` и `value`. Параметр `parameterId` должен быть одинаковым. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ParameterValueDTO   {
  
  private Long parameterId;
  private Long unitId;
  private Long valueId;
  private String value;

  /**
   * Идентификатор характеристики.
   **/
  
  @ApiModelProperty(required = true, value = "Идентификатор характеристики.")
  @JsonProperty("parameterId")
  @NotNull
  public Long getParameterId() {
    return parameterId;
  }
  public void setParameterId(Long parameterId) {
    this.parameterId = parameterId;
  }

  /**
   * Идентификатор единицы измерения. Если вы не передали параметр &#x60;unitId&#x60;, используется единица измерения по умолчанию.
   **/
  
  @ApiModelProperty(value = "Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.")
  @JsonProperty("unitId")
  public Long getUnitId() {
    return unitId;
  }
  public void setUnitId(Long unitId) {
    this.unitId = unitId;
  }

  /**
   * Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа &#x60;ENUM&#x60;. 
   **/
  
  @ApiModelProperty(value = "Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. ")
  @JsonProperty("valueId")
  public Long getValueId() {
    return valueId;
  }
  public void setValueId(Long valueId) {
    this.valueId = valueId;
  }

  /**
   * Значение.
   **/
  
  @ApiModelProperty(value = "Значение.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

