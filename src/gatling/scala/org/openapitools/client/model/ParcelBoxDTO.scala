
package org.openapitools.client.model


case class ParcelBoxDTO (
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  */
    _id: Option[Long],
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  */
    _fulfilmentId: Option[String]
)
object ParcelBoxDTO {
    def toStringBody(var_id: Object, var_fulfilmentId: Object) =
        s"""
        | {
        | "id":$var_id,"fulfilmentId":$var_fulfilmentId
        | }
        """.stripMargin
}
