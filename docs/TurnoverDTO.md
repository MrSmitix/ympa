# TurnoverDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Turnover** | [**TurnoverType**](TurnoverType.md) |  | 
**TurnoverDays** | Pointer to **float64** | Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html) | [optional] 

## Methods

### NewTurnoverDTO

`func NewTurnoverDTO(turnover TurnoverType, ) *TurnoverDTO`

NewTurnoverDTO instantiates a new TurnoverDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTurnoverDTOWithDefaults

`func NewTurnoverDTOWithDefaults() *TurnoverDTO`

NewTurnoverDTOWithDefaults instantiates a new TurnoverDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTurnover

`func (o *TurnoverDTO) GetTurnover() TurnoverType`

GetTurnover returns the Turnover field if non-nil, zero value otherwise.

### GetTurnoverOk

`func (o *TurnoverDTO) GetTurnoverOk() (*TurnoverType, bool)`

GetTurnoverOk returns a tuple with the Turnover field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTurnover

`func (o *TurnoverDTO) SetTurnover(v TurnoverType)`

SetTurnover sets Turnover field to given value.


### GetTurnoverDays

`func (o *TurnoverDTO) GetTurnoverDays() float64`

GetTurnoverDays returns the TurnoverDays field if non-nil, zero value otherwise.

### GetTurnoverDaysOk

`func (o *TurnoverDTO) GetTurnoverDaysOk() (*float64, bool)`

GetTurnoverDaysOk returns a tuple with the TurnoverDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTurnoverDays

`func (o *TurnoverDTO) SetTurnoverDays(v float64)`

SetTurnoverDays sets TurnoverDays field to given value.

### HasTurnoverDays

`func (o *TurnoverDTO) HasTurnoverDays() bool`

HasTurnoverDays returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


