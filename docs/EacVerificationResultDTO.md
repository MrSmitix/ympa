# EacVerificationResultDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VerificationResult** | Pointer to [**EacVerificationStatusType**](EacVerificationStatusType.md) |  | [optional] 
**AttemptsLeft** | Pointer to **int32** | Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится.  | [optional] 

## Methods

### NewEacVerificationResultDTO

`func NewEacVerificationResultDTO() *EacVerificationResultDTO`

NewEacVerificationResultDTO instantiates a new EacVerificationResultDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEacVerificationResultDTOWithDefaults

`func NewEacVerificationResultDTOWithDefaults() *EacVerificationResultDTO`

NewEacVerificationResultDTOWithDefaults instantiates a new EacVerificationResultDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetVerificationResult

`func (o *EacVerificationResultDTO) GetVerificationResult() EacVerificationStatusType`

GetVerificationResult returns the VerificationResult field if non-nil, zero value otherwise.

### GetVerificationResultOk

`func (o *EacVerificationResultDTO) GetVerificationResultOk() (*EacVerificationStatusType, bool)`

GetVerificationResultOk returns a tuple with the VerificationResult field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVerificationResult

`func (o *EacVerificationResultDTO) SetVerificationResult(v EacVerificationStatusType)`

SetVerificationResult sets VerificationResult field to given value.

### HasVerificationResult

`func (o *EacVerificationResultDTO) HasVerificationResult() bool`

HasVerificationResult returns a boolean if a field has been set.

### GetAttemptsLeft

`func (o *EacVerificationResultDTO) GetAttemptsLeft() int32`

GetAttemptsLeft returns the AttemptsLeft field if non-nil, zero value otherwise.

### GetAttemptsLeftOk

`func (o *EacVerificationResultDTO) GetAttemptsLeftOk() (*int32, bool)`

GetAttemptsLeftOk returns a tuple with the AttemptsLeft field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptsLeft

`func (o *EacVerificationResultDTO) SetAttemptsLeft(v int32)`

SetAttemptsLeft sets AttemptsLeft field to given value.

### HasAttemptsLeft

`func (o *EacVerificationResultDTO) HasAttemptsLeft() bool`

HasAttemptsLeft returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


