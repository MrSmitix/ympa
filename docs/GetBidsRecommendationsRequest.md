# GetBidsRecommendationsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Skus** | **[]string** | Список товаров, для которых нужно получить рекомендации по ставкам.  | 

## Methods

### NewGetBidsRecommendationsRequest

`func NewGetBidsRecommendationsRequest(skus []string, ) *GetBidsRecommendationsRequest`

NewGetBidsRecommendationsRequest instantiates a new GetBidsRecommendationsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBidsRecommendationsRequestWithDefaults

`func NewGetBidsRecommendationsRequestWithDefaults() *GetBidsRecommendationsRequest`

NewGetBidsRecommendationsRequestWithDefaults instantiates a new GetBidsRecommendationsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSkus

`func (o *GetBidsRecommendationsRequest) GetSkus() []string`

GetSkus returns the Skus field if non-nil, zero value otherwise.

### GetSkusOk

`func (o *GetBidsRecommendationsRequest) GetSkusOk() (*[]string, bool)`

GetSkusOk returns a tuple with the Skus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSkus

`func (o *GetBidsRecommendationsRequest) SetSkus(v []string)`

SetSkus sets Skus field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


