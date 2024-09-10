# GenerateShowsSalesReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | Pointer to **int64** | Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] 
**CampaignId** | Pointer to **int64** | Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] 
**DateFrom** | **string** | Начало периода, включительно. | 
**DateTo** | **string** | Конец периода, включительно. | 
**Grouping** | [**ShowsSalesGroupingType**](ShowsSalesGroupingType.md) |  | 

## Methods

### NewGenerateShowsSalesReportRequest

`func NewGenerateShowsSalesReportRequest(dateFrom string, dateTo string, grouping ShowsSalesGroupingType, ) *GenerateShowsSalesReportRequest`

NewGenerateShowsSalesReportRequest instantiates a new GenerateShowsSalesReportRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenerateShowsSalesReportRequestWithDefaults

`func NewGenerateShowsSalesReportRequestWithDefaults() *GenerateShowsSalesReportRequest`

NewGenerateShowsSalesReportRequestWithDefaults instantiates a new GenerateShowsSalesReportRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBusinessId

`func (o *GenerateShowsSalesReportRequest) GetBusinessId() int64`

GetBusinessId returns the BusinessId field if non-nil, zero value otherwise.

### GetBusinessIdOk

`func (o *GenerateShowsSalesReportRequest) GetBusinessIdOk() (*int64, bool)`

GetBusinessIdOk returns a tuple with the BusinessId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessId

`func (o *GenerateShowsSalesReportRequest) SetBusinessId(v int64)`

SetBusinessId sets BusinessId field to given value.

### HasBusinessId

`func (o *GenerateShowsSalesReportRequest) HasBusinessId() bool`

HasBusinessId returns a boolean if a field has been set.

### GetCampaignId

`func (o *GenerateShowsSalesReportRequest) GetCampaignId() int64`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *GenerateShowsSalesReportRequest) GetCampaignIdOk() (*int64, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *GenerateShowsSalesReportRequest) SetCampaignId(v int64)`

SetCampaignId sets CampaignId field to given value.

### HasCampaignId

`func (o *GenerateShowsSalesReportRequest) HasCampaignId() bool`

HasCampaignId returns a boolean if a field has been set.

### GetDateFrom

`func (o *GenerateShowsSalesReportRequest) GetDateFrom() string`

GetDateFrom returns the DateFrom field if non-nil, zero value otherwise.

### GetDateFromOk

`func (o *GenerateShowsSalesReportRequest) GetDateFromOk() (*string, bool)`

GetDateFromOk returns a tuple with the DateFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateFrom

`func (o *GenerateShowsSalesReportRequest) SetDateFrom(v string)`

SetDateFrom sets DateFrom field to given value.


### GetDateTo

`func (o *GenerateShowsSalesReportRequest) GetDateTo() string`

GetDateTo returns the DateTo field if non-nil, zero value otherwise.

### GetDateToOk

`func (o *GenerateShowsSalesReportRequest) GetDateToOk() (*string, bool)`

GetDateToOk returns a tuple with the DateTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateTo

`func (o *GenerateShowsSalesReportRequest) SetDateTo(v string)`

SetDateTo sets DateTo field to given value.


### GetGrouping

`func (o *GenerateShowsSalesReportRequest) GetGrouping() ShowsSalesGroupingType`

GetGrouping returns the Grouping field if non-nil, zero value otherwise.

### GetGroupingOk

`func (o *GenerateShowsSalesReportRequest) GetGroupingOk() (*ShowsSalesGroupingType, bool)`

GetGroupingOk returns a tuple with the Grouping field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrouping

`func (o *GenerateShowsSalesReportRequest) SetGrouping(v ShowsSalesGroupingType)`

SetGrouping sets Grouping field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


