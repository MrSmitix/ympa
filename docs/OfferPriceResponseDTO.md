# OfferPriceResponseDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | Идентификатор предложения из прайс-листа. | [optional] 
**Price** | Pointer to [**PriceDTO**](PriceDTO.md) |  | [optional] 
**MarketSku** | Pointer to **int64** | SKU на Маркете. | [optional] 
**UpdatedAt** | Pointer to **time.Time** | Дата и время последнего обновления цены на товар. | [optional] 

## Methods

### NewOfferPriceResponseDTO

`func NewOfferPriceResponseDTO() *OfferPriceResponseDTO`

NewOfferPriceResponseDTO instantiates a new OfferPriceResponseDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferPriceResponseDTOWithDefaults

`func NewOfferPriceResponseDTOWithDefaults() *OfferPriceResponseDTO`

NewOfferPriceResponseDTOWithDefaults instantiates a new OfferPriceResponseDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OfferPriceResponseDTO) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OfferPriceResponseDTO) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OfferPriceResponseDTO) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *OfferPriceResponseDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetPrice

`func (o *OfferPriceResponseDTO) GetPrice() PriceDTO`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *OfferPriceResponseDTO) GetPriceOk() (*PriceDTO, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *OfferPriceResponseDTO) SetPrice(v PriceDTO)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *OfferPriceResponseDTO) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetMarketSku

`func (o *OfferPriceResponseDTO) GetMarketSku() int64`

GetMarketSku returns the MarketSku field if non-nil, zero value otherwise.

### GetMarketSkuOk

`func (o *OfferPriceResponseDTO) GetMarketSkuOk() (*int64, bool)`

GetMarketSkuOk returns a tuple with the MarketSku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarketSku

`func (o *OfferPriceResponseDTO) SetMarketSku(v int64)`

SetMarketSku sets MarketSku field to given value.

### HasMarketSku

`func (o *OfferPriceResponseDTO) HasMarketSku() bool`

HasMarketSku returns a boolean if a field has been set.

### GetUpdatedAt

`func (o *OfferPriceResponseDTO) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *OfferPriceResponseDTO) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *OfferPriceResponseDTO) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.

### HasUpdatedAt

`func (o *OfferPriceResponseDTO) HasUpdatedAt() bool`

HasUpdatedAt returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


