# UpdatePromoOffersResultDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RejectedOffers** | Pointer to [**[]RejectedPromoOfferUpdateDTO**](RejectedPromoOfferUpdateDTO.md) | Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.  | [optional] 
**WarningOffers** | Pointer to [**[]WarningPromoOfferUpdateDTO**](WarningPromoOfferUpdateDTO.md) | Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.  | [optional] 

## Methods

### NewUpdatePromoOffersResultDTO

`func NewUpdatePromoOffersResultDTO() *UpdatePromoOffersResultDTO`

NewUpdatePromoOffersResultDTO instantiates a new UpdatePromoOffersResultDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdatePromoOffersResultDTOWithDefaults

`func NewUpdatePromoOffersResultDTOWithDefaults() *UpdatePromoOffersResultDTO`

NewUpdatePromoOffersResultDTOWithDefaults instantiates a new UpdatePromoOffersResultDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRejectedOffers

`func (o *UpdatePromoOffersResultDTO) GetRejectedOffers() []RejectedPromoOfferUpdateDTO`

GetRejectedOffers returns the RejectedOffers field if non-nil, zero value otherwise.

### GetRejectedOffersOk

`func (o *UpdatePromoOffersResultDTO) GetRejectedOffersOk() (*[]RejectedPromoOfferUpdateDTO, bool)`

GetRejectedOffersOk returns a tuple with the RejectedOffers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRejectedOffers

`func (o *UpdatePromoOffersResultDTO) SetRejectedOffers(v []RejectedPromoOfferUpdateDTO)`

SetRejectedOffers sets RejectedOffers field to given value.

### HasRejectedOffers

`func (o *UpdatePromoOffersResultDTO) HasRejectedOffers() bool`

HasRejectedOffers returns a boolean if a field has been set.

### SetRejectedOffersNil

`func (o *UpdatePromoOffersResultDTO) SetRejectedOffersNil(b bool)`

 SetRejectedOffersNil sets the value for RejectedOffers to be an explicit nil

### UnsetRejectedOffers
`func (o *UpdatePromoOffersResultDTO) UnsetRejectedOffers()`

UnsetRejectedOffers ensures that no value is present for RejectedOffers, not even an explicit nil
### GetWarningOffers

`func (o *UpdatePromoOffersResultDTO) GetWarningOffers() []WarningPromoOfferUpdateDTO`

GetWarningOffers returns the WarningOffers field if non-nil, zero value otherwise.

### GetWarningOffersOk

`func (o *UpdatePromoOffersResultDTO) GetWarningOffersOk() (*[]WarningPromoOfferUpdateDTO, bool)`

GetWarningOffersOk returns a tuple with the WarningOffers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarningOffers

`func (o *UpdatePromoOffersResultDTO) SetWarningOffers(v []WarningPromoOfferUpdateDTO)`

SetWarningOffers sets WarningOffers field to given value.

### HasWarningOffers

`func (o *UpdatePromoOffersResultDTO) HasWarningOffers() bool`

HasWarningOffers returns a boolean if a field has been set.

### SetWarningOffersNil

`func (o *UpdatePromoOffersResultDTO) SetWarningOffersNil(b bool)`

 SetWarningOffersNil sets the value for WarningOffers to be an explicit nil

### UnsetWarningOffers
`func (o *UpdatePromoOffersResultDTO) UnsetWarningOffers()`

UnsetWarningOffers ensures that no value is present for WarningOffers, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


