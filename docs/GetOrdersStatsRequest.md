# GetOrdersStatsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateFrom** | Pointer to **string** | Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;.  | [optional] 
**DateTo** | Pointer to **string** | Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;.  | [optional] 
**UpdateFrom** | Pointer to **string** | Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;.  | [optional] 
**UpdateTo** | Pointer to **string** | Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;.  | [optional] 
**Orders** | Pointer to **[]int64** | Список идентификаторов заказов. | [optional] 
**Statuses** | Pointer to [**[]OrderStatsStatusType**](OrderStatsStatusType.md) | Список статусов заказов. | [optional] 
**HasCis** | Pointer to **bool** | Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  | [optional] 

## Methods

### NewGetOrdersStatsRequest

`func NewGetOrdersStatsRequest() *GetOrdersStatsRequest`

NewGetOrdersStatsRequest instantiates a new GetOrdersStatsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetOrdersStatsRequestWithDefaults

`func NewGetOrdersStatsRequestWithDefaults() *GetOrdersStatsRequest`

NewGetOrdersStatsRequestWithDefaults instantiates a new GetOrdersStatsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDateFrom

`func (o *GetOrdersStatsRequest) GetDateFrom() string`

GetDateFrom returns the DateFrom field if non-nil, zero value otherwise.

### GetDateFromOk

`func (o *GetOrdersStatsRequest) GetDateFromOk() (*string, bool)`

GetDateFromOk returns a tuple with the DateFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateFrom

`func (o *GetOrdersStatsRequest) SetDateFrom(v string)`

SetDateFrom sets DateFrom field to given value.

### HasDateFrom

`func (o *GetOrdersStatsRequest) HasDateFrom() bool`

HasDateFrom returns a boolean if a field has been set.

### GetDateTo

`func (o *GetOrdersStatsRequest) GetDateTo() string`

GetDateTo returns the DateTo field if non-nil, zero value otherwise.

### GetDateToOk

`func (o *GetOrdersStatsRequest) GetDateToOk() (*string, bool)`

GetDateToOk returns a tuple with the DateTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateTo

`func (o *GetOrdersStatsRequest) SetDateTo(v string)`

SetDateTo sets DateTo field to given value.

### HasDateTo

`func (o *GetOrdersStatsRequest) HasDateTo() bool`

HasDateTo returns a boolean if a field has been set.

### GetUpdateFrom

`func (o *GetOrdersStatsRequest) GetUpdateFrom() string`

GetUpdateFrom returns the UpdateFrom field if non-nil, zero value otherwise.

### GetUpdateFromOk

`func (o *GetOrdersStatsRequest) GetUpdateFromOk() (*string, bool)`

GetUpdateFromOk returns a tuple with the UpdateFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdateFrom

`func (o *GetOrdersStatsRequest) SetUpdateFrom(v string)`

SetUpdateFrom sets UpdateFrom field to given value.

### HasUpdateFrom

`func (o *GetOrdersStatsRequest) HasUpdateFrom() bool`

HasUpdateFrom returns a boolean if a field has been set.

### GetUpdateTo

`func (o *GetOrdersStatsRequest) GetUpdateTo() string`

GetUpdateTo returns the UpdateTo field if non-nil, zero value otherwise.

### GetUpdateToOk

`func (o *GetOrdersStatsRequest) GetUpdateToOk() (*string, bool)`

GetUpdateToOk returns a tuple with the UpdateTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdateTo

`func (o *GetOrdersStatsRequest) SetUpdateTo(v string)`

SetUpdateTo sets UpdateTo field to given value.

### HasUpdateTo

`func (o *GetOrdersStatsRequest) HasUpdateTo() bool`

HasUpdateTo returns a boolean if a field has been set.

### GetOrders

`func (o *GetOrdersStatsRequest) GetOrders() []int64`

GetOrders returns the Orders field if non-nil, zero value otherwise.

### GetOrdersOk

`func (o *GetOrdersStatsRequest) GetOrdersOk() (*[]int64, bool)`

GetOrdersOk returns a tuple with the Orders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrders

`func (o *GetOrdersStatsRequest) SetOrders(v []int64)`

SetOrders sets Orders field to given value.

### HasOrders

`func (o *GetOrdersStatsRequest) HasOrders() bool`

HasOrders returns a boolean if a field has been set.

### SetOrdersNil

`func (o *GetOrdersStatsRequest) SetOrdersNil(b bool)`

 SetOrdersNil sets the value for Orders to be an explicit nil

### UnsetOrders
`func (o *GetOrdersStatsRequest) UnsetOrders()`

UnsetOrders ensures that no value is present for Orders, not even an explicit nil
### GetStatuses

`func (o *GetOrdersStatsRequest) GetStatuses() []OrderStatsStatusType`

GetStatuses returns the Statuses field if non-nil, zero value otherwise.

### GetStatusesOk

`func (o *GetOrdersStatsRequest) GetStatusesOk() (*[]OrderStatsStatusType, bool)`

GetStatusesOk returns a tuple with the Statuses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatuses

`func (o *GetOrdersStatsRequest) SetStatuses(v []OrderStatsStatusType)`

SetStatuses sets Statuses field to given value.

### HasStatuses

`func (o *GetOrdersStatsRequest) HasStatuses() bool`

HasStatuses returns a boolean if a field has been set.

### SetStatusesNil

`func (o *GetOrdersStatsRequest) SetStatusesNil(b bool)`

 SetStatusesNil sets the value for Statuses to be an explicit nil

### UnsetStatuses
`func (o *GetOrdersStatsRequest) UnsetStatuses()`

UnsetStatuses ensures that no value is present for Statuses, not even an explicit nil
### GetHasCis

`func (o *GetOrdersStatsRequest) GetHasCis() bool`

GetHasCis returns the HasCis field if non-nil, zero value otherwise.

### GetHasCisOk

`func (o *GetOrdersStatsRequest) GetHasCisOk() (*bool, bool)`

GetHasCisOk returns a tuple with the HasCis field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasCis

`func (o *GetOrdersStatsRequest) SetHasCis(v bool)`

SetHasCis sets HasCis field to given value.

### HasHasCis

`func (o *GetOrdersStatsRequest) HasHasCis() bool`

HasHasCis returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


