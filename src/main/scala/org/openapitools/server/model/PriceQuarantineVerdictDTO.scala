package org.openapitools.server.model


/**
 * Причина попадания товара в карантин.
 *
 * @param `type`  for example: ''null''
 * @param params Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина. for example: ''null''
*/
final case class PriceQuarantineVerdictDTO (
  `type`: Option[PriceQuarantineVerdictType] = None,
  params: Seq[PriceQuarantineVerdictParameterDTO]
)

