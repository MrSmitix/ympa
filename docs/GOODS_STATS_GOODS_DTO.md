# GOODS_STATS_GOODS_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shop_sku** | [**STRING_32**](STRING_32.md) | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] [default to null]
**market_sku** | **INTEGER_64** | SKU на Маркете. | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Название товара. | [optional] [default to null]
**price** | **REAL_32** | Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). | [optional] [default to null]
**category_id** | **INTEGER_64** | Идентификатор категории товара на Маркете. | [optional] [default to null]
**category_name** | [**STRING_32**](STRING_32.md) | Название категории товара на Маркете. | [optional] [default to null]
**weight_dimensions** | [**GOODS_STATS_WEIGHT_DIMENSIONS_DTO**](GoodsStatsWeightDimensionsDTO.md) |  | [optional] [default to null]
**warehouses** | [**LIST [GOODS_STATS_WAREHOUSE_DTO]**](GoodsStatsWarehouseDTO.md) | Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  | [optional] [default to null]
**tariffs** | [**LIST [TARIFF_DTO]**](TariffDTO.md) | Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  | [optional] [default to null]
**pictures** | [**LIST [STRING_32]**](STRING_32.md) | Ссылки (URL) изображений товара в хорошем качестве. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


