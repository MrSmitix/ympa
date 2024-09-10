
package org.openapitools.client.model


case class EnrichedModelDTO (
    /* Идентификатор модели товара. */
    _id: Option[Long],
    /* Название модели товара. */
    _name: Option[String],
    _prices: Option[ModelPriceDTO],
    /* Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  */
    _offers: Option[List[ModelOfferDTO]],
    /* Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. */
    _offlineOffers: Option[Integer],
    /* Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. */
    _onlineOffers: Option[Integer]
)
object EnrichedModelDTO {
    def toStringBody(var_id: Object, var_name: Object, var_prices: Object, var_offers: Object, var_offlineOffers: Object, var_onlineOffers: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"prices":$var_prices,"offers":$var_offers,"offlineOffers":$var_offlineOffers,"onlineOffers":$var_onlineOffers
        | }
        """.stripMargin
}
