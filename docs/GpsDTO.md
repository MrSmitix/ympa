# GpsDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Latitude** | **float32** | Широта. | 
**Longitude** | **float32** | Долгота. | 

## Methods

### NewGpsDTO

`func NewGpsDTO(latitude float32, longitude float32, ) *GpsDTO`

NewGpsDTO instantiates a new GpsDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGpsDTOWithDefaults

`func NewGpsDTOWithDefaults() *GpsDTO`

NewGpsDTOWithDefaults instantiates a new GpsDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLatitude

`func (o *GpsDTO) GetLatitude() float32`

GetLatitude returns the Latitude field if non-nil, zero value otherwise.

### GetLatitudeOk

`func (o *GpsDTO) GetLatitudeOk() (*float32, bool)`

GetLatitudeOk returns a tuple with the Latitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatitude

`func (o *GpsDTO) SetLatitude(v float32)`

SetLatitude sets Latitude field to given value.


### GetLongitude

`func (o *GpsDTO) GetLongitude() float32`

GetLongitude returns the Longitude field if non-nil, zero value otherwise.

### GetLongitudeOk

`func (o *GpsDTO) GetLongitudeOk() (*float32, bool)`

GetLongitudeOk returns a tuple with the Longitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLongitude

`func (o *GpsDTO) SetLongitude(v float32)`

SetLongitude sets Longitude field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


