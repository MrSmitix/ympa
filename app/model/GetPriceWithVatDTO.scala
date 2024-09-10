package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Цена с указанием ставки НДС и времени последнего обновления.
  * @param value Цена на товар.
  * @param discountBase Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
  * @param vat Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
  * @param updatedAt Время последнего обновления.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetPriceWithVatDTO(
  value: Option[BigDecimal],
  discountBase: Option[BigDecimal],
  currencyId: Option[CurrencyType],
  vat: Option[Int],
  updatedAt: OffsetDateTime
  additionalProperties: 
)

object GetPriceWithVatDTO {
  implicit lazy val getPriceWithVatDTOJsonFormat: Format[GetPriceWithVatDTO] = {
    val realJsonFormat = Json.format[GetPriceWithVatDTO]
    val declaredPropNames = Set("value", "discountBase", "currencyId", "vat", "updatedAt")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { getPriceWithVatDTO =>
        val jsObj = realJsonFormat.writes(getPriceWithVatDTO)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

