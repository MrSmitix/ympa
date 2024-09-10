# CalculateTariffsParametersDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignId** | Pointer to **int64** | Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  | [optional] 
**SellingProgram** | Pointer to [**SellingProgramType**](SellingProgramType.md) |  | [optional] 
**Frequency** | Pointer to [**PaymentFrequencyType**](PaymentFrequencyType.md) |  | [optional] 

## Methods

### NewCalculateTariffsParametersDTO

`func NewCalculateTariffsParametersDTO() *CalculateTariffsParametersDTO`

NewCalculateTariffsParametersDTO instantiates a new CalculateTariffsParametersDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCalculateTariffsParametersDTOWithDefaults

`func NewCalculateTariffsParametersDTOWithDefaults() *CalculateTariffsParametersDTO`

NewCalculateTariffsParametersDTOWithDefaults instantiates a new CalculateTariffsParametersDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCampaignId

`func (o *CalculateTariffsParametersDTO) GetCampaignId() int64`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *CalculateTariffsParametersDTO) GetCampaignIdOk() (*int64, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *CalculateTariffsParametersDTO) SetCampaignId(v int64)`

SetCampaignId sets CampaignId field to given value.

### HasCampaignId

`func (o *CalculateTariffsParametersDTO) HasCampaignId() bool`

HasCampaignId returns a boolean if a field has been set.

### GetSellingProgram

`func (o *CalculateTariffsParametersDTO) GetSellingProgram() SellingProgramType`

GetSellingProgram returns the SellingProgram field if non-nil, zero value otherwise.

### GetSellingProgramOk

`func (o *CalculateTariffsParametersDTO) GetSellingProgramOk() (*SellingProgramType, bool)`

GetSellingProgramOk returns a tuple with the SellingProgram field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSellingProgram

`func (o *CalculateTariffsParametersDTO) SetSellingProgram(v SellingProgramType)`

SetSellingProgram sets SellingProgram field to given value.

### HasSellingProgram

`func (o *CalculateTariffsParametersDTO) HasSellingProgram() bool`

HasSellingProgram returns a boolean if a field has been set.

### GetFrequency

`func (o *CalculateTariffsParametersDTO) GetFrequency() PaymentFrequencyType`

GetFrequency returns the Frequency field if non-nil, zero value otherwise.

### GetFrequencyOk

`func (o *CalculateTariffsParametersDTO) GetFrequencyOk() (*PaymentFrequencyType, bool)`

GetFrequencyOk returns a tuple with the Frequency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrequency

`func (o *CalculateTariffsParametersDTO) SetFrequency(v PaymentFrequencyType)`

SetFrequency sets Frequency field to given value.

### HasFrequency

`func (o *CalculateTariffsParametersDTO) HasFrequency() bool`

HasFrequency returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


