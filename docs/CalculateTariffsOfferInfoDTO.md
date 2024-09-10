# CalculateTariffsOfferInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offer** | [**CalculateTariffsOfferDTO**](CalculateTariffsOfferDTO.md) |  | 
**Tariffs** | [**[]CalculatedTariffDTO**](CalculatedTariffDTO.md) | Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  | 

## Methods

### NewCalculateTariffsOfferInfoDTO

`func NewCalculateTariffsOfferInfoDTO(offer CalculateTariffsOfferDTO, tariffs []CalculatedTariffDTO, ) *CalculateTariffsOfferInfoDTO`

NewCalculateTariffsOfferInfoDTO instantiates a new CalculateTariffsOfferInfoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCalculateTariffsOfferInfoDTOWithDefaults

`func NewCalculateTariffsOfferInfoDTOWithDefaults() *CalculateTariffsOfferInfoDTO`

NewCalculateTariffsOfferInfoDTOWithDefaults instantiates a new CalculateTariffsOfferInfoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffer

`func (o *CalculateTariffsOfferInfoDTO) GetOffer() CalculateTariffsOfferDTO`

GetOffer returns the Offer field if non-nil, zero value otherwise.

### GetOfferOk

`func (o *CalculateTariffsOfferInfoDTO) GetOfferOk() (*CalculateTariffsOfferDTO, bool)`

GetOfferOk returns a tuple with the Offer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffer

`func (o *CalculateTariffsOfferInfoDTO) SetOffer(v CalculateTariffsOfferDTO)`

SetOffer sets Offer field to given value.


### GetTariffs

`func (o *CalculateTariffsOfferInfoDTO) GetTariffs() []CalculatedTariffDTO`

GetTariffs returns the Tariffs field if non-nil, zero value otherwise.

### GetTariffsOk

`func (o *CalculateTariffsOfferInfoDTO) GetTariffsOk() (*[]CalculatedTariffDTO, bool)`

GetTariffsOk returns a tuple with the Tariffs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTariffs

`func (o *CalculateTariffsOfferInfoDTO) SetTariffs(v []CalculatedTariffDTO)`

SetTariffs sets Tariffs field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


