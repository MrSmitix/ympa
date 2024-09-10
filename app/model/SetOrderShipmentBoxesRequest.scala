package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SetOrderShipmentBoxesRequest.
  * @param boxes Список грузовых мест. Маркет определяет количество мест по длине этого списка.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class SetOrderShipmentBoxesRequest(
  boxes: List[ParcelBoxDTO]
  additionalProperties: 
)

object SetOrderShipmentBoxesRequest {
  implicit lazy val setOrderShipmentBoxesRequestJsonFormat: Format[SetOrderShipmentBoxesRequest] = {
    val realJsonFormat = Json.format[SetOrderShipmentBoxesRequest]
    val declaredPropNames = Set("boxes")
    
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
      Writes { setOrderShipmentBoxesRequest =>
        val jsObj = realJsonFormat.writes(setOrderShipmentBoxesRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

