package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — &#x60;ENUM&#x60;. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле &#x60;multivalue&#x60; имеет значение &#x60;true&#x60;.  Для этого в &#x60;parameterValues&#x60; передавайте каждое значение отдельно — несколько объектов с параметрами &#x60;parameterId&#x60;, &#x60;valueId&#x60; и &#x60;value&#x60;. Параметр &#x60;parameterId&#x60; должен быть одинаковым. 
 */

@Schema(name = "ParameterValueDTO", description = "Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — `ENUM`. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле `multivalue` имеет значение `true`.  Для этого в `parameterValues` передавайте каждое значение отдельно — несколько объектов с параметрами `parameterId`, `valueId` и `value`. Параметр `parameterId` должен быть одинаковым. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ParameterValueDTO {

  private Long parameterId;

  private Long unitId;

  private Long valueId;

  private String value;

  public ParameterValueDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ParameterValueDTO(Long parameterId) {
    this.parameterId = parameterId;
  }

  public ParameterValueDTO parameterId(Long parameterId) {
    this.parameterId = parameterId;
    return this;
  }

  /**
   * Идентификатор характеристики.
   * @return parameterId
   */
  @NotNull 
  @Schema(name = "parameterId", description = "Идентификатор характеристики.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parameterId")
  public Long getParameterId() {
    return parameterId;
  }

  public void setParameterId(Long parameterId) {
    this.parameterId = parameterId;
  }

  public ParameterValueDTO unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  /**
   * Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.
   * @return unitId
   */
  
  @Schema(name = "unitId", description = "Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unitId")
  public Long getUnitId() {
    return unitId;
  }

  public void setUnitId(Long unitId) {
    this.unitId = unitId;
  }

  public ParameterValueDTO valueId(Long valueId) {
    this.valueId = valueId;
    return this;
  }

  /**
   * Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. 
   * @return valueId
   */
  
  @Schema(name = "valueId", description = "Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueId")
  public Long getValueId() {
    return valueId;
  }

  public void setValueId(Long valueId) {
    this.valueId = valueId;
  }

  public ParameterValueDTO value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Значение.
   * @return value
   */
  
  @Schema(name = "value", description = "Значение.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

