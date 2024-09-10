# LogisticPickupPointDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор пункта вывоза. | [optional] 
**Name** | Pointer to **string** | Название пункта вывоза. | [optional] 
**Address** | Pointer to [**PickupAddressDTO**](PickupAddressDTO.md) |  | [optional] 
**Instruction** | Pointer to **string** | Дополнительные инструкции к вывозу. | [optional] 
**Type** | Pointer to [**LogisticPointType**](LogisticPointType.md) |  | [optional] 
**LogisticPartnerId** | Pointer to **int64** | Идентификатор логистического партнера, к которому относится логистическая точка. | [optional] 

## Methods

### NewLogisticPickupPointDTO

`func NewLogisticPickupPointDTO() *LogisticPickupPointDTO`

NewLogisticPickupPointDTO instantiates a new LogisticPickupPointDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLogisticPickupPointDTOWithDefaults

`func NewLogisticPickupPointDTOWithDefaults() *LogisticPickupPointDTO`

NewLogisticPickupPointDTOWithDefaults instantiates a new LogisticPickupPointDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *LogisticPickupPointDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *LogisticPickupPointDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *LogisticPickupPointDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *LogisticPickupPointDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *LogisticPickupPointDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *LogisticPickupPointDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *LogisticPickupPointDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *LogisticPickupPointDTO) HasName() bool`

HasName returns a boolean if a field has been set.

### GetAddress

`func (o *LogisticPickupPointDTO) GetAddress() PickupAddressDTO`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *LogisticPickupPointDTO) GetAddressOk() (*PickupAddressDTO, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *LogisticPickupPointDTO) SetAddress(v PickupAddressDTO)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *LogisticPickupPointDTO) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetInstruction

`func (o *LogisticPickupPointDTO) GetInstruction() string`

GetInstruction returns the Instruction field if non-nil, zero value otherwise.

### GetInstructionOk

`func (o *LogisticPickupPointDTO) GetInstructionOk() (*string, bool)`

GetInstructionOk returns a tuple with the Instruction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstruction

`func (o *LogisticPickupPointDTO) SetInstruction(v string)`

SetInstruction sets Instruction field to given value.

### HasInstruction

`func (o *LogisticPickupPointDTO) HasInstruction() bool`

HasInstruction returns a boolean if a field has been set.

### GetType

`func (o *LogisticPickupPointDTO) GetType() LogisticPointType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *LogisticPickupPointDTO) GetTypeOk() (*LogisticPointType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *LogisticPickupPointDTO) SetType(v LogisticPointType)`

SetType sets Type field to given value.

### HasType

`func (o *LogisticPickupPointDTO) HasType() bool`

HasType returns a boolean if a field has been set.

### GetLogisticPartnerId

`func (o *LogisticPickupPointDTO) GetLogisticPartnerId() int64`

GetLogisticPartnerId returns the LogisticPartnerId field if non-nil, zero value otherwise.

### GetLogisticPartnerIdOk

`func (o *LogisticPickupPointDTO) GetLogisticPartnerIdOk() (*int64, bool)`

GetLogisticPartnerIdOk returns a tuple with the LogisticPartnerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogisticPartnerId

`func (o *LogisticPickupPointDTO) SetLogisticPartnerId(v int64)`

SetLogisticPartnerId sets LogisticPartnerId field to given value.

### HasLogisticPartnerId

`func (o *LogisticPickupPointDTO) HasLogisticPartnerId() bool`

HasLogisticPartnerId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


