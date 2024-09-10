package model

import play.api.libs.json._

/**
  * Информация об акции.
  * @param id Идентификатор акции.
  * @param name Название акции.
  * @param participating Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
  * @param channels Список каналов продвижения товаров.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetPromoDTO(
  id: String,
  name: String,
  period: PromoPeriodDTO,
  participating: Boolean,
  assortmentInfo: GetPromoAssortmentInfoDTO,
  mechanicsInfo: GetPromoMechanicsInfoDTO,
  bestsellerInfo: GetPromoBestsellerInfoDTO,
  channels: Option[List[ChannelType]],
  constraints: Option[GetPromoConstraintsDTO]
)

object GetPromoDTO {
  implicit lazy val getPromoDTOJsonFormat: Format[GetPromoDTO] = Json.format[GetPromoDTO]
}

