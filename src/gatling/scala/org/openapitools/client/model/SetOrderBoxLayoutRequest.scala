
package org.openapitools.client.model


case class SetOrderBoxLayoutRequest (
    /* Список коробок. */
    _boxes: List[OrderBoxLayoutDTO],
    /* Передайте `true`, если вы собираетесь удалить часть товаров из заказа. */
    _allowRemove: Option[Boolean]
)
object SetOrderBoxLayoutRequest {
    def toStringBody(var_boxes: Object, var_allowRemove: Object) =
        s"""
        | {
        | "boxes":$var_boxes,"allowRemove":$var_allowRemove
        | }
        """.stripMargin
}
