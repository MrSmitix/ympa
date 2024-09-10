
package org.openapitools.client.model


case class OrderBusinessDocumentsDTO (
    _upd: Option[DocumentDTO],
    _ukd: Option[DocumentDTO],
    _torgTwelve: Option[DocumentDTO],
    _sf: Option[DocumentDTO],
    _ksf: Option[DocumentDTO]
)
object OrderBusinessDocumentsDTO {
    def toStringBody(var_upd: Object, var_ukd: Object, var_torgTwelve: Object, var_sf: Object, var_ksf: Object) =
        s"""
        | {
        | "upd":$var_upd,"ukd":$var_ukd,"torgTwelve":$var_torgTwelve,"sf":$var_sf,"ksf":$var_ksf
        | }
        """.stripMargin
}
