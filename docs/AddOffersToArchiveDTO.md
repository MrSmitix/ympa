# AddOffersToArchiveDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NotArchivedOffers** | Pointer to [**[]AddOffersToArchiveErrorDTO**](AddOffersToArchiveErrorDTO.md) | Список товаров, которые не удалось поместить в архив. | [optional] 

## Methods

### NewAddOffersToArchiveDTO

`func NewAddOffersToArchiveDTO() *AddOffersToArchiveDTO`

NewAddOffersToArchiveDTO instantiates a new AddOffersToArchiveDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAddOffersToArchiveDTOWithDefaults

`func NewAddOffersToArchiveDTOWithDefaults() *AddOffersToArchiveDTO`

NewAddOffersToArchiveDTOWithDefaults instantiates a new AddOffersToArchiveDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNotArchivedOffers

`func (o *AddOffersToArchiveDTO) GetNotArchivedOffers() []AddOffersToArchiveErrorDTO`

GetNotArchivedOffers returns the NotArchivedOffers field if non-nil, zero value otherwise.

### GetNotArchivedOffersOk

`func (o *AddOffersToArchiveDTO) GetNotArchivedOffersOk() (*[]AddOffersToArchiveErrorDTO, bool)`

GetNotArchivedOffersOk returns a tuple with the NotArchivedOffers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotArchivedOffers

`func (o *AddOffersToArchiveDTO) SetNotArchivedOffers(v []AddOffersToArchiveErrorDTO)`

SetNotArchivedOffers sets NotArchivedOffers field to given value.

### HasNotArchivedOffers

`func (o *AddOffersToArchiveDTO) HasNotArchivedOffers() bool`

HasNotArchivedOffers returns a boolean if a field has been set.

### SetNotArchivedOffersNil

`func (o *AddOffersToArchiveDTO) SetNotArchivedOffersNil(b bool)`

 SetNotArchivedOffersNil sets the value for NotArchivedOffers to be an explicit nil

### UnsetNotArchivedOffers
`func (o *AddOffersToArchiveDTO) UnsetNotArchivedOffers()`

UnsetNotArchivedOffers ensures that no value is present for NotArchivedOffers, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


