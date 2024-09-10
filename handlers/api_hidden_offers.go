package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AddHiddenOffers - Скрытие товаров и настройки скрытия
func (c *Container) AddHiddenOffers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DeleteHiddenOffers - Возобновление показа товаров
func (c *Container) DeleteHiddenOffers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetHiddenOffers - Информация о скрытых вами товарах
func (c *Container) GetHiddenOffers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

