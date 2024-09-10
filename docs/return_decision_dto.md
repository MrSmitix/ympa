# return_decision_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**return_item_id** | **long** | Идентификатор товара в возврате. | [optional] 
**count** | **int** | Количество единиц товара. | [optional] 
**comment** | **char \*** | Комментарий. | [optional] 
**reason_type** | **return_decision_reason_type_t \*** |  | [optional] 
**subreason_type** | **return_decision_subreason_type_t \*** |  | [optional] 
**decision_type** | **return_decision_type_t \*** |  | [optional] 
**refund_amount** | **long** | Сумма возврата. | [optional] 
**partner_compensation** | **long** | Компенсация за обратную доставку. | [optional] 
**images** | **list_t \*** | Список хеш-кодов фотографий товара от покупателя. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


