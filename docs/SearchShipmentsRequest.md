# SearchShipmentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateFrom** | **string** | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**DateTo** | **string** | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**Statuses** | Pointer to [**[]ShipmentStatusType**](ShipmentStatusType.md) | Список статусов отгрузок. | [optional] 
**OrderIds** | Pointer to **[]int64** | Список идентификаторов заказов из отгрузок. | [optional] 
**CancelledOrders** | Pointer to **bool** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  | [optional] [default to true]

## Methods

### NewSearchShipmentsRequest

`func NewSearchShipmentsRequest(dateFrom string, dateTo string, ) *SearchShipmentsRequest`

NewSearchShipmentsRequest instantiates a new SearchShipmentsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSearchShipmentsRequestWithDefaults

`func NewSearchShipmentsRequestWithDefaults() *SearchShipmentsRequest`

NewSearchShipmentsRequestWithDefaults instantiates a new SearchShipmentsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDateFrom

`func (o *SearchShipmentsRequest) GetDateFrom() string`

GetDateFrom returns the DateFrom field if non-nil, zero value otherwise.

### GetDateFromOk

`func (o *SearchShipmentsRequest) GetDateFromOk() (*string, bool)`

GetDateFromOk returns a tuple with the DateFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateFrom

`func (o *SearchShipmentsRequest) SetDateFrom(v string)`

SetDateFrom sets DateFrom field to given value.


### GetDateTo

`func (o *SearchShipmentsRequest) GetDateTo() string`

GetDateTo returns the DateTo field if non-nil, zero value otherwise.

### GetDateToOk

`func (o *SearchShipmentsRequest) GetDateToOk() (*string, bool)`

GetDateToOk returns a tuple with the DateTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateTo

`func (o *SearchShipmentsRequest) SetDateTo(v string)`

SetDateTo sets DateTo field to given value.


### GetStatuses

`func (o *SearchShipmentsRequest) GetStatuses() []ShipmentStatusType`

GetStatuses returns the Statuses field if non-nil, zero value otherwise.

### GetStatusesOk

`func (o *SearchShipmentsRequest) GetStatusesOk() (*[]ShipmentStatusType, bool)`

GetStatusesOk returns a tuple with the Statuses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatuses

`func (o *SearchShipmentsRequest) SetStatuses(v []ShipmentStatusType)`

SetStatuses sets Statuses field to given value.

### HasStatuses

`func (o *SearchShipmentsRequest) HasStatuses() bool`

HasStatuses returns a boolean if a field has been set.

### SetStatusesNil

`func (o *SearchShipmentsRequest) SetStatusesNil(b bool)`

 SetStatusesNil sets the value for Statuses to be an explicit nil

### UnsetStatuses
`func (o *SearchShipmentsRequest) UnsetStatuses()`

UnsetStatuses ensures that no value is present for Statuses, not even an explicit nil
### GetOrderIds

`func (o *SearchShipmentsRequest) GetOrderIds() []int64`

GetOrderIds returns the OrderIds field if non-nil, zero value otherwise.

### GetOrderIdsOk

`func (o *SearchShipmentsRequest) GetOrderIdsOk() (*[]int64, bool)`

GetOrderIdsOk returns a tuple with the OrderIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderIds

`func (o *SearchShipmentsRequest) SetOrderIds(v []int64)`

SetOrderIds sets OrderIds field to given value.

### HasOrderIds

`func (o *SearchShipmentsRequest) HasOrderIds() bool`

HasOrderIds returns a boolean if a field has been set.

### SetOrderIdsNil

`func (o *SearchShipmentsRequest) SetOrderIdsNil(b bool)`

 SetOrderIdsNil sets the value for OrderIds to be an explicit nil

### UnsetOrderIds
`func (o *SearchShipmentsRequest) UnsetOrderIds()`

UnsetOrderIds ensures that no value is present for OrderIds, not even an explicit nil
### GetCancelledOrders

`func (o *SearchShipmentsRequest) GetCancelledOrders() bool`

GetCancelledOrders returns the CancelledOrders field if non-nil, zero value otherwise.

### GetCancelledOrdersOk

`func (o *SearchShipmentsRequest) GetCancelledOrdersOk() (*bool, bool)`

GetCancelledOrdersOk returns a tuple with the CancelledOrders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancelledOrders

`func (o *SearchShipmentsRequest) SetCancelledOrders(v bool)`

SetCancelledOrders sets CancelledOrders field to given value.

### HasCancelledOrders

`func (o *SearchShipmentsRequest) HasCancelledOrders() bool`

HasCancelledOrders returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


