# GetPromoOfferDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**Status** | [**PromoOfferParticipationStatusType**](PromoOfferParticipationStatusType.md) |  | 
**Params** | [**PromoOfferParamsDTO**](PromoOfferParamsDTO.md) |  | 
**AutoParticipatingDetails** | Pointer to [**PromoOfferAutoParticipatingDetailsDTO**](PromoOfferAutoParticipatingDetailsDTO.md) |  | [optional] 

## Methods

### NewGetPromoOfferDTO

`func NewGetPromoOfferDTO(offerId string, status PromoOfferParticipationStatusType, params PromoOfferParamsDTO, ) *GetPromoOfferDTO`

NewGetPromoOfferDTO instantiates a new GetPromoOfferDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPromoOfferDTOWithDefaults

`func NewGetPromoOfferDTOWithDefaults() *GetPromoOfferDTO`

NewGetPromoOfferDTOWithDefaults instantiates a new GetPromoOfferDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferId

`func (o *GetPromoOfferDTO) GetOfferId() string`

GetOfferId returns the OfferId field if non-nil, zero value otherwise.

### GetOfferIdOk

`func (o *GetPromoOfferDTO) GetOfferIdOk() (*string, bool)`

GetOfferIdOk returns a tuple with the OfferId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferId

`func (o *GetPromoOfferDTO) SetOfferId(v string)`

SetOfferId sets OfferId field to given value.


### GetStatus

`func (o *GetPromoOfferDTO) GetStatus() PromoOfferParticipationStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetPromoOfferDTO) GetStatusOk() (*PromoOfferParticipationStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetPromoOfferDTO) SetStatus(v PromoOfferParticipationStatusType)`

SetStatus sets Status field to given value.


### GetParams

`func (o *GetPromoOfferDTO) GetParams() PromoOfferParamsDTO`

GetParams returns the Params field if non-nil, zero value otherwise.

### GetParamsOk

`func (o *GetPromoOfferDTO) GetParamsOk() (*PromoOfferParamsDTO, bool)`

GetParamsOk returns a tuple with the Params field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParams

`func (o *GetPromoOfferDTO) SetParams(v PromoOfferParamsDTO)`

SetParams sets Params field to given value.


### GetAutoParticipatingDetails

`func (o *GetPromoOfferDTO) GetAutoParticipatingDetails() PromoOfferAutoParticipatingDetailsDTO`

GetAutoParticipatingDetails returns the AutoParticipatingDetails field if non-nil, zero value otherwise.

### GetAutoParticipatingDetailsOk

`func (o *GetPromoOfferDTO) GetAutoParticipatingDetailsOk() (*PromoOfferAutoParticipatingDetailsDTO, bool)`

GetAutoParticipatingDetailsOk returns a tuple with the AutoParticipatingDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoParticipatingDetails

`func (o *GetPromoOfferDTO) SetAutoParticipatingDetails(v PromoOfferAutoParticipatingDetailsDTO)`

SetAutoParticipatingDetails sets AutoParticipatingDetails field to given value.

### HasAutoParticipatingDetails

`func (o *GetPromoOfferDTO) HasAutoParticipatingDetails() bool`

HasAutoParticipatingDetails returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


