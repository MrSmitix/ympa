package model

import play.api.libs.json._

/**
  * Фильтр для товаров, которые добавлены в акцию вручную:  * `MANUALLY_ADDED` — товары, которые добавлены вручную.  * `NOT_MANUALLY_ADDED`— товары, которые не участвуют в акции и те, которые добавлены автоматически.  Если не передать параметр `statusType`, вернутся все товары.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PromoOfferParticipationStatusFilterType(
)

object PromoOfferParticipationStatusFilterType {
  implicit lazy val promoOfferParticipationStatusFilterTypeJsonFormat: Format[PromoOfferParticipationStatusFilterType] = Json.format[PromoOfferParticipationStatusFilterType]
}

