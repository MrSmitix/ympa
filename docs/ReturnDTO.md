# ReturnDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор возврата. | [optional] 
**OrderId** | Pointer to **int64** | Номер заказа. | [optional] 
**CreationDate** | Pointer to **time.Time** | Дата создания возврата клиентом. | [optional] 
**UpdateDate** | Pointer to **time.Time** | Дата обновления возврата. | [optional] 
**RefundStatus** | Pointer to [**RefundStatusType**](RefundStatusType.md) |  | [optional] 
**LogisticPickupPoint** | Pointer to [**LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  | [optional] 
**ShipmentRecipientType** | Pointer to [**RecipientType**](RecipientType.md) |  | [optional] 
**ShipmentStatus** | Pointer to [**ReturnShipmentStatusType**](ReturnShipmentStatusType.md) |  | [optional] 
**RefundAmount** | Pointer to **int64** | Сумма возврата. | [optional] 
**Items** | [**[]ReturnItemDTO**](ReturnItemDTO.md) | Список товаров в возврате. | 
**ReturnType** | Pointer to [**ReturnType**](ReturnType.md) |  | [optional] 
**FastReturn** | Pointer to **bool** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional] 

## Methods

### NewReturnDTO

`func NewReturnDTO(items []ReturnItemDTO, ) *ReturnDTO`

NewReturnDTO instantiates a new ReturnDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReturnDTOWithDefaults

`func NewReturnDTOWithDefaults() *ReturnDTO`

NewReturnDTOWithDefaults instantiates a new ReturnDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ReturnDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ReturnDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ReturnDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *ReturnDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetOrderId

`func (o *ReturnDTO) GetOrderId() int64`

GetOrderId returns the OrderId field if non-nil, zero value otherwise.

### GetOrderIdOk

`func (o *ReturnDTO) GetOrderIdOk() (*int64, bool)`

GetOrderIdOk returns a tuple with the OrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderId

`func (o *ReturnDTO) SetOrderId(v int64)`

SetOrderId sets OrderId field to given value.

### HasOrderId

`func (o *ReturnDTO) HasOrderId() bool`

HasOrderId returns a boolean if a field has been set.

### GetCreationDate

`func (o *ReturnDTO) GetCreationDate() time.Time`

GetCreationDate returns the CreationDate field if non-nil, zero value otherwise.

### GetCreationDateOk

`func (o *ReturnDTO) GetCreationDateOk() (*time.Time, bool)`

GetCreationDateOk returns a tuple with the CreationDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreationDate

`func (o *ReturnDTO) SetCreationDate(v time.Time)`

SetCreationDate sets CreationDate field to given value.

### HasCreationDate

`func (o *ReturnDTO) HasCreationDate() bool`

HasCreationDate returns a boolean if a field has been set.

### GetUpdateDate

`func (o *ReturnDTO) GetUpdateDate() time.Time`

GetUpdateDate returns the UpdateDate field if non-nil, zero value otherwise.

### GetUpdateDateOk

`func (o *ReturnDTO) GetUpdateDateOk() (*time.Time, bool)`

GetUpdateDateOk returns a tuple with the UpdateDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdateDate

`func (o *ReturnDTO) SetUpdateDate(v time.Time)`

SetUpdateDate sets UpdateDate field to given value.

### HasUpdateDate

`func (o *ReturnDTO) HasUpdateDate() bool`

HasUpdateDate returns a boolean if a field has been set.

### GetRefundStatus

`func (o *ReturnDTO) GetRefundStatus() RefundStatusType`

GetRefundStatus returns the RefundStatus field if non-nil, zero value otherwise.

### GetRefundStatusOk

`func (o *ReturnDTO) GetRefundStatusOk() (*RefundStatusType, bool)`

GetRefundStatusOk returns a tuple with the RefundStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefundStatus

`func (o *ReturnDTO) SetRefundStatus(v RefundStatusType)`

SetRefundStatus sets RefundStatus field to given value.

### HasRefundStatus

`func (o *ReturnDTO) HasRefundStatus() bool`

HasRefundStatus returns a boolean if a field has been set.

### GetLogisticPickupPoint

`func (o *ReturnDTO) GetLogisticPickupPoint() LogisticPickupPointDTO`

GetLogisticPickupPoint returns the LogisticPickupPoint field if non-nil, zero value otherwise.

