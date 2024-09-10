package model

import play.api.libs.json._

/**
  * Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
  * @param campaignIds Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PromoOfferAutoParticipatingDetailsDTO(
  campaignIds: Option[List[Long]]
)

object PromoOfferAutoParticipatingDetailsDTO {
  implicit lazy val promoOfferAutoParticipatingDetailsDTOJsonFormat: Format[PromoOfferAutoParticipatingDetailsDTO] = Json.format[PromoOfferAutoParticipatingDetailsDTO]
}

