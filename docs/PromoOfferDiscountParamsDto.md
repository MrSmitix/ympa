# PromoOfferDiscountParamsDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | Option<**i64**> | Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  | [optional]
**promo_price** | Option<**i64**> | Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  | [optional]
**max_promo_price** | **i64** | Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


