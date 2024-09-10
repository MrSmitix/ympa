# PromoOfferDiscountParamsDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | **Int!** | Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  | [optional] [default to null]
**promoPrice** | **Int!** | Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  | [optional] [default to null]
**maxPromoPrice** | **Int!** | Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


