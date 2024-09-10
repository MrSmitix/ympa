# goods_stats_goods_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shop_sku** | **char \*** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**market_sku** | **long** | SKU на Маркете. | [optional] 
**name** | **char \*** | Название товара. | [optional] 
**price** | **double** | Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). | [optional] 
**category_id** | **long** | Идентификатор категории товара на Маркете. | [optional] 
**category_name** | **char \*** | Название категории товара на Маркете. | [optional] 
**weight_dimensions** | [**goods_stats_weight_dimensions_dto_t**](goods_stats_weight_dimensions_dto.md) \* |  | [optional] 
**warehouses** | [**list_t**](goods_stats_warehouse_dto.md) \* | Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  | [optional] 
**tariffs** | [**list_t**](tariff_dto.md) \* | Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  | [optional] 
**pictures** | **list_t \*** | Ссылки (URL) изображений товара в хорошем качестве. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


