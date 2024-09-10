package model

import play.api.libs.json._

/**
  * Цена с указанием скидки, валюты и времени последнего обновления.
  * @param value Цена на товар.
  * @param discountBase Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
  * @param vat Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PriceDTO(
  value: Option[BigDecimal],
  discountBase: Option[BigDecimal],
  currencyId: Option[CurrencyType],
  vat: Option[Int]
)

object PriceDTO {
  implicit lazy val priceDTOJsonFormat: Format[PriceDTO] = Json.format[PriceDTO]
}

