package org.openapitools.server.model


/**
 * Информация об акции.
 *
 * @param id Идентификатор акции. for example: ''null''
 * @param name Название акции. for example: ''null''
 * @param period  for example: ''null''
 * @param participating Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  for example: ''null''
 * @param assortmentInfo  for example: ''null''
 * @param mechanicsInfo  for example: ''null''
 * @param bestsellerInfo  for example: ''null''
 * @param channels Список каналов продвижения товаров. for example: ''null''
 * @param constraints  for example: ''null''
*/
final case class GetPromoDTO (
  id: String,
  name: String,
  period: PromoPeriodDTO,
  participating: Boolean,
  assortmentInfo: GetPromoAssortmentInfoDTO,
  mechanicsInfo: GetPromoMechanicsInfoDTO,
  bestsellerInfo: GetPromoBestsellerInfoDTO,
  channels: Option[Seq[ChannelType]] = None,
  constraints: Option[GetPromoConstraintsDTO] = None
)

