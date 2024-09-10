# order_item_promo_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **order_promo_type_t \*** |  | 
**discount** | **double** | Размер пользовательской скидки в валюте покупателя.  | [optional] 
**subsidy** | **double** | Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  | [optional] 
**shop_promo_id** | **char \*** | Идентификатор акции поставщика.  | [optional] 
**market_promo_id** | **char \*** | Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


