
package org.openapitools.client.model


case class GetBidsRecommendationsRequest (
    /* Список товаров, для которых нужно получить рекомендации по ставкам.  */
    _skus: List[String]
)
object GetBidsRecommendationsRequest {
    def toStringBody(var_skus: Object) =
        s"""
        | {
        | "skus":$var_skus
        | }
        """.stripMargin
}
