# GenerateUnitedOrdersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | **int64** | Идентификатор бизнеса. | 
**DateFrom** | **string** | Начало периода, включительно. | 
**DateTo** | **string** | Конец периода, включительно. Максимальный период — 1 год. | 
**CampaignIds** | Pointer to **[]int64** | Список магазинов, которые нужны в отчете. | [optional] 
**PromoId** | Pointer to **string** | Идентификатор акции, товары из которой нужны в отчете. | [optional] 

## Methods

### NewGenerateUnitedOrdersRequest

`func NewGenerateUnitedOrdersRequest(businessId int64, dateFrom string, dateTo string, ) *GenerateUnitedOrdersRequest`

NewGenerateUnitedOrdersRequest instantiates a new GenerateUnitedOrdersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenerateUnitedOrdersRequestWithDefaults

`func NewGenerateUnitedOrdersRequestWithDefaults() *GenerateUnitedOrdersRequest`

NewGenerateUnitedOrdersRequestWithDefaults instantiates a new GenerateUnitedOrdersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBusinessId

`func (o *GenerateUnitedOrdersRequest) GetBusinessId() int64`

GetBusinessId returns the BusinessId field if non-nil, zero value otherwise.

### GetBusinessIdOk

`func (o *GenerateUnitedOrdersRequest) GetBusinessIdOk() (*int64, bool)`

GetBusinessIdOk returns a tuple with the BusinessId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessId

`func (o *GenerateUnitedOrdersRequest) SetBusinessId(v int64)`

SetBusinessId sets BusinessId field to given value.


### GetDateFrom

`func (o *GenerateUnitedOrdersRequest) GetDateFrom() string`

GetDateFrom returns the DateFrom field if non-nil, zero value otherwise.

### GetDateFromOk

`func (o *GenerateUnitedOrdersRequest) GetDateFromOk() (*string, bool)`

GetDateFromOk returns a tuple with the DateFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateFrom

`func (o *GenerateUnitedOrdersRequest) SetDateFrom(v string)`

SetDateFrom sets DateFrom field to given value.


### GetDateTo

`func (o *GenerateUnitedOrdersRequest) GetDateTo() string`

GetDateTo returns the DateTo field if non-nil, zero value otherwise.

### GetDateToOk

`func (o *GenerateUnitedOrdersRequest) GetDateToOk() (*string, bool)`

GetDateToOk returns a tuple with the DateTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateTo

`func (o *GenerateUnitedOrdersRequest) SetDateTo(v string)`

SetDateTo sets DateTo field to given value.


### GetCampaignIds

`func (o *GenerateUnitedOrdersRequest) GetCampaignIds() []int64`

GetCampaignIds returns the CampaignIds field if non-nil, zero value otherwise.

### GetCampaignIdsOk

`func (o *GenerateUnitedOrdersRequest) GetCampaignIdsOk() (*[]int64, bool)`

GetCampaignIdsOk returns a tuple with the CampaignIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignIds

`func (o *GenerateUnitedOrdersRequest) SetCampaignIds(v []int64)`

SetCampaignIds sets CampaignIds field to given value.

### HasCampaignIds

`func (o *GenerateUnitedOrdersRequest) HasCampaignIds() bool`

HasCampaignIds returns a boolean if a field has been set.

### SetCampaignIdsNil

`func (o *GenerateUnitedOrdersRequest) SetCampaignIdsNil(b bool)`

 SetCampaignIdsNil sets the value for CampaignIds to be an explicit nil

### UnsetCampaignIds
`func (o *GenerateUnitedOrdersRequest) UnsetCampaignIds()`

UnsetCampaignIds ensures that no value is present for CampaignIds, not even an explicit nil
### GetPromoId

`func (o *GenerateUnitedOrdersRequest) GetPromoId() string`

GetPromoId returns the PromoId field if non-nil, zero value otherwise.

### GetPromoIdOk

`func (o *GenerateUnitedOrdersRequest) GetPromoIdOk() (*string, bool)`

GetPromoIdOk returns a tuple with the PromoId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromoId

`func (o *GenerateUnitedOrdersRequest) SetPromoId(v string)`

SetPromoId sets PromoId field to given value.

### HasPromoId

`func (o *GenerateUnitedOrdersRequest) HasPromoId() bool`

HasPromoId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


