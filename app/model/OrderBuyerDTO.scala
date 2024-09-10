package model

import play.api.libs.json._

/**
  * Информация о покупателе.  Параметры `id`, `lastName`, `firstName` и `middleName` возвращаются, только если вы работаете по модели DBS. 
  * @param id Идентификатор покупателя.
  * @param lastName Фамилия покупателя.
  * @param firstName Имя покупателя.
  * @param middleName Отчество покупателя.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderBuyerDTO(
  id: Option[String],
  lastName: Option[String],
  firstName: Option[String],
  middleName: Option[String],
  `type`: Option[OrderBuyerType]
  additionalProperties: 
)

object OrderBuyerDTO {
  implicit lazy val orderBuyerDTOJsonFormat: Format[OrderBuyerDTO] = {
    val realJsonFormat = Json.format[OrderBuyerDTO]
    val declaredPropNames = Set("id", "lastName", "firstName", "middleName", "`type`")
    
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
      Writes { orderBuyerDTO =>
        val jsObj = realJsonFormat.writes(orderBuyerDTO)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

