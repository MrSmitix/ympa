# ympa_r_client::OrderBuyerInfoDTO

Информация о покупателе и его номере телефона.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | Идентификатор покупателя. | [optional] 
**lastName** | **character** | Фамилия покупателя. | [optional] 
**firstName** | **character** | Имя покупателя. | [optional] 
**middleName** | **character** | Отчество покупателя. | [optional] 
**type** | [**OrderBuyerType**](OrderBuyerType.md) |  | [optional] [Enum: ] 
**phone** | **character** | Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: &#x60;+&lt;код_страны&gt;&lt;код_региона&gt;&lt;номер_телефона&gt;&#x60;.  | [optional] 


