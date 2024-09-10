package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Данные, необходимые для генерации отчета.
  * @param campaignId Идентификатор кампании.
  * @param dateFrom Начало периода, включительно.
  * @param dateTo Конец периода, включительно.
  * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GenerateGoodsMovementReportRequest(
  campaignId: Long,
  dateFrom: LocalDate,
  dateTo: LocalDate,
  shopSku: Option[String]
)

object GenerateGoodsMovementReportRequest {
  implicit lazy val generateGoodsMovementReportRequestJsonFormat: Format[GenerateGoodsMovementReportRequest] = Json.format[GenerateGoodsMovementReportRequest]
}

