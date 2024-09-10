# FullOutletLicenseDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре &#x60;number&#x60;.  | [optional] [default to nothing]
**outletId** | **Int64** | Идентификатор точки продаж, для которой действительна лицензия. | [optional] [default to nothing]
**licenseType** | [***LicenseType**](LicenseType.md) |  | [optional] [default to nothing]
**number** | **String** | Номер лицензии. | [optional] [default to nothing]
**dateOfIssue** | **ZonedDateTime** | Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение &#x60;2017-11-13T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре &#x60;dateOfExpiry&#x60;.  | [optional] [default to nothing]
**dateOfExpiry** | **ZonedDateTime** | Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение &#x60;2022-11-20T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре &#x60;dateOfIssue&#x60;.  | [optional] [default to nothing]
**checkStatus** | [***LicenseCheckStatusType**](LicenseCheckStatusType.md) |  | [optional] [default to nothing]
**checkComment** | **String** | Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр &#x60;checkStatus&#x60; имеет значение &#x60;FAIL&#x60;.  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


