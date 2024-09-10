# CalculateTariffsOfferDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CategoryId** | **int64** | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 
**Price** | **float32** | Цена на товар в рублях. | 
**Length** | **float32** | Длина товара в сантиметрах. | 
**Width** | **float32** | Ширина товара в сантиметрах. | 
**Height** | **float32** | Высота товара в сантиметрах. | 
**Weight** | **float32** | Вес товара в килограммах. | 
**Quantity** | Pointer to **int32** | Квант продажи — количество единиц товара в одном товарном предложении. | [optional] [default to 1]

## Methods

### NewCalculateTariffsOfferDTO

`func NewCalculateTariffsOfferDTO(categoryId int64, price float32, length float32, width float32, height float32, weight float32, ) *CalculateTariffsOfferDTO`

NewCalculateTariffsOfferDTO instantiates a new CalculateTariffsOfferDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCalculateTariffsOfferDTOWithDefaults

`func NewCalculateTariffsOfferDTOWithDefaults() *CalculateTariffsOfferDTO`

NewCalculateTariffsOfferDTOWithDefaults instantiates a new CalculateTariffsOfferDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryId

`func (o *CalculateTariffsOfferDTO) GetCategoryId() int64`

GetCategoryId returns the CategoryId field if non-nil, zero value otherwise.

### GetCategoryIdOk

`func (o *CalculateTariffsOfferDTO) GetCategoryIdOk() (*int64, bool)`

GetCategoryIdOk returns a tuple with the CategoryId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryId

`func (o *CalculateTariffsOfferDTO) SetCategoryId(v int64)`

SetCategoryId sets CategoryId field to given value.


### GetPrice

`func (o *CalculateTariffsOfferDTO) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *CalculateTariffsOfferDTO) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *CalculateTariffsOfferDTO) SetPrice(v float32)`

SetPrice sets Price field to given value.


### GetLength

`func (o *CalculateTariffsOfferDTO) GetLength() float32`

GetLength returns the Length field if non-nil, zero value otherwise.

### GetLengthOk

`func (o *CalculateTariffsOfferDTO) GetLengthOk() (*float32, bool)`

GetLengthOk returns a tuple with the Length field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLength

`func (o *CalculateTariffsOfferDTO) SetLength(v float32)`

SetLength sets Length field to given value.


### GetWidth

`func (o *CalculateTariffsOfferDTO) GetWidth() float32`

GetWidth returns the Width field if non-nil, zero value otherwise.

### GetWidthOk

`func (o *CalculateTariffsOfferDTO) GetWidthOk() (*float32, bool)`

GetWidthOk returns a tuple with the Width field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWidth

`func (o *CalculateTariffsOfferDTO) SetWidth(v float32)`

SetWidth sets Width field to given value.


### GetHeight

`func (o *CalculateTariffsOfferDTO) GetHeight() float32`

GetHeight returns the Height field if non-nil, zero value otherwise.

### GetHeightOk

`func (o *CalculateTariffsOfferDTO) GetHeightOk() (*float32, bool)`

GetHeightOk returns a tuple with the Height field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeight

`func (o *CalculateTariffsOfferDTO) SetHeight(v float32)`

SetHeight sets Height field to given value.


### GetWeight

`func (o *CalculateTariffsOfferDTO) GetWeight() float32`

GetWeight returns the Weight field if non-nil, zero value otherwise.

### GetWeightOk

`func (o *CalculateTariffsOfferDTO) GetWeightOk() (*float32, bool)`

GetWeightOk returns a tuple with the Weight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeight

`func (o *CalculateTariffsOfferDTO) SetWeight(v float32)`

SetWeight sets Weight field to given value.


### GetQuantity

`func (o *CalculateTariffsOfferDTO) GetQuantity() int32`

GetQuantity returns the Quantity field if non-nil, zero value otherwise.

### GetQuantityOk

`func (o *CalculateTariffsOfferDTO) GetQuantityOk() (*int32, bool)`

GetQuantityOk returns a tuple with the Quantity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuantity

`func (o *CalculateTariffsOfferDTO) SetQuantity(v int32)`

SetQuantity sets Quantity field to given value.

### HasQuantity

`func (o *CalculateTariffsOfferDTO) HasQuantity() bool`

HasQuantity returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


