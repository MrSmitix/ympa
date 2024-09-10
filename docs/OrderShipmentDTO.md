# OrderShipmentDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор посылки, присвоенный Маркетом. | [optional] 
**ShipmentDate** | Pointer to **string** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**ShipmentTime** | Pointer to **string** | **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус &#x60;READY_TO_SHIP&#x60;. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.  | [optional] 
**Tracks** | Pointer to [**[]OrderTrackDTO**](OrderTrackDTO.md) | **Только для модели DBS**  Информация для отслеживания перемещений посылки.  | [optional] 
**Boxes** | Pointer to [**[]OrderParcelBoxDTO**](OrderParcelBoxDTO.md) | Список грузовых мест. | [optional] 

## Methods

### NewOrderShipmentDTO

`func NewOrderShipmentDTO() *OrderShipmentDTO`

NewOrderShipmentDTO instantiates a new OrderShipmentDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderShipmentDTOWithDefaults

`func NewOrderShipmentDTOWithDefaults() *OrderShipmentDTO`

NewOrderShipmentDTOWithDefaults instantiates a new OrderShipmentDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OrderShipmentDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OrderShipmentDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OrderShipmentDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *OrderShipmentDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetShipmentDate

`func (o *OrderShipmentDTO) GetShipmentDate() string`

GetShipmentDate returns the ShipmentDate field if non-nil, zero value otherwise.

### GetShipmentDateOk

`func (o *OrderShipmentDTO) GetShipmentDateOk() (*string, bool)`

GetShipmentDateOk returns a tuple with the ShipmentDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShipmentDate

`func (o *OrderShipmentDTO) SetShipmentDate(v string)`

SetShipmentDate sets ShipmentDate field to given value.

### HasShipmentDate

`func (o *OrderShipmentDTO) HasShipmentDate() bool`

HasShipmentDate returns a boolean if a field has been set.

### GetShipmentTime

`func (o *OrderShipmentDTO) GetShipmentTime() string`

GetShipmentTime returns the ShipmentTime field if non-nil, zero value otherwise.

### GetShipmentTimeOk

`func (o *OrderShipmentDTO) GetShipmentTimeOk() (*string, bool)`

GetShipmentTimeOk returns a tuple with the ShipmentTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShipmentTime

`func (o *OrderShipmentDTO) SetShipmentTime(v string)`

SetShipmentTime sets ShipmentTime field to given value.

### HasShipmentTime

`func (o *OrderShipmentDTO) HasShipmentTime() bool`

HasShipmentTime returns a boolean if a field has been set.

### GetTracks

`func (o *OrderShipmentDTO) GetTracks() []OrderTrackDTO`

GetTracks returns the Tracks field if non-nil, zero value otherwise.

### GetTracksOk

`func (o *OrderShipmentDTO) GetTracksOk() (*[]OrderTrackDTO, bool)`

GetTracksOk returns a tuple with the Tracks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTracks

`func (o *OrderShipmentDTO) SetTracks(v []OrderTrackDTO)`

SetTracks sets Tracks field to given value.

### HasTracks

`func (o *OrderShipmentDTO) HasTracks() bool`

HasTracks returns a boolean if a field has been set.

### SetTracksNil

`func (o *OrderShipmentDTO) SetTracksNil(b bool)`

 SetTracksNil sets the value for Tracks to be an explicit nil

### UnsetTracks
`func (o *OrderShipmentDTO) UnsetTracks()`

UnsetTracks ensures that no value is present for Tracks, not even an explicit nil
### GetBoxes

`func (o *OrderShipmentDTO) GetBoxes() []OrderParcelBoxDTO`

GetBoxes returns the Boxes field if non-nil, zero value otherwise.

### GetBoxesOk

`func (o *OrderShipmentDTO) GetBoxesOk() (*[]OrderParcelBoxDTO, bool)`

GetBoxesOk returns a tuple with the Boxes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoxes

`func (o *OrderShipmentDTO) SetBoxes(v []OrderParcelBoxDTO)`

SetBoxes sets Boxes field to given value.

### HasBoxes

`func (o *OrderShipmentDTO) HasBoxes() bool`

HasBoxes returns a boolean if a field has been set.

### SetBoxesNil

`func (o *OrderShipmentDTO) SetBoxesNil(b bool)`

 SetBoxesNil sets the value for Boxes to be an explicit nil

### UnsetBoxes
`func (o *OrderShipmentDTO) UnsetBoxes()`

UnsetBoxes ensures that no value is present for Boxes, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


