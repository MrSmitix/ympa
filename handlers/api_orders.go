package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AcceptOrderCancellation - Отмена заказа покупателем
func (c *Container) AcceptOrderCancellation(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetOrder - Информация об одном заказе
func (c *Container) GetOrder(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetOrders - Информация о нескольких заказах
func (c *Container) GetOrders(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ProvideOrderDigitalCodes - Передача ключей цифровых товаров
func (c *Container) ProvideOrderDigitalCodes(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара
func (c *Container) ProvideOrderItemIdentifiers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SetOrderBoxLayout - Подготовка заказа
func (c *Container) SetOrderBoxLayout(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SetOrderShipmentBoxes - Передача количества грузовых мест в заказе
func (c *Container) SetOrderShipmentBoxes(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц
func (c *Container) UpdateOrderItems(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateOrderStatus - Изменение статуса одного заказа
func (c *Container) UpdateOrderStatus(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateOrderStatuses - Изменение статусов нескольких заказов
func (c *Container) UpdateOrderStatuses(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

