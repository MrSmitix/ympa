package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// ConfirmBusinessPrices - Удаление товара из карантина по цене в кабинете
func (c *Container) ConfirmBusinessPrices(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ConfirmCampaignPrices - Удаление товара из карантина по цене в магазине
func (c *Container) ConfirmCampaignPrices(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetBusinessQuarantineOffers - Список товаров, находящихся в карантине по цене в кабинете
func (c *Container) GetBusinessQuarantineOffers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetCampaignQuarantineOffers - Список товаров, находящихся в карантине по цене в магазине
func (c *Container) GetCampaignQuarantineOffers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

