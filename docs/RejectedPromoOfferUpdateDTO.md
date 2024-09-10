# RejectedPromoOfferUpdateDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**Reason** | [**RejectedPromoOfferUpdateReasonType**](RejectedPromoOfferUpdateReasonType.md) |  | 

## Methods

### NewRejectedPromoOfferUpdateDTO

`func NewRejectedPromoOfferUpdateDTO(offerId string, reason RejectedPromoOfferUpdateReasonType, ) *RejectedPromoOfferUpdateDTO`

NewRejectedPromoOfferUpdateDTO instantiates a new RejectedPromoOfferUpdateDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRejectedPromoOfferUpdateDTOWithDefaults

`func NewRejectedPromoOfferUpdateDTOWithDefaults() *RejectedPromoOfferUpdateDTO`

NewRejectedPromoOfferUpdateDTOWithDefaults instantiates a new RejectedPromoOfferUpdateDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferId

`func (o *RejectedPromoOfferUpdateDTO) GetOfferId() string`

GetOfferId returns the OfferId field if non-nil, zero value otherwise.

### GetOfferIdOk

`func (o *RejectedPromoOfferUpdateDTO) GetOfferIdOk() (*string, bool)`

GetOfferIdOk returns a tuple with the OfferId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferId

`func (o *RejectedPromoOfferUpdateDTO) SetOfferId(v string)`

SetOfferId sets OfferId field to given value.


### GetReason

`func (o *RejectedPromoOfferUpdateDTO) GetReason() RejectedPromoOfferUpdateReasonType`

GetReason returns the Reason field if non-nil, zero value otherwise.

### GetReasonOk

`func (o *RejectedPromoOfferUpdateDTO) GetReasonOk() (*RejectedPromoOfferUpdateReasonType, bool)`

GetReasonOk returns a tuple with the Reason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReason

`func (o *RejectedPromoOfferUpdateDTO) SetReason(v RejectedPromoOfferUpdateReasonType)`

SetReason sets Reason field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


