package org.openapitools.server.model


/**
 * @param boxes Список коробок. for example: ''null''
 * @param allowRemove Передайте `true`, если вы собираетесь удалить часть товаров из заказа. for example: ''null''
*/
final case class SetOrderBoxLayoutRequest (
  boxes: Seq[OrderBoxLayoutDTO],
  allowRemove: Option[Boolean] = None
)

