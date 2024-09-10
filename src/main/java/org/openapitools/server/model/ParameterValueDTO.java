package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — `ENUM`. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле `multivalue` имеет значение `true`.  Для этого в `parameterValues` передавайте каждое значение отдельно — несколько объектов с параметрами `parameterId`, `valueId` и `value`. Параметр `parameterId` должен быть одинаковым. 
 */
public class ParameterValueDTO   {

    private Long parameterId;
    private Long unitId;
    private Long valueId;
    private String value;

    /**
     * Default constructor.
     */
    public ParameterValueDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ParameterValueDTO.
     *
     * @param parameterId Идентификатор характеристики.
     * @param unitId Идентификатор единицы измерения. Если вы не передали параметр &#x60;unitId&#x60;, используется единица измерения по умолчанию.
     * @param valueId Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа &#x60;ENUM&#x60;. 
     * @param value Значение.
     */
    public ParameterValueDTO(
        Long parameterId, 
        Long unitId, 
        Long valueId, 
        String value
    ) {
        this.parameterId = parameterId;
        this.unitId = unitId;
        this.valueId = valueId;
        this.value = value;
    }



    /**
     * Идентификатор характеристики.
     * @return parameterId
     */
    public Long getParameterId() {
        return parameterId;
    }

    public void setParameterId(Long parameterId) {
        this.parameterId = parameterId;
    }

    /**
     * Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.
     * @return unitId
     */
    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    /**
     * Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. 
     * @return valueId
     */
    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    /**
     * Значение.
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

