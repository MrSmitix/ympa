# ympa_r_client::GoodsStatsGoodsDTO

Информация о товаре.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shopSku** | **character** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] [Pattern: ^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$] [Max. length: 255] [Min. length: 1] 
**marketSku** | **integer** | SKU на Маркете. | [optional] 
**name** | **character** | Название товара. | [optional] 
**price** | **numeric** | Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). | [optional] 
**categoryId** | **integer** | Идентификатор категории товара на Маркете. | [optional] 
**categoryName** | **character** | Название категории товара на Маркете. | [optional] 
**weightDimensions** | [**GoodsStatsWeightDimensionsDTO**](GoodsStatsWeightDimensionsDTO.md) |  | [optional] 
**warehouses** | [**array[GoodsStatsWarehouseDTO]**](GoodsStatsWarehouseDTO.md) | Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  | [optional] 
**tariffs** | [**array[TariffDTO]**](TariffDTO.md) | Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  | [optional] 
**pictures** | **array[character]** | Ссылки (URL) изображений товара в хорошем качестве. | [optional] 


