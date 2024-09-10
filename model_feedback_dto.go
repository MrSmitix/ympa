/*
Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

API version: LATEST
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package ympa_go_client

import (
	"encoding/json"
	"time"
	"bytes"
	"fmt"
)

// checks if the FeedbackDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &FeedbackDTO{}

// FeedbackDTO Отзыв пользователя Яндекс Маркета об указанном магазине.
type FeedbackDTO struct {
	// Идентификатор отзыва.
	Id *int64 `json:"id,omitempty"`
	// Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
	CreatedAt *time.Time `json:"createdAt,omitempty"`
	// Комментарий автора отзыва.
	Text *string `json:"text,omitempty"`
	State *FeedbackStateType `json:"state,omitempty"`
	Author *FeedbackAuthorDTO `json:"author,omitempty"`
	// Достоинства магазина, описанные в отзыве.
	Pro *string `json:"pro,omitempty"`
	// Недостатки магазина, описанные в отзыве.
	Contra *string `json:"contra,omitempty"`
	// Переписка автора отзыва с магазином.
	Comments []FeedbackCommentDTO `json:"comments"`
	Shop *FeedbackShopDTO `json:"shop,omitempty"`
	// Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
	Resolved *bool `json:"resolved,omitempty"`
	// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
	Verified *bool `json:"verified,omitempty"`
	// Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
	Recommend *bool `json:"recommend,omitempty"`
	Grades *FeedbackGradesDTO `json:"grades,omitempty"`
	Order *FeedbackOrderDTO `json:"order,omitempty"`
}

type _FeedbackDTO FeedbackDTO

// NewFeedbackDTO instantiates a new FeedbackDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFeedbackDTO(comments []FeedbackCommentDTO) *FeedbackDTO {
	this := FeedbackDTO{}
	this.Comments = comments
	return &this
}

// NewFeedbackDTOWithDefaults instantiates a new FeedbackDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFeedbackDTOWithDefaults() *FeedbackDTO {
	this := FeedbackDTO{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *FeedbackDTO) GetId() int64 {
	if o == nil || IsNil(o.Id) {
		var ret int64
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FeedbackDTO) GetIdOk() (*int64, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *FeedbackDTO) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int64 and assigns it to the Id field.
func (o *FeedbackDTO) SetId(v int64) {
	o.Id = &v
}

// GetCreatedAt returns the CreatedAt field value if set, zero value otherwise.
func (o *FeedbackDTO) GetCreatedAt() time.Time {
	if o == nil || IsNil(o.CreatedAt) {
		var ret time.Time
		return ret
	}
	return *o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FeedbackDTO) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil || IsNil(o.CreatedAt) {
		return nil, false
	}
	return o.CreatedAt, true
}

// HasCreatedAt returns a boolean if a field has been set.
func (o *FeedbackDTO) HasCreatedAt() bool {
	if o != nil && !IsNil(o.CreatedAt) {
		return true
	}

	return false
}

// SetCreatedAt gets a reference to the given time.Time and assigns it to the CreatedAt field.
func (o *FeedbackDTO) SetCreatedAt(v time.Time) {
	o.CreatedAt = &v
}

// GetText returns the Text field value if set, zero value otherwise.
func (o *FeedbackDTO) GetText() string {
	if o == nil || IsNil(o.Text) {
		var ret string
		return ret
	}
	return *o.Text
}

// GetTextOk returns a tuple with the Text field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FeedbackDTO) GetTextOk() (*string, bool) {
	if o == nil || IsNil(o.Text) {
		return nil, false
	}
	return o.Text, true
}

// HasText returns a boolean if a field has been set.
func (o *FeedbackDTO) HasText() bool {
	if o != nil && !IsNil(o.Text) {
		return true
	}

	return false
}

// SetText gets a reference to the given string and assigns it to the Text field.
func (o *FeedbackDTO) SetText(v string) {
	o.Text = &v
}

// GetState returns the State field value if set, zero value otherwise.
func (o *FeedbackDTO) GetState() FeedbackStateType {
	if o == nil || IsNil(o.State) {
		var ret FeedbackStateType
		return ret
	}
	return *o.State
}

// GetStateOk returns a tuple with the State field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FeedbackDTO) GetStateOk() (*FeedbackStateType, bool) {
	if o == nil || IsNil(o.State) {
		return nil, false
	}
	return o.State, true
}

// HasState returns a boolean if a field has been set.
func (o *FeedbackDTO) HasState() bool {
	if o != nil && !IsNil(o.State) {
		return true
	}

	return false
}

// SetState gets a reference to the given FeedbackStateType and assigns it to the State field.
func (o *FeedbackDTO) SetState(v FeedbackStateType) {
	o.State = &v
}

// GetAuthor returns the Author field value if set, zero value otherwise.
func (o *FeedbackDTO) GetAuthor() FeedbackAuthorDTO {
	if o == nil || IsNil(o.Author) {
		var ret FeedbackAuthorDTO
		return ret
	}
	return *o.Author
}

// GetAuthorOk returns a tuple with the Author field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FeedbackDTO) GetAuthorOk() (*FeedbackAuthorDTO, bool) {
	if o == nil || IsNil(o.Author) {
		return nil, false
	}
	return o.Author, true
}

// HasAuthor returns a boolean if a field has been set.
func (o *FeedbackDTO) HasAuthor() bool {
	if o != nil && !IsNil(o.Author) {
		return true
	}

	return false
}

// SetAuthor gets a reference to the given FeedbackAuthorDTO and assigns it to the Author field.
func (o *FeedbackDTO) SetAuthor(v FeedbackAuthorDTO) {
	o.Author = &v
}

// GetPro returns the Pro field value if set, zero value otherwise.
func (o *FeedbackDTO) GetPro() string {
	if o == nil || IsNil(o.Pro) {
		var ret string
		return ret
	}
	return *o.Pro
}

// GetProOk returns a tuple with the Pro field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FeedbackDTO) GetProOk() (*string, bool) {
	if o == nil || IsNil(o.Pro) {
		return nil, false
	}
	return o.Pro, true
}

// HasPro returns a boolean if a field has been set.
func (o *FeedbackDTO) HasPro() bool {
	if o != nil && !IsNil(o.Pro) {
		return true
	}

	return false
}

// SetPro gets a reference to the given string and assigns it to the Pro field.
func (o *FeedbackDTO) SetPro(v string) {
	o.Pro = &v
}

// GetContra returns the Contra field value if set, zero value otherwise.
func (o *FeedbackDTO) GetContra() string {
	if o == nil || IsNil(o.Contra) {
		var ret string
		return ret
	}
	return *o.Contra
}

// GetContraOk returns a tuple with the Contra field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FeedbackDTO) GetContraOk() (*string, bool) {
	if o == nil || IsNil(o.Contra) {
		return nil, false
	}
	return o.Contra, true
}

// HasContra returns a boolean if a field has been set.
func (o *FeedbackDTO) HasContra() bool {
	if o != nil && !IsNil(o.Contra) {
		return true
	}

	return false
}

// SetContra gets a reference to the given string and assigns it to the Contra field.
func (o *FeedbackDTO) SetContra(v string) {
	o.Contra = &v
}

// GetComments returns the Comments field value
func (o *FeedbackDTO) GetComments() []FeedbackCommentDTO {
	if o == nil {
		var ret []FeedbackCommentDTO
		return ret
	}

	return o.Comments
}

// GetCommentsOk returns a tuple with the Comments field value
// and a boolean to check if the value has been set.
func (o *FeedbackDTO) GetCommentsOk() ([]FeedbackCommentDTO, bool) {
	if o == nil {
		return nil, false
	}
	return o.Comments, true
}

// SetComments sets field value
func (o *FeedbackDTO) SetComments(v []FeedbackCommentDTO) {
	o.Comments = v
}

// GetShop returns the Shop field value if set, zero value otherwise.
func (o *FeedbackDTO) GetShop() FeedbackShopDTO {
	if o == nil || IsNil(o.Shop) {
		var ret FeedbackShopDTO
		return ret
	}
	return *o.Shop
}

// GetShopOk returns a tuple with the Shop field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FeedbackDTO) GetShopOk() (*FeedbackShopDTO, bool) {
	if o == nil || IsNil(o.Shop) {
		return nil, false
	}
	return o.Shop, true
}

// HasShop returns a boolean if a field has been set.
func (o *FeedbackDTO) HasShop() bool {
	if o != nil && !IsNil(o.Shop) {
		return true
	}

	return false
}

// SetShop gets a reference to the given FeedbackShopDTO and assigns it to the Shop field.
func (o *FeedbackDTO) SetShop(v FeedbackShopDTO) {
	o.Shop = &v
}

// GetResolved returns the Resolved field value if set, zero value otherwise.
func (o *FeedbackDTO) GetResolved() bool {
	if o == nil || IsNil(o.Resolved) {
		var ret bool
		return ret
	}
	return *o.Resolved
}

// GetResolvedOk returns a tuple with the Resolved field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FeedbackDTO) GetResolvedOk() (*bool, bool) {
	if o == nil || IsNil(o.Resolved) {
		return nil, false
	}
	return o.Resolved, true
}

// HasResolved returns a boolean if a field has been set.
func (o *FeedbackDTO) HasResolved() bool {
	if o != nil && !IsNil(o.Resolved) {
		return true
	}

	return false
}

// SetResolved gets a reference to the given bool and assigns it to the Resolved field.
func (o *FeedbackDTO) SetResolved(v bool) {
	o.Resolved = &v
}

// GetVerified returns the Verified field value if set, zero value otherwise.
func (o *FeedbackDTO) GetVerified() bool {
	if o == nil || IsNil(o.Verified) {
		var ret bool
		return ret
	}
	return *o.Verified
}

// GetVerifiedOk returns a tuple with the Verified field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FeedbackDTO) GetVerifiedOk() (*bool, bool) {
	if o == nil || IsNil(o.Verified) {
		return nil, false
	}
	return o.Verified, true
}

// HasVerified returns a boolean if a field has been set.
func (o *FeedbackDTO) HasVerified() bool {
	if o != nil && !IsNil(o.Verified) {
		return true
	}

	return false
}

// SetVerified gets a reference to the given bool and assigns it to the Verified field.
func (o *FeedbackDTO) SetVerified(v bool) {
	o.Verified = &v
}

// GetRecommend returns the Recommend field value if set, zero value otherwise.
func (o *FeedbackDTO) GetRecommend() bool {
	if o == nil || IsNil(o.Recommend) {
		var ret bool
		return ret
	}
	return *o.Recommend
}

// GetRecommendOk returns a tuple with the Recommend field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FeedbackDTO) GetRecommendOk() (*bool, bool) {
	if o == nil || IsNil(o.Recommend) {
		return nil, false
	}
	return o.Recommend, true
}

// HasRecommend returns a boolean if a field has been set.
func (o *FeedbackDTO) HasRecommend() bool {
	if o != nil && !IsNil(o.Recommend) {
		return true
	}

	return false
}

// SetRecommend gets a reference to the given bool and assigns it to the Recommend field.
func (o *FeedbackDTO) SetRecommend(v bool) {
	o.Recommend = &v
}

// GetGrades returns the Grades field value if set, zero value otherwise.
func (o *FeedbackDTO) GetGrades() FeedbackGradesDTO {
	if o == nil || IsNil(o.Grades) {
		var ret FeedbackGradesDTO
		return ret
	}
	return *o.Grades
}

// GetGradesOk returns a tuple with the Grades field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FeedbackDTO) GetGradesOk() (*FeedbackGradesDTO, bool) {
	if o == nil || IsNil(o.Grades) {
		return nil, false
	}
	return o.Grades, true
}

// HasGrades returns a boolean if a field has been set.
func (o *FeedbackDTO) HasGrades() bool {
	if o != nil && !IsNil(o.Grades) {
		return true
	}

	return false
}

// SetGrades gets a reference to the given FeedbackGradesDTO and assigns it to the Grades field.
func (o *FeedbackDTO) SetGrades(v FeedbackGradesDTO) {
	o.Grades = &v
}

// GetOrder returns the Order field value if set, zero value otherwise.
func (o *FeedbackDTO) GetOrder() FeedbackOrderDTO {
	if o == nil || IsNil(o.Order) {
		var ret FeedbackOrderDTO
		return ret
	}
	return *o.Order
}

// GetOrderOk returns a tuple with the Order field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FeedbackDTO) GetOrderOk() (*FeedbackOrderDTO, bool) {
	if o == nil || IsNil(o.Order) {
		return nil, false
	}
	return o.Order, true
}

// HasOrder returns a boolean if a field has been set.
func (o *FeedbackDTO) HasOrder() bool {
	if o != nil && !IsNil(o.Order) {
		return true
	}

	return false
}

// SetOrder gets a reference to the given FeedbackOrderDTO and assigns it to the Order field.
func (o *FeedbackDTO) SetOrder(v FeedbackOrderDTO) {
	o.Order = &v
}

func (o FeedbackDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o FeedbackDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.CreatedAt) {
		toSerialize["createdAt"] = o.CreatedAt
	}
	if !IsNil(o.Text) {
		toSerialize["text"] = o.Text
	}
	if !IsNil(o.State) {
		toSerialize["state"] = o.State
	}
	if !IsNil(o.Author) {
		toSerialize["author"] = o.Author
	}
	if !IsNil(o.Pro) {
		toSerialize["pro"] = o.Pro
	}
	if !IsNil(o.Contra) {
		toSerialize["contra"] = o.Contra
	}
	toSerialize["comments"] = o.Comments
	if !IsNil(o.Shop) {
		toSerialize["shop"] = o.Shop
	}
	if !IsNil(o.Resolved) {
		toSerialize["resolved"] = o.Resolved
	}
	if !IsNil(o.Verified) {
		toSerialize["verified"] = o.Verified
	}
	if !IsNil(o.Recommend) {
		toSerialize["recommend"] = o.Recommend
	}
	if !IsNil(o.Grades) {
		toSerialize["grades"] = o.Grades
	}
	if !IsNil(o.Order) {
		toSerialize["order"] = o.Order
	}
	return toSerialize, nil
}

func (o *FeedbackDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"comments",
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

	varFeedbackDTO := _FeedbackDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varFeedbackDTO)

	if err != nil {
		return err
	}

	*o = FeedbackDTO(varFeedbackDTO)

	return err
}

type NullableFeedbackDTO struct {
	value *FeedbackDTO
	isSet bool
}

func (v NullableFeedbackDTO) Get() *FeedbackDTO {
	return v.value
}

func (v *NullableFeedbackDTO) Set(val *FeedbackDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableFeedbackDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableFeedbackDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFeedbackDTO(val *FeedbackDTO) *NullableFeedbackDTO {
	return &NullableFeedbackDTO{value: val, isSet: true}
}

func (v NullableFeedbackDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFeedbackDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


