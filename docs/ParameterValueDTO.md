
# Table `ParameterValueDTO`
(mapped from: ParameterValueDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**parameterId** | parameterId | long NOT NULL |  | **kotlin.Long** | Идентификатор характеристики. | 
**unitId** | unitId | long |  | **kotlin.Long** | Идентификатор единицы измерения. Если вы не передали параметр &#x60;unitId&#x60;, используется единица измерения по умолчанию. |  [optional]
**valueId** | valueId | long |  | **kotlin.Long** | Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа &#x60;ENUM&#x60;.  |  [optional]
**value** | value | text |  | **kotlin.String** | Значение. |  [optional]






