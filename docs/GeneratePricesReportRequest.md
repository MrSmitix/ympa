# GeneratePricesReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | Pointer to **int64** | Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан &#x60;campaignId&#x60;.  | [optional] 
**CampaignId** | Pointer to **int64** | Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать &#x60;businessId&#x60; не нужно.  | [optional] 
**CategoryIds** | Pointer to **[]int64** | Фильтр по категориям на Маркете. | [optional] 
**CreationDateFrom** | Pointer to **string** | Фильтр по времени появления предложения — начало периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**CreationDateTo** | Pointer to **string** | Фильтр по времени появления предложения — окончание периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 

## Methods

### NewGeneratePricesReportRequest

`func NewGeneratePricesReportRequest() *GeneratePricesReportRequest`

NewGeneratePricesReportRequest instantiates a new GeneratePricesReportRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGeneratePricesReportRequestWithDefaults

`func NewGeneratePricesReportRequestWithDefaults() *GeneratePricesReportRequest`

NewGeneratePricesReportRequestWithDefaults instantiates a new GeneratePricesReportRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBusinessId

`func (o *GeneratePricesReportRequest) GetBusinessId() int64`

GetBusinessId returns the BusinessId field if non-nil, zero value otherwise.

### GetBusinessIdOk

`func (o *GeneratePricesReportRequest) GetBusinessIdOk() (*int64, bool)`

GetBusinessIdOk returns a tuple with the BusinessId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessId

`func (o *GeneratePricesReportRequest) SetBusinessId(v int64)`

SetBusinessId sets BusinessId field to given value.

### HasBusinessId

`func (o *GeneratePricesReportRequest) HasBusinessId() bool`

HasBusinessId returns a boolean if a field has been set.

### GetCampaignId

`func (o *GeneratePricesReportRequest) GetCampaignId() int64`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *GeneratePricesReportRequest) GetCampaignIdOk() (*int64, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *GeneratePricesReportRequest) SetCampaignId(v int64)`

SetCampaignId sets CampaignId field to given value.

### HasCampaignId

`func (o *GeneratePricesReportRequest) HasCampaignId() bool`

HasCampaignId returns a boolean if a field has been set.

### GetCategoryIds

`func (o *GeneratePricesReportRequest) GetCategoryIds() []int64`

GetCategoryIds returns the CategoryIds field if non-nil, zero value otherwise.

### GetCategoryIdsOk

`func (o *GeneratePricesReportRequest) GetCategoryIdsOk() (*[]int64, bool)`

GetCategoryIdsOk returns a tuple with the CategoryIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryIds

`func (o *GeneratePricesReportRequest) SetCategoryIds(v []int64)`

SetCategoryIds sets CategoryIds field to given value.

### HasCategoryIds

`func (o *GeneratePricesReportRequest) HasCategoryIds() bool`

HasCategoryIds returns a boolean if a field has been set.

### SetCategoryIdsNil

`func (o *GeneratePricesReportRequest) SetCategoryIdsNil(b bool)`

 SetCategoryIdsNil sets the value for CategoryIds to be an explicit nil

### UnsetCategoryIds
`func (o *GeneratePricesReportRequest) UnsetCategoryIds()`

UnsetCategoryIds ensures that no value is present for CategoryIds, not even an explicit nil
### GetCreationDateFrom

`func (o *GeneratePricesReportRequest) GetCreationDateFrom() string`

GetCreationDateFrom returns the CreationDateFrom field if non-nil, zero value otherwise.

### GetCreationDateFromOk

`func (o *GeneratePricesReportRequest) GetCreationDateFromOk() (*string, bool)`

GetCreationDateFromOk returns a tuple with the CreationDateFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreationDateFrom

`func (o *GeneratePricesReportRequest) SetCreationDateFrom(v string)`

SetCreationDateFrom sets CreationDateFrom field to given value.

### HasCreationDateFrom

`func (o *GeneratePricesReportRequest) HasCreationDateFrom() bool`

HasCreationDateFrom returns a boolean if a field has been set.

### GetCreationDateTo

`func (o *GeneratePricesReportRequest) GetCreationDateTo() string`

GetCreationDateTo returns the CreationDateTo field if non-nil, zero value otherwise.

### GetCreationDateToOk

`func (o *GeneratePricesReportRequest) GetCreationDateToOk() (*string, bool)`

GetCreationDateToOk returns a tuple with the CreationDateTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreationDateTo

`func (o *GeneratePricesReportRequest) SetCreationDateTo(v string)`

SetCreationDateTo sets CreationDateTo field to given value.

### HasCreationDateTo

`func (o *GeneratePricesReportRequest) HasCreationDateTo() bool`

HasCreationDateTo returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


