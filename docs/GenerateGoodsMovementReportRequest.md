# GenerateGoodsMovementReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignId** | **int64** | Идентификатор кампании. | 
**DateFrom** | **string** | Начало периода, включительно. | 
**DateTo** | **string** | Конец периода, включительно. | 
**ShopSku** | Pointer to **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 

## Methods

### NewGenerateGoodsMovementReportRequest

`func NewGenerateGoodsMovementReportRequest(campaignId int64, dateFrom string, dateTo string, ) *GenerateGoodsMovementReportRequest`

NewGenerateGoodsMovementReportRequest instantiates a new GenerateGoodsMovementReportRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenerateGoodsMovementReportRequestWithDefaults

`func NewGenerateGoodsMovementReportRequestWithDefaults() *GenerateGoodsMovementReportRequest`

NewGenerateGoodsMovementReportRequestWithDefaults instantiates a new GenerateGoodsMovementReportRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCampaignId

`func (o *GenerateGoodsMovementReportRequest) GetCampaignId() int64`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *GenerateGoodsMovementReportRequest) GetCampaignIdOk() (*int64, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *GenerateGoodsMovementReportRequest) SetCampaignId(v int64)`

SetCampaignId sets CampaignId field to given value.


### GetDateFrom

`func (o *GenerateGoodsMovementReportRequest) GetDateFrom() string`

GetDateFrom returns the DateFrom field if non-nil, zero value otherwise.

### GetDateFromOk

`func (o *GenerateGoodsMovementReportRequest) GetDateFromOk() (*string, bool)`

GetDateFromOk returns a tuple with the DateFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateFrom

`func (o *GenerateGoodsMovementReportRequest) SetDateFrom(v string)`

SetDateFrom sets DateFrom field to given value.


### GetDateTo

`func (o *GenerateGoodsMovementReportRequest) GetDateTo() string`

GetDateTo returns the DateTo field if non-nil, zero value otherwise.

### GetDateToOk

`func (o *GenerateGoodsMovementReportRequest) GetDateToOk() (*string, bool)`

GetDateToOk returns a tuple with the DateTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateTo

`func (o *GenerateGoodsMovementReportRequest) SetDateTo(v string)`

SetDateTo sets DateTo field to given value.


### GetShopSku

`func (o *GenerateGoodsMovementReportRequest) GetShopSku() string`

GetShopSku returns the ShopSku field if non-nil, zero value otherwise.

### GetShopSkuOk

`func (o *GenerateGoodsMovementReportRequest) GetShopSkuOk() (*string, bool)`

GetShopSkuOk returns a tuple with the ShopSku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopSku

`func (o *GenerateGoodsMovementReportRequest) SetShopSku(v string)`

SetShopSku sets ShopSku field to given value.

### HasShopSku

`func (o *GenerateGoodsMovementReportRequest) HasShopSku() bool`

HasShopSku returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


