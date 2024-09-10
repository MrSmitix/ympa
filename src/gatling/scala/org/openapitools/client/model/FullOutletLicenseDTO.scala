
package org.openapitools.client.model

import java.time.OffsetDateTime

case class FullOutletLicenseDTO (
    /* Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`.  */
    _id: Option[Long],
    /* Идентификатор точки продаж, для которой действительна лицензия. */
    _outletId: Option[Long],
    _licenseType: Option[LicenseType],
    /* Номер лицензии. */
    _number: Option[String],
    /* Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`.  */
    _dateOfIssue: Option[OffsetDateTime],
    /* Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`.  */
    _dateOfExpiry: Option[OffsetDateTime],
    _checkStatus: Option[LicenseCheckStatusType],
    /* Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр `checkStatus` имеет значение `FAIL`.  */
    _checkComment: Option[String]
)
object FullOutletLicenseDTO {
    def toStringBody(var_id: Object, var_outletId: Object, var_licenseType: Object, var_number: Object, var_dateOfIssue: Object, var_dateOfExpiry: Object, var_checkStatus: Object, var_checkComment: Object) =
        s"""
        | {
        | "id":$var_id,"outletId":$var_outletId,"licenseType":$var_licenseType,"number":$var_number,"dateOfIssue":$var_dateOfIssue,"dateOfExpiry":$var_dateOfExpiry,"checkStatus":$var_checkStatus,"checkComment":$var_checkComment
        | }
        """.stripMargin
}
