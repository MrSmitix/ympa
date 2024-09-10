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

// checks if the SuggestedOfferDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &SuggestedOfferDTO{}

// SuggestedOfferDTO Информация о товаре.
type SuggestedOfferDTO struct {
	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	OfferId *string `json:"offerId,omitempty" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`
	// Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
	Name *string `json:"name,omitempty"`
	// Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
	Category *string `json:"category,omitempty"`
	// Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
	Vendor *string `json:"vendor,omitempty"`
	// Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
	Barcodes []string `json:"barcodes,omitempty"`
	// Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
	Description *string `json:"description,omitempty"`
	// Артикул товара от производителя.
	VendorCode *string `json:"vendorCode,omitempty"`
	BasicPrice *BasePriceDTO `json:"basicPrice,omitempty"`
}

// NewSuggestedOfferDTO instantiates a new SuggestedOfferDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSuggestedOfferDTO() *SuggestedOfferDTO {
	this := SuggestedOfferDTO{}
	return &this
}

// NewSuggestedOfferDTOWithDefaults instantiates a new SuggestedOfferDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSuggestedOfferDTOWithDefaults() *SuggestedOfferDTO {
	this := SuggestedOfferDTO{}
	return &this
}

// GetOfferId returns the OfferId field value if set, zero value otherwise.
func (o *SuggestedOfferDTO) GetOfferId() string {
	if o == nil || IsNil(o.OfferId) {
		var ret string
		return ret
	}
	return *o.OfferId
}

// GetOfferIdOk returns a tuple with the OfferId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SuggestedOfferDTO) GetOfferIdOk() (*string, bool) {
	if o == nil || IsNil(o.OfferId) {
		return nil, false
	}
	return o.OfferId, true
}

// HasOfferId returns a boolean if a field has been set.
func (o *SuggestedOfferDTO) HasOfferId() bool {
	if o != nil && !IsNil(o.OfferId) {
		return true
	}

	return false
}

// SetOfferId gets a reference to the given string and assigns it to the OfferId field.
func (o *SuggestedOfferDTO) SetOfferId(v string) {
	o.OfferId = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *SuggestedOfferDTO) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SuggestedOfferDTO) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *SuggestedOfferDTO) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *SuggestedOfferDTO) SetName(v string) {
	o.Name = &v
}

// GetCategory returns the Category field value if set, zero value otherwise.
func (o *SuggestedOfferDTO) GetCategory() string {
	if o == nil || IsNil(o.Category) {
		var ret string
		return ret
	}
	return *o.Category
}

// GetCategoryOk returns a tuple with the Category field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SuggestedOfferDTO) GetCategoryOk() (*string, bool) {
	if o == nil || IsNil(o.Category) {
		return nil, false
	}
	return o.Category, true
}

// HasCategory returns a boolean if a field has been set.
func (o *SuggestedOfferDTO) HasCategory() bool {
	if o != nil && !IsNil(o.Category) {
		return true
	}

	return false
}

// SetCategory gets a reference to the given string and assigns it to the Category field.
func (o *SuggestedOfferDTO) SetCategory(v string) {
	o.Category = &v
}

// GetVendor returns the Vendor field value if set, zero value otherwise.
func (o *SuggestedOfferDTO) GetVendor() string {
	if o == nil || IsNil(o.Vendor) {
		var ret string
		return ret
	}
	return *o.Vendor
}

// GetVendorOk returns a tuple with the Vendor field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SuggestedOfferDTO) GetVendorOk() (*string, bool) {
	if o == nil || IsNil(o.Vendor) {
		return nil, false
	}
	return o.Vendor, true
}

// HasVendor returns a boolean if a field has been set.
func (o *SuggestedOfferDTO) HasVendor() bool {
	if o != nil && !IsNil(o.Vendor) {
		return true
	}

	return false
}

// SetVendor gets a reference to the given string and assigns it to the Vendor field.
func (o *SuggestedOfferDTO) SetVendor(v string) {
	o.Vendor = &v
}

// GetBarcodes returns the Barcodes field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SuggestedOfferDTO) GetBarcodes() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.Barcodes
}

// GetBarcodesOk returns a tuple with the Barcodes field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SuggestedOfferDTO) GetBarcodesOk() ([]string, bool) {
	if o == nil || IsNil(o.Barcodes) {
		return nil, false
	}
	return o.Barcodes, true
}

