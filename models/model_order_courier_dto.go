package models

// OrderCourierDto - Информация о курьере.
type OrderCourierDto struct {

	// Полное имя курьера.
	FullName string `json:"fullName,omitempty"`

	// Номер телефона курьера.
	Phone string `json:"phone,omitempty"`

	// Добавочный номер телефона.
	PhoneExtension string `json:"phoneExtension,omitempty"`

	// Номер транспортного средства.
	VehicleNumber string `json:"vehicleNumber,omitempty"`

	// Описание машины. Например, модель и цвет.
	VehicleDescription string `json:"vehicleDescription,omitempty"`
}
