/*
Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

API version: LATEST
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package ympa_go_client

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the RejectedPromoOfferDeleteDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &RejectedPromoOfferDeleteDTO{}

// RejectedPromoOfferDeleteDTO Информация о товаре и ошибки, которые появились при его удалении.
type RejectedPromoOfferDeleteDTO struct {
	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	OfferId string `json:"offerId" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`
	Reason RejectedPromoOfferDeleteReasonType `json:"reason"`
}

type _RejectedPromoOfferDeleteDTO RejectedPromoOfferDeleteDTO

// NewRejectedPromoOfferDeleteDTO instantiates a new RejectedPromoOfferDeleteDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRejectedPromoOfferDeleteDTO(offerId string, reason RejectedPromoOfferDeleteReasonType) *RejectedPromoOfferDeleteDTO {
	this := RejectedPromoOfferDeleteDTO{}
	this.OfferId = offerId
	this.Reason = reason
	return &this
}

// NewRejectedPromoOfferDeleteDTOWithDefaults instantiates a new RejectedPromoOfferDeleteDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRejectedPromoOfferDeleteDTOWithDefaults() *RejectedPromoOfferDeleteDTO {
	this := RejectedPromoOfferDeleteDTO{}
	return &this
}

// GetOfferId returns the OfferId field value
func (o *RejectedPromoOfferDeleteDTO) GetOfferId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.OfferId
}

// GetOfferIdOk returns a tuple with the OfferId field value
// and a boolean to check if the value has been set.
func (o *RejectedPromoOfferDeleteDTO) GetOfferIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.OfferId, true
}

// SetOfferId sets field value
func (o *RejectedPromoOfferDeleteDTO) SetOfferId(v string) {
	o.OfferId = v
}

// GetReason returns the Reason field value
func (o *RejectedPromoOfferDeleteDTO) GetReason() RejectedPromoOfferDeleteReasonType {
	if o == nil {
		var ret RejectedPromoOfferDeleteReasonType
		return ret
	}

	return o.Reason
}

// GetReasonOk returns a tuple with the Reason field value
// and a boolean to check if the value has been set.
func (o *RejectedPromoOfferDeleteDTO) GetReasonOk() (*RejectedPromoOfferDeleteReasonType, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Reason, true
}

// SetReason sets field value
func (o *RejectedPromoOfferDeleteDTO) SetReason(v RejectedPromoOfferDeleteReasonType) {
	o.Reason = v
}

func (o RejectedPromoOfferDeleteDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o RejectedPromoOfferDeleteDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["offerId"] = o.OfferId
	toSerialize["reason"] = o.Reason
	return toSerialize, nil
}

func (o *RejectedPromoOfferDeleteDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"offerId",
		"reason",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varRejectedPromoOfferDeleteDTO := _RejectedPromoOfferDeleteDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varRejectedPromoOfferDeleteDTO)

	if err != nil {
		return err
	}

	*o = RejectedPromoOfferDeleteDTO(varRejectedPromoOfferDeleteDTO)

	return err
}

type NullableRejectedPromoOfferDeleteDTO struct {
	value *RejectedPromoOfferDeleteDTO
	isSet bool
}

func (v NullableRejectedPromoOfferDeleteDTO) Get() *RejectedPromoOfferDeleteDTO {
	return v.value
}

func (v *NullableRejectedPromoOfferDeleteDTO) Set(val *RejectedPromoOfferDeleteDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableRejectedPromoOfferDeleteDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableRejectedPromoOfferDeleteDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRejectedPromoOfferDeleteDTO(val *RejectedPromoOfferDeleteDTO) *NullableRejectedPromoOfferDeleteDTO {
	return &NullableRejectedPromoOfferDeleteDTO{value: val, isSet: true}
}

func (v NullableRejectedPromoOfferDeleteDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRejectedPromoOfferDeleteDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


