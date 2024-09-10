# ShipmentStatusChangeDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ShipmentStatusType**](ShipmentStatusType.md) |  | [optional] 
**Description** | Pointer to **string** | Описание статуса отгрузки. | [optional] 
**UpdateTime** | Pointer to **time.Time** | Время последнего изменения статуса отгрузки. | [optional] 

## Methods

### NewShipmentStatusChangeDTO

`func NewShipmentStatusChangeDTO() *ShipmentStatusChangeDTO`

NewShipmentStatusChangeDTO instantiates a new ShipmentStatusChangeDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewShipmentStatusChangeDTOWithDefaults

`func NewShipmentStatusChangeDTOWithDefaults() *ShipmentStatusChangeDTO`

NewShipmentStatusChangeDTOWithDefaults instantiates a new ShipmentStatusChangeDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *ShipmentStatusChangeDTO) GetStatus() ShipmentStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ShipmentStatusChangeDTO) GetStatusOk() (*ShipmentStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ShipmentStatusChangeDTO) SetStatus(v ShipmentStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ShipmentStatusChangeDTO) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetDescription

`func (o *ShipmentStatusChangeDTO) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ShipmentStatusChangeDTO) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ShipmentStatusChangeDTO) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ShipmentStatusChangeDTO) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetUpdateTime

`func (o *ShipmentStatusChangeDTO) GetUpdateTime() time.Time`

GetUpdateTime returns the UpdateTime field if non-nil, zero value otherwise.

### GetUpdateTimeOk

`func (o *ShipmentStatusChangeDTO) GetUpdateTimeOk() (*time.Time, bool)`

GetUpdateTimeOk returns a tuple with the UpdateTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdateTime

`func (o *ShipmentStatusChangeDTO) SetUpdateTime(v time.Time)`

SetUpdateTime sets UpdateTime field to given value.

### HasUpdateTime

`func (o *ShipmentStatusChangeDTO) HasUpdateTime() bool`

HasUpdateTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


