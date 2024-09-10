# ShipmentInfoDTO

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
**Status** | Pointer to [**ShipmentStatusType**](ShipmentStatusType.md) |  | [optional] 
**StatusDescription** | Pointer to **string** | Описание статуса отгрузки. | [optional] 
**StatusUpdateTime** | Pointer to **time.Time** | Время последнего изменения статуса отгрузки. | [optional] 

## Methods

### NewShipmentInfoDTO

`func NewShipmentInfoDTO(orderIds []int64, ) *ShipmentInfoDTO`

NewShipmentInfoDTO instantiates a new ShipmentInfoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewShipmentInfoDTOWithDefaults

`func NewShipmentInfoDTOWithDefaults() *ShipmentInfoDTO`

NewShipmentInfoDTOWithDefaults instantiates a new ShipmentInfoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ShipmentInfoDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ShipmentInfoDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ShipmentInfoDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *ShipmentInfoDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetPlanIntervalFrom

`func (o *ShipmentInfoDTO) GetPlanIntervalFrom() time.Time`

GetPlanIntervalFrom returns the PlanIntervalFrom field if non-nil, zero value otherwise.

### GetPlanIntervalFromOk

`func (o *ShipmentInfoDTO) GetPlanIntervalFromOk() (*time.Time, bool)`

GetPlanIntervalFromOk returns a tuple with the PlanIntervalFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlanIntervalFrom

`func (o *ShipmentInfoDTO) SetPlanIntervalFrom(v time.Time)`

SetPlanIntervalFrom sets PlanIntervalFrom field to given value.

### HasPlanIntervalFrom

`func (o *ShipmentInfoDTO) HasPlanIntervalFrom() bool`

HasPlanIntervalFrom returns a boolean if a field has been set.

### GetPlanIntervalTo

`func (o *ShipmentInfoDTO) GetPlanIntervalTo() time.Time`

GetPlanIntervalTo returns the PlanIntervalTo field if non-nil, zero value otherwise.

### GetPlanIntervalToOk

`func (o *ShipmentInfoDTO) GetPlanIntervalToOk() (*time.Time, bool)`

GetPlanIntervalToOk returns a tuple with the PlanIntervalTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlanIntervalTo

`func (o *ShipmentInfoDTO) SetPlanIntervalTo(v time.Time)`

SetPlanIntervalTo sets PlanIntervalTo field to given value.

### HasPlanIntervalTo

`func (o *ShipmentInfoDTO) HasPlanIntervalTo() bool`

HasPlanIntervalTo returns a boolean if a field has been set.

### GetShipmentType

`func (o *ShipmentInfoDTO) GetShipmentType() ShipmentType`

GetShipmentType returns the ShipmentType field if non-nil, zero value otherwise.

### GetShipmentTypeOk

`func (o *ShipmentInfoDTO) GetShipmentTypeOk() (*ShipmentType, bool)`

GetShipmentTypeOk returns a tuple with the ShipmentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShipmentType

`func (o *ShipmentInfoDTO) SetShipmentType(v ShipmentType)`

SetShipmentType sets ShipmentType field to given value.

### HasShipmentType

`func (o *ShipmentInfoDTO) HasShipmentType() bool`

HasShipmentType returns a boolean if a field has been set.

### GetWarehouse

`func (o *ShipmentInfoDTO) GetWarehouse() PartnerShipmentWarehouseDTO`

GetWarehouse returns the Warehouse field if non-nil, zero value otherwise.

### GetWarehouseOk

`func (o *ShipmentInfoDTO) GetWarehouseOk() (*PartnerShipmentWarehouseDTO, bool)`

GetWarehouseOk returns a tuple with the Warehouse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarehouse

`func (o *ShipmentInfoDTO) SetWarehouse(v PartnerShipmentWarehouseDTO)`

SetWarehouse sets Warehouse field to given value.

### HasWarehouse

`func (o *ShipmentInfoDTO) HasWarehouse() bool`

HasWarehouse returns a boolean if a field has been set.

### GetWarehouseTo

`func (o *ShipmentInfoDTO) GetWarehouseTo() PartnerShipmentWarehouseDTO`

GetWarehouseTo returns the WarehouseTo field if non-nil, zero value otherwise.

### GetWarehouseToOk

`func (o *ShipmentInfoDTO) GetWarehouseToOk() (*PartnerShipmentWarehouseDTO, bool)`

GetWarehouseToOk returns a tuple with the WarehouseTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarehouseTo

`func (o *ShipmentInfoDTO) SetWarehouseTo(v PartnerShipmentWarehouseDTO)`

SetWarehouseTo sets WarehouseTo field to given value.

### HasWarehouseTo

`func (o *ShipmentInfoDTO) HasWarehouseTo() bool`

HasWarehouseTo returns a boolean if a field has been set.

### GetExternalId

`func (o *ShipmentInfoDTO) GetExternalId() string`

GetExternalId returns the ExternalId field if non-nil, zero value otherwise.

### GetExternalIdOk

`func (o *ShipmentInfoDTO) GetExternalIdOk() (*string, bool)`

GetExternalIdOk returns a tuple with the ExternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalId

`func (o *ShipmentInfoDTO) SetExternalId(v string)`

SetExternalId sets ExternalId field to given value.

### HasExternalId

`func (o *ShipmentInfoDTO) HasExternalId() bool`

HasExternalId returns a boolean if a field has been set.

### GetDeliveryService

`func (o *ShipmentInfoDTO) GetDeliveryService() DeliveryServiceDTO`

