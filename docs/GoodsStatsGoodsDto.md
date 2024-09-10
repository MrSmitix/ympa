# GoodsStatsGoodsDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shop_sku** | Option<**String**> | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional]
**market_sku** | Option<**i64**> | SKU на Маркете. | [optional]
**name** | Option<**String**> | Название товара. | [optional]
**price** | Option<**f64**> | Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). | [optional]
**category_id** | Option<**i64**> | Идентификатор категории товара на Маркете. | [optional]
**category_name** | Option<**String**> | Название категории товара на Маркете. | [optional]
**weight_dimensions** | Option<[**models::GoodsStatsWeightDimensionsDto**](GoodsStatsWeightDimensionsDTO.md)> |  | [optional]
**warehouses** | Option<[**Vec<models::GoodsStatsWarehouseDto>**](GoodsStatsWarehouseDTO.md)> | Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  | [optional]
**tariffs** | Option<[**Vec<models::TariffDto>**](TariffDTO.md)> | Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  | [optional]
**pictures** | Option<**Vec<String>**> | Ссылки (URL) изображений товара в хорошем качестве. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


