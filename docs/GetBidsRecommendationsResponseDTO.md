# GetBidsRecommendationsResponseDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Recommendations** | [**[]SkuBidRecommendationItemDTO**](SkuBidRecommendationItemDTO.md) | Список товаров с рекомендованными ставками. | 

## Methods

### NewGetBidsRecommendationsResponseDTO

`func NewGetBidsRecommendationsResponseDTO(recommendations []SkuBidRecommendationItemDTO, ) *GetBidsRecommendationsResponseDTO`

NewGetBidsRecommendationsResponseDTO instantiates a new GetBidsRecommendationsResponseDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBidsRecommendationsResponseDTOWithDefaults

`func NewGetBidsRecommendationsResponseDTOWithDefaults() *GetBidsRecommendationsResponseDTO`

NewGetBidsRecommendationsResponseDTOWithDefaults instantiates a new GetBidsRecommendationsResponseDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRecommendations

`func (o *GetBidsRecommendationsResponseDTO) GetRecommendations() []SkuBidRecommendationItemDTO`

GetRecommendations returns the Recommendations field if non-nil, zero value otherwise.

### GetRecommendationsOk

`func (o *GetBidsRecommendationsResponseDTO) GetRecommendationsOk() (*[]SkuBidRecommendationItemDTO, bool)`

GetRecommendationsOk returns a tuple with the Recommendations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecommendations

`func (o *GetBidsRecommendationsResponseDTO) SetRecommendations(v []SkuBidRecommendationItemDTO)`

SetRecommendations sets Recommendations field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


