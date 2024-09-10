package model

import play.api.libs.json._

/**
  * Диапазон дат доставки.
  * @param fromDate Формат даты: `ДД-ММ-ГГГГ`. 
  * @param toDate Формат даты: `ДД-ММ-ГГГГ`. 
  * @param fromTime Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. 
  * @param toTime Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. 
  * @param realDeliveryDate Формат даты: `ДД-ММ-ГГГГ`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderDeliveryDatesDTO(
  fromDate: Option[String],
  toDate: Option[String],
  fromTime: Option[String],
  toTime: Option[String],
  realDeliveryDate: Option[String]
)

object OrderDeliveryDatesDTO {
  implicit lazy val orderDeliveryDatesDTOJsonFormat: Format[OrderDeliveryDatesDTO] = Json.format[OrderDeliveryDatesDTO]
}

