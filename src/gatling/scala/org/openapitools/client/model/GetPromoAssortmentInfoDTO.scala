
package org.openapitools.client.model


case class GetPromoAssortmentInfoDTO (
    /* Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  */
    _activeOffers: Integer,
    /* Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций.  */
    _potentialOffers: Option[Integer],
    /* Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций.  */
    _processing: Option[Boolean]
)
object GetPromoAssortmentInfoDTO {
    def toStringBody(var_activeOffers: Object, var_potentialOffers: Object, var_processing: Object) =
        s"""
        | {
        | "activeOffers":$var_activeOffers,"potentialOffers":$var_potentialOffers,"processing":$var_processing
        | }
        """.stripMargin
}
