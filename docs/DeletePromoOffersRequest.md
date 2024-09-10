# ympa_r_client::DeletePromoOffersRequest

Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**promoId** | **character** | Идентификатор акции. | 
**deleteAllOffers** | **character** | Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;. | [optional] 
**offerIds** | **array[character]** | Товары, которые нужно убрать из акции. | [optional] [Max. items: 500] [Min. items: 1] 


