# ympa_csharp_client.Model.DeletePromoOffersRequest
Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PromoId** | **string** | Идентификатор акции. | 
**DeleteAllOffers** | **bool** | Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;. | [optional] 
**OfferIds** | **List&lt;string&gt;** | Товары, которые нужно убрать из акции. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