// HasBarcodes returns a boolean if a field has been set.
func (o *SuggestedOfferDTO) HasBarcodes() bool {
	if o != nil && !IsNil(o.Barcodes) {
		return true
	}

	return false
}

// SetBarcodes gets a reference to the given []string and assigns it to the Barcodes field.
func (o *SuggestedOfferDTO) SetBarcodes(v []string) {
	o.Barcodes = v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *SuggestedOfferDTO) GetDescription() string {
	if o == nil || IsNil(o.Description) {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SuggestedOfferDTO) GetDescriptionOk() (*string, bool) {
	if o == nil || IsNil(o.Description) {
		return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *SuggestedOfferDTO) HasDescription() bool {
	if o != nil && !IsNil(o.Description) {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *SuggestedOfferDTO) SetDescription(v string) {
	o.Description = &v
}

// GetVendorCode returns the VendorCode field value if set, zero value otherwise.
func (o *SuggestedOfferDTO) GetVendorCode() string {
	if o == nil || IsNil(o.VendorCode) {
		var ret string
		return ret
	}
	return *o.VendorCode
}

// GetVendorCodeOk returns a tuple with the VendorCode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SuggestedOfferDTO) GetVendorCodeOk() (*string, bool) {
	if o == nil || IsNil(o.VendorCode) {
		return nil, false
	}
	return o.VendorCode, true
}

// HasVendorCode returns a boolean if a field has been set.
func (o *SuggestedOfferDTO) HasVendorCode() bool {
	if o != nil && !IsNil(o.VendorCode) {
		return true
	}

	return false
}

// SetVendorCode gets a reference to the given string and assigns it to the VendorCode field.
func (o *SuggestedOfferDTO) SetVendorCode(v string) {
	o.VendorCode = &v
}

// GetBasicPrice returns the BasicPrice field value if set, zero value otherwise.
func (o *SuggestedOfferDTO) GetBasicPrice() BasePriceDTO {
	if o == nil || IsNil(o.BasicPrice) {
		var ret BasePriceDTO
		return ret
	}
	return *o.BasicPrice
}

// GetBasicPriceOk returns a tuple with the BasicPrice field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SuggestedOfferDTO) GetBasicPriceOk() (*BasePriceDTO, bool) {
	if o == nil || IsNil(o.BasicPrice) {
		return nil, false
	}
	return o.BasicPrice, true
}

// HasBasicPrice returns a boolean if a field has been set.
func (o *SuggestedOfferDTO) HasBasicPrice() bool {
	if o != nil && !IsNil(o.BasicPrice) {
		return true
	}

	return false
}

// SetBasicPrice gets a reference to the given BasePriceDTO and assigns it to the BasicPrice field.
func (o *SuggestedOfferDTO) SetBasicPrice(v BasePriceDTO) {
	o.BasicPrice = &v
}

func (o SuggestedOfferDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o SuggestedOfferDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.OfferId) {
		toSerialize["offerId"] = o.OfferId
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Category) {
		toSerialize["category"] = o.Category
	}
	if !IsNil(o.Vendor) {
		toSerialize["vendor"] = o.Vendor
	}
	if o.Barcodes != nil {
		toSerialize["barcodes"] = o.Barcodes
	}
	if !IsNil(o.Description) {
		toSerialize["description"] = o.Description
	}
	if !IsNil(o.VendorCode) {
		toSerialize["vendorCode"] = o.VendorCode
	}
	if !IsNil(o.BasicPrice) {
		toSerialize["basicPrice"] = o.BasicPrice
	}
	return toSerialize, nil
}

type NullableSuggestedOfferDTO struct {
	value *SuggestedOfferDTO
	isSet bool
}

func (v NullableSuggestedOfferDTO) Get() *SuggestedOfferDTO {
	return v.value
}

func (v *NullableSuggestedOfferDTO) Set(val *SuggestedOfferDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableSuggestedOfferDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableSuggestedOfferDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSuggestedOfferDTO(val *SuggestedOfferDTO) *NullableSuggestedOfferDTO {
	return &NullableSuggestedOfferDTO{value: val, isSet: true}
}

func (v NullableSuggestedOfferDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSuggestedOfferDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


