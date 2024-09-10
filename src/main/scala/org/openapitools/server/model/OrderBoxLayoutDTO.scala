package org.openapitools.server.model


/**
 * Информация о коробке.
 *
 * @param items Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  for example: ''null''
*/
final case class OrderBoxLayoutDTO (
  items: Seq[OrderBoxLayoutItemDTO]
)

