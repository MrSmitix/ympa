package model

import play.api.libs.json._

/**
  * Информация о товарах в акции.
  * @param activeOffers Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
  * @param potentialOffers Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. 
  * @param processing Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetPromoAssortmentInfoDTO(
  activeOffers: Int,
  potentialOffers: Option[Int],
  processing: Option[Boolean]
)

object GetPromoAssortmentInfoDTO {
  implicit lazy val getPromoAssortmentInfoDTOJsonFormat: Format[GetPromoAssortmentInfoDTO] = Json.format[GetPromoAssortmentInfoDTO]
}

