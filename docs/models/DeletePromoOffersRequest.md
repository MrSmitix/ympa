

# DeletePromoOffersRequest

Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. 

The class is defined in **[DeletePromoOffersRequest.java](../../src/main/java/org/openapitools/model/DeletePromoOffersRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**promoId** | `String` | Идентификатор акции. | 
**deleteAllOffers** | `Boolean` | Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;. |  [optional property]
**offerIds** | `List&lt;String&gt;` | Товары, которые нужно убрать из акции. |  [optional property]





