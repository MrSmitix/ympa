package org.openapitools.server.model


/**
 * Составляющая индекса качества.
 *
 * @param value Значение составляющей в процентах. for example: ''null''
 * @param componentType  for example: ''null''
*/
final case class QualityRatingComponentDTO (
  value: Double,
  componentType: QualityRatingComponentType
)

