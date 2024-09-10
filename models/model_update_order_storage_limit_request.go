package models

// UpdateOrderStorageLimitRequest - Запрос на обновление срока хранения заказа в ПВЗ.
type UpdateOrderStorageLimitRequest struct {

	// Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`. 
	NewDate string `json:"newDate"`
}
