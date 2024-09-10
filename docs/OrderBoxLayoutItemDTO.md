# OrderBoxLayoutItemDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** | Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}    | 
**FullCount** | Pointer to **int32** | Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;.  | [optional] 
**PartialCount** | Pointer to [**OrderBoxLayoutPartialCountDTO**](OrderBoxLayoutPartialCountDTO.md) |  | [optional] 
**Instances** | Pointer to [**[]BriefOrderItemInstanceDTO**](BriefOrderItemInstanceDTO.md) | Переданные вами коды маркировки. | [optional] 

## Methods

### NewOrderBoxLayoutItemDTO

`func NewOrderBoxLayoutItemDTO(id int64, ) *OrderBoxLayoutItemDTO`

NewOrderBoxLayoutItemDTO instantiates a new OrderBoxLayoutItemDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderBoxLayoutItemDTOWithDefaults

`func NewOrderBoxLayoutItemDTOWithDefaults() *OrderBoxLayoutItemDTO`

NewOrderBoxLayoutItemDTOWithDefaults instantiates a new OrderBoxLayoutItemDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OrderBoxLayoutItemDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OrderBoxLayoutItemDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OrderBoxLayoutItemDTO) SetId(v int64)`

SetId sets Id field to given value.


### GetFullCount

`func (o *OrderBoxLayoutItemDTO) GetFullCount() int32`

GetFullCount returns the FullCount field if non-nil, zero value otherwise.

### GetFullCountOk

`func (o *OrderBoxLayoutItemDTO) GetFullCountOk() (*int32, bool)`

GetFullCountOk returns a tuple with the FullCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullCount

`func (o *OrderBoxLayoutItemDTO) SetFullCount(v int32)`

SetFullCount sets FullCount field to given value.

### HasFullCount

`func (o *OrderBoxLayoutItemDTO) HasFullCount() bool`

HasFullCount returns a boolean if a field has been set.

### GetPartialCount

`func (o *OrderBoxLayoutItemDTO) GetPartialCount() OrderBoxLayoutPartialCountDTO`

GetPartialCount returns the PartialCount field if non-nil, zero value otherwise.

### GetPartialCountOk

`func (o *OrderBoxLayoutItemDTO) GetPartialCountOk() (*OrderBoxLayoutPartialCountDTO, bool)`

GetPartialCountOk returns a tuple with the PartialCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartialCount

`func (o *OrderBoxLayoutItemDTO) SetPartialCount(v OrderBoxLayoutPartialCountDTO)`

SetPartialCount sets PartialCount field to given value.

### HasPartialCount

`func (o *OrderBoxLayoutItemDTO) HasPartialCount() bool`

HasPartialCount returns a boolean if a field has been set.

### GetInstances

`func (o *OrderBoxLayoutItemDTO) GetInstances() []BriefOrderItemInstanceDTO`

GetInstances returns the Instances field if non-nil, zero value otherwise.

### GetInstancesOk

`func (o *OrderBoxLayoutItemDTO) GetInstancesOk() (*[]BriefOrderItemInstanceDTO, bool)`

GetInstancesOk returns a tuple with the Instances field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstances

`func (o *OrderBoxLayoutItemDTO) SetInstances(v []BriefOrderItemInstanceDTO)`

SetInstances sets Instances field to given value.

### HasInstances

`func (o *OrderBoxLayoutItemDTO) HasInstances() bool`

HasInstances returns a boolean if a field has been set.

### SetInstancesNil

`func (o *OrderBoxLayoutItemDTO) SetInstancesNil(b bool)`

 SetInstancesNil sets the value for Instances to be an explicit nil

### UnsetInstances
`func (o *OrderBoxLayoutItemDTO) UnsetInstances()`

UnsetInstances ensures that no value is present for Instances, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


