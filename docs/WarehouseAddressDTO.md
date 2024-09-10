# WarehouseAddressDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**City** | **string** | Город. | 
**Street** | Pointer to **string** | Улица. | [optional] 
**Number** | Pointer to **string** | Номер дома. | [optional] 
**Building** | Pointer to **string** | Номер строения. | [optional] 
**Block** | Pointer to **string** | Номер корпуса. | [optional] 
**Gps** | [**GpsDTO**](GpsDTO.md) |  | 

## Methods

### NewWarehouseAddressDTO

`func NewWarehouseAddressDTO(city string, gps GpsDTO, ) *WarehouseAddressDTO`

NewWarehouseAddressDTO instantiates a new WarehouseAddressDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewWarehouseAddressDTOWithDefaults

`func NewWarehouseAddressDTOWithDefaults() *WarehouseAddressDTO`

NewWarehouseAddressDTOWithDefaults instantiates a new WarehouseAddressDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCity

`func (o *WarehouseAddressDTO) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *WarehouseAddressDTO) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *WarehouseAddressDTO) SetCity(v string)`

SetCity sets City field to given value.


### GetStreet

`func (o *WarehouseAddressDTO) GetStreet() string`

GetStreet returns the Street field if non-nil, zero value otherwise.

### GetStreetOk

`func (o *WarehouseAddressDTO) GetStreetOk() (*string, bool)`

GetStreetOk returns a tuple with the Street field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreet

`func (o *WarehouseAddressDTO) SetStreet(v string)`

SetStreet sets Street field to given value.

### HasStreet

`func (o *WarehouseAddressDTO) HasStreet() bool`

HasStreet returns a boolean if a field has been set.

### GetNumber

`func (o *WarehouseAddressDTO) GetNumber() string`

GetNumber returns the Number field if non-nil, zero value otherwise.

### GetNumberOk

`func (o *WarehouseAddressDTO) GetNumberOk() (*string, bool)`

GetNumberOk returns a tuple with the Number field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumber

`func (o *WarehouseAddressDTO) SetNumber(v string)`

SetNumber sets Number field to given value.

### HasNumber

`func (o *WarehouseAddressDTO) HasNumber() bool`

HasNumber returns a boolean if a field has been set.

### GetBuilding

`func (o *WarehouseAddressDTO) GetBuilding() string`

GetBuilding returns the Building field if non-nil, zero value otherwise.

### GetBuildingOk

`func (o *WarehouseAddressDTO) GetBuildingOk() (*string, bool)`

GetBuildingOk returns a tuple with the Building field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuilding

`func (o *WarehouseAddressDTO) SetBuilding(v string)`

SetBuilding sets Building field to given value.

### HasBuilding

`func (o *WarehouseAddressDTO) HasBuilding() bool`

HasBuilding returns a boolean if a field has been set.

### GetBlock

`func (o *WarehouseAddressDTO) GetBlock() string`

GetBlock returns the Block field if non-nil, zero value otherwise.

### GetBlockOk

`func (o *WarehouseAddressDTO) GetBlockOk() (*string, bool)`

GetBlockOk returns a tuple with the Block field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlock

`func (o *WarehouseAddressDTO) SetBlock(v string)`

SetBlock sets Block field to given value.

### HasBlock

`func (o *WarehouseAddressDTO) HasBlock() bool`

HasBlock returns a boolean if a field has been set.

### GetGps

`func (o *WarehouseAddressDTO) GetGps() GpsDTO`

GetGps returns the Gps field if non-nil, zero value otherwise.

### GetGpsOk

`func (o *WarehouseAddressDTO) GetGpsOk() (*GpsDTO, bool)`

GetGpsOk returns a tuple with the Gps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGps

`func (o *WarehouseAddressDTO) SetGps(v GpsDTO)`

SetGps sets Gps field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


