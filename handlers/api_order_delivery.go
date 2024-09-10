package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetOrderBuyerInfo - Информация о покупателе — физическом лице
func (c *Container) GetOrderBuyerInfo(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SetOrderDeliveryDate - Изменение даты доставки заказа
func (c *Container) SetOrderDeliveryDate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SetOrderDeliveryTrackCode - Передача трек‑номера посылки
func (c *Container) SetOrderDeliveryTrackCode(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateOrderStorageLimit - Продление срока хранения заказа
func (c *Container) UpdateOrderStorageLimit(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// VerifyOrderEac - Передача кода подтверждения
func (c *Container) VerifyOrderEac(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

