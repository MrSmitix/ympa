# OfferMappingDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MarketSku** | Pointer to **int64** | SKU на Маркете. | [optional] 
**ModelId** | Pointer to **int64** | Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр &#x60;marketSku&#x60;), но одинаковый идентификатор модели товара.  | [optional] 
**CategoryId** | Pointer to **int64** | Идентификатор категории для текущей карточки товара на Маркете. | [optional] 

## Methods

### NewOfferMappingDTO

`func NewOfferMappingDTO() *OfferMappingDTO`

NewOfferMappingDTO instantiates a new OfferMappingDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferMappingDTOWithDefaults

`func NewOfferMappingDTOWithDefaults() *OfferMappingDTO`

NewOfferMappingDTOWithDefaults instantiates a new OfferMappingDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMarketSku

`func (o *OfferMappingDTO) GetMarketSku() int64`

GetMarketSku returns the MarketSku field if non-nil, zero value otherwise.

### GetMarketSkuOk

`func (o *OfferMappingDTO) GetMarketSkuOk() (*int64, bool)`

GetMarketSkuOk returns a tuple with the MarketSku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarketSku

`func (o *OfferMappingDTO) SetMarketSku(v int64)`

SetMarketSku sets MarketSku field to given value.

### HasMarketSku

`func (o *OfferMappingDTO) HasMarketSku() bool`

HasMarketSku returns a boolean if a field has been set.

### GetModelId

`func (o *OfferMappingDTO) GetModelId() int64`

GetModelId returns the ModelId field if non-nil, zero value otherwise.

### GetModelIdOk

`func (o *OfferMappingDTO) GetModelIdOk() (*int64, bool)`

GetModelIdOk returns a tuple with the ModelId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModelId

`func (o *OfferMappingDTO) SetModelId(v int64)`

SetModelId sets ModelId field to given value.

### HasModelId

`func (o *OfferMappingDTO) HasModelId() bool`

HasModelId returns a boolean if a field has been set.

### GetCategoryId

`func (o *OfferMappingDTO) GetCategoryId() int64`

GetCategoryId returns the CategoryId field if non-nil, zero value otherwise.

### GetCategoryIdOk

`func (o *OfferMappingDTO) GetCategoryIdOk() (*int64, bool)`

GetCategoryIdOk returns a tuple with the CategoryId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryId

`func (o *OfferMappingDTO) SetCategoryId(v int64)`

SetCategoryId sets CategoryId field to given value.

### HasCategoryId

`func (o *OfferMappingDTO) HasCategoryId() bool`

HasCategoryId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


