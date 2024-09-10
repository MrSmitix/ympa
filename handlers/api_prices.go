package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetPrices - Список цен
// Deprecated
func (c *Container) GetPrices(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetPricesByOfferIds - Просмотр цен на указанные товары в магазине
func (c *Container) GetPricesByOfferIds(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetSuggestedPrices - Цены для продвижения товаров
// Deprecated
func (c *Container) GetSuggestedPrices(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateBusinessPrices - Установка цен на товары во всех магазинах
func (c *Container) UpdateBusinessPrices(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdatePrices - Установка цен на товары в конкретном магазине
func (c *Container) UpdatePrices(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

