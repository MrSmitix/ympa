# OrdersStatsPriceDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to [**OrdersStatsPriceType**](OrdersStatsPriceType.md) |  | [optional] 
**CostPerItem** | Pointer to **float32** | Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой.  | [optional] 
**Total** | Pointer to **float32** | Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой.  | [optional] 

## Methods

### NewOrdersStatsPriceDTO

`func NewOrdersStatsPriceDTO() *OrdersStatsPriceDTO`

NewOrdersStatsPriceDTO instantiates a new OrdersStatsPriceDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrdersStatsPriceDTOWithDefaults

`func NewOrdersStatsPriceDTOWithDefaults() *OrdersStatsPriceDTO`

NewOrdersStatsPriceDTOWithDefaults instantiates a new OrdersStatsPriceDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *OrdersStatsPriceDTO) GetType() OrdersStatsPriceType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OrdersStatsPriceDTO) GetTypeOk() (*OrdersStatsPriceType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OrdersStatsPriceDTO) SetType(v OrdersStatsPriceType)`

SetType sets Type field to given value.

### HasType

`func (o *OrdersStatsPriceDTO) HasType() bool`

HasType returns a boolean if a field has been set.

### GetCostPerItem

`func (o *OrdersStatsPriceDTO) GetCostPerItem() float32`

GetCostPerItem returns the CostPerItem field if non-nil, zero value otherwise.

### GetCostPerItemOk

`func (o *OrdersStatsPriceDTO) GetCostPerItemOk() (*float32, bool)`

GetCostPerItemOk returns a tuple with the CostPerItem field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCostPerItem

`func (o *OrdersStatsPriceDTO) SetCostPerItem(v float32)`

SetCostPerItem sets CostPerItem field to given value.

### HasCostPerItem

`func (o *OrdersStatsPriceDTO) HasCostPerItem() bool`

HasCostPerItem returns a boolean if a field has been set.

### GetTotal

`func (o *OrdersStatsPriceDTO) GetTotal() float32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *OrdersStatsPriceDTO) GetTotalOk() (*float32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *OrdersStatsPriceDTO) SetTotal(v float32)`

SetTotal sets Total field to given value.

### HasTotal

`func (o *OrdersStatsPriceDTO) HasTotal() bool`

HasTotal returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


