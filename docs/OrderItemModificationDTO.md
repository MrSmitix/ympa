# OrderItemModificationDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** | Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр.  | 
**Count** | **int32** | Новое количество товара. | 
**Instances** | Pointer to [**[]BriefOrderItemInstanceDTO**](BriefOrderItemInstanceDTO.md) | Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  | [optional] 

## Methods

### NewOrderItemModificationDTO

`func NewOrderItemModificationDTO(id int64, count int32, ) *OrderItemModificationDTO`

NewOrderItemModificationDTO instantiates a new OrderItemModificationDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderItemModificationDTOWithDefaults

`func NewOrderItemModificationDTOWithDefaults() *OrderItemModificationDTO`

NewOrderItemModificationDTOWithDefaults instantiates a new OrderItemModificationDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OrderItemModificationDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OrderItemModificationDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OrderItemModificationDTO) SetId(v int64)`

SetId sets Id field to given value.


### GetCount

`func (o *OrderItemModificationDTO) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *OrderItemModificationDTO) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *OrderItemModificationDTO) SetCount(v int32)`

SetCount sets Count field to given value.


### GetInstances

`func (o *OrderItemModificationDTO) GetInstances() []BriefOrderItemInstanceDTO`

GetInstances returns the Instances field if non-nil, zero value otherwise.

### GetInstancesOk

`func (o *OrderItemModificationDTO) GetInstancesOk() (*[]BriefOrderItemInstanceDTO, bool)`

GetInstancesOk returns a tuple with the Instances field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstances

`func (o *OrderItemModificationDTO) SetInstances(v []BriefOrderItemInstanceDTO)`

SetInstances sets Instances field to given value.

### HasInstances

`func (o *OrderItemModificationDTO) HasInstances() bool`

HasInstances returns a boolean if a field has been set.

### SetInstancesNil

`func (o *OrderItemModificationDTO) SetInstancesNil(b bool)`

 SetInstancesNil sets the value for Instances to be an explicit nil

### UnsetInstances
`func (o *OrderItemModificationDTO) UnsetInstances()`

UnsetInstances ensures that no value is present for Instances, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


