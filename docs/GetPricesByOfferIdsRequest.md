# ympa_r_client::GetPricesByOfferIdsRequest

Запрос списка цен.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerIds** | **array[character]** | Список SKU.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     | [optional] [Max. items: 2000] [Min. items: 1] 


