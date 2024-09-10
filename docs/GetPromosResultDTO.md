# GetPromosResultDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Promos** | [**[]GetPromoDTO**](GetPromoDTO.md) | Акции Маркета. | 

## Methods

### NewGetPromosResultDTO

`func NewGetPromosResultDTO(promos []GetPromoDTO, ) *GetPromosResultDTO`

NewGetPromosResultDTO instantiates a new GetPromosResultDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPromosResultDTOWithDefaults

`func NewGetPromosResultDTOWithDefaults() *GetPromosResultDTO`

NewGetPromosResultDTOWithDefaults instantiates a new GetPromosResultDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPromos

`func (o *GetPromosResultDTO) GetPromos() []GetPromoDTO`

GetPromos returns the Promos field if non-nil, zero value otherwise.

### GetPromosOk

`func (o *GetPromosResultDTO) GetPromosOk() (*[]GetPromoDTO, bool)`

GetPromosOk returns a tuple with the Promos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromos

`func (o *GetPromosResultDTO) SetPromos(v []GetPromoDTO)`

SetPromos sets Promos field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


