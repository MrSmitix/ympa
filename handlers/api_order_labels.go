package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе
func (c *Container) GenerateOrderLabel(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе
func (c *Container) GenerateOrderLabels(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков
func (c *Container) GetOrderLabelsData(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

