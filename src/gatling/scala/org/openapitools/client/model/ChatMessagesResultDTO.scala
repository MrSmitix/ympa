
package org.openapitools.client.model


case class ChatMessagesResultDTO (
    /* Идентификатор заказа. */
    _orderId: Long,
    /* Информация о сообщениях. */
    _messages: List[ChatMessageDTO],
    _paging: Option[ForwardScrollingPagerDTO]
)
object ChatMessagesResultDTO {
    def toStringBody(var_orderId: Object, var_messages: Object, var_paging: Object) =
        s"""
        | {
        | "orderId":$var_orderId,"messages":$var_messages,"paging":$var_paging
        | }
        """.stripMargin
}
