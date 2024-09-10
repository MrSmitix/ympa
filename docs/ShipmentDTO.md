# ShipmentDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор отгрузки. | [optional] 
**PlanIntervalFrom** | Pointer to **time.Time** | Начало планового интервала отгрузки. | [optional] 
**PlanIntervalTo** | Pointer to **time.Time** | Конец планового интервала отгрузки. | [optional] 
**ShipmentType** | Pointer to [**ShipmentType**](ShipmentType.md) |  | [optional] 
**Warehouse** | Pointer to [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**WarehouseTo** | Pointer to [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**ExternalId** | Pointer to **string** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional] 
**DeliveryService** | Pointer to [**DeliveryServiceDTO**](DeliveryServiceDTO.md) |  | [optional] 
**PalletsCount** | Pointer to [**PalletsCountDTO**](PalletsCountDTO.md) |  | [optional] 
**OrderIds** | **[]int64** | Идентификаторы заказов в отгрузке. | 
**DraftCount** | Pointer to **int32** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] 
**PlannedCount** | Pointer to **int32** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] 
**FactCount** | Pointer to **int32** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] 
**CurrentStatus** | Pointer to [**ShipmentStatusChangeDTO**](ShipmentStatusChangeDTO.md) |  | [optional] 
**AvailableActions** | [**[]ShipmentActionType**](ShipmentActionType.md) | Доступные действия над отгрузкой. | 

## Methods

### NewShipmentDTO

`func NewShipmentDTO(orderIds []int64, availableActions []ShipmentActionType, ) *ShipmentDTO`

NewShipmentDTO instantiates a new ShipmentDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewShipmentDTOWithDefaults

`func NewShipmentDTOWithDefaults() *ShipmentDTO`

NewShipmentDTOWithDefaults instantiates a new ShipmentDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ShipmentDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ShipmentDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ShipmentDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *ShipmentDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetPlanIntervalFrom

`func (o *ShipmentDTO) GetPlanIntervalFrom() time.Time`

GetPlanIntervalFrom returns the PlanIntervalFrom field if non-nil, zero value otherwise.

### GetPlanIntervalFromOk

`func (o *ShipmentDTO) GetPlanIntervalFromOk() (*time.Time, bool)`

GetPlanIntervalFromOk returns a tuple with the PlanIntervalFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlanIntervalFrom

`func (o *ShipmentDTO) SetPlanIntervalFrom(v time.Time)`

SetPlanIntervalFrom sets PlanIntervalFrom field to given value.

### HasPlanIntervalFrom

`func (o *ShipmentDTO) HasPlanIntervalFrom() bool`

HasPlanIntervalFrom returns a boolean if a field has been set.

### GetPlanIntervalTo

`func (o *ShipmentDTO) GetPlanIntervalTo() time.Time`

GetPlanIntervalTo returns the PlanIntervalTo field if non-nil, zero value otherwise.

### GetPlanIntervalToOk

`func (o *ShipmentDTO) GetPlanIntervalToOk() (*time.Time, bool)`

GetPlanIntervalToOk returns a tuple with the PlanIntervalTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlanIntervalTo

`func (o *ShipmentDTO) SetPlanIntervalTo(v time.Time)`

SetPlanIntervalTo sets PlanIntervalTo field to given value.

### HasPlanIntervalTo

`func (o *ShipmentDTO) HasPlanIntervalTo() bool`

HasPlanIntervalTo returns a boolean if a field has been set.

### GetShipmentType

`func (o *ShipmentDTO) GetShipmentType() ShipmentType`

GetShipmentType returns the ShipmentType field if non-nil, zero value otherwise.

### GetShipmentTypeOk

`func (o *ShipmentDTO) GetShipmentTypeOk() (*ShipmentType, bool)`

GetShipmentTypeOk returns a tuple with the ShipmentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShipmentType

`func (o *ShipmentDTO) SetShipmentType(v ShipmentType)`

SetShipmentType sets ShipmentType field to given value.

### HasShipmentType

`func (o *ShipmentDTO) HasShipmentType() bool`

HasShipmentType returns a boolean if a field has been set.

### GetWarehouse

`func (o *ShipmentDTO) GetWarehouse() PartnerShipmentWarehouseDTO`

GetWarehouse returns the Warehouse field if non-nil, zero value otherwise.

### GetWarehouseOk

`func (o *ShipmentDTO) GetWarehouseOk() (*PartnerShipmentWarehouseDTO, bool)`

GetWarehouseOk returns a tuple with the Warehouse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarehouse

`func (o *ShipmentDTO) SetWarehouse(v PartnerShipmentWarehouseDTO)`

SetWarehouse sets Warehouse field to given value.

### HasWarehouse

`func (o *ShipmentDTO) HasWarehouse() bool`

HasWarehouse returns a boolean if a field has been set.

### GetWarehouseTo

`func (o *ShipmentDTO) GetWarehouseTo() PartnerShipmentWarehouseDTO`

GetWarehouseTo returns the WarehouseTo field if non-nil, zero value otherwise.

### GetWarehouseToOk

`func (o *ShipmentDTO) GetWarehouseToOk() (*PartnerShipmentWarehouseDTO, bool)`

GetWarehouseToOk returns a tuple with the WarehouseTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarehouseTo

`func (o *ShipmentDTO) SetWarehouseTo(v PartnerShipmentWarehouseDTO)`

SetWarehouseTo sets WarehouseTo field to given value.

### HasWarehouseTo

`func (o *ShipmentDTO) HasWarehouseTo() bool`

HasWarehouseTo returns a boolean if a field has been set.

### GetExternalId

