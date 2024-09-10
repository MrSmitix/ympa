# BidRecommendationItemDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bid** | **int32** | Значение ставки. | 
**ShowPercent** | **int64** | Доля показов.  | 

## Methods

### NewBidRecommendationItemDTO

`func NewBidRecommendationItemDTO(bid int32, showPercent int64, ) *BidRecommendationItemDTO`

NewBidRecommendationItemDTO instantiates a new BidRecommendationItemDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBidRecommendationItemDTOWithDefaults

`func NewBidRecommendationItemDTOWithDefaults() *BidRecommendationItemDTO`

NewBidRecommendationItemDTOWithDefaults instantiates a new BidRecommendationItemDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBid

`func (o *BidRecommendationItemDTO) GetBid() int32`

GetBid returns the Bid field if non-nil, zero value otherwise.

### GetBidOk

`func (o *BidRecommendationItemDTO) GetBidOk() (*int32, bool)`

GetBidOk returns a tuple with the Bid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBid

`func (o *BidRecommendationItemDTO) SetBid(v int32)`

SetBid sets Bid field to given value.


### GetShowPercent

`func (o *BidRecommendationItemDTO) GetShowPercent() int64`

GetShowPercent returns the ShowPercent field if non-nil, zero value otherwise.

### GetShowPercentOk

`func (o *BidRecommendationItemDTO) GetShowPercentOk() (*int64, bool)`

GetShowPercentOk returns a tuple with the ShowPercent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowPercent

`func (o *BidRecommendationItemDTO) SetShowPercent(v int64)`

SetShowPercent sets ShowPercent field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


