# ympa_r_client::ReturnDecisionDTO

Решения по возвратам.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**returnItemId** | **integer** | Идентификатор товара в возврате. | [optional] 
**count** | **integer** | Количество единиц товара. | [optional] 
**comment** | **character** | Комментарий. | [optional] 
**reasonType** | [**ReturnDecisionReasonType**](ReturnDecisionReasonType.md) |  | [optional] [Enum: ] 
**subreasonType** | [**ReturnDecisionSubreasonType**](ReturnDecisionSubreasonType.md) |  | [optional] [Enum: ] 
**decisionType** | [**ReturnDecisionType**](ReturnDecisionType.md) |  | [optional] [Enum: ] 
**refundAmount** | **integer** | Сумма возврата. | [optional] 
**partnerCompensation** | **integer** | Компенсация за обратную доставку. | [optional] 
**images** | **array[character]** | Список хеш-кодов фотографий товара от покупателя. | [optional] 


