# OutletLicensesResponseDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Licenses** | [**[]FullOutletLicenseDTO**](FullOutletLicenseDTO.md) | Список лицензий. | 

## Methods

### NewOutletLicensesResponseDTO

`func NewOutletLicensesResponseDTO(licenses []FullOutletLicenseDTO, ) *OutletLicensesResponseDTO`

NewOutletLicensesResponseDTO instantiates a new OutletLicensesResponseDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOutletLicensesResponseDTOWithDefaults

`func NewOutletLicensesResponseDTOWithDefaults() *OutletLicensesResponseDTO`

NewOutletLicensesResponseDTOWithDefaults instantiates a new OutletLicensesResponseDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLicenses

`func (o *OutletLicensesResponseDTO) GetLicenses() []FullOutletLicenseDTO`

GetLicenses returns the Licenses field if non-nil, zero value otherwise.

### GetLicensesOk

`func (o *OutletLicensesResponseDTO) GetLicensesOk() (*[]FullOutletLicenseDTO, bool)`

GetLicensesOk returns a tuple with the Licenses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLicenses

`func (o *OutletLicensesResponseDTO) SetLicenses(v []FullOutletLicenseDTO)`

SetLicenses sets Licenses field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


