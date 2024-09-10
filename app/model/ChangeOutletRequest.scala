package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChangeOutletRequest.
  * @param name Название точки продаж. 
  * @param coords Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
  * @param isMain Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
  * @param shopOutletCode Идентификатор точки продаж, присвоенный магазином.
  * @param phones Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
  * @param deliveryRules Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
  * @param storagePeriod Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ChangeOutletRequest(
  name: String,
  `type`: OutletType,
  coords: Option[String],
  isMain: Option[Boolean],
  shopOutletCode: Option[String],
  visibility: Option[OutletVisibilityType],
  address: OutletAddressDTO,
  phones: List[String],
  workingSchedule: OutletWorkingScheduleDTO,
  deliveryRules: Option[List[OutletDeliveryRuleDTO]],
  storagePeriod: Option[Long]
  additionalProperties: 
)

object ChangeOutletRequest {
  implicit lazy val changeOutletRequestJsonFormat: Format[ChangeOutletRequest] = {
    val realJsonFormat = Json.format[ChangeOutletRequest]
    val declaredPropNames = Set("name", "`type`", "coords", "isMain", "shopOutletCode", "visibility", "address", "phones", "workingSchedule", "deliveryRules", "storagePeriod")
    
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
      Writes { changeOutletRequest =>
        val jsObj = realJsonFormat.writes(changeOutletRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

