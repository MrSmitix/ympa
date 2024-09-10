package model

import play.api.libs.json._
import java.time.LocalDate
import scala.collection.immutable.Set

/**
  * Запрос информации по индексу качества.
  * @param dateFrom Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. 
  * @param dateTo Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. 
  * @param campaignIds Список идентификаторов магазинов.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetQualityRatingRequest(
  dateFrom: Option[LocalDate],
  dateTo: Option[LocalDate],
  campaignIds: Set[Long]
)

object GetQualityRatingRequest {
  implicit lazy val getQualityRatingRequestJsonFormat: Format[GetQualityRatingRequest] = Json.format[GetQualityRatingRequest]
}

