# OrderCourierDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FullName** | Pointer to **string** | Полное имя курьера. | [optional] 
**Phone** | Pointer to **string** | Номер телефона курьера. | [optional] 
**PhoneExtension** | Pointer to **string** | Добавочный номер телефона. | [optional] 
**VehicleNumber** | Pointer to **string** | Номер транспортного средства. | [optional] 
**VehicleDescription** | Pointer to **string** | Описание машины. Например, модель и цвет. | [optional] 

## Methods

### NewOrderCourierDTO

`func NewOrderCourierDTO() *OrderCourierDTO`

NewOrderCourierDTO instantiates a new OrderCourierDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderCourierDTOWithDefaults

`func NewOrderCourierDTOWithDefaults() *OrderCourierDTO`

NewOrderCourierDTOWithDefaults instantiates a new OrderCourierDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFullName

`func (o *OrderCourierDTO) GetFullName() string`

GetFullName returns the FullName field if non-nil, zero value otherwise.

### GetFullNameOk

`func (o *OrderCourierDTO) GetFullNameOk() (*string, bool)`

GetFullNameOk returns a tuple with the FullName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullName

`func (o *OrderCourierDTO) SetFullName(v string)`

SetFullName sets FullName field to given value.

### HasFullName

`func (o *OrderCourierDTO) HasFullName() bool`

HasFullName returns a boolean if a field has been set.

### GetPhone

`func (o *OrderCourierDTO) GetPhone() string`

GetPhone returns the Phone field if non-nil, zero value otherwise.

### GetPhoneOk

`func (o *OrderCourierDTO) GetPhoneOk() (*string, bool)`

GetPhoneOk returns a tuple with the Phone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhone

`func (o *OrderCourierDTO) SetPhone(v string)`

SetPhone sets Phone field to given value.

### HasPhone

`func (o *OrderCourierDTO) HasPhone() bool`

HasPhone returns a boolean if a field has been set.

### GetPhoneExtension

`func (o *OrderCourierDTO) GetPhoneExtension() string`

GetPhoneExtension returns the PhoneExtension field if non-nil, zero value otherwise.

### GetPhoneExtensionOk

`func (o *OrderCourierDTO) GetPhoneExtensionOk() (*string, bool)`

GetPhoneExtensionOk returns a tuple with the PhoneExtension field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhoneExtension

`func (o *OrderCourierDTO) SetPhoneExtension(v string)`

SetPhoneExtension sets PhoneExtension field to given value.

### HasPhoneExtension

`func (o *OrderCourierDTO) HasPhoneExtension() bool`

HasPhoneExtension returns a boolean if a field has been set.

### GetVehicleNumber

`func (o *OrderCourierDTO) GetVehicleNumber() string`

GetVehicleNumber returns the VehicleNumber field if non-nil, zero value otherwise.

### GetVehicleNumberOk

`func (o *OrderCourierDTO) GetVehicleNumberOk() (*string, bool)`

GetVehicleNumberOk returns a tuple with the VehicleNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVehicleNumber

`func (o *OrderCourierDTO) SetVehicleNumber(v string)`

SetVehicleNumber sets VehicleNumber field to given value.

### HasVehicleNumber

`func (o *OrderCourierDTO) HasVehicleNumber() bool`

HasVehicleNumber returns a boolean if a field has been set.

### GetVehicleDescription

`func (o *OrderCourierDTO) GetVehicleDescription() string`

GetVehicleDescription returns the VehicleDescription field if non-nil, zero value otherwise.

### GetVehicleDescriptionOk

`func (o *OrderCourierDTO) GetVehicleDescriptionOk() (*string, bool)`

GetVehicleDescriptionOk returns a tuple with the VehicleDescription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVehicleDescription

`func (o *OrderCourierDTO) SetVehicleDescription(v string)`

SetVehicleDescription sets VehicleDescription field to given value.

### HasVehicleDescription

`func (o *OrderCourierDTO) HasVehicleDescription() bool`

HasVehicleDescription returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


