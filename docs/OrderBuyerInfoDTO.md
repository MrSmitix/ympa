
# Table `OrderBuyerInfoDTO`
(mapped from: OrderBuyerInfoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Идентификатор покупателя. |  [optional]
**lastName** | lastName | text |  | **kotlin.String** | Фамилия покупателя. |  [optional]
**firstName** | firstName | text |  | **kotlin.String** | Имя покупателя. |  [optional]
**middleName** | middleName | text |  | **kotlin.String** | Отчество покупателя. |  [optional]
**type** | type | long |  | [**OrderBuyerType**](OrderBuyerType.md) |  |  [optional] [foreignkey]
**phone** | phone | text |  | **kotlin.String** | Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: &#x60;+&lt;код_страны&gt;&lt;код_региона&gt;&lt;номер_телефона&gt;&#x60;.  |  [optional]








