package org.openapitools.server.model


/**
 * Распределение товаров по коробкам.
 *
 * @param boxes Список коробок. for example: ''null''
*/
final case class OrderBoxesLayoutDTO (
  boxes: Seq[EnrichedOrderBoxLayoutDTO]
)

