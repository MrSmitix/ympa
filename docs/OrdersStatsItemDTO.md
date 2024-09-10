# OrdersStatsItemDTO

Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`). 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_name** | **str** | Название товара. | [optional] 
**market_sku** | **int** | SKU на Маркете. | [optional] 
**shop_sku** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**count** | **int** | Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;.  | [optional] 
**prices** | [**List[OrdersStatsPriceDTO]**](OrdersStatsPriceDTO.md) | Цена или скидки на товар. | [optional] 
**warehouse** | [**OrdersStatsWarehouseDTO**](OrdersStatsWarehouseDTO.md) |  | [optional] 
**details** | [**List[OrdersStatsDetailsDTO]**](OrdersStatsDetailsDTO.md) | Информация об удалении товара из заказа. | [optional] 
**cis_list** | **List[str]** | Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). | [optional] 
**initial_count** | **int** | Первоначальное количество единиц товара. | [optional] 
**bid_fee** | **int** | Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.  | [optional] 
**cofinance_threshold** | **float** | Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.  | [optional] 
**cofinance_value** | **float** | Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.orders_stats_item_dto import OrdersStatsItemDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrdersStatsItemDTO from a JSON string
orders_stats_item_dto_instance = OrdersStatsItemDTO.from_json(json)
# print the JSON string representation of the object
print OrdersStatsItemDTO.to_json()

# convert the object into a dict
orders_stats_item_dto_dict = orders_stats_item_dto_instance.to_dict()
# create an instance of OrdersStatsItemDTO from a dict
orders_stats_item_dto_from_dict = OrdersStatsItemDTO.from_dict(orders_stats_item_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


