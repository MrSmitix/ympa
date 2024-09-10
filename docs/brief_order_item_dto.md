# brief_order_item_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **long** | Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  | [optional] 
**vat** | **order_vat_type_t \*** |  | [optional] 
**count** | **int** | Количество единиц товара. | [optional] 
**price** | **double** | Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.  | [optional] 
**offer_name** | **char \*** | Название товара. | [optional] 
**offer_id** | **char \*** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**instances** | [**list_t**](order_item_instance_dto.md) \* | Переданные вами коды маркировки. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


