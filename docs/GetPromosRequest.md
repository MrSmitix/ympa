# GetPromosRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Participation** | Pointer to [**PromoParticipationType**](PromoParticipationType.md) |  | [optional] 
**Mechanics** | Pointer to [**MechanicsType**](MechanicsType.md) |  | [optional] 

## Methods

### NewGetPromosRequest

`func NewGetPromosRequest() *GetPromosRequest`

NewGetPromosRequest instantiates a new GetPromosRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPromosRequestWithDefaults

`func NewGetPromosRequestWithDefaults() *GetPromosRequest`

NewGetPromosRequestWithDefaults instantiates a new GetPromosRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetParticipation

`func (o *GetPromosRequest) GetParticipation() PromoParticipationType`

GetParticipation returns the Participation field if non-nil, zero value otherwise.

### GetParticipationOk

`func (o *GetPromosRequest) GetParticipationOk() (*PromoParticipationType, bool)`

GetParticipationOk returns a tuple with the Participation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParticipation

`func (o *GetPromosRequest) SetParticipation(v PromoParticipationType)`

SetParticipation sets Participation field to given value.

### HasParticipation

`func (o *GetPromosRequest) HasParticipation() bool`

HasParticipation returns a boolean if a field has been set.

### GetMechanics

`func (o *GetPromosRequest) GetMechanics() MechanicsType`

GetMechanics returns the Mechanics field if non-nil, zero value otherwise.

### GetMechanicsOk

`func (o *GetPromosRequest) GetMechanicsOk() (*MechanicsType, bool)`

GetMechanicsOk returns a tuple with the Mechanics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMechanics

`func (o *GetPromosRequest) SetMechanics(v MechanicsType)`

SetMechanics sets Mechanics field to given value.

### HasMechanics

`func (o *GetPromosRequest) HasMechanics() bool`

HasMechanics returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


