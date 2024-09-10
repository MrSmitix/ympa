# GetMappingDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MarketSku** | Pointer to **int64** | SKU на Маркете. | [optional] 
**MarketSkuName** | Pointer to **string** | Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  | [optional] 
**MarketModelId** | Pointer to **int64** | Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  | [optional] 
**MarketModelName** | Pointer to **string** | Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  | [optional] 
**MarketCategoryId** | Pointer to **int64** | Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  | [optional] 
**MarketCategoryName** | Pointer to **string** | Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  | [optional] 

## Methods

### NewGetMappingDTO

`func NewGetMappingDTO() *GetMappingDTO`

NewGetMappingDTO instantiates a new GetMappingDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetMappingDTOWithDefaults

`func NewGetMappingDTOWithDefaults() *GetMappingDTO`

NewGetMappingDTOWithDefaults instantiates a new GetMappingDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMarketSku

`func (o *GetMappingDTO) GetMarketSku() int64`

GetMarketSku returns the MarketSku field if non-nil, zero value otherwise.

### GetMarketSkuOk

`func (o *GetMappingDTO) GetMarketSkuOk() (*int64, bool)`

GetMarketSkuOk returns a tuple with the MarketSku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarketSku

`func (o *GetMappingDTO) SetMarketSku(v int64)`

SetMarketSku sets MarketSku field to given value.

### HasMarketSku

`func (o *GetMappingDTO) HasMarketSku() bool`

HasMarketSku returns a boolean if a field has been set.

### GetMarketSkuName

`func (o *GetMappingDTO) GetMarketSkuName() string`

GetMarketSkuName returns the MarketSkuName field if non-nil, zero value otherwise.

### GetMarketSkuNameOk

`func (o *GetMappingDTO) GetMarketSkuNameOk() (*string, bool)`

GetMarketSkuNameOk returns a tuple with the MarketSkuName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarketSkuName

`func (o *GetMappingDTO) SetMarketSkuName(v string)`

SetMarketSkuName sets MarketSkuName field to given value.

### HasMarketSkuName

`func (o *GetMappingDTO) HasMarketSkuName() bool`

HasMarketSkuName returns a boolean if a field has been set.

### GetMarketModelId

`func (o *GetMappingDTO) GetMarketModelId() int64`

GetMarketModelId returns the MarketModelId field if non-nil, zero value otherwise.

### GetMarketModelIdOk

`func (o *GetMappingDTO) GetMarketModelIdOk() (*int64, bool)`

GetMarketModelIdOk returns a tuple with the MarketModelId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarketModelId

`func (o *GetMappingDTO) SetMarketModelId(v int64)`

SetMarketModelId sets MarketModelId field to given value.

### HasMarketModelId

`func (o *GetMappingDTO) HasMarketModelId() bool`

HasMarketModelId returns a boolean if a field has been set.

### GetMarketModelName

`func (o *GetMappingDTO) GetMarketModelName() string`

GetMarketModelName returns the MarketModelName field if non-nil, zero value otherwise.

### GetMarketModelNameOk

`func (o *GetMappingDTO) GetMarketModelNameOk() (*string, bool)`

GetMarketModelNameOk returns a tuple with the MarketModelName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarketModelName

`func (o *GetMappingDTO) SetMarketModelName(v string)`

SetMarketModelName sets MarketModelName field to given value.

### HasMarketModelName

`func (o *GetMappingDTO) HasMarketModelName() bool`

HasMarketModelName returns a boolean if a field has been set.

### GetMarketCategoryId

`func (o *GetMappingDTO) GetMarketCategoryId() int64`

GetMarketCategoryId returns the MarketCategoryId field if non-nil, zero value otherwise.

### GetMarketCategoryIdOk

`func (o *GetMappingDTO) GetMarketCategoryIdOk() (*int64, bool)`

GetMarketCategoryIdOk returns a tuple with the MarketCategoryId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarketCategoryId

`func (o *GetMappingDTO) SetMarketCategoryId(v int64)`

SetMarketCategoryId sets MarketCategoryId field to given value.

### HasMarketCategoryId

`func (o *GetMappingDTO) HasMarketCategoryId() bool`

HasMarketCategoryId returns a boolean if a field has been set.

### GetMarketCategoryName

`func (o *GetMappingDTO) GetMarketCategoryName() string`

GetMarketCategoryName returns the MarketCategoryName field if non-nil, zero value otherwise.

### GetMarketCategoryNameOk

`func (o *GetMappingDTO) GetMarketCategoryNameOk() (*string, bool)`

GetMarketCategoryNameOk returns a tuple with the MarketCategoryName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarketCategoryName

`func (o *GetMappingDTO) SetMarketCategoryName(v string)`

SetMarketCategoryName sets MarketCategoryName field to given value.

### HasMarketCategoryName

`func (o *GetMappingDTO) HasMarketCategoryName() bool`

HasMarketCategoryName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


