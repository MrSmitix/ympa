# CalculateTariffsResponseDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**[]CalculateTariffsOfferInfoDTO**](CalculateTariffsOfferInfoDTO.md) | Стоимость услуг. | 

## Methods

### NewCalculateTariffsResponseDTO

`func NewCalculateTariffsResponseDTO(offers []CalculateTariffsOfferInfoDTO, ) *CalculateTariffsResponseDTO`

NewCalculateTariffsResponseDTO instantiates a new CalculateTariffsResponseDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCalculateTariffsResponseDTOWithDefaults

`func NewCalculateTariffsResponseDTOWithDefaults() *CalculateTariffsResponseDTO`

NewCalculateTariffsResponseDTOWithDefaults instantiates a new CalculateTariffsResponseDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffers

`func (o *CalculateTariffsResponseDTO) GetOffers() []CalculateTariffsOfferInfoDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *CalculateTariffsResponseDTO) GetOffersOk() (*[]CalculateTariffsOfferInfoDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *CalculateTariffsResponseDTO) SetOffers(v []CalculateTariffsOfferInfoDTO)`

SetOffers sets Offers field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


