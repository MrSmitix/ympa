# WarehouseDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** | Идентификатор склада. | 
**Name** | **string** | Название склада. | 
**CampaignId** | **int64** | Идентификатор кампании в API и идентификатор магазина. | 
**Express** | **bool** | Возможна ли доставка по модели Экспресс. | 
**Address** | Pointer to [**WarehouseAddressDTO**](WarehouseAddressDTO.md) |  | [optional] 

## Methods

### NewWarehouseDTO

`func NewWarehouseDTO(id int64, name string, campaignId int64, express bool, ) *WarehouseDTO`

NewWarehouseDTO instantiates a new WarehouseDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewWarehouseDTOWithDefaults

`func NewWarehouseDTOWithDefaults() *WarehouseDTO`

NewWarehouseDTOWithDefaults instantiates a new WarehouseDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *WarehouseDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *WarehouseDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *WarehouseDTO) SetId(v int64)`

SetId sets Id field to given value.


### GetName

`func (o *WarehouseDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *WarehouseDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *WarehouseDTO) SetName(v string)`

SetName sets Name field to given value.


### GetCampaignId

`func (o *WarehouseDTO) GetCampaignId() int64`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *WarehouseDTO) GetCampaignIdOk() (*int64, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *WarehouseDTO) SetCampaignId(v int64)`

SetCampaignId sets CampaignId field to given value.


### GetExpress

`func (o *WarehouseDTO) GetExpress() bool`

GetExpress returns the Express field if non-nil, zero value otherwise.

### GetExpressOk

`func (o *WarehouseDTO) GetExpressOk() (*bool, bool)`

GetExpressOk returns a tuple with the Express field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpress

`func (o *WarehouseDTO) SetExpress(v bool)`

SetExpress sets Express field to given value.


### GetAddress

`func (o *WarehouseDTO) GetAddress() WarehouseAddressDTO`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *WarehouseDTO) GetAddressOk() (*WarehouseAddressDTO, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *WarehouseDTO) SetAddress(v WarehouseAddressDTO)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *WarehouseDTO) HasAddress() bool`

HasAddress returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


