# GetOfferMappingsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferIds** | Pointer to **[]string** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * &#x60;page_token&#x60;; * &#x60;limit&#x60;; * &#x60;cardStatuses&#x60;; * &#x60;categoryIds&#x60;; * &#x60;vendorNames&#x60;; * &#x60;tags&#x60;; * &#x60;archived&#x60;.  {% endnote %}     | [optional] 
**CardStatuses** | Pointer to [**[]OfferCardStatusType**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] 
**CategoryIds** | Pointer to **[]int32** | Фильтр по категориям на Маркете. | [optional] 
**VendorNames** | Pointer to **[]string** | Фильтр по брендам. | [optional] 
**Tags** | Pointer to **[]string** | Фильтр по тегам. | [optional] 
**Archived** | Pointer to **bool** | Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращаются товары, не находящиеся в архиве.  | [optional] 

## Methods

### NewGetOfferMappingsRequest

`func NewGetOfferMappingsRequest() *GetOfferMappingsRequest`

NewGetOfferMappingsRequest instantiates a new GetOfferMappingsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetOfferMappingsRequestWithDefaults

`func NewGetOfferMappingsRequestWithDefaults() *GetOfferMappingsRequest`

NewGetOfferMappingsRequestWithDefaults instantiates a new GetOfferMappingsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferIds

`func (o *GetOfferMappingsRequest) GetOfferIds() []string`

GetOfferIds returns the OfferIds field if non-nil, zero value otherwise.

### GetOfferIdsOk

`func (o *GetOfferMappingsRequest) GetOfferIdsOk() (*[]string, bool)`

GetOfferIdsOk returns a tuple with the OfferIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferIds

`func (o *GetOfferMappingsRequest) SetOfferIds(v []string)`

SetOfferIds sets OfferIds field to given value.

### HasOfferIds

`func (o *GetOfferMappingsRequest) HasOfferIds() bool`

HasOfferIds returns a boolean if a field has been set.

### SetOfferIdsNil

`func (o *GetOfferMappingsRequest) SetOfferIdsNil(b bool)`

 SetOfferIdsNil sets the value for OfferIds to be an explicit nil

### UnsetOfferIds
`func (o *GetOfferMappingsRequest) UnsetOfferIds()`

UnsetOfferIds ensures that no value is present for OfferIds, not even an explicit nil
### GetCardStatuses

`func (o *GetOfferMappingsRequest) GetCardStatuses() []OfferCardStatusType`

GetCardStatuses returns the CardStatuses field if non-nil, zero value otherwise.

### GetCardStatusesOk

`func (o *GetOfferMappingsRequest) GetCardStatusesOk() (*[]OfferCardStatusType, bool)`

GetCardStatusesOk returns a tuple with the CardStatuses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardStatuses

`func (o *GetOfferMappingsRequest) SetCardStatuses(v []OfferCardStatusType)`

SetCardStatuses sets CardStatuses field to given value.

### HasCardStatuses

`func (o *GetOfferMappingsRequest) HasCardStatuses() bool`

HasCardStatuses returns a boolean if a field has been set.

### SetCardStatusesNil

`func (o *GetOfferMappingsRequest) SetCardStatusesNil(b bool)`

 SetCardStatusesNil sets the value for CardStatuses to be an explicit nil

### UnsetCardStatuses
`func (o *GetOfferMappingsRequest) UnsetCardStatuses()`

UnsetCardStatuses ensures that no value is present for CardStatuses, not even an explicit nil
### GetCategoryIds

`func (o *GetOfferMappingsRequest) GetCategoryIds() []int32`

GetCategoryIds returns the CategoryIds field if non-nil, zero value otherwise.

### GetCategoryIdsOk

`func (o *GetOfferMappingsRequest) GetCategoryIdsOk() (*[]int32, bool)`

GetCategoryIdsOk returns a tuple with the CategoryIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryIds

`func (o *GetOfferMappingsRequest) SetCategoryIds(v []int32)`

SetCategoryIds sets CategoryIds field to given value.

### HasCategoryIds

`func (o *GetOfferMappingsRequest) HasCategoryIds() bool`

HasCategoryIds returns a boolean if a field has been set.

### SetCategoryIdsNil

`func (o *GetOfferMappingsRequest) SetCategoryIdsNil(b bool)`

 SetCategoryIdsNil sets the value for CategoryIds to be an explicit nil

### UnsetCategoryIds
`func (o *GetOfferMappingsRequest) UnsetCategoryIds()`

UnsetCategoryIds ensures that no value is present for CategoryIds, not even an explicit nil
### GetVendorNames

`func (o *GetOfferMappingsRequest) GetVendorNames() []string`

GetVendorNames returns the VendorNames field if non-nil, zero value otherwise.

### GetVendorNamesOk

`func (o *GetOfferMappingsRequest) GetVendorNamesOk() (*[]string, bool)`

GetVendorNamesOk returns a tuple with the VendorNames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVendorNames

`func (o *GetOfferMappingsRequest) SetVendorNames(v []string)`

SetVendorNames sets VendorNames field to given value.

### HasVendorNames

`func (o *GetOfferMappingsRequest) HasVendorNames() bool`

HasVendorNames returns a boolean if a field has been set.

### SetVendorNamesNil

`func (o *GetOfferMappingsRequest) SetVendorNamesNil(b bool)`

 SetVendorNamesNil sets the value for VendorNames to be an explicit nil

### UnsetVendorNames
`func (o *GetOfferMappingsRequest) UnsetVendorNames()`

UnsetVendorNames ensures that no value is present for VendorNames, not even an explicit nil
### GetTags

`func (o *GetOfferMappingsRequest) GetTags() []string`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *GetOfferMappingsRequest) GetTagsOk() (*[]string, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *GetOfferMappingsRequest) SetTags(v []string)`

SetTags sets Tags field to given value.

### HasTags

`func (o *GetOfferMappingsRequest) HasTags() bool`

HasTags returns a boolean if a field has been set.

### SetTagsNil

`func (o *GetOfferMappingsRequest) SetTagsNil(b bool)`

 SetTagsNil sets the value for Tags to be an explicit nil

### UnsetTags
`func (o *GetOfferMappingsRequest) UnsetTags()`

UnsetTags ensures that no value is present for Tags, not even an explicit nil
### GetArchived

`func (o *GetOfferMappingsRequest) GetArchived() bool`

GetArchived returns the Archived field if non-nil, zero value otherwise.

### GetArchivedOk

`func (o *GetOfferMappingsRequest) GetArchivedOk() (*bool, bool)`

GetArchivedOk returns a tuple with the Archived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArchived

`func (o *GetOfferMappingsRequest) SetArchived(v bool)`

SetArchived sets Archived field to given value.

### HasArchived

`func (o *GetOfferMappingsRequest) HasArchived() bool`

HasArchived returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


