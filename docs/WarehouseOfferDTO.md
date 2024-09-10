# WarehouseOfferDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**TurnoverSummary** | Pointer to [**TurnoverDTO**](TurnoverDTO.md) |  | [optional] 
**Stocks** | [**[]WarehouseStockDTO**](WarehouseStockDTO.md) | Информация об остатках. | 
**UpdatedAt** | Pointer to **time.Time** | Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2023-11-21T00:42:42+03:00&#x60;.  | [optional] 

## Methods

### NewWarehouseOfferDTO

`func NewWarehouseOfferDTO(offerId string, stocks []WarehouseStockDTO, ) *WarehouseOfferDTO`

NewWarehouseOfferDTO instantiates a new WarehouseOfferDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewWarehouseOfferDTOWithDefaults

`func NewWarehouseOfferDTOWithDefaults() *WarehouseOfferDTO`

NewWarehouseOfferDTOWithDefaults instantiates a new WarehouseOfferDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferId

`func (o *WarehouseOfferDTO) GetOfferId() string`

GetOfferId returns the OfferId field if non-nil, zero value otherwise.

### GetOfferIdOk

`func (o *WarehouseOfferDTO) GetOfferIdOk() (*string, bool)`

GetOfferIdOk returns a tuple with the OfferId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferId

`func (o *WarehouseOfferDTO) SetOfferId(v string)`

SetOfferId sets OfferId field to given value.


### GetTurnoverSummary

`func (o *WarehouseOfferDTO) GetTurnoverSummary() TurnoverDTO`

GetTurnoverSummary returns the TurnoverSummary field if non-nil, zero value otherwise.

### GetTurnoverSummaryOk

`func (o *WarehouseOfferDTO) GetTurnoverSummaryOk() (*TurnoverDTO, bool)`

GetTurnoverSummaryOk returns a tuple with the TurnoverSummary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTurnoverSummary

`func (o *WarehouseOfferDTO) SetTurnoverSummary(v TurnoverDTO)`

SetTurnoverSummary sets TurnoverSummary field to given value.

### HasTurnoverSummary

`func (o *WarehouseOfferDTO) HasTurnoverSummary() bool`

HasTurnoverSummary returns a boolean if a field has been set.

### GetStocks

`func (o *WarehouseOfferDTO) GetStocks() []WarehouseStockDTO`

GetStocks returns the Stocks field if non-nil, zero value otherwise.

### GetStocksOk

`func (o *WarehouseOfferDTO) GetStocksOk() (*[]WarehouseStockDTO, bool)`

GetStocksOk returns a tuple with the Stocks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStocks

`func (o *WarehouseOfferDTO) SetStocks(v []WarehouseStockDTO)`

SetStocks sets Stocks field to given value.


### GetUpdatedAt

`func (o *WarehouseOfferDTO) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *WarehouseOfferDTO) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *WarehouseOfferDTO) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.

### HasUpdatedAt

`func (o *WarehouseOfferDTO) HasUpdatedAt() bool`

HasUpdatedAt returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


