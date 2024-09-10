package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Данные, необходимые для генерации отчета. 
  * @param businessId Идентификатор бизнеса.
  * @param dateFrom Начало периода, включительно.
  * @param dateTo Конец периода, включительно. Максимальный период — 1 год.
  * @param campaignIds Список магазинов, которые нужны в отчете.
  * @param promoId Идентификатор акции, товары из которой нужны в отчете.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GenerateUnitedOrdersRequest(
  businessId: Long,
  dateFrom: LocalDate,
  dateTo: LocalDate,
  campaignIds: Option[List[Long]],
  promoId: Option[String]
)

object GenerateUnitedOrdersRequest {
  implicit lazy val generateUnitedOrdersRequestJsonFormat: Format[GenerateUnitedOrdersRequest] = Json.format[GenerateUnitedOrdersRequest]
}

