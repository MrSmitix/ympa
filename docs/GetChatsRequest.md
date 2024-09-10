# GetChatsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrderIds** | Pointer to **[]int64** | Фильтр по идентификаторам заказов на Маркете. | [optional] 
**Types** | Pointer to [**[]ChatType**](ChatType.md) | Фильтр по типам чатов. | [optional] 
**Statuses** | Pointer to [**[]ChatStatusType**](ChatStatusType.md) | Фильтр по статусам чатов. | [optional] 

## Methods

### NewGetChatsRequest

`func NewGetChatsRequest() *GetChatsRequest`

NewGetChatsRequest instantiates a new GetChatsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetChatsRequestWithDefaults

`func NewGetChatsRequestWithDefaults() *GetChatsRequest`

NewGetChatsRequestWithDefaults instantiates a new GetChatsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOrderIds

`func (o *GetChatsRequest) GetOrderIds() []int64`

GetOrderIds returns the OrderIds field if non-nil, zero value otherwise.

### GetOrderIdsOk

`func (o *GetChatsRequest) GetOrderIdsOk() (*[]int64, bool)`

GetOrderIdsOk returns a tuple with the OrderIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderIds

`func (o *GetChatsRequest) SetOrderIds(v []int64)`

SetOrderIds sets OrderIds field to given value.

### HasOrderIds

`func (o *GetChatsRequest) HasOrderIds() bool`

HasOrderIds returns a boolean if a field has been set.

### SetOrderIdsNil

`func (o *GetChatsRequest) SetOrderIdsNil(b bool)`

 SetOrderIdsNil sets the value for OrderIds to be an explicit nil

### UnsetOrderIds
`func (o *GetChatsRequest) UnsetOrderIds()`

UnsetOrderIds ensures that no value is present for OrderIds, not even an explicit nil
### GetTypes

`func (o *GetChatsRequest) GetTypes() []ChatType`

GetTypes returns the Types field if non-nil, zero value otherwise.

### GetTypesOk

`func (o *GetChatsRequest) GetTypesOk() (*[]ChatType, bool)`

GetTypesOk returns a tuple with the Types field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypes

`func (o *GetChatsRequest) SetTypes(v []ChatType)`

SetTypes sets Types field to given value.

### HasTypes

`func (o *GetChatsRequest) HasTypes() bool`

HasTypes returns a boolean if a field has been set.

### SetTypesNil

`func (o *GetChatsRequest) SetTypesNil(b bool)`

 SetTypesNil sets the value for Types to be an explicit nil

### UnsetTypes
`func (o *GetChatsRequest) UnsetTypes()`

UnsetTypes ensures that no value is present for Types, not even an explicit nil
### GetStatuses

`func (o *GetChatsRequest) GetStatuses() []ChatStatusType`

GetStatuses returns the Statuses field if non-nil, zero value otherwise.

### GetStatusesOk

`func (o *GetChatsRequest) GetStatusesOk() (*[]ChatStatusType, bool)`

GetStatusesOk returns a tuple with the Statuses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatuses

`func (o *GetChatsRequest) SetStatuses(v []ChatStatusType)`

SetStatuses sets Statuses field to given value.

### HasStatuses

`func (o *GetChatsRequest) HasStatuses() bool`

HasStatuses returns a boolean if a field has been set.

### SetStatusesNil

`func (o *GetChatsRequest) SetStatusesNil(b bool)`

 SetStatusesNil sets the value for Statuses to be an explicit nil

### UnsetStatuses
`func (o *GetChatsRequest) UnsetStatuses()`

UnsetStatuses ensures that no value is present for Statuses, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


