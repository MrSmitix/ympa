package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Цена с указанием скидки и времени последнего обновления.
  * @param value Значение.
  * @param discountBase Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
  * @param updatedAt Время последнего обновления.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetPriceWithDiscountDTO(
  value: BigDecimal,
  currencyId: CurrencyType,
  discountBase: Option[BigDecimal],
  updatedAt: OffsetDateTime
  additionalProperties: 
)

object GetPriceWithDiscountDTO {
  implicit lazy val getPriceWithDiscountDTOJsonFormat: Format[GetPriceWithDiscountDTO] = {
    val realJsonFormat = Json.format[GetPriceWithDiscountDTO]
    val declaredPropNames = Set("value", "currencyId", "discountBase", "updatedAt")
    
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
      Writes { getPriceWithDiscountDTO =>
        val jsObj = realJsonFormat.writes(getPriceWithDiscountDTO)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

