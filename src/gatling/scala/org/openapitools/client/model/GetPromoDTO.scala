
package org.openapitools.client.model


case class GetPromoDTO (
    /* Идентификатор акции. */
    _id: String,
    /* Название акции. */
    _name: String,
    _period: PromoPeriodDTO,
    /* Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  */
    _participating: Boolean,
    _assortmentInfo: GetPromoAssortmentInfoDTO,
    _mechanicsInfo: GetPromoMechanicsInfoDTO,
    _bestsellerInfo: GetPromoBestsellerInfoDTO,
    /* Список каналов продвижения товаров. */
    _channels: Option[List[ChannelType]],
    _constraints: Option[GetPromoConstraintsDTO]
)
object GetPromoDTO {
    def toStringBody(var_id: Object, var_name: Object, var_period: Object, var_participating: Object, var_assortmentInfo: Object, var_mechanicsInfo: Object, var_bestsellerInfo: Object, var_channels: Object, var_constraints: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"period":$var_period,"participating":$var_participating,"assortmentInfo":$var_assortmentInfo,"mechanicsInfo":$var_mechanicsInfo,"bestsellerInfo":$var_bestsellerInfo,"channels":$var_channels,"constraints":$var_constraints
        | }
        """.stripMargin
}
