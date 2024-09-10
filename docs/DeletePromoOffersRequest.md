# WWW::OpenAPIClient::Object::DeletePromoOffersRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::DeletePromoOffersRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**promo_id** | **string** | Идентификатор акции. | 
**delete_all_offers** | **boolean** | Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;. | [optional] 
**offer_ids** | **ARRAY[string]** | Товары, которые нужно убрать из акции. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


