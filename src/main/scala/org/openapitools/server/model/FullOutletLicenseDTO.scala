package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Информация о лицензии.
 *
 * @param id Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`.  for example: ''null''
 * @param outletId Идентификатор точки продаж, для которой действительна лицензия. for example: ''null''
 * @param licenseType  for example: ''null''
 * @param number Номер лицензии. for example: ''null''
 * @param dateOfIssue Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`.  for example: ''null''
 * @param dateOfExpiry Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`.  for example: ''null''
 * @param checkStatus  for example: ''null''
 * @param checkComment Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр `checkStatus` имеет значение `FAIL`.  for example: ''null''
*/
final case class FullOutletLicenseDTO (
  id: Option[Long] = None,
  outletId: Option[Long] = None,
  licenseType: Option[LicenseType] = None,
  number: Option[String] = None,
  dateOfIssue: Option[OffsetDateTime] = None,
  dateOfExpiry: Option[OffsetDateTime] = None,
  checkStatus: Option[LicenseCheckStatusType] = None,
  checkComment: Option[String] = None
)

