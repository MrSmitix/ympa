package model

import play.api.libs.json._

/**
  * Информация о покупателе и его номере телефона.
  * @param id Идентификатор покупателя.
  * @param lastName Фамилия покупателя.
  * @param firstName Имя покупателя.
  * @param middleName Отчество покупателя.
  * @param phone Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. 
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderBuyerInfoDTO(
  id: Option[String],
  lastName: Option[String],
  firstName: Option[String],
  middleName: Option[String],
  `type`: Option[OrderBuyerType],
  phone: Option[String]
  additionalProperties: 
)

object OrderBuyerInfoDTO {
  implicit lazy val orderBuyerInfoDTOJsonFormat: Format[OrderBuyerInfoDTO] = {
    val realJsonFormat = Json.format[OrderBuyerInfoDTO]
    val declaredPropNames = Set("id", "lastName", "firstName", "middleName", "`type`", "phone")
    
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
      Writes { orderBuyerInfoDTO =>
        val jsObj = realJsonFormat.writes(orderBuyerInfoDTO)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

