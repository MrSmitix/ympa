# UpdatePromoOfferDiscountParamsDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Price** | Pointer to **int64** | Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым.  | [optional] 
**PromoPrice** | Pointer to **int64** | Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым.  | [optional] 

## Methods

### NewUpdatePromoOfferDiscountParamsDTO

`func NewUpdatePromoOfferDiscountParamsDTO() *UpdatePromoOfferDiscountParamsDTO`

NewUpdatePromoOfferDiscountParamsDTO instantiates a new UpdatePromoOfferDiscountParamsDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdatePromoOfferDiscountParamsDTOWithDefaults

`func NewUpdatePromoOfferDiscountParamsDTOWithDefaults() *UpdatePromoOfferDiscountParamsDTO`

NewUpdatePromoOfferDiscountParamsDTOWithDefaults instantiates a new UpdatePromoOfferDiscountParamsDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPrice

`func (o *UpdatePromoOfferDiscountParamsDTO) GetPrice() int64`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *UpdatePromoOfferDiscountParamsDTO) GetPriceOk() (*int64, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *UpdatePromoOfferDiscountParamsDTO) SetPrice(v int64)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *UpdatePromoOfferDiscountParamsDTO) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetPromoPrice

`func (o *UpdatePromoOfferDiscountParamsDTO) GetPromoPrice() int64`

GetPromoPrice returns the PromoPrice field if non-nil, zero value otherwise.

### GetPromoPriceOk

`func (o *UpdatePromoOfferDiscountParamsDTO) GetPromoPriceOk() (*int64, bool)`

GetPromoPriceOk returns a tuple with the PromoPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromoPrice

`func (o *UpdatePromoOfferDiscountParamsDTO) SetPromoPrice(v int64)`

SetPromoPrice sets PromoPrice field to given value.

### HasPromoPrice

`func (o *UpdatePromoOfferDiscountParamsDTO) HasPromoPrice() bool`

HasPromoPrice returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


