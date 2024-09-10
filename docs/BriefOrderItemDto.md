# BriefOrderItemDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  | [optional] [default to None]
**vat** | [***models::OrderVatType**](OrderVatType.md) |  | [optional] [default to None]
**count** | **i32** | Количество единиц товара. | [optional] [default to None]
**price** | **f64** | Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.  | [optional] [default to None]
**offer_name** | **String** | Название товара. | [optional] [default to None]
**offer_id** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] [default to None]
**instances** | [**Vec<models::OrderItemInstanceDto>**](OrderItemInstanceDTO.md) | Переданные вами коды маркировки. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


