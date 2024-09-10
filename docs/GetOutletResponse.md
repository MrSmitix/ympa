# GetOutletResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Outlet** | Pointer to [**FullOutletDTO**](FullOutletDTO.md) |  | [optional] 

## Methods

### NewGetOutletResponse

`func NewGetOutletResponse() *GetOutletResponse`

NewGetOutletResponse instantiates a new GetOutletResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetOutletResponseWithDefaults

`func NewGetOutletResponseWithDefaults() *GetOutletResponse`

NewGetOutletResponseWithDefaults instantiates a new GetOutletResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOutlet

`func (o *GetOutletResponse) GetOutlet() FullOutletDTO`

GetOutlet returns the Outlet field if non-nil, zero value otherwise.

### GetOutletOk

`func (o *GetOutletResponse) GetOutletOk() (*FullOutletDTO, bool)`

GetOutletOk returns a tuple with the Outlet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutlet

`func (o *GetOutletResponse) SetOutlet(v FullOutletDTO)`

SetOutlet sets Outlet field to given value.

### HasOutlet

`func (o *GetOutletResponse) HasOutlet() bool`

HasOutlet returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


