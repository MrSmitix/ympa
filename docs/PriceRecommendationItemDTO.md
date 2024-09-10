# PriceRecommendationItemDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignId** | **int64** | Идентификатор кампании. | 
**Price** | **float32** | Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices)  | 

## Methods

### NewPriceRecommendationItemDTO

`func NewPriceRecommendationItemDTO(campaignId int64, price float32, ) *PriceRecommendationItemDTO`

NewPriceRecommendationItemDTO instantiates a new PriceRecommendationItemDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPriceRecommendationItemDTOWithDefaults

`func NewPriceRecommendationItemDTOWithDefaults() *PriceRecommendationItemDTO`

NewPriceRecommendationItemDTOWithDefaults instantiates a new PriceRecommendationItemDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCampaignId

`func (o *PriceRecommendationItemDTO) GetCampaignId() int64`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *PriceRecommendationItemDTO) GetCampaignIdOk() (*int64, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *PriceRecommendationItemDTO) SetCampaignId(v int64)`

SetCampaignId sets CampaignId field to given value.


### GetPrice

`func (o *PriceRecommendationItemDTO) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *PriceRecommendationItemDTO) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *PriceRecommendationItemDTO) SetPrice(v float32)`

SetPrice sets Price field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


