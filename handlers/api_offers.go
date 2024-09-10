package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// DeleteCampaignOffers - Удаление товаров из ассортимента магазина
func (c *Container) DeleteCampaignOffers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetAllOffers - Все предложения магазина
// Deprecated
func (c *Container) GetAllOffers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине
func (c *Container) GetCampaignOffers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetOfferRecommendations - Рекомендации Маркета, касающиеся цен
func (c *Container) GetOfferRecommendations(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetOffers - Предложения магазина
// Deprecated
func (c *Container) GetOffers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateCampaignOffers - Изменение условий продажи товаров в магазине
func (c *Container) UpdateCampaignOffers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

