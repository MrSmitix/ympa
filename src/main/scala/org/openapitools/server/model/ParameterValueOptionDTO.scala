package org.openapitools.server.model


/**
 * Значение характеристики.
 *
 * @param id Идентификатор значения. for example: ''null''
 * @param value Значение. for example: ''null''
 * @param description Описание значения. for example: ''null''
*/
final case class ParameterValueOptionDTO (
  id: Long,
  value: String,
  description: Option[String] = None
)

