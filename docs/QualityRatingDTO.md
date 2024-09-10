# QualityRatingDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Rating** | **int64** | Значение индекса качества. | 
**CalculationDate** | **string** | Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  | 
**Components** | [**[]QualityRatingComponentDTO**](QualityRatingComponentDTO.md) | Составляющие индекса качества. | 

## Methods

### NewQualityRatingDTO

`func NewQualityRatingDTO(rating int64, calculationDate string, components []QualityRatingComponentDTO, ) *QualityRatingDTO`

NewQualityRatingDTO instantiates a new QualityRatingDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQualityRatingDTOWithDefaults

`func NewQualityRatingDTOWithDefaults() *QualityRatingDTO`

NewQualityRatingDTOWithDefaults instantiates a new QualityRatingDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRating

`func (o *QualityRatingDTO) GetRating() int64`

GetRating returns the Rating field if non-nil, zero value otherwise.

### GetRatingOk

`func (o *QualityRatingDTO) GetRatingOk() (*int64, bool)`

GetRatingOk returns a tuple with the Rating field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRating

`func (o *QualityRatingDTO) SetRating(v int64)`

SetRating sets Rating field to given value.


### GetCalculationDate

`func (o *QualityRatingDTO) GetCalculationDate() string`

GetCalculationDate returns the CalculationDate field if non-nil, zero value otherwise.

### GetCalculationDateOk

`func (o *QualityRatingDTO) GetCalculationDateOk() (*string, bool)`

GetCalculationDateOk returns a tuple with the CalculationDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCalculationDate

`func (o *QualityRatingDTO) SetCalculationDate(v string)`

SetCalculationDate sets CalculationDate field to given value.


### GetComponents

`func (o *QualityRatingDTO) GetComponents() []QualityRatingComponentDTO`

GetComponents returns the Components field if non-nil, zero value otherwise.

### GetComponentsOk

`func (o *QualityRatingDTO) GetComponentsOk() (*[]QualityRatingComponentDTO, bool)`

GetComponentsOk returns a tuple with the Components field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponents

`func (o *QualityRatingDTO) SetComponents(v []QualityRatingComponentDTO)`

SetComponents sets Components field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


