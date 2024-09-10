# OfferCardRecommendationDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**OfferCardRecommendationType**](OfferCardRecommendationType.md) |  | 
**Percent** | Pointer to **int32** | Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов. | [optional] 

## Methods

### NewOfferCardRecommendationDTO

`func NewOfferCardRecommendationDTO(type_ OfferCardRecommendationType, ) *OfferCardRecommendationDTO`

NewOfferCardRecommendationDTO instantiates a new OfferCardRecommendationDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferCardRecommendationDTOWithDefaults

`func NewOfferCardRecommendationDTOWithDefaults() *OfferCardRecommendationDTO`

NewOfferCardRecommendationDTOWithDefaults instantiates a new OfferCardRecommendationDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *OfferCardRecommendationDTO) GetType() OfferCardRecommendationType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OfferCardRecommendationDTO) GetTypeOk() (*OfferCardRecommendationType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OfferCardRecommendationDTO) SetType(v OfferCardRecommendationType)`

SetType sets Type field to given value.


### GetPercent

`func (o *OfferCardRecommendationDTO) GetPercent() int32`

GetPercent returns the Percent field if non-nil, zero value otherwise.

### GetPercentOk

`func (o *OfferCardRecommendationDTO) GetPercentOk() (*int32, bool)`

GetPercentOk returns a tuple with the Percent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPercent

`func (o *OfferCardRecommendationDTO) SetPercent(v int32)`

SetPercent sets Percent field to given value.

### HasPercent

`func (o *OfferCardRecommendationDTO) HasPercent() bool`

HasPercent returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


