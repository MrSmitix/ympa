
package org.openapitools.client.model


case class PagedReturnsDTO (
    _paging: Option[ForwardScrollingPagerDTO],
    /* Список возвратов. */
    _returns: List[ReturnDTO]
)
object PagedReturnsDTO {
    def toStringBody(var_paging: Object, var_returns: Object) =
        s"""
        | {
        | "paging":$var_paging,"returns":$var_returns
        | }
        """.stripMargin
}
