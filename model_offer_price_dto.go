/*
Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

API version: LATEST
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package ympa_go_client

import (
	"encoding/json"
)

// checks if the OfferPriceDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OfferPriceDTO{}

// OfferPriceDTO Товар с информацией о новой цене на него.
type OfferPriceDTO struct {
	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	OfferId *string `json:"offerId,omitempty" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`
	Price *PriceDTO `json:"price,omitempty"`
}

// NewOfferPriceDTO instantiates a new OfferPriceDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOfferPriceDTO() *OfferPriceDTO {
	this := OfferPriceDTO{}
	return &this
}

// NewOfferPriceDTOWithDefaults instantiates a new OfferPriceDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOfferPriceDTOWithDefaults() *OfferPriceDTO {
	this := OfferPriceDTO{}
	return &this
}

// GetOfferId returns the OfferId field value if set, zero value otherwise.
func (o *OfferPriceDTO) GetOfferId() string {
	if o == nil || IsNil(o.OfferId) {
		var ret string
		return ret
	}
	return *o.OfferId
}

// GetOfferIdOk returns a tuple with the OfferId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OfferPriceDTO) GetOfferIdOk() (*string, bool) {
	if o == nil || IsNil(o.OfferId) {
		return nil, false
	}
	return o.OfferId, true
}

// HasOfferId returns a boolean if a field has been set.
func (o *OfferPriceDTO) HasOfferId() bool {
	if o != nil && !IsNil(o.OfferId) {
		return true
	}

	return false
}

// SetOfferId gets a reference to the given string and assigns it to the OfferId field.
func (o *OfferPriceDTO) SetOfferId(v string) {
	o.OfferId = &v
}

// GetPrice returns the Price field value if set, zero value otherwise.
func (o *OfferPriceDTO) GetPrice() PriceDTO {
	if o == nil || IsNil(o.Price) {
		var ret PriceDTO
		return ret
	}
	return *o.Price
}

// GetPriceOk returns a tuple with the Price field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OfferPriceDTO) GetPriceOk() (*PriceDTO, bool) {
	if o == nil || IsNil(o.Price) {
		return nil, false
	}
	return o.Price, true
}

// HasPrice returns a boolean if a field has been set.
func (o *OfferPriceDTO) HasPrice() bool {
	if o != nil && !IsNil(o.Price) {
		return true
	}

	return false
}

// SetPrice gets a reference to the given PriceDTO and assigns it to the Price field.
func (o *OfferPriceDTO) SetPrice(v PriceDTO) {
	o.Price = &v
}

func (o OfferPriceDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OfferPriceDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.OfferId) {
		toSerialize["offerId"] = o.OfferId
	}
	if !IsNil(o.Price) {
		toSerialize["price"] = o.Price
	}
	return toSerialize, nil
}

type NullableOfferPriceDTO struct {
	value *OfferPriceDTO
	isSet bool
}

func (v NullableOfferPriceDTO) Get() *OfferPriceDTO {
	return v.value
}

func (v *NullableOfferPriceDTO) Set(val *OfferPriceDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableOfferPriceDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableOfferPriceDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOfferPriceDTO(val *OfferPriceDTO) *NullableOfferPriceDTO {
	return &NullableOfferPriceDTO{value: val, isSet: true}
}

func (v NullableOfferPriceDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOfferPriceDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


