# FeedPlacementDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**FeedStatusType**](FeedStatusType.md) |  | [optional] 
**TotalOffersCount** | Pointer to **int32** | Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса. | [optional] 

## Methods

### NewFeedPlacementDTO

`func NewFeedPlacementDTO() *FeedPlacementDTO`

NewFeedPlacementDTO instantiates a new FeedPlacementDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedPlacementDTOWithDefaults

`func NewFeedPlacementDTOWithDefaults() *FeedPlacementDTO`

NewFeedPlacementDTOWithDefaults instantiates a new FeedPlacementDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *FeedPlacementDTO) GetStatus() FeedStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *FeedPlacementDTO) GetStatusOk() (*FeedStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *FeedPlacementDTO) SetStatus(v FeedStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *FeedPlacementDTO) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTotalOffersCount

`func (o *FeedPlacementDTO) GetTotalOffersCount() int32`

GetTotalOffersCount returns the TotalOffersCount field if non-nil, zero value otherwise.

### GetTotalOffersCountOk

`func (o *FeedPlacementDTO) GetTotalOffersCountOk() (*int32, bool)`

GetTotalOffersCountOk returns a tuple with the TotalOffersCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalOffersCount

`func (o *FeedPlacementDTO) SetTotalOffersCount(v int32)`

SetTotalOffersCount sets TotalOffersCount field to given value.

### HasTotalOffersCount

`func (o *FeedPlacementDTO) HasTotalOffersCount() bool`

HasTotalOffersCount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


