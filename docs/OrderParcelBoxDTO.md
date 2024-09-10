# OrderParcelBoxDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор грузоместа. | [optional] 
**FulfilmentId** | Pointer to **string** | Идентификатор грузового места в информационной системе магазина. | [optional] 

## Methods

### NewOrderParcelBoxDTO

`func NewOrderParcelBoxDTO() *OrderParcelBoxDTO`

NewOrderParcelBoxDTO instantiates a new OrderParcelBoxDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderParcelBoxDTOWithDefaults

`func NewOrderParcelBoxDTOWithDefaults() *OrderParcelBoxDTO`

NewOrderParcelBoxDTOWithDefaults instantiates a new OrderParcelBoxDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OrderParcelBoxDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OrderParcelBoxDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OrderParcelBoxDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *OrderParcelBoxDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetFulfilmentId

`func (o *OrderParcelBoxDTO) GetFulfilmentId() string`

GetFulfilmentId returns the FulfilmentId field if non-nil, zero value otherwise.

### GetFulfilmentIdOk

`func (o *OrderParcelBoxDTO) GetFulfilmentIdOk() (*string, bool)`

GetFulfilmentIdOk returns a tuple with the FulfilmentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFulfilmentId

`func (o *OrderParcelBoxDTO) SetFulfilmentId(v string)`

SetFulfilmentId sets FulfilmentId field to given value.

### HasFulfilmentId

`func (o *OrderParcelBoxDTO) HasFulfilmentId() bool`

HasFulfilmentId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


