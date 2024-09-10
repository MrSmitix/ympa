package org.openapitools.server.model


/**
 * Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — `ENUM`. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле `multivalue` имеет значение `true`.  Для этого в `parameterValues` передавайте каждое значение отдельно — несколько объектов с параметрами `parameterId`, `valueId` и `value`. Параметр `parameterId` должен быть одинаковым. 
 *
 * @param parameterId Идентификатор характеристики. for example: ''null''
 * @param unitId Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию. for example: ''null''
 * @param valueId Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`.  for example: ''null''
 * @param value Значение. for example: ''null''
*/
final case class ParameterValueDTO (
  parameterId: Long,
  unitId: Option[Long] = None,
  valueId: Option[Long] = None,
  value: Option[String] = None
)

