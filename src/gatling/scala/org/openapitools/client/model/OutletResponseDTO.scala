
package org.openapitools.client.model


case class OutletResponseDTO (
    /* Идентификатор точки продаж, присвоенный Маркетом. */
    _id: Option[Long]
)
object OutletResponseDTO {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
