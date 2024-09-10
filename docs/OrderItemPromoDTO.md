# OrderItemPromoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**OrderPromoType**](OrderPromoType.md) |  | 
**Discount** | Pointer to **float32** | Размер пользовательской скидки в валюте покупателя.  | [optional] 
**Subsidy** | Pointer to **float32** | Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  | [optional] 
**ShopPromoId** | Pointer to **string** | Идентификатор акции поставщика.  | [optional] 
**MarketPromoId** | Pointer to **string** | Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;.  | [optional] 

## Methods

### NewOrderItemPromoDTO

`func NewOrderItemPromoDTO(type_ OrderPromoType, ) *OrderItemPromoDTO`

NewOrderItemPromoDTO instantiates a new OrderItemPromoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderItemPromoDTOWithDefaults

`func NewOrderItemPromoDTOWithDefaults() *OrderItemPromoDTO`

NewOrderItemPromoDTOWithDefaults instantiates a new OrderItemPromoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *OrderItemPromoDTO) GetType() OrderPromoType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OrderItemPromoDTO) GetTypeOk() (*OrderPromoType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OrderItemPromoDTO) SetType(v OrderPromoType)`

SetType sets Type field to given value.


### GetDiscount

`func (o *OrderItemPromoDTO) GetDiscount() float32`

GetDiscount returns the Discount field if non-nil, zero value otherwise.

### GetDiscountOk

`func (o *OrderItemPromoDTO) GetDiscountOk() (*float32, bool)`

GetDiscountOk returns a tuple with the Discount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscount

`func (o *OrderItemPromoDTO) SetDiscount(v float32)`

SetDiscount sets Discount field to given value.

### HasDiscount

`func (o *OrderItemPromoDTO) HasDiscount() bool`

HasDiscount returns a boolean if a field has been set.

### GetSubsidy

`func (o *OrderItemPromoDTO) GetSubsidy() float32`

GetSubsidy returns the Subsidy field if non-nil, zero value otherwise.

### GetSubsidyOk

`func (o *OrderItemPromoDTO) GetSubsidyOk() (*float32, bool)`

GetSubsidyOk returns a tuple with the Subsidy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubsidy

`func (o *OrderItemPromoDTO) SetSubsidy(v float32)`

SetSubsidy sets Subsidy field to given value.

### HasSubsidy

`func (o *OrderItemPromoDTO) HasSubsidy() bool`

HasSubsidy returns a boolean if a field has been set.

### GetShopPromoId

`func (o *OrderItemPromoDTO) GetShopPromoId() string`

GetShopPromoId returns the ShopPromoId field if non-nil, zero value otherwise.

### GetShopPromoIdOk

`func (o *OrderItemPromoDTO) GetShopPromoIdOk() (*string, bool)`

GetShopPromoIdOk returns a tuple with the ShopPromoId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopPromoId

`func (o *OrderItemPromoDTO) SetShopPromoId(v string)`

SetShopPromoId sets ShopPromoId field to given value.

### HasShopPromoId

`func (o *OrderItemPromoDTO) HasShopPromoId() bool`

HasShopPromoId returns a boolean if a field has been set.

### GetMarketPromoId

`func (o *OrderItemPromoDTO) GetMarketPromoId() string`

GetMarketPromoId returns the MarketPromoId field if non-nil, zero value otherwise.

### GetMarketPromoIdOk

`func (o *OrderItemPromoDTO) GetMarketPromoIdOk() (*string, bool)`

GetMarketPromoIdOk returns a tuple with the MarketPromoId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarketPromoId

`func (o *OrderItemPromoDTO) SetMarketPromoId(v string)`

SetMarketPromoId sets MarketPromoId field to given value.

### HasMarketPromoId

`func (o *OrderItemPromoDTO) HasMarketPromoId() bool`

HasMarketPromoId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


