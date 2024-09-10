package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — `ENUM`. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле `multivalue` имеет значение `true`.  Для этого в `parameterValues` передавайте каждое значение отдельно — несколько объектов с параметрами `parameterId`, `valueId` и `value`. Параметр `parameterId` должен быть одинаковым. 
 * @param parameterId Идентификатор характеристики.
 * @param unitId Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.
 * @param valueId Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. 
 * @param value Значение.
 */
case class ParameterValueDTO(parameterId: Long,
                unitId: Option[Long],
                valueId: Option[Long],
                value: Option[String]
                )

object ParameterValueDTO {
    /**
     * Creates the codec for converting ParameterValueDTO from and to JSON.
     */
    implicit val decoder: Decoder[ParameterValueDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ParameterValueDTO] = deriveEncoder
}
