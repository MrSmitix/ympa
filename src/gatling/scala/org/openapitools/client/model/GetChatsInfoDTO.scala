
package org.openapitools.client.model


case class GetChatsInfoDTO (
    /* Информация о чатах. */
    _chats: List[GetChatInfoDTO],
    _paging: Option[ForwardScrollingPagerDTO]
)
object GetChatsInfoDTO {
    def toStringBody(var_chats: Object, var_paging: Object) =
        s"""
        | {
        | "chats":$var_chats,"paging":$var_paging
        | }
        """.stripMargin
}
