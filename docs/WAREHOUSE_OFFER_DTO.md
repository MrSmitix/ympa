# WAREHOUSE_OFFER_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | [**STRING_32**](STRING_32.md) | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [default to null]
**turnover_summary** | [**TURNOVER_DTO**](TurnoverDTO.md) |  | [optional] [default to null]
**stocks** | [**LIST [WAREHOUSE_STOCK_DTO]**](WarehouseStockDTO.md) | Информация об остатках. | [default to null]
**updated_at** | [**DATE_TIME**](DATE_TIME.md) | Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2023-11-21T00:42:42+03:00&#x60;.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


