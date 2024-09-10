# GetModelsOffersResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Models** | [**[]EnrichedModelDTO**](EnrichedModelDTO.md) | Список моделей товаров. | 
**Currency** | Pointer to [**CurrencyType**](CurrencyType.md) |  | [optional] 
**RegionId** | Pointer to **int64** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] 

## Methods

### NewGetModelsOffersResponse

`func NewGetModelsOffersResponse(models []EnrichedModelDTO, ) *GetModelsOffersResponse`

NewGetModelsOffersResponse instantiates a new GetModelsOffersResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetModelsOffersResponseWithDefaults

`func NewGetModelsOffersResponseWithDefaults() *GetModelsOffersResponse`

NewGetModelsOffersResponseWithDefaults instantiates a new GetModelsOffersResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetModels

`func (o *GetModelsOffersResponse) GetModels() []EnrichedModelDTO`

GetModels returns the Models field if non-nil, zero value otherwise.

### GetModelsOk

`func (o *GetModelsOffersResponse) GetModelsOk() (*[]EnrichedModelDTO, bool)`

GetModelsOk returns a tuple with the Models field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModels

`func (o *GetModelsOffersResponse) SetModels(v []EnrichedModelDTO)`

SetModels sets Models field to given value.


### GetCurrency

`func (o *GetModelsOffersResponse) GetCurrency() CurrencyType`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *GetModelsOffersResponse) GetCurrencyOk() (*CurrencyType, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *GetModelsOffersResponse) SetCurrency(v CurrencyType)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *GetModelsOffersResponse) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetRegionId

`func (o *GetModelsOffersResponse) GetRegionId() int64`

GetRegionId returns the RegionId field if non-nil, zero value otherwise.

### GetRegionIdOk

`func (o *GetModelsOffersResponse) GetRegionIdOk() (*int64, bool)`

GetRegionIdOk returns a tuple with the RegionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegionId

`func (o *GetModelsOffersResponse) SetRegionId(v int64)`

SetRegionId sets RegionId field to given value.

### HasRegionId

`func (o *GetModelsOffersResponse) HasRegionId() bool`

HasRegionId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


