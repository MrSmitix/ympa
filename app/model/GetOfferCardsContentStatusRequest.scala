package model

import play.api.libs.json._
import scala.collection.immutable.Set

/**
  * Represents the Swagger definition for GetOfferCardsContentStatusRequest.
  * @param offerIds Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
  * @param cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
  * @param categoryIds Фильтр по категориям на Маркете.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetOfferCardsContentStatusRequest(
  offerIds: Option[Set[String]],
  cardStatuses: Option[Set[OfferCardStatusType]],
  categoryIds: Option[Set[Int]]
)

object GetOfferCardsContentStatusRequest {
  implicit lazy val getOfferCardsContentStatusRequestJsonFormat: Format[GetOfferCardsContentStatusRequest] = Json.format[GetOfferCardsContentStatusRequest]
}

