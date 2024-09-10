# UpdateStockItemDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | **int64** | Количество доступного товара.  | 
**UpdatedAt** | Pointer to **time.Time** | Дата и время последнего обновления информации об остатках. &lt;br&gt;&lt;br&gt; Если вы не передали параметр &#x60;updatedAt&#x60;, используется текущее время. &lt;br&gt;&lt;br&gt; Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 

## Methods

### NewUpdateStockItemDTO

`func NewUpdateStockItemDTO(count int64, ) *UpdateStockItemDTO`

NewUpdateStockItemDTO instantiates a new UpdateStockItemDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateStockItemDTOWithDefaults

`func NewUpdateStockItemDTOWithDefaults() *UpdateStockItemDTO`

NewUpdateStockItemDTOWithDefaults instantiates a new UpdateStockItemDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *UpdateStockItemDTO) GetCount() int64`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *UpdateStockItemDTO) GetCountOk() (*int64, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *UpdateStockItemDTO) SetCount(v int64)`

SetCount sets Count field to given value.


### GetUpdatedAt

`func (o *UpdateStockItemDTO) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *UpdateStockItemDTO) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *UpdateStockItemDTO) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.

### HasUpdatedAt

`func (o *UpdateStockItemDTO) HasUpdatedAt() bool`

HasUpdatedAt returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


