# OfferRecommendationsResultDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | Pointer to [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**OfferRecommendations** | [**[]OfferRecommendationDTO**](OfferRecommendationDTO.md) | Страница списка товаров. | 

## Methods

### NewOfferRecommendationsResultDTO

`func NewOfferRecommendationsResultDTO(offerRecommendations []OfferRecommendationDTO, ) *OfferRecommendationsResultDTO`

NewOfferRecommendationsResultDTO instantiates a new OfferRecommendationsResultDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferRecommendationsResultDTOWithDefaults

`func NewOfferRecommendationsResultDTOWithDefaults() *OfferRecommendationsResultDTO`

NewOfferRecommendationsResultDTOWithDefaults instantiates a new OfferRecommendationsResultDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaging

`func (o *OfferRecommendationsResultDTO) GetPaging() ScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *OfferRecommendationsResultDTO) GetPagingOk() (*ScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *OfferRecommendationsResultDTO) SetPaging(v ScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *OfferRecommendationsResultDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.

### GetOfferRecommendations

`func (o *OfferRecommendationsResultDTO) GetOfferRecommendations() []OfferRecommendationDTO`

GetOfferRecommendations returns the OfferRecommendations field if non-nil, zero value otherwise.

### GetOfferRecommendationsOk

`func (o *OfferRecommendationsResultDTO) GetOfferRecommendationsOk() (*[]OfferRecommendationDTO, bool)`

GetOfferRecommendationsOk returns a tuple with the OfferRecommendations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferRecommendations

`func (o *OfferRecommendationsResultDTO) SetOfferRecommendations(v []OfferRecommendationDTO)`

SetOfferRecommendations sets OfferRecommendations field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


