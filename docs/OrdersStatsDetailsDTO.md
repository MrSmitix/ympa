# OrdersStatsDetailsDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemStatus** | Pointer to [**OrdersStatsItemStatusType**](OrdersStatsItemStatusType.md) |  | [optional] 
**ItemCount** | Pointer to **int64** | Количество товара со статусом, указанном в параметре &#x60;itemStatus&#x60;. | [optional] 
**UpdateDate** | Pointer to **string** | Дата, когда товар получил статус, указанный в параметре &#x60;itemStatus&#x60;.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**StockType** | Pointer to [**OrdersStatsStockType**](OrdersStatsStockType.md) |  | [optional] 

## Methods

### NewOrdersStatsDetailsDTO

`func NewOrdersStatsDetailsDTO() *OrdersStatsDetailsDTO`

NewOrdersStatsDetailsDTO instantiates a new OrdersStatsDetailsDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrdersStatsDetailsDTOWithDefaults

`func NewOrdersStatsDetailsDTOWithDefaults() *OrdersStatsDetailsDTO`

NewOrdersStatsDetailsDTOWithDefaults instantiates a new OrdersStatsDetailsDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemStatus

`func (o *OrdersStatsDetailsDTO) GetItemStatus() OrdersStatsItemStatusType`

GetItemStatus returns the ItemStatus field if non-nil, zero value otherwise.

### GetItemStatusOk

`func (o *OrdersStatsDetailsDTO) GetItemStatusOk() (*OrdersStatsItemStatusType, bool)`

GetItemStatusOk returns a tuple with the ItemStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemStatus

`func (o *OrdersStatsDetailsDTO) SetItemStatus(v OrdersStatsItemStatusType)`

SetItemStatus sets ItemStatus field to given value.

### HasItemStatus

`func (o *OrdersStatsDetailsDTO) HasItemStatus() bool`

HasItemStatus returns a boolean if a field has been set.

### GetItemCount

`func (o *OrdersStatsDetailsDTO) GetItemCount() int64`

GetItemCount returns the ItemCount field if non-nil, zero value otherwise.

### GetItemCountOk

`func (o *OrdersStatsDetailsDTO) GetItemCountOk() (*int64, bool)`

GetItemCountOk returns a tuple with the ItemCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemCount

`func (o *OrdersStatsDetailsDTO) SetItemCount(v int64)`

SetItemCount sets ItemCount field to given value.

### HasItemCount

`func (o *OrdersStatsDetailsDTO) HasItemCount() bool`

HasItemCount returns a boolean if a field has been set.

### GetUpdateDate

`func (o *OrdersStatsDetailsDTO) GetUpdateDate() string`

GetUpdateDate returns the UpdateDate field if non-nil, zero value otherwise.

### GetUpdateDateOk

`func (o *OrdersStatsDetailsDTO) GetUpdateDateOk() (*string, bool)`

GetUpdateDateOk returns a tuple with the UpdateDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdateDate

`func (o *OrdersStatsDetailsDTO) SetUpdateDate(v string)`

SetUpdateDate sets UpdateDate field to given value.

### HasUpdateDate

`func (o *OrdersStatsDetailsDTO) HasUpdateDate() bool`

HasUpdateDate returns a boolean if a field has been set.

### GetStockType

`func (o *OrdersStatsDetailsDTO) GetStockType() OrdersStatsStockType`

GetStockType returns the StockType field if non-nil, zero value otherwise.

### GetStockTypeOk

`func (o *OrdersStatsDetailsDTO) GetStockTypeOk() (*OrdersStatsStockType, bool)`

GetStockTypeOk returns a tuple with the StockType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStockType

`func (o *OrdersStatsDetailsDTO) SetStockType(v OrdersStatsStockType)`

SetStockType sets StockType field to given value.

### HasStockType

`func (o *OrdersStatsDetailsDTO) HasStockType() bool`

HasStockType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