`func (o *ShipmentDTO) GetExternalId() string`

GetExternalId returns the ExternalId field if non-nil, zero value otherwise.

### GetExternalIdOk

`func (o *ShipmentDTO) GetExternalIdOk() (*string, bool)`

GetExternalIdOk returns a tuple with the ExternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalId

`func (o *ShipmentDTO) SetExternalId(v string)`

SetExternalId sets ExternalId field to given value.

### HasExternalId

`func (o *ShipmentDTO) HasExternalId() bool`

HasExternalId returns a boolean if a field has been set.

### GetDeliveryService

`func (o *ShipmentDTO) GetDeliveryService() DeliveryServiceDTO`

GetDeliveryService returns the DeliveryService field if non-nil, zero value otherwise.

### GetDeliveryServiceOk

`func (o *ShipmentDTO) GetDeliveryServiceOk() (*DeliveryServiceDTO, bool)`

GetDeliveryServiceOk returns a tuple with the DeliveryService field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryService

`func (o *ShipmentDTO) SetDeliveryService(v DeliveryServiceDTO)`

SetDeliveryService sets DeliveryService field to given value.

### HasDeliveryService

`func (o *ShipmentDTO) HasDeliveryService() bool`

HasDeliveryService returns a boolean if a field has been set.

### GetPalletsCount

`func (o *ShipmentDTO) GetPalletsCount() PalletsCountDTO`

GetPalletsCount returns the PalletsCount field if non-nil, zero value otherwise.

### GetPalletsCountOk

`func (o *ShipmentDTO) GetPalletsCountOk() (*PalletsCountDTO, bool)`

GetPalletsCountOk returns a tuple with the PalletsCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPalletsCount

`func (o *ShipmentDTO) SetPalletsCount(v PalletsCountDTO)`

SetPalletsCount sets PalletsCount field to given value.

### HasPalletsCount

`func (o *ShipmentDTO) HasPalletsCount() bool`

HasPalletsCount returns a boolean if a field has been set.

### GetOrderIds

`func (o *ShipmentDTO) GetOrderIds() []int64`

GetOrderIds returns the OrderIds field if non-nil, zero value otherwise.

### GetOrderIdsOk

`func (o *ShipmentDTO) GetOrderIdsOk() (*[]int64, bool)`

GetOrderIdsOk returns a tuple with the OrderIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderIds

`func (o *ShipmentDTO) SetOrderIds(v []int64)`

SetOrderIds sets OrderIds field to given value.


### GetDraftCount

`func (o *ShipmentDTO) GetDraftCount() int32`

GetDraftCount returns the DraftCount field if non-nil, zero value otherwise.

### GetDraftCountOk

`func (o *ShipmentDTO) GetDraftCountOk() (*int32, bool)`

GetDraftCountOk returns a tuple with the DraftCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDraftCount

`func (o *ShipmentDTO) SetDraftCount(v int32)`

SetDraftCount sets DraftCount field to given value.

### HasDraftCount

`func (o *ShipmentDTO) HasDraftCount() bool`

HasDraftCount returns a boolean if a field has been set.

### GetPlannedCount

`func (o *ShipmentDTO) GetPlannedCount() int32`

GetPlannedCount returns the PlannedCount field if non-nil, zero value otherwise.

### GetPlannedCountOk

`func (o *ShipmentDTO) GetPlannedCountOk() (*int32, bool)`

GetPlannedCountOk returns a tuple with the PlannedCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlannedCount

`func (o *ShipmentDTO) SetPlannedCount(v int32)`

SetPlannedCount sets PlannedCount field to given value.

### HasPlannedCount

`func (o *ShipmentDTO) HasPlannedCount() bool`

HasPlannedCount returns a boolean if a field has been set.

### GetFactCount

`func (o *ShipmentDTO) GetFactCount() int32`

GetFactCount returns the FactCount field if non-nil, zero value otherwise.

### GetFactCountOk

`func (o *ShipmentDTO) GetFactCountOk() (*int32, bool)`

GetFactCountOk returns a tuple with the FactCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFactCount

`func (o *ShipmentDTO) SetFactCount(v int32)`

SetFactCount sets FactCount field to given value.

### HasFactCount

`func (o *ShipmentDTO) HasFactCount() bool`

HasFactCount returns a boolean if a field has been set.

### GetCurrentStatus

`func (o *ShipmentDTO) GetCurrentStatus() ShipmentStatusChangeDTO`

GetCurrentStatus returns the CurrentStatus field if non-nil, zero value otherwise.

### GetCurrentStatusOk

`func (o *ShipmentDTO) GetCurrentStatusOk() (*ShipmentStatusChangeDTO, bool)`

GetCurrentStatusOk returns a tuple with the CurrentStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentStatus

`func (o *ShipmentDTO) SetCurrentStatus(v ShipmentStatusChangeDTO)`

SetCurrentStatus sets CurrentStatus field to given value.

### HasCurrentStatus

`func (o *ShipmentDTO) HasCurrentStatus() bool`

HasCurrentStatus returns a boolean if a field has been set.

### GetAvailableActions

`func (o *ShipmentDTO) GetAvailableActions() []ShipmentActionType`

GetAvailableActions returns the AvailableActions field if non-nil, zero value otherwise.

### GetAvailableActionsOk

`func (o *ShipmentDTO) GetAvailableActionsOk() (*[]ShipmentActionType, bool)`

GetAvailableActionsOk returns a tuple with the AvailableActions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailableActions

`func (o *ShipmentDTO) SetAvailableActions(v []ShipmentActionType)`

SetAvailableActions sets AvailableActions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


