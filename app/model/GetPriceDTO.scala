package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Цена с указанием времени последнего обновления.
  * @param value Значение.
  * @param updatedAt Время последнего обновления.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetPriceDTO(
  value: BigDecimal,
  currencyId: CurrencyType,
  updatedAt: OffsetDateTime
  additionalProperties: 
)

object GetPriceDTO {
  implicit lazy val getPriceDTOJsonFormat: Format[GetPriceDTO] = {
    val realJsonFormat = Json.format[GetPriceDTO]
    val declaredPropNames = Set("value", "currencyId", "updatedAt")
    
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
      Writes { getPriceDTO =>
        val jsObj = realJsonFormat.writes(getPriceDTO)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

