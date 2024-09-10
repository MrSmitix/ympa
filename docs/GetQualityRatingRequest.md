# GetQualityRatingRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateFrom** | Pointer to **string** | Начало периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть раньше 30 дней от текущей даты.  | [optional] 
**DateTo** | Pointer to **string** | Конец периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть позже текущей даты.  | [optional] 
**CampaignIds** | **[]int64** | Список идентификаторов магазинов. | 

## Methods

### NewGetQualityRatingRequest

`func NewGetQualityRatingRequest(campaignIds []int64, ) *GetQualityRatingRequest`

NewGetQualityRatingRequest instantiates a new GetQualityRatingRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetQualityRatingRequestWithDefaults

`func NewGetQualityRatingRequestWithDefaults() *GetQualityRatingRequest`

NewGetQualityRatingRequestWithDefaults instantiates a new GetQualityRatingRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDateFrom

`func (o *GetQualityRatingRequest) GetDateFrom() string`

GetDateFrom returns the DateFrom field if non-nil, zero value otherwise.

### GetDateFromOk

`func (o *GetQualityRatingRequest) GetDateFromOk() (*string, bool)`

GetDateFromOk returns a tuple with the DateFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateFrom

`func (o *GetQualityRatingRequest) SetDateFrom(v string)`

SetDateFrom sets DateFrom field to given value.

### HasDateFrom

`func (o *GetQualityRatingRequest) HasDateFrom() bool`

HasDateFrom returns a boolean if a field has been set.

### GetDateTo

`func (o *GetQualityRatingRequest) GetDateTo() string`

GetDateTo returns the DateTo field if non-nil, zero value otherwise.

### GetDateToOk

`func (o *GetQualityRatingRequest) GetDateToOk() (*string, bool)`

GetDateToOk returns a tuple with the DateTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateTo

`func (o *GetQualityRatingRequest) SetDateTo(v string)`

SetDateTo sets DateTo field to given value.

### HasDateTo

`func (o *GetQualityRatingRequest) HasDateTo() bool`

HasDateTo returns a boolean if a field has been set.

### GetCampaignIds

`func (o *GetQualityRatingRequest) GetCampaignIds() []int64`

GetCampaignIds returns the CampaignIds field if non-nil, zero value otherwise.

### GetCampaignIdsOk

`func (o *GetQualityRatingRequest) GetCampaignIdsOk() (*[]int64, bool)`

GetCampaignIdsOk returns a tuple with the CampaignIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignIds

`func (o *GetQualityRatingRequest) SetCampaignIds(v []int64)`

SetCampaignIds sets CampaignIds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


