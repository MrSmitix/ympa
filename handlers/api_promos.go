package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// DeletePromoOffers - Удаление товаров из акции
func (c *Container) DeletePromoOffers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetPromoOffers - Получение списка товаров, которые участвуют или могут участвовать в акции
func (c *Container) GetPromoOffers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetPromos - Получение списка акций
func (c *Container) GetPromos(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdatePromoOffers - Добавление товаров в акцию или изменение их цен
func (c *Container) UpdatePromoOffers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

