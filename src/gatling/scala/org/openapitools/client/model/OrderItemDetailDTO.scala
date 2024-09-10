
package org.openapitools.client.model


case class OrderItemDetailDTO (
    /* Количество единиц товара. */
    _itemCount: Option[Long],
    _itemStatus: Option[OrderItemStatusType],
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    _updateDate: Option[String]
)
object OrderItemDetailDTO {
    def toStringBody(var_itemCount: Object, var_itemStatus: Object, var_updateDate: Object) =
        s"""
        | {
        | "itemCount":$var_itemCount,"itemStatus":$var_itemStatus,"updateDate":$var_updateDate
        | }
        """.stripMargin
}
