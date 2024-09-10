# OrderBuyerBasicInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | Идентификатор покупателя. | [optional] 
**LastName** | Pointer to **string** | Фамилия покупателя. | [optional] 
**FirstName** | Pointer to **string** | Имя покупателя. | [optional] 
**MiddleName** | Pointer to **string** | Отчество покупателя. | [optional] 
**Type** | Pointer to [**OrderBuyerType**](OrderBuyerType.md) |  | [optional] 

## Methods

### NewOrderBuyerBasicInfoDTO

`func NewOrderBuyerBasicInfoDTO() *OrderBuyerBasicInfoDTO`

NewOrderBuyerBasicInfoDTO instantiates a new OrderBuyerBasicInfoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderBuyerBasicInfoDTOWithDefaults

`func NewOrderBuyerBasicInfoDTOWithDefaults() *OrderBuyerBasicInfoDTO`

NewOrderBuyerBasicInfoDTOWithDefaults instantiates a new OrderBuyerBasicInfoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OrderBuyerBasicInfoDTO) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OrderBuyerBasicInfoDTO) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OrderBuyerBasicInfoDTO) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *OrderBuyerBasicInfoDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLastName

`func (o *OrderBuyerBasicInfoDTO) GetLastName() string`

GetLastName returns the LastName field if non-nil, zero value otherwise.

### GetLastNameOk

`func (o *OrderBuyerBasicInfoDTO) GetLastNameOk() (*string, bool)`

GetLastNameOk returns a tuple with the LastName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastName

`func (o *OrderBuyerBasicInfoDTO) SetLastName(v string)`

SetLastName sets LastName field to given value.

### HasLastName

`func (o *OrderBuyerBasicInfoDTO) HasLastName() bool`

HasLastName returns a boolean if a field has been set.

### GetFirstName

`func (o *OrderBuyerBasicInfoDTO) GetFirstName() string`

GetFirstName returns the FirstName field if non-nil, zero value otherwise.

### GetFirstNameOk

`func (o *OrderBuyerBasicInfoDTO) GetFirstNameOk() (*string, bool)`

GetFirstNameOk returns a tuple with the FirstName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstName

`func (o *OrderBuyerBasicInfoDTO) SetFirstName(v string)`

SetFirstName sets FirstName field to given value.

### HasFirstName

`func (o *OrderBuyerBasicInfoDTO) HasFirstName() bool`

HasFirstName returns a boolean if a field has been set.

### GetMiddleName

`func (o *OrderBuyerBasicInfoDTO) GetMiddleName() string`

GetMiddleName returns the MiddleName field if non-nil, zero value otherwise.

### GetMiddleNameOk

`func (o *OrderBuyerBasicInfoDTO) GetMiddleNameOk() (*string, bool)`

GetMiddleNameOk returns a tuple with the MiddleName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMiddleName

`func (o *OrderBuyerBasicInfoDTO) SetMiddleName(v string)`

SetMiddleName sets MiddleName field to given value.

### HasMiddleName

`func (o *OrderBuyerBasicInfoDTO) HasMiddleName() bool`

HasMiddleName returns a boolean if a field has been set.

### GetType

`func (o *OrderBuyerBasicInfoDTO) GetType() OrderBuyerType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OrderBuyerBasicInfoDTO) GetTypeOk() (*OrderBuyerType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OrderBuyerBasicInfoDTO) SetType(v OrderBuyerType)`

SetType sets Type field to given value.

### HasType

`func (o *OrderBuyerBasicInfoDTO) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


