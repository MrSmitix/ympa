# OrdersStatsDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Orders** | [**[]OrdersStatsOrderDTO**](OrdersStatsOrderDTO.md) | Список заказов. | 
**Paging** | Pointer to [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Methods

### NewOrdersStatsDTO

`func NewOrdersStatsDTO(orders []OrdersStatsOrderDTO, ) *OrdersStatsDTO`

NewOrdersStatsDTO instantiates a new OrdersStatsDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrdersStatsDTOWithDefaults

`func NewOrdersStatsDTOWithDefaults() *OrdersStatsDTO`

NewOrdersStatsDTOWithDefaults instantiates a new OrdersStatsDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOrders

`func (o *OrdersStatsDTO) GetOrders() []OrdersStatsOrderDTO`

GetOrders returns the Orders field if non-nil, zero value otherwise.

### GetOrdersOk

`func (o *OrdersStatsDTO) GetOrdersOk() (*[]OrdersStatsOrderDTO, bool)`

GetOrdersOk returns a tuple with the Orders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrders

`func (o *OrdersStatsDTO) SetOrders(v []OrdersStatsOrderDTO)`

SetOrders sets Orders field to given value.


### GetPaging

`func (o *OrdersStatsDTO) GetPaging() ForwardScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *OrdersStatsDTO) GetPagingOk() (*ForwardScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *OrdersStatsDTO) SetPaging(v ForwardScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *OrdersStatsDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


