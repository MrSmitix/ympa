
package org.openapitools.client.model


case class GetBidsInfoRequest (
    /* Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются.  */
    _skus: Option[List[String]]
)
object GetBidsInfoRequest {
    def toStringBody(var_skus: Object) =
        s"""
        | {
        | "skus":$var_skus
        | }
        """.stripMargin
}
