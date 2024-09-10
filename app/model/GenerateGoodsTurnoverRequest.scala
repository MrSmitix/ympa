package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Данные, необходимые для генерации отчета. 
  * @param campaignId Идентификатор кампании.
  * @param date Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GenerateGoodsTurnoverRequest(
  campaignId: Long,
  date: Option[LocalDate]
)

object GenerateGoodsTurnoverRequest {
  implicit lazy val generateGoodsTurnoverRequestJsonFormat: Format[GenerateGoodsTurnoverRequest] = Json.format[GenerateGoodsTurnoverRequest]
}

