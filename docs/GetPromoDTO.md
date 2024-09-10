
# Table `GetPromoDTO`
(mapped from: GetPromoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Идентификатор акции. | 
**name** | name | text NOT NULL |  | **kotlin.String** | Название акции. | 
**period** | period | long NOT NULL |  | [**PromoPeriodDTO**](PromoPeriodDTO.md) |  |  [foreignkey]
**participating** | participating | boolean NOT NULL |  | **kotlin.Boolean** | Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | 
**assortmentInfo** | assortmentInfo | long NOT NULL |  | [**GetPromoAssortmentInfoDTO**](GetPromoAssortmentInfoDTO.md) |  |  [foreignkey]
**mechanicsInfo** | mechanicsInfo | long NOT NULL |  | [**GetPromoMechanicsInfoDTO**](GetPromoMechanicsInfoDTO.md) |  |  [foreignkey]
**bestsellerInfo** | bestsellerInfo | long NOT NULL |  | [**GetPromoBestsellerInfoDTO**](GetPromoBestsellerInfoDTO.md) |  |  [foreignkey]
**channels** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ChannelType&gt;**](ChannelType.md) | Список каналов продвижения товаров. |  [optional]
**constraints** | constraints | long |  | [**GetPromoConstraintsDTO**](GetPromoConstraintsDTO.md) |  |  [optional] [foreignkey]









# **Table `GetPromoDTOChannelType`**
(mapped from: GetPromoDTOChannelType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getPromoDTO | getPromoDTO | long | | kotlin.Long | Primary Key | *one*
channelType | channelType | long | | kotlin.Long | Foreign Key | *many*




