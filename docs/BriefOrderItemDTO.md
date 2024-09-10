# ympa_r_client::BriefOrderItemDTO

Информация о маркированном товаре.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  | [optional] 
**vat** | [**OrderVatType**](OrderVatType.md) |  | [optional] [Enum: ] 
**count** | **integer** | Количество единиц товара. | [optional] 
**price** | **numeric** | Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.  | [optional] 
**offerName** | **character** | Название товара. | [optional] 
**offerId** | **character** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] [Pattern: ^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$] [Max. length: 255] [Min. length: 1] 
**instances** | [**array[OrderItemInstanceDTO]**](OrderItemInstanceDTO.md) | Переданные вами коды маркировки. | [optional] 


