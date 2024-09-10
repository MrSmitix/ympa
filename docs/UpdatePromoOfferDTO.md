# UpdatePromoOfferDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**Params** | Pointer to [**UpdatePromoOfferParamsDTO**](UpdatePromoOfferParamsDTO.md) |  | [optional] 

## Methods

### NewUpdatePromoOfferDTO

`func NewUpdatePromoOfferDTO(offerId string, ) *UpdatePromoOfferDTO`

NewUpdatePromoOfferDTO instantiates a new UpdatePromoOfferDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdatePromoOfferDTOWithDefaults

`func NewUpdatePromoOfferDTOWithDefaults() *UpdatePromoOfferDTO`

NewUpdatePromoOfferDTOWithDefaults instantiates a new UpdatePromoOfferDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferId

`func (o *UpdatePromoOfferDTO) GetOfferId() string`

GetOfferId returns the OfferId field if non-nil, zero value otherwise.

### GetOfferIdOk

`func (o *UpdatePromoOfferDTO) GetOfferIdOk() (*string, bool)`

GetOfferIdOk returns a tuple with the OfferId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferId

`func (o *UpdatePromoOfferDTO) SetOfferId(v string)`

SetOfferId sets OfferId field to given value.


### GetParams

`func (o *UpdatePromoOfferDTO) GetParams() UpdatePromoOfferParamsDTO`

GetParams returns the Params field if non-nil, zero value otherwise.

### GetParamsOk

`func (o *UpdatePromoOfferDTO) GetParamsOk() (*UpdatePromoOfferParamsDTO, bool)`

GetParamsOk returns a tuple with the Params field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParams

`func (o *UpdatePromoOfferDTO) SetParams(v UpdatePromoOfferParamsDTO)`

SetParams sets Params field to given value.

### HasParams

`func (o *UpdatePromoOfferDTO) HasParams() bool`

HasParams returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


