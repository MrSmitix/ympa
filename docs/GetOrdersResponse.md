# GetOrdersResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pager** | Pointer to [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 
**Orders** | [**[]OrderDTO**](OrderDTO.md) | Модель заказа.  | 
**Paging** | Pointer to [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Methods

### NewGetOrdersResponse

`func NewGetOrdersResponse(orders []OrderDTO, ) *GetOrdersResponse`

NewGetOrdersResponse instantiates a new GetOrdersResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetOrdersResponseWithDefaults

`func NewGetOrdersResponseWithDefaults() *GetOrdersResponse`

NewGetOrdersResponseWithDefaults instantiates a new GetOrdersResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPager

`func (o *GetOrdersResponse) GetPager() FlippingPagerDTO`

GetPager returns the Pager field if non-nil, zero value otherwise.

### GetPagerOk

`func (o *GetOrdersResponse) GetPagerOk() (*FlippingPagerDTO, bool)`

GetPagerOk returns a tuple with the Pager field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPager

`func (o *GetOrdersResponse) SetPager(v FlippingPagerDTO)`

SetPager sets Pager field to given value.

### HasPager

`func (o *GetOrdersResponse) HasPager() bool`

HasPager returns a boolean if a field has been set.

### GetOrders

`func (o *GetOrdersResponse) GetOrders() []OrderDTO`

GetOrders returns the Orders field if non-nil, zero value otherwise.

### GetOrdersOk

`func (o *GetOrdersResponse) GetOrdersOk() (*[]OrderDTO, bool)`

GetOrdersOk returns a tuple with the Orders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrders

`func (o *GetOrdersResponse) SetOrders(v []OrderDTO)`

SetOrders sets Orders field to given value.


### GetPaging

`func (o *GetOrdersResponse) GetPaging() ForwardScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *GetOrdersResponse) GetPagingOk() (*ForwardScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *GetOrdersResponse) SetPaging(v ForwardScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *GetOrdersResponse) HasPaging() bool`

HasPaging returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


