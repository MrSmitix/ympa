package org.openapitools.server.model


/**
 * Ограничения в акции.
 *
 * @param warehouseIds Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу.  for example: ''null''
*/
final case class GetPromoConstraintsDTO (
  warehouseIds: Option[Seq[Long]] = None
)

