# GenerateShipmentListDocumentReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignId** | **int64** | Идентификатор кампании. | 
**ShipmentId** | Pointer to **int64** | Идентификатор отгрузки. | [optional] 
**OrderIds** | Pointer to **[]int64** | Фильтр по идентификаторам заказа в отгрузке. | [optional] 

## Methods

### NewGenerateShipmentListDocumentReportRequest

`func NewGenerateShipmentListDocumentReportRequest(campaignId int64, ) *GenerateShipmentListDocumentReportRequest`

NewGenerateShipmentListDocumentReportRequest instantiates a new GenerateShipmentListDocumentReportRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenerateShipmentListDocumentReportRequestWithDefaults

`func NewGenerateShipmentListDocumentReportRequestWithDefaults() *GenerateShipmentListDocumentReportRequest`

NewGenerateShipmentListDocumentReportRequestWithDefaults instantiates a new GenerateShipmentListDocumentReportRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCampaignId

`func (o *GenerateShipmentListDocumentReportRequest) GetCampaignId() int64`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *GenerateShipmentListDocumentReportRequest) GetCampaignIdOk() (*int64, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *GenerateShipmentListDocumentReportRequest) SetCampaignId(v int64)`

SetCampaignId sets CampaignId field to given value.


### GetShipmentId

`func (o *GenerateShipmentListDocumentReportRequest) GetShipmentId() int64`

GetShipmentId returns the ShipmentId field if non-nil, zero value otherwise.

### GetShipmentIdOk

`func (o *GenerateShipmentListDocumentReportRequest) GetShipmentIdOk() (*int64, bool)`

GetShipmentIdOk returns a tuple with the ShipmentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShipmentId

`func (o *GenerateShipmentListDocumentReportRequest) SetShipmentId(v int64)`

SetShipmentId sets ShipmentId field to given value.

### HasShipmentId

`func (o *GenerateShipmentListDocumentReportRequest) HasShipmentId() bool`

HasShipmentId returns a boolean if a field has been set.

### GetOrderIds

`func (o *GenerateShipmentListDocumentReportRequest) GetOrderIds() []int64`

GetOrderIds returns the OrderIds field if non-nil, zero value otherwise.

### GetOrderIdsOk

`func (o *GenerateShipmentListDocumentReportRequest) GetOrderIdsOk() (*[]int64, bool)`

GetOrderIdsOk returns a tuple with the OrderIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderIds

`func (o *GenerateShipmentListDocumentReportRequest) SetOrderIds(v []int64)`

SetOrderIds sets OrderIds field to given value.

### HasOrderIds

`func (o *GenerateShipmentListDocumentReportRequest) HasOrderIds() bool`

HasOrderIds returns a boolean if a field has been set.

### SetOrderIdsNil

`func (o *GenerateShipmentListDocumentReportRequest) SetOrderIdsNil(b bool)`

 SetOrderIdsNil sets the value for OrderIds to be an explicit nil

### UnsetOrderIds
`func (o *GenerateShipmentListDocumentReportRequest) UnsetOrderIds()`

UnsetOrderIds ensures that no value is present for OrderIds, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


