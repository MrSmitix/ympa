# GetBidsInfoRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Skus** | Pointer to **[]string** | Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры &#x60;page_token&#x60; и &#x60;limit&#x60; игнорируются.  | [optional] 

## Methods

### NewGetBidsInfoRequest

`func NewGetBidsInfoRequest() *GetBidsInfoRequest`

NewGetBidsInfoRequest instantiates a new GetBidsInfoRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBidsInfoRequestWithDefaults

`func NewGetBidsInfoRequestWithDefaults() *GetBidsInfoRequest`

NewGetBidsInfoRequestWithDefaults instantiates a new GetBidsInfoRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSkus

`func (o *GetBidsInfoRequest) GetSkus() []string`

GetSkus returns the Skus field if non-nil, zero value otherwise.

### GetSkusOk

`func (o *GetBidsInfoRequest) GetSkusOk() (*[]string, bool)`

GetSkusOk returns a tuple with the Skus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSkus

`func (o *GetBidsInfoRequest) SetSkus(v []string)`

SetSkus sets Skus field to given value.

### HasSkus

`func (o *GetBidsInfoRequest) HasSkus() bool`

HasSkus returns a boolean if a field has been set.

### SetSkusNil

`func (o *GetBidsInfoRequest) SetSkusNil(b bool)`

 SetSkusNil sets the value for Skus to be an explicit nil

### UnsetSkus
`func (o *GetBidsInfoRequest) UnsetSkus()`

UnsetSkus ensures that no value is present for Skus, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


