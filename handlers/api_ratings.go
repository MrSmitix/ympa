package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetQualityRatingDetails - Заказы, которые повлияли на индекс качества
func (c *Container) GetQualityRatingDetails(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetQualityRatings - Индекс качества магазинов
func (c *Container) GetQualityRatings(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

