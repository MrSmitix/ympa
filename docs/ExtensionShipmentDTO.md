# ExtensionShipmentDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CurrentStatus** | Pointer to [**ShipmentStatusChangeDTO**](ShipmentStatusChangeDTO.md) |  | [optional] 
**AvailableActions** | [**[]ShipmentActionType**](ShipmentActionType.md) | Доступные действия над отгрузкой. | 

## Methods

### NewExtensionShipmentDTO

`func NewExtensionShipmentDTO(availableActions []ShipmentActionType, ) *ExtensionShipmentDTO`

NewExtensionShipmentDTO instantiates a new ExtensionShipmentDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewExtensionShipmentDTOWithDefaults

`func NewExtensionShipmentDTOWithDefaults() *ExtensionShipmentDTO`

NewExtensionShipmentDTOWithDefaults instantiates a new ExtensionShipmentDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCurrentStatus

`func (o *ExtensionShipmentDTO) GetCurrentStatus() ShipmentStatusChangeDTO`

GetCurrentStatus returns the CurrentStatus field if non-nil, zero value otherwise.

### GetCurrentStatusOk

`func (o *ExtensionShipmentDTO) GetCurrentStatusOk() (*ShipmentStatusChangeDTO, bool)`

GetCurrentStatusOk returns a tuple with the CurrentStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentStatus

`func (o *ExtensionShipmentDTO) SetCurrentStatus(v ShipmentStatusChangeDTO)`

SetCurrentStatus sets CurrentStatus field to given value.

### HasCurrentStatus

`func (o *ExtensionShipmentDTO) HasCurrentStatus() bool`

HasCurrentStatus returns a boolean if a field has been set.

### GetAvailableActions

`func (o *ExtensionShipmentDTO) GetAvailableActions() []ShipmentActionType`

GetAvailableActions returns the AvailableActions field if non-nil, zero value otherwise.

### GetAvailableActionsOk

`func (o *ExtensionShipmentDTO) GetAvailableActionsOk() (*[]ShipmentActionType, bool)`

GetAvailableActionsOk returns a tuple with the AvailableActions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailableActions

`func (o *ExtensionShipmentDTO) SetAvailableActions(v []ShipmentActionType)`

SetAvailableActions sets AvailableActions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


