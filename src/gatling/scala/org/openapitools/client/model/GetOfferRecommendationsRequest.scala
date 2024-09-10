
package org.openapitools.client.model


case class GetOfferRecommendationsRequest (
    /* Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. */
    _offerIds: Option[List[String]],
    _cofinancePriceFilter: Option[FieldStateType],
    _recommendedCofinancePriceFilter: Option[FieldStateType],
    _competitivenessFilter: Option[PriceCompetitivenessType]
)
object GetOfferRecommendationsRequest {
    def toStringBody(var_offerIds: Object, var_cofinancePriceFilter: Object, var_recommendedCofinancePriceFilter: Object, var_competitivenessFilter: Object) =
        s"""
        | {
        | "offerIds":$var_offerIds,"cofinancePriceFilter":$var_cofinancePriceFilter,"recommendedCofinancePriceFilter":$var_recommendedCofinancePriceFilter,"competitivenessFilter":$var_competitivenessFilter
        | }
        """.stripMargin
}
