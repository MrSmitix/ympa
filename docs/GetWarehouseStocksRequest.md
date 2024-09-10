# GetWarehouseStocksRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**WithTurnover** | Pointer to **bool** | **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — &#x60;false&#x60;. Если информация нужна, передайте значение &#x60;true&#x60;.  | [optional] [default to false]
**Archived** | Pointer to **bool** | Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращается информация о товарах, которые не находятся в архиве.  | [optional] 
**OfferIds** | Pointer to **[]string** | Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60; * &#x60;archived&#x60;  {% endnote %}     | [optional] 

## Methods

### NewGetWarehouseStocksRequest

`func NewGetWarehouseStocksRequest() *GetWarehouseStocksRequest`

NewGetWarehouseStocksRequest instantiates a new GetWarehouseStocksRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetWarehouseStocksRequestWithDefaults

`func NewGetWarehouseStocksRequestWithDefaults() *GetWarehouseStocksRequest`

NewGetWarehouseStocksRequestWithDefaults instantiates a new GetWarehouseStocksRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetWithTurnover

`func (o *GetWarehouseStocksRequest) GetWithTurnover() bool`

GetWithTurnover returns the WithTurnover field if non-nil, zero value otherwise.

### GetWithTurnoverOk

`func (o *GetWarehouseStocksRequest) GetWithTurnoverOk() (*bool, bool)`

GetWithTurnoverOk returns a tuple with the WithTurnover field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWithTurnover

`func (o *GetWarehouseStocksRequest) SetWithTurnover(v bool)`

SetWithTurnover sets WithTurnover field to given value.

### HasWithTurnover

`func (o *GetWarehouseStocksRequest) HasWithTurnover() bool`

HasWithTurnover returns a boolean if a field has been set.

### GetArchived

`func (o *GetWarehouseStocksRequest) GetArchived() bool`

GetArchived returns the Archived field if non-nil, zero value otherwise.

### GetArchivedOk

`func (o *GetWarehouseStocksRequest) GetArchivedOk() (*bool, bool)`

GetArchivedOk returns a tuple with the Archived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArchived

`func (o *GetWarehouseStocksRequest) SetArchived(v bool)`

SetArchived sets Archived field to given value.

### HasArchived

`func (o *GetWarehouseStocksRequest) HasArchived() bool`

HasArchived returns a boolean if a field has been set.

### GetOfferIds

`func (o *GetWarehouseStocksRequest) GetOfferIds() []string`

GetOfferIds returns the OfferIds field if non-nil, zero value otherwise.

### GetOfferIdsOk

`func (o *GetWarehouseStocksRequest) GetOfferIdsOk() (*[]string, bool)`

GetOfferIdsOk returns a tuple with the OfferIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferIds

`func (o *GetWarehouseStocksRequest) SetOfferIds(v []string)`

SetOfferIds sets OfferIds field to given value.

### HasOfferIds

`func (o *GetWarehouseStocksRequest) HasOfferIds() bool`

HasOfferIds returns a boolean if a field has been set.

### SetOfferIdsNil

`func (o *GetWarehouseStocksRequest) SetOfferIdsNil(b bool)`

 SetOfferIdsNil sets the value for OfferIds to be an explicit nil

### UnsetOfferIds
`func (o *GetWarehouseStocksRequest) UnsetOfferIds()`

UnsetOfferIds ensures that no value is present for OfferIds, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


