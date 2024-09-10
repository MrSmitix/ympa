# FeedPublicationDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**FeedStatusType**](FeedStatusType.md) |  | [optional] 
**Full** | Pointer to [**FeedPublicationFullDTO**](FeedPublicationFullDTO.md) |  | [optional] 
**PriceAndStockUpdate** | Pointer to [**FeedPublicationPriceAndStockUpdateDTO**](FeedPublicationPriceAndStockUpdateDTO.md) |  | [optional] 

## Methods

### NewFeedPublicationDTO

`func NewFeedPublicationDTO() *FeedPublicationDTO`

NewFeedPublicationDTO instantiates a new FeedPublicationDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedPublicationDTOWithDefaults

`func NewFeedPublicationDTOWithDefaults() *FeedPublicationDTO`

NewFeedPublicationDTOWithDefaults instantiates a new FeedPublicationDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *FeedPublicationDTO) GetStatus() FeedStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *FeedPublicationDTO) GetStatusOk() (*FeedStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *FeedPublicationDTO) SetStatus(v FeedStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *FeedPublicationDTO) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetFull

`func (o *FeedPublicationDTO) GetFull() FeedPublicationFullDTO`

GetFull returns the Full field if non-nil, zero value otherwise.

### GetFullOk

`func (o *FeedPublicationDTO) GetFullOk() (*FeedPublicationFullDTO, bool)`

GetFullOk returns a tuple with the Full field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFull

`func (o *FeedPublicationDTO) SetFull(v FeedPublicationFullDTO)`

SetFull sets Full field to given value.

### HasFull

`func (o *FeedPublicationDTO) HasFull() bool`

HasFull returns a boolean if a field has been set.

### GetPriceAndStockUpdate

`func (o *FeedPublicationDTO) GetPriceAndStockUpdate() FeedPublicationPriceAndStockUpdateDTO`

GetPriceAndStockUpdate returns the PriceAndStockUpdate field if non-nil, zero value otherwise.

### GetPriceAndStockUpdateOk

`func (o *FeedPublicationDTO) GetPriceAndStockUpdateOk() (*FeedPublicationPriceAndStockUpdateDTO, bool)`

GetPriceAndStockUpdateOk returns a tuple with the PriceAndStockUpdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceAndStockUpdate

`func (o *FeedPublicationDTO) SetPriceAndStockUpdate(v FeedPublicationPriceAndStockUpdateDTO)`

SetPriceAndStockUpdate sets PriceAndStockUpdate field to given value.

### HasPriceAndStockUpdate

`func (o *FeedPublicationDTO) HasPriceAndStockUpdate() bool`

HasPriceAndStockUpdate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


