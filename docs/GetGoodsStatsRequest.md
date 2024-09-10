# GetGoodsStatsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ShopSkus** | **[]string** | Список ваших идентификаторов SKU.  | 

## Methods

### NewGetGoodsStatsRequest

`func NewGetGoodsStatsRequest(shopSkus []string, ) *GetGoodsStatsRequest`

NewGetGoodsStatsRequest instantiates a new GetGoodsStatsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetGoodsStatsRequestWithDefaults

`func NewGetGoodsStatsRequestWithDefaults() *GetGoodsStatsRequest`

NewGetGoodsStatsRequestWithDefaults instantiates a new GetGoodsStatsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetShopSkus

`func (o *GetGoodsStatsRequest) GetShopSkus() []string`

GetShopSkus returns the ShopSkus field if non-nil, zero value otherwise.

### GetShopSkusOk

`func (o *GetGoodsStatsRequest) GetShopSkusOk() (*[]string, bool)`

GetShopSkusOk returns a tuple with the ShopSkus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopSkus

`func (o *GetGoodsStatsRequest) SetShopSkus(v []string)`

SetShopSkus sets ShopSkus field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


