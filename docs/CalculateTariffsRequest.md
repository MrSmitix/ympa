# CalculateTariffsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Parameters** | [**CalculateTariffsParametersDTO**](CalculateTariffsParametersDTO.md) |  | 
**Offers** | [**[]CalculateTariffsOfferDTO**](CalculateTariffsOfferDTO.md) | Товары, для которых нужно рассчитать стоимость услуг. | 

## Methods

### NewCalculateTariffsRequest

`func NewCalculateTariffsRequest(parameters CalculateTariffsParametersDTO, offers []CalculateTariffsOfferDTO, ) *CalculateTariffsRequest`

NewCalculateTariffsRequest instantiates a new CalculateTariffsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCalculateTariffsRequestWithDefaults

`func NewCalculateTariffsRequestWithDefaults() *CalculateTariffsRequest`

NewCalculateTariffsRequestWithDefaults instantiates a new CalculateTariffsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetParameters

`func (o *CalculateTariffsRequest) GetParameters() CalculateTariffsParametersDTO`

GetParameters returns the Parameters field if non-nil, zero value otherwise.

### GetParametersOk

`func (o *CalculateTariffsRequest) GetParametersOk() (*CalculateTariffsParametersDTO, bool)`

GetParametersOk returns a tuple with the Parameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParameters

`func (o *CalculateTariffsRequest) SetParameters(v CalculateTariffsParametersDTO)`

SetParameters sets Parameters field to given value.


### GetOffers

`func (o *CalculateTariffsRequest) GetOffers() []CalculateTariffsOfferDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *CalculateTariffsRequest) GetOffersOk() (*[]CalculateTariffsOfferDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *CalculateTariffsRequest) SetOffers(v []CalculateTariffsOfferDTO)`

SetOffers sets Offers field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


