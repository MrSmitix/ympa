package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetBidsInfoForBusiness - Информация об установленных ставках
func (c *Container) GetBidsInfoForBusiness(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetBidsRecommendations - Рекомендованные ставки для заданных товаров
func (c *Container) GetBidsRecommendations(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// PutBidsForBusiness - Включение буста продаж и установка ставок
func (c *Container) PutBidsForBusiness(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// PutBidsForCampaign - Включение буста продаж и установка ставок для магазина
func (c *Container) PutBidsForCampaign(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

