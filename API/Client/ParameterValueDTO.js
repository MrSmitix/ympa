goog.provide('API.Client.ParameterValueDTO');

/**
 * Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — `ENUM`. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле `multivalue` имеет значение `true`.  Для этого в `parameterValues` передавайте каждое значение отдельно — несколько объектов с параметрами `parameterId`, `valueId` и `value`. Параметр `parameterId` должен быть одинаковым. 
 * @record
 */
API.Client.ParameterValueDTO = function() {}

/**
 * Идентификатор характеристики.
 * @type {!number}
 * @export
 */
API.Client.ParameterValueDTO.prototype.parameterId;

/**
 * Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.
 * @type {!number}
 * @export
 */
API.Client.ParameterValueDTO.prototype.unitId;

/**
 * Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. 
 * @type {!number}
 * @export
 */
API.Client.ParameterValueDTO.prototype.valueId;

/**
 * Значение.
 * @type {!string}
 * @export
 */
API.Client.ParameterValueDTO.prototype.value;

