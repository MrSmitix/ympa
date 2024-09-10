# OrderItemInstanceModificationDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** | Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  | 
**Instances** | [**[]BriefOrderItemInstanceDTO**](BriefOrderItemInstanceDTO.md) | Список кодов маркировки единиц товара.  | 

## Methods

### NewOrderItemInstanceModificationDTO

`func NewOrderItemInstanceModificationDTO(id int64, instances []BriefOrderItemInstanceDTO, ) *OrderItemInstanceModificationDTO`

NewOrderItemInstanceModificationDTO instantiates a new OrderItemInstanceModificationDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderItemInstanceModificationDTOWithDefaults

`func NewOrderItemInstanceModificationDTOWithDefaults() *OrderItemInstanceModificationDTO`

NewOrderItemInstanceModificationDTOWithDefaults instantiates a new OrderItemInstanceModificationDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OrderItemInstanceModificationDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OrderItemInstanceModificationDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OrderItemInstanceModificationDTO) SetId(v int64)`

SetId sets Id field to given value.


### GetInstances

`func (o *OrderItemInstanceModificationDTO) GetInstances() []BriefOrderItemInstanceDTO`

GetInstances returns the Instances field if non-nil, zero value otherwise.

### GetInstancesOk

`func (o *OrderItemInstanceModificationDTO) GetInstancesOk() (*[]BriefOrderItemInstanceDTO, bool)`

GetInstancesOk returns a tuple with the Instances field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstances

`func (o *OrderItemInstanceModificationDTO) SetInstances(v []BriefOrderItemInstanceDTO)`

SetInstances sets Instances field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