### GetLogisticPickupPointOk

`func (o *ReturnDTO) GetLogisticPickupPointOk() (*LogisticPickupPointDTO, bool)`

GetLogisticPickupPointOk returns a tuple with the LogisticPickupPoint field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogisticPickupPoint

`func (o *ReturnDTO) SetLogisticPickupPoint(v LogisticPickupPointDTO)`

SetLogisticPickupPoint sets LogisticPickupPoint field to given value.

### HasLogisticPickupPoint

`func (o *ReturnDTO) HasLogisticPickupPoint() bool`

HasLogisticPickupPoint returns a boolean if a field has been set.

### GetShipmentRecipientType

`func (o *ReturnDTO) GetShipmentRecipientType() RecipientType`

GetShipmentRecipientType returns the ShipmentRecipientType field if non-nil, zero value otherwise.

### GetShipmentRecipientTypeOk

`func (o *ReturnDTO) GetShipmentRecipientTypeOk() (*RecipientType, bool)`

GetShipmentRecipientTypeOk returns a tuple with the ShipmentRecipientType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShipmentRecipientType

`func (o *ReturnDTO) SetShipmentRecipientType(v RecipientType)`

SetShipmentRecipientType sets ShipmentRecipientType field to given value.

### HasShipmentRecipientType

`func (o *ReturnDTO) HasShipmentRecipientType() bool`

HasShipmentRecipientType returns a boolean if a field has been set.

### GetShipmentStatus

`func (o *ReturnDTO) GetShipmentStatus() ReturnShipmentStatusType`

GetShipmentStatus returns the ShipmentStatus field if non-nil, zero value otherwise.

### GetShipmentStatusOk

`func (o *ReturnDTO) GetShipmentStatusOk() (*ReturnShipmentStatusType, bool)`

GetShipmentStatusOk returns a tuple with the ShipmentStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShipmentStatus

`func (o *ReturnDTO) SetShipmentStatus(v ReturnShipmentStatusType)`

SetShipmentStatus sets ShipmentStatus field to given value.

### HasShipmentStatus

`func (o *ReturnDTO) HasShipmentStatus() bool`

HasShipmentStatus returns a boolean if a field has been set.

### GetRefundAmount

`func (o *ReturnDTO) GetRefundAmount() int64`

GetRefundAmount returns the RefundAmount field if non-nil, zero value otherwise.

### GetRefundAmountOk

`func (o *ReturnDTO) GetRefundAmountOk() (*int64, bool)`

GetRefundAmountOk returns a tuple with the RefundAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefundAmount

`func (o *ReturnDTO) SetRefundAmount(v int64)`

SetRefundAmount sets RefundAmount field to given value.

### HasRefundAmount

`func (o *ReturnDTO) HasRefundAmount() bool`

HasRefundAmount returns a boolean if a field has been set.

### GetItems

`func (o *ReturnDTO) GetItems() []ReturnItemDTO`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *ReturnDTO) GetItemsOk() (*[]ReturnItemDTO, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *ReturnDTO) SetItems(v []ReturnItemDTO)`

SetItems sets Items field to given value.


### GetReturnType

`func (o *ReturnDTO) GetReturnType() ReturnType`

GetReturnType returns the ReturnType field if non-nil, zero value otherwise.

### GetReturnTypeOk

`func (o *ReturnDTO) GetReturnTypeOk() (*ReturnType, bool)`

GetReturnTypeOk returns a tuple with the ReturnType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReturnType

`func (o *ReturnDTO) SetReturnType(v ReturnType)`

SetReturnType sets ReturnType field to given value.

### HasReturnType

`func (o *ReturnDTO) HasReturnType() bool`

HasReturnType returns a boolean if a field has been set.

### GetFastReturn

`func (o *ReturnDTO) GetFastReturn() bool`

GetFastReturn returns the FastReturn field if non-nil, zero value otherwise.

### GetFastReturnOk

`func (o *ReturnDTO) GetFastReturnOk() (*bool, bool)`

GetFastReturnOk returns a tuple with the FastReturn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFastReturn

`func (o *ReturnDTO) SetFastReturn(v bool)`

SetFastReturn sets FastReturn field to given value.

### HasFastReturn

`func (o *ReturnDTO) HasFastReturn() bool`

HasFastReturn returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


