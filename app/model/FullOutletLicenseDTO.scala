package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Информация о лицензии.
  * @param id Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 
  * @param outletId Идентификатор точки продаж, для которой действительна лицензия.
  * @param number Номер лицензии.
  * @param dateOfIssue Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 
  * @param dateOfExpiry Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 
  * @param checkComment Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр `checkStatus` имеет значение `FAIL`. 
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FullOutletLicenseDTO(
  id: Option[Long],
  outletId: Option[Long],
  licenseType: Option[LicenseType],
  number: Option[String],
  dateOfIssue: Option[OffsetDateTime],
  dateOfExpiry: Option[OffsetDateTime],
  checkStatus: Option[LicenseCheckStatusType],
  checkComment: Option[String]
  additionalProperties: 
)

object FullOutletLicenseDTO {
  implicit lazy val fullOutletLicenseDTOJsonFormat: Format[FullOutletLicenseDTO] = {
    val realJsonFormat = Json.format[FullOutletLicenseDTO]
    val declaredPropNames = Set("id", "outletId", "licenseType", "number", "dateOfIssue", "dateOfExpiry", "checkStatus", "checkComment")
    
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
      Writes { fullOutletLicenseDTO =>
        val jsObj = realJsonFormat.writes(fullOutletLicenseDTO)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

