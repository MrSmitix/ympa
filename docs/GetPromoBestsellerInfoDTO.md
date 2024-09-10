# GetPromoBestsellerInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bestseller** | **bool** | Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers). | 
**EntryDeadline** | Pointer to **time.Time** | До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета».  | [optional] 

## Methods

### NewGetPromoBestsellerInfoDTO

`func NewGetPromoBestsellerInfoDTO(bestseller bool, ) *GetPromoBestsellerInfoDTO`

NewGetPromoBestsellerInfoDTO instantiates a new GetPromoBestsellerInfoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPromoBestsellerInfoDTOWithDefaults

`func NewGetPromoBestsellerInfoDTOWithDefaults() *GetPromoBestsellerInfoDTO`

NewGetPromoBestsellerInfoDTOWithDefaults instantiates a new GetPromoBestsellerInfoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBestseller

`func (o *GetPromoBestsellerInfoDTO) GetBestseller() bool`

GetBestseller returns the Bestseller field if non-nil, zero value otherwise.

### GetBestsellerOk

`func (o *GetPromoBestsellerInfoDTO) GetBestsellerOk() (*bool, bool)`

GetBestsellerOk returns a tuple with the Bestseller field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBestseller

`func (o *GetPromoBestsellerInfoDTO) SetBestseller(v bool)`

SetBestseller sets Bestseller field to given value.


### GetEntryDeadline

`func (o *GetPromoBestsellerInfoDTO) GetEntryDeadline() time.Time`

GetEntryDeadline returns the EntryDeadline field if non-nil, zero value otherwise.

### GetEntryDeadlineOk

`func (o *GetPromoBestsellerInfoDTO) GetEntryDeadlineOk() (*time.Time, bool)`

GetEntryDeadlineOk returns a tuple with the EntryDeadline field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntryDeadline

`func (o *GetPromoBestsellerInfoDTO) SetEntryDeadline(v time.Time)`

SetEntryDeadline sets EntryDeadline field to given value.

### HasEntryDeadline

`func (o *GetPromoBestsellerInfoDTO) HasEntryDeadline() bool`

HasEntryDeadline returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


