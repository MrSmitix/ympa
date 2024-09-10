package model

import play.api.libs.json._
import java.time.OffsetDateTime
import scala.collection.immutable.Set

/**
  * Фильтр запроса отзывов в кабинете. 
  * @param dateTimeFrom Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
  * @param dateTimeTo Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
  * @param ratingValues Оценка товара.
  * @param modelIds Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
  * @param paid Фильтр отзывов за баллы Плюса.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetGoodsFeedbackRequest(
  dateTimeFrom: Option[OffsetDateTime],
  dateTimeTo: Option[OffsetDateTime],
  reactionStatus: Option[FeedbackReactionStatusType],
  ratingValues: Option[Set[Int]],
  modelIds: Option[Set[Long]],
  paid: Option[Boolean]
)

object GetGoodsFeedbackRequest {
  implicit lazy val getGoodsFeedbackRequestJsonFormat: Format[GetGoodsFeedbackRequest] = Json.format[GetGoodsFeedbackRequest]
}

