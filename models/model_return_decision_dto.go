package models

// ReturnDecisionDto - Решения по возвратам.
type ReturnDecisionDto struct {

	// Идентификатор товара в возврате.
	ReturnItemId int64 `json:"returnItemId,omitempty"`

	// Количество единиц товара.
	Count int32 `json:"count,omitempty"`

	// Комментарий.
	Comment string `json:"comment,omitempty"`

	ReasonType ReturnDecisionReasonType `json:"reasonType,omitempty"`

	SubreasonType ReturnDecisionSubreasonType `json:"subreasonType,omitempty"`

	DecisionType ReturnDecisionType `json:"decisionType,omitempty"`

	// Сумма возврата.
	RefundAmount int64 `json:"refundAmount,omitempty"`

	// Компенсация за обратную доставку.
	PartnerCompensation int64 `json:"partnerCompensation,omitempty"`

	// Список хеш-кодов фотографий товара от покупателя.
	Images *[]string `json:"images,omitempty"`
}
