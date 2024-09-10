# GetQuarantineOffersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferIds** | Pointer to **[]string** | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  | [optional] 
**CardStatuses** | Pointer to [**[]OfferCardStatusType**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] 
**CategoryIds** | Pointer to **[]int32** | Фильтр по категориям на Маркете. | [optional] 
**VendorNames** | Pointer to **[]string** | Фильтр по брендам. | [optional] 
**Tags** | Pointer to **[]string** | Фильтр по тегам. | [optional] 

## Methods

### NewGetQuarantineOffersRequest

`func NewGetQuarantineOffersRequest() *GetQuarantineOffersRequest`

NewGetQuarantineOffersRequest instantiates a new GetQuarantineOffersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetQuarantineOffersRequestWithDefaults

`func NewGetQuarantineOffersRequestWithDefaults() *GetQuarantineOffersRequest`

NewGetQuarantineOffersRequestWithDefaults instantiates a new GetQuarantineOffersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferIds

`func (o *GetQuarantineOffersRequest) GetOfferIds() []string`

GetOfferIds returns the OfferIds field if non-nil, zero value otherwise.

### GetOfferIdsOk

`func (o *GetQuarantineOffersRequest) GetOfferIdsOk() (*[]string, bool)`

GetOfferIdsOk returns a tuple with the OfferIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferIds

`func (o *GetQuarantineOffersRequest) SetOfferIds(v []string)`

SetOfferIds sets OfferIds field to given value.

### HasOfferIds

`func (o *GetQuarantineOffersRequest) HasOfferIds() bool`

HasOfferIds returns a boolean if a field has been set.

### SetOfferIdsNil

`func (o *GetQuarantineOffersRequest) SetOfferIdsNil(b bool)`

 SetOfferIdsNil sets the value for OfferIds to be an explicit nil

### UnsetOfferIds
`func (o *GetQuarantineOffersRequest) UnsetOfferIds()`

UnsetOfferIds ensures that no value is present for OfferIds, not even an explicit nil
### GetCardStatuses

`func (o *GetQuarantineOffersRequest) GetCardStatuses() []OfferCardStatusType`

GetCardStatuses returns the CardStatuses field if non-nil, zero value otherwise.

### GetCardStatusesOk

`func (o *GetQuarantineOffersRequest) GetCardStatusesOk() (*[]OfferCardStatusType, bool)`

GetCardStatusesOk returns a tuple with the CardStatuses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardStatuses

`func (o *GetQuarantineOffersRequest) SetCardStatuses(v []OfferCardStatusType)`

SetCardStatuses sets CardStatuses field to given value.

### HasCardStatuses

`func (o *GetQuarantineOffersRequest) HasCardStatuses() bool`

HasCardStatuses returns a boolean if a field has been set.

### SetCardStatusesNil

`func (o *GetQuarantineOffersRequest) SetCardStatusesNil(b bool)`

 SetCardStatusesNil sets the value for CardStatuses to be an explicit nil

### UnsetCardStatuses
`func (o *GetQuarantineOffersRequest) UnsetCardStatuses()`

UnsetCardStatuses ensures that no value is present for CardStatuses, not even an explicit nil
### GetCategoryIds

`func (o *GetQuarantineOffersRequest) GetCategoryIds() []int32`

GetCategoryIds returns the CategoryIds field if non-nil, zero value otherwise.

### GetCategoryIdsOk

`func (o *GetQuarantineOffersRequest) GetCategoryIdsOk() (*[]int32, bool)`

GetCategoryIdsOk returns a tuple with the CategoryIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryIds

`func (o *GetQuarantineOffersRequest) SetCategoryIds(v []int32)`

SetCategoryIds sets CategoryIds field to given value.

### HasCategoryIds

`func (o *GetQuarantineOffersRequest) HasCategoryIds() bool`

HasCategoryIds returns a boolean if a field has been set.

### SetCategoryIdsNil

`func (o *GetQuarantineOffersRequest) SetCategoryIdsNil(b bool)`

 SetCategoryIdsNil sets the value for CategoryIds to be an explicit nil

### UnsetCategoryIds
`func (o *GetQuarantineOffersRequest) UnsetCategoryIds()`

UnsetCategoryIds ensures that no value is present for CategoryIds, not even an explicit nil
### GetVendorNames

`func (o *GetQuarantineOffersRequest) GetVendorNames() []string`

GetVendorNames returns the VendorNames field if non-nil, zero value otherwise.

### GetVendorNamesOk

`func (o *GetQuarantineOffersRequest) GetVendorNamesOk() (*[]string, bool)`

GetVendorNamesOk returns a tuple with the VendorNames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVendorNames

`func (o *GetQuarantineOffersRequest) SetVendorNames(v []string)`

SetVendorNames sets VendorNames field to given value.

### HasVendorNames

`func (o *GetQuarantineOffersRequest) HasVendorNames() bool`

HasVendorNames returns a boolean if a field has been set.

### SetVendorNamesNil

`func (o *GetQuarantineOffersRequest) SetVendorNamesNil(b bool)`

 SetVendorNamesNil sets the value for VendorNames to be an explicit nil

### UnsetVendorNames
`func (o *GetQuarantineOffersRequest) UnsetVendorNames()`

UnsetVendorNames ensures that no value is present for VendorNames, not even an explicit nil
### GetTags

`func (o *GetQuarantineOffersRequest) GetTags() []string`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *GetQuarantineOffersRequest) GetTagsOk() (*[]string, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *GetQuarantineOffersRequest) SetTags(v []string)`

SetTags sets Tags field to given value.

### HasTags

`func (o *GetQuarantineOffersRequest) HasTags() bool`

HasTags returns a boolean if a field has been set.

### SetTagsNil

`func (o *GetQuarantineOffersRequest) SetTagsNil(b bool)`

 SetTagsNil sets the value for Tags to be an explicit nil

### UnsetTags
`func (o *GetQuarantineOffersRequest) UnsetTags()`

UnsetTags ensures that no value is present for Tags, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


