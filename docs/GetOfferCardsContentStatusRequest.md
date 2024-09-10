# GetOfferCardsContentStatusRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferIds** | Pointer to **[]string** | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  | [optional] 
**CardStatuses** | Pointer to [**[]OfferCardStatusType**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] 
**CategoryIds** | Pointer to **[]int32** | Фильтр по категориям на Маркете. | [optional] 

## Methods

### NewGetOfferCardsContentStatusRequest

`func NewGetOfferCardsContentStatusRequest() *GetOfferCardsContentStatusRequest`

NewGetOfferCardsContentStatusRequest instantiates a new GetOfferCardsContentStatusRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetOfferCardsContentStatusRequestWithDefaults

`func NewGetOfferCardsContentStatusRequestWithDefaults() *GetOfferCardsContentStatusRequest`

NewGetOfferCardsContentStatusRequestWithDefaults instantiates a new GetOfferCardsContentStatusRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferIds

`func (o *GetOfferCardsContentStatusRequest) GetOfferIds() []string`

GetOfferIds returns the OfferIds field if non-nil, zero value otherwise.

### GetOfferIdsOk

`func (o *GetOfferCardsContentStatusRequest) GetOfferIdsOk() (*[]string, bool)`

GetOfferIdsOk returns a tuple with the OfferIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferIds

`func (o *GetOfferCardsContentStatusRequest) SetOfferIds(v []string)`

SetOfferIds sets OfferIds field to given value.

### HasOfferIds

`func (o *GetOfferCardsContentStatusRequest) HasOfferIds() bool`

HasOfferIds returns a boolean if a field has been set.

### SetOfferIdsNil

`func (o *GetOfferCardsContentStatusRequest) SetOfferIdsNil(b bool)`

 SetOfferIdsNil sets the value for OfferIds to be an explicit nil

### UnsetOfferIds
`func (o *GetOfferCardsContentStatusRequest) UnsetOfferIds()`

UnsetOfferIds ensures that no value is present for OfferIds, not even an explicit nil
### GetCardStatuses

`func (o *GetOfferCardsContentStatusRequest) GetCardStatuses() []OfferCardStatusType`

GetCardStatuses returns the CardStatuses field if non-nil, zero value otherwise.

### GetCardStatusesOk

`func (o *GetOfferCardsContentStatusRequest) GetCardStatusesOk() (*[]OfferCardStatusType, bool)`

GetCardStatusesOk returns a tuple with the CardStatuses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardStatuses

`func (o *GetOfferCardsContentStatusRequest) SetCardStatuses(v []OfferCardStatusType)`

SetCardStatuses sets CardStatuses field to given value.

### HasCardStatuses

`func (o *GetOfferCardsContentStatusRequest) HasCardStatuses() bool`

HasCardStatuses returns a boolean if a field has been set.

### SetCardStatusesNil

`func (o *GetOfferCardsContentStatusRequest) SetCardStatusesNil(b bool)`

 SetCardStatusesNil sets the value for CardStatuses to be an explicit nil

### UnsetCardStatuses
`func (o *GetOfferCardsContentStatusRequest) UnsetCardStatuses()`

UnsetCardStatuses ensures that no value is present for CardStatuses, not even an explicit nil
### GetCategoryIds

`func (o *GetOfferCardsContentStatusRequest) GetCategoryIds() []int32`

GetCategoryIds returns the CategoryIds field if non-nil, zero value otherwise.

### GetCategoryIdsOk

`func (o *GetOfferCardsContentStatusRequest) GetCategoryIdsOk() (*[]int32, bool)`

GetCategoryIdsOk returns a tuple with the CategoryIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryIds

`func (o *GetOfferCardsContentStatusRequest) SetCategoryIds(v []int32)`

SetCategoryIds sets CategoryIds field to given value.

### HasCategoryIds

`func (o *GetOfferCardsContentStatusRequest) HasCategoryIds() bool`

HasCategoryIds returns a boolean if a field has been set.

### SetCategoryIdsNil

`func (o *GetOfferCardsContentStatusRequest) SetCategoryIdsNil(b bool)`

 SetCategoryIdsNil sets the value for CategoryIds to be an explicit nil

### UnsetCategoryIds
`func (o *GetOfferCardsContentStatusRequest) UnsetCategoryIds()`

UnsetCategoryIds ensures that no value is present for CategoryIds, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


