# UpdateOutletLicenseRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Licenses** | [**[]OutletLicenseDTO**](OutletLicenseDTO.md) | Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии.  | 

## Methods

### NewUpdateOutletLicenseRequest

`func NewUpdateOutletLicenseRequest(licenses []OutletLicenseDTO, ) *UpdateOutletLicenseRequest`

NewUpdateOutletLicenseRequest instantiates a new UpdateOutletLicenseRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateOutletLicenseRequestWithDefaults

`func NewUpdateOutletLicenseRequestWithDefaults() *UpdateOutletLicenseRequest`

NewUpdateOutletLicenseRequestWithDefaults instantiates a new UpdateOutletLicenseRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLicenses

`func (o *UpdateOutletLicenseRequest) GetLicenses() []OutletLicenseDTO`

GetLicenses returns the Licenses field if non-nil, zero value otherwise.

### GetLicensesOk

`func (o *UpdateOutletLicenseRequest) GetLicensesOk() (*[]OutletLicenseDTO, bool)`

GetLicensesOk returns a tuple with the Licenses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLicenses

`func (o *UpdateOutletLicenseRequest) SetLicenses(v []OutletLicenseDTO)`

SetLicenses sets Licenses field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


