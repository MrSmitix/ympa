# UpdateOfferContentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OffersContent** | [**[]OfferContentDTO**](OfferContentDTO.md) | Список товаров с указанными характеристиками. | 

## Methods

### NewUpdateOfferContentRequest

`func NewUpdateOfferContentRequest(offersContent []OfferContentDTO, ) *UpdateOfferContentRequest`

NewUpdateOfferContentRequest instantiates a new UpdateOfferContentRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateOfferContentRequestWithDefaults

`func NewUpdateOfferContentRequestWithDefaults() *UpdateOfferContentRequest`

NewUpdateOfferContentRequestWithDefaults instantiates a new UpdateOfferContentRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffersContent

`func (o *UpdateOfferContentRequest) GetOffersContent() []OfferContentDTO`

GetOffersContent returns the OffersContent field if non-nil, zero value otherwise.

### GetOffersContentOk

`func (o *UpdateOfferContentRequest) GetOffersContentOk() (*[]OfferContentDTO, bool)`

GetOffersContentOk returns a tuple with the OffersContent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffersContent

`func (o *UpdateOfferContentRequest) SetOffersContent(v []OfferContentDTO)`

SetOffersContent sets OffersContent field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


