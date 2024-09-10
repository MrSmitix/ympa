# DeleteOffersDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NotDeletedOfferIds** | Pointer to **[]string** | Список SKU товаров, которые не удалось удалить. | [optional] 

## Methods

### NewDeleteOffersDTO

`func NewDeleteOffersDTO() *DeleteOffersDTO`

NewDeleteOffersDTO instantiates a new DeleteOffersDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeleteOffersDTOWithDefaults

`func NewDeleteOffersDTOWithDefaults() *DeleteOffersDTO`

NewDeleteOffersDTOWithDefaults instantiates a new DeleteOffersDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNotDeletedOfferIds

`func (o *DeleteOffersDTO) GetNotDeletedOfferIds() []string`

GetNotDeletedOfferIds returns the NotDeletedOfferIds field if non-nil, zero value otherwise.

### GetNotDeletedOfferIdsOk

`func (o *DeleteOffersDTO) GetNotDeletedOfferIdsOk() (*[]string, bool)`

GetNotDeletedOfferIdsOk returns a tuple with the NotDeletedOfferIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotDeletedOfferIds

`func (o *DeleteOffersDTO) SetNotDeletedOfferIds(v []string)`

SetNotDeletedOfferIds sets NotDeletedOfferIds field to given value.

### HasNotDeletedOfferIds

`func (o *DeleteOffersDTO) HasNotDeletedOfferIds() bool`

HasNotDeletedOfferIds returns a boolean if a field has been set.

### SetNotDeletedOfferIdsNil

`func (o *DeleteOffersDTO) SetNotDeletedOfferIdsNil(b bool)`

 SetNotDeletedOfferIdsNil sets the value for NotDeletedOfferIds to be an explicit nil

### UnsetNotDeletedOfferIds
`func (o *DeleteOffersDTO) UnsetNotDeletedOfferIds()`

UnsetNotDeletedOfferIds ensures that no value is present for NotDeletedOfferIds, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


