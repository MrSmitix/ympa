# ympa_r_client::UpdatePromoOffersRequest

Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**promoId** | **character** | Идентификатор акции. | 
**offers** | [**array[UpdatePromoOfferDTO]**](UpdatePromoOfferDTO.md) | Товары, которые необходимо добавить в акцию или цены которых нужно изменить. | [Max. items: 500] [Min. items: 1] 


