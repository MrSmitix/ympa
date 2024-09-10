# SearchModelsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Models** | [**[]ModelDTO**](ModelDTO.md) | Список моделей товаров. | 
**Currency** | Pointer to [**CurrencyType**](CurrencyType.md) |  | [optional] 
**RegionId** | Pointer to **int64** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] 
**Pager** | Pointer to [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 

## Methods

### NewSearchModelsResponse

`func NewSearchModelsResponse(models []ModelDTO, ) *SearchModelsResponse`

NewSearchModelsResponse instantiates a new SearchModelsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSearchModelsResponseWithDefaults

`func NewSearchModelsResponseWithDefaults() *SearchModelsResponse`

NewSearchModelsResponseWithDefaults instantiates a new SearchModelsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetModels

`func (o *SearchModelsResponse) GetModels() []ModelDTO`

GetModels returns the Models field if non-nil, zero value otherwise.

### GetModelsOk

`func (o *SearchModelsResponse) GetModelsOk() (*[]ModelDTO, bool)`

GetModelsOk returns a tuple with the Models field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModels

`func (o *SearchModelsResponse) SetModels(v []ModelDTO)`

SetModels sets Models field to given value.


### GetCurrency

`func (o *SearchModelsResponse) GetCurrency() CurrencyType`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *SearchModelsResponse) GetCurrencyOk() (*CurrencyType, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *SearchModelsResponse) SetCurrency(v CurrencyType)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *SearchModelsResponse) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetRegionId

`func (o *SearchModelsResponse) GetRegionId() int64`

GetRegionId returns the RegionId field if non-nil, zero value otherwise.

### GetRegionIdOk

`func (o *SearchModelsResponse) GetRegionIdOk() (*int64, bool)`

GetRegionIdOk returns a tuple with the RegionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegionId

`func (o *SearchModelsResponse) SetRegionId(v int64)`

SetRegionId sets RegionId field to given value.

### HasRegionId

`func (o *SearchModelsResponse) HasRegionId() bool`

HasRegionId returns a boolean if a field has been set.

### GetPager

`func (o *SearchModelsResponse) GetPager() FlippingPagerDTO`

GetPager returns the Pager field if non-nil, zero value otherwise.

### GetPagerOk

`func (o *SearchModelsResponse) GetPagerOk() (*FlippingPagerDTO, bool)`

GetPagerOk returns a tuple with the Pager field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPager

`func (o *SearchModelsResponse) SetPager(v FlippingPagerDTO)`

SetPager sets Pager field to given value.

### HasPager

`func (o *SearchModelsResponse) HasPager() bool`

HasPager returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


