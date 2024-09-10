# UpdateOfferMappingsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferMappings** | [**[]UpdateOfferMappingDTO**](UpdateOfferMappingDTO.md) | Перечень товаров, которые нужно добавить или обновить. | 
**OnlyPartnerMediaContent** | Pointer to **bool** | Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — &#x60;false&#x60;. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение &#x60;true&#x60;.  | [optional] 

## Methods

### NewUpdateOfferMappingsRequest

`func NewUpdateOfferMappingsRequest(offerMappings []UpdateOfferMappingDTO, ) *UpdateOfferMappingsRequest`

NewUpdateOfferMappingsRequest instantiates a new UpdateOfferMappingsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateOfferMappingsRequestWithDefaults

`func NewUpdateOfferMappingsRequestWithDefaults() *UpdateOfferMappingsRequest`

NewUpdateOfferMappingsRequestWithDefaults instantiates a new UpdateOfferMappingsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferMappings

`func (o *UpdateOfferMappingsRequest) GetOfferMappings() []UpdateOfferMappingDTO`

GetOfferMappings returns the OfferMappings field if non-nil, zero value otherwise.

### GetOfferMappingsOk

`func (o *UpdateOfferMappingsRequest) GetOfferMappingsOk() (*[]UpdateOfferMappingDTO, bool)`

GetOfferMappingsOk returns a tuple with the OfferMappings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferMappings

`func (o *UpdateOfferMappingsRequest) SetOfferMappings(v []UpdateOfferMappingDTO)`

SetOfferMappings sets OfferMappings field to given value.


### GetOnlyPartnerMediaContent

`func (o *UpdateOfferMappingsRequest) GetOnlyPartnerMediaContent() bool`

GetOnlyPartnerMediaContent returns the OnlyPartnerMediaContent field if non-nil, zero value otherwise.

### GetOnlyPartnerMediaContentOk

`func (o *UpdateOfferMappingsRequest) GetOnlyPartnerMediaContentOk() (*bool, bool)`

GetOnlyPartnerMediaContentOk returns a tuple with the OnlyPartnerMediaContent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOnlyPartnerMediaContent

`func (o *UpdateOfferMappingsRequest) SetOnlyPartnerMediaContent(v bool)`

SetOnlyPartnerMediaContent sets OnlyPartnerMediaContent field to given value.

### HasOnlyPartnerMediaContent

`func (o *UpdateOfferMappingsRequest) HasOnlyPartnerMediaContent() bool`

HasOnlyPartnerMediaContent returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


