package org.openapitools.server.model


/**
 * Единица измерения.
 *
 * @param id Идентификатор единицы измерения. for example: ''null''
 * @param name Сокращенное название единицы измерения. for example: ''кг''
 * @param fullName Полное название единицы измерения. for example: ''килограмм''
*/
final case class UnitDTO (
  id: Long,
  name: String,
  fullName: String
)

