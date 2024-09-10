# FulfillmentWarehouseDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** | Идентификатор склада. | 
**Name** | **string** | Название склада. | 
**Address** | Pointer to [**WarehouseAddressDTO**](WarehouseAddressDTO.md) |  | [optional] 

## Methods

### NewFulfillmentWarehouseDTO

`func NewFulfillmentWarehouseDTO(id int64, name string, ) *FulfillmentWarehouseDTO`

NewFulfillmentWarehouseDTO instantiates a new FulfillmentWarehouseDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFulfillmentWarehouseDTOWithDefaults

`func NewFulfillmentWarehouseDTOWithDefaults() *FulfillmentWarehouseDTO`

NewFulfillmentWarehouseDTOWithDefaults instantiates a new FulfillmentWarehouseDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *FulfillmentWarehouseDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *FulfillmentWarehouseDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *FulfillmentWarehouseDTO) SetId(v int64)`

SetId sets Id field to given value.


### GetName

`func (o *FulfillmentWarehouseDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *FulfillmentWarehouseDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *FulfillmentWarehouseDTO) SetName(v string)`

SetName sets Name field to given value.


### GetAddress

`func (o *FulfillmentWarehouseDTO) GetAddress() WarehouseAddressDTO`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *FulfillmentWarehouseDTO) GetAddressOk() (*WarehouseAddressDTO, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *FulfillmentWarehouseDTO) SetAddress(v WarehouseAddressDTO)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *FulfillmentWarehouseDTO) HasAddress() bool`

HasAddress returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


