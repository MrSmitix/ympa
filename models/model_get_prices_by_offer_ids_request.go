package models

// GetPricesByOfferIdsRequest - Запрос списка цен.
type GetPricesByOfferIdsRequest struct {

	// Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
	OfferIds *[]string `json:"offerIds,omitempty"`
}
