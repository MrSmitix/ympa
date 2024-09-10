package models
// RejectedPromoOfferUpdateReasonType : Причина отклонения изменения:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU.  * `OFFER_DUPLICATION` — один и тот же товар передан несколько раз.  * `OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар не подходит под условия акции.  * `OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED` — товар не добавлен в акцию по техническим причинам.  * `DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED` — истек срок добавления товаров в акцию.  * `EMPTY_OLD_PRICE` — не указана зачеркнутая цена.  * `EMPTY_PROMO_PRICE` — не указана цена по акции.  * `MAX_PROMO_PRICE_EXCEEDED` — цена по акции превышает максимально возможную цену для участия в акции.  * `PROMO_PRICE_BIGGER_THAN_MAX` — цена по акции больше 95% от зачеркнутой цены.  * `PROMO_PRICE_SMALLER_THAN_MIN` — цена по акции меньше 1% от зачеркнутой цены. 
type RejectedPromoOfferUpdateReasonType string

// List of RejectedPromoOfferUpdateReasonType
const (
	OFFER_DOES_NOT_EXIST RejectedPromoOfferUpdateReasonType = "OFFER_DOES_NOT_EXIST"
	OFFER_DUPLICATION RejectedPromoOfferUpdateReasonType = "OFFER_DUPLICATION"
	OFFER_NOT_ELIGIBLE_FOR_PROMO RejectedPromoOfferUpdateReasonType = "OFFER_NOT_ELIGIBLE_FOR_PROMO"
	OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED RejectedPromoOfferUpdateReasonType = "OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED"
	DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED RejectedPromoOfferUpdateReasonType = "DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED"
	EMPTY_OLD_PRICE RejectedPromoOfferUpdateReasonType = "EMPTY_OLD_PRICE"
	EMPTY_PROMO_PRICE RejectedPromoOfferUpdateReasonType = "EMPTY_PROMO_PRICE"
	MAX_PROMO_PRICE_EXCEEDED RejectedPromoOfferUpdateReasonType = "MAX_PROMO_PRICE_EXCEEDED"
	PROMO_PRICE_BIGGER_THAN_MAX RejectedPromoOfferUpdateReasonType = "PROMO_PRICE_BIGGER_THAN_MAX"
	PROMO_PRICE_SMALLER_THAN_MIN RejectedPromoOfferUpdateReasonType = "PROMO_PRICE_SMALLER_THAN_MIN"
)
