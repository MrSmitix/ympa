package models

// ParameterValueDto - Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — `ENUM`. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле `multivalue` имеет значение `true`.  Для этого в `parameterValues` передавайте каждое значение отдельно — несколько объектов с параметрами `parameterId`, `valueId` и `value`. Параметр `parameterId` должен быть одинаковым. 
type ParameterValueDto struct {

	// Идентификатор характеристики.
	ParameterId int64 `json:"parameterId"`

	// Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.
	UnitId int64 `json:"unitId,omitempty"`

	// Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. 
	ValueId int64 `json:"valueId,omitempty"`

	// Значение.
	Value string `json:"value,omitempty"`
}
