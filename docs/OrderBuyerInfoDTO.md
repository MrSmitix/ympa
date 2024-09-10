

# OrderBuyerInfoDTO

Информация о покупателе и его номере телефона.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Идентификатор покупателя. |  [optional]
**lastName** | **String** | Фамилия покупателя. |  [optional]
**firstName** | **String** | Имя покупателя. |  [optional]
**middleName** | **String** | Отчество покупателя. |  [optional]
**`type`** | **OrderBuyerType** |  |  [optional]
**phone** | **String** | Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: &#x60;+&lt;код_страны&gt;&lt;код_региона&gt;&lt;номер_телефона&gt;&#x60;.  |  [optional]


