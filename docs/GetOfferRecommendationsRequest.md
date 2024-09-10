# GetOfferRecommendationsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferIds** | Pointer to **[]string** | Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. | [optional] 
**CofinancePriceFilter** | Pointer to [**FieldStateType**](FieldStateType.md) |  | [optional] 
**RecommendedCofinancePriceFilter** | Pointer to [**FieldStateType**](FieldStateType.md) |  | [optional] 
**CompetitivenessFilter** | Pointer to [**PriceCompetitivenessType**](PriceCompetitivenessType.md) |  | [optional] 

## Methods

### NewGetOfferRecommendationsRequest

`func NewGetOfferRecommendationsRequest() *GetOfferRecommendationsRequest`

NewGetOfferRecommendationsRequest instantiates a new GetOfferRecommendationsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetOfferRecommendationsRequestWithDefaults

`func NewGetOfferRecommendationsRequestWithDefaults() *GetOfferRecommendationsRequest`

NewGetOfferRecommendationsRequestWithDefaults instantiates a new GetOfferRecommendationsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferIds

`func (o *GetOfferRecommendationsRequest) GetOfferIds() []string`

GetOfferIds returns the OfferIds field if non-nil, zero value otherwise.

### GetOfferIdsOk

`func (o *GetOfferRecommendationsRequest) GetOfferIdsOk() (*[]string, bool)`

GetOfferIdsOk returns a tuple with the OfferIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferIds

`func (o *GetOfferRecommendationsRequest) SetOfferIds(v []string)`

SetOfferIds sets OfferIds field to given value.

### HasOfferIds

`func (o *GetOfferRecommendationsRequest) HasOfferIds() bool`

HasOfferIds returns a boolean if a field has been set.

### SetOfferIdsNil

`func (o *GetOfferRecommendationsRequest) SetOfferIdsNil(b bool)`

 SetOfferIdsNil sets the value for OfferIds to be an explicit nil

### UnsetOfferIds
`func (o *GetOfferRecommendationsRequest) UnsetOfferIds()`

UnsetOfferIds ensures that no value is present for OfferIds, not even an explicit nil
### GetCofinancePriceFilter

`func (o *GetOfferRecommendationsRequest) GetCofinancePriceFilter() FieldStateType`

GetCofinancePriceFilter returns the CofinancePriceFilter field if non-nil, zero value otherwise.

### GetCofinancePriceFilterOk

`func (o *GetOfferRecommendationsRequest) GetCofinancePriceFilterOk() (*FieldStateType, bool)`

GetCofinancePriceFilterOk returns a tuple with the CofinancePriceFilter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCofinancePriceFilter

`func (o *GetOfferRecommendationsRequest) SetCofinancePriceFilter(v FieldStateType)`

SetCofinancePriceFilter sets CofinancePriceFilter field to given value.

### HasCofinancePriceFilter

`func (o *GetOfferRecommendationsRequest) HasCofinancePriceFilter() bool`

HasCofinancePriceFilter returns a boolean if a field has been set.

### GetRecommendedCofinancePriceFilter

`func (o *GetOfferRecommendationsRequest) GetRecommendedCofinancePriceFilter() FieldStateType`

GetRecommendedCofinancePriceFilter returns the RecommendedCofinancePriceFilter field if non-nil, zero value otherwise.

### GetRecommendedCofinancePriceFilterOk

`func (o *GetOfferRecommendationsRequest) GetRecommendedCofinancePriceFilterOk() (*FieldStateType, bool)`

GetRecommendedCofinancePriceFilterOk returns a tuple with the RecommendedCofinancePriceFilter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecommendedCofinancePriceFilter

`func (o *GetOfferRecommendationsRequest) SetRecommendedCofinancePriceFilter(v FieldStateType)`

SetRecommendedCofinancePriceFilter sets RecommendedCofinancePriceFilter field to given value.

### HasRecommendedCofinancePriceFilter

`func (o *GetOfferRecommendationsRequest) HasRecommendedCofinancePriceFilter() bool`

HasRecommendedCofinancePriceFilter returns a boolean if a field has been set.

### GetCompetitivenessFilter

`func (o *GetOfferRecommendationsRequest) GetCompetitivenessFilter() PriceCompetitivenessType`

GetCompetitivenessFilter returns the CompetitivenessFilter field if non-nil, zero value otherwise.

### GetCompetitivenessFilterOk

`func (o *GetOfferRecommendationsRequest) GetCompetitivenessFilterOk() (*PriceCompetitivenessType, bool)`

GetCompetitivenessFilterOk returns a tuple with the CompetitivenessFilter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetitivenessFilter

`func (o *GetOfferRecommendationsRequest) SetCompetitivenessFilter(v PriceCompetitivenessType)`

SetCompetitivenessFilter sets CompetitivenessFilter field to given value.

### HasCompetitivenessFilter

`func (o *GetOfferRecommendationsRequest) HasCompetitivenessFilter() bool`

HasCompetitivenessFilter returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


