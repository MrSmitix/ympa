# FullOutletLicenseDTO

Информация о лицензии.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре &#x60;number&#x60;.  | [optional] 
**outlet_id** | **int** | Идентификатор точки продаж, для которой действительна лицензия. | [optional] 
**license_type** | [**LicenseType**](LicenseType.md) |  | [optional] 
**number** | **str** | Номер лицензии. | [optional] 
**date_of_issue** | **datetime** | Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение &#x60;2017-11-13T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре &#x60;dateOfExpiry&#x60;.  | [optional] 
**date_of_expiry** | **datetime** | Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение &#x60;2022-11-20T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре &#x60;dateOfIssue&#x60;.  | [optional] 
**check_status** | [**LicenseCheckStatusType**](LicenseCheckStatusType.md) |  | [optional] 
**check_comment** | **str** | Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр &#x60;checkStatus&#x60; имеет значение &#x60;FAIL&#x60;.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.full_outlet_license_dto import FullOutletLicenseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FullOutletLicenseDTO from a JSON string
full_outlet_license_dto_instance = FullOutletLicenseDTO.from_json(json)
# print the JSON string representation of the object
print FullOutletLicenseDTO.to_json()

# convert the object into a dict
full_outlet_license_dto_dict = full_outlet_license_dto_instance.to_dict()
# create an instance of FullOutletLicenseDTO from a dict
full_outlet_license_dto_from_dict = FullOutletLicenseDTO.from_dict(full_outlet_license_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


