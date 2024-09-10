# WWW::OpenAPIClient::Object::OrderBuyerInfoDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::OrderBuyerInfoDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Идентификатор покупателя. | [optional] 
**last_name** | **string** | Фамилия покупателя. | [optional] 
**first_name** | **string** | Имя покупателя. | [optional] 
**middle_name** | **string** | Отчество покупателя. | [optional] 
**type** | [**OrderBuyerType**](OrderBuyerType.md) |  | [optional] 
**phone** | **string** | Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: &#x60;+&lt;код_страны&gt;&lt;код_региона&gt;&lt;номер_телефона&gt;&#x60;.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


