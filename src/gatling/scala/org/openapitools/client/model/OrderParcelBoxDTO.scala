
package org.openapitools.client.model


case class OrderParcelBoxDTO (
    /* Идентификатор грузоместа. */
    _id: Option[Long],
    /* Идентификатор грузового места в информационной системе магазина. */
    _fulfilmentId: Option[String]
)
object OrderParcelBoxDTO {
    def toStringBody(var_id: Object, var_fulfilmentId: Object) =
        s"""
        | {
        | "id":$var_id,"fulfilmentId":$var_fulfilmentId
        | }
        """.stripMargin
}
