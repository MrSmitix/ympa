# ympa_r_client::UpdateOfferMappingResultDTO

Ошибки и предупреждения, которые появились из-за переданных характеристик.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerId** | **character** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [Pattern: ^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$] [Max. length: 255] [Min. length: 1] 
**errors** | [**array[OfferMappingErrorDTO]**](OfferMappingErrorDTO.md) | Ошибки — информация в каталоге не обновится. | [optional] 
**warnings** | [**array[OfferMappingErrorDTO]**](OfferMappingErrorDTO.md) | Предупреждения — информация в каталоге обновится. | [optional] 