GetDeliveryService returns the DeliveryService field if non-nil, zero value otherwise.

### GetDeliveryServiceOk

`func (o *ShipmentInfoDTO) GetDeliveryServiceOk() (*DeliveryServiceDTO, bool)`

GetDeliveryServiceOk returns a tuple with the DeliveryService field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryService

`func (o *ShipmentInfoDTO) SetDeliveryService(v DeliveryServiceDTO)`

SetDeliveryService sets DeliveryService field to given value.

### HasDeliveryService

`func (o *ShipmentInfoDTO) HasDeliveryService() bool`

HasDeliveryService returns a boolean if a field has been set.

### GetPalletsCount

`func (o *ShipmentInfoDTO) GetPalletsCount() PalletsCountDTO`

GetPalletsCount returns the PalletsCount field if non-nil, zero value otherwise.

### GetPalletsCountOk

`func (o *ShipmentInfoDTO) GetPalletsCountOk() (*PalletsCountDTO, bool)`

GetPalletsCountOk returns a tuple with the PalletsCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPalletsCount

`func (o *ShipmentInfoDTO) SetPalletsCount(v PalletsCountDTO)`

SetPalletsCount sets PalletsCount field to given value.

### HasPalletsCount

`func (o *ShipmentInfoDTO) HasPalletsCount() bool`

HasPalletsCount returns a boolean if a field has been set.

### GetOrderIds

`func (o *ShipmentInfoDTO) GetOrderIds() []int64`

GetOrderIds returns the OrderIds field if non-nil, zero value otherwise.

### GetOrderIdsOk

`func (o *ShipmentInfoDTO) GetOrderIdsOk() (*[]int64, bool)`

GetOrderIdsOk returns a tuple with the OrderIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderIds

`func (o *ShipmentInfoDTO) SetOrderIds(v []int64)`

SetOrderIds sets OrderIds field to given value.


### GetDraftCount

`func (o *ShipmentInfoDTO) GetDraftCount() int32`

GetDraftCount returns the DraftCount field if non-nil, zero value otherwise.

### GetDraftCountOk

`func (o *ShipmentInfoDTO) GetDraftCountOk() (*int32, bool)`

GetDraftCountOk returns a tuple with the DraftCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDraftCount

`func (o *ShipmentInfoDTO) SetDraftCount(v int32)`

SetDraftCount sets DraftCount field to given value.

### HasDraftCount

`func (o *ShipmentInfoDTO) HasDraftCount() bool`

HasDraftCount returns a boolean if a field has been set.

### GetPlannedCount

`func (o *ShipmentInfoDTO) GetPlannedCount() int32`

GetPlannedCount returns the PlannedCount field if non-nil, zero value otherwise.

### GetPlannedCountOk

`func (o *ShipmentInfoDTO) GetPlannedCountOk() (*int32, bool)`

GetPlannedCountOk returns a tuple with the PlannedCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlannedCount

`func (o *ShipmentInfoDTO) SetPlannedCount(v int32)`

SetPlannedCount sets PlannedCount field to given value.

### HasPlannedCount

`func (o *ShipmentInfoDTO) HasPlannedCount() bool`

HasPlannedCount returns a boolean if a field has been set.

### GetFactCount

`func (o *ShipmentInfoDTO) GetFactCount() int32`

GetFactCount returns the FactCount field if non-nil, zero value otherwise.

### GetFactCountOk

`func (o *ShipmentInfoDTO) GetFactCountOk() (*int32, bool)`

GetFactCountOk returns a tuple with the FactCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFactCount

`func (o *ShipmentInfoDTO) SetFactCount(v int32)`

SetFactCount sets FactCount field to given value.

### HasFactCount

`func (o *ShipmentInfoDTO) HasFactCount() bool`

HasFactCount returns a boolean if a field has been set.

### GetStatus

`func (o *ShipmentInfoDTO) GetStatus() ShipmentStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ShipmentInfoDTO) GetStatusOk() (*ShipmentStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ShipmentInfoDTO) SetStatus(v ShipmentStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ShipmentInfoDTO) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetStatusDescription

`func (o *ShipmentInfoDTO) GetStatusDescription() string`

GetStatusDescription returns the StatusDescription field if non-nil, zero value otherwise.

### GetStatusDescriptionOk

`func (o *ShipmentInfoDTO) GetStatusDescriptionOk() (*string, bool)`

GetStatusDescriptionOk returns a tuple with the StatusDescription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusDescription

`func (o *ShipmentInfoDTO) SetStatusDescription(v string)`

SetStatusDescription sets StatusDescription field to given value.

### HasStatusDescription

`func (o *ShipmentInfoDTO) HasStatusDescription() bool`

HasStatusDescription returns a boolean if a field has been set.

### GetStatusUpdateTime

`func (o *ShipmentInfoDTO) GetStatusUpdateTime() time.Time`

GetStatusUpdateTime returns the StatusUpdateTime field if non-nil, zero value otherwise.

### GetStatusUpdateTimeOk

`func (o *ShipmentInfoDTO) GetStatusUpdateTimeOk() (*time.Time, bool)`

GetStatusUpdateTimeOk returns a tuple with the StatusUpdateTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusUpdateTime

`func (o *ShipmentInfoDTO) SetStatusUpdateTime(v time.Time)`

SetStatusUpdateTime sets StatusUpdateTime field to given value.

### HasStatusUpdateTime

`func (o *ShipmentInfoDTO) HasStatusUpdateTime() bool`

HasStatusUpdateTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


