package model

import play.api.libs.json._

/**
  * Информация о коробке.
  * @param items Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
  * @param boxId Идентификатор коробки.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class EnrichedOrderBoxLayoutDTO(
  items: List[OrderBoxLayoutItemDTO],
  boxId: Option[Long]
  additionalProperties: 
)

object EnrichedOrderBoxLayoutDTO {
  implicit lazy val enrichedOrderBoxLayoutDTOJsonFormat: Format[EnrichedOrderBoxLayoutDTO] = {
    val realJsonFormat = Json.format[EnrichedOrderBoxLayoutDTO]
    val declaredPropNames = Set("items", "boxId")
    
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
      Writes { enrichedOrderBoxLayoutDTO =>
        val jsObj = realJsonFormat.writes(enrichedOrderBoxLayoutDTO)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

