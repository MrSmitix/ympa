package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetCampaign - Информация о магазине
func (c *Container) GetCampaign(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetCampaignLogins - Логины, связанные с магазином
func (c *Container) GetCampaignLogins(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetCampaignRegion - Регион магазина
// Deprecated
func (c *Container) GetCampaignRegion(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetCampaignSettings - Настройки магазина
func (c *Container) GetCampaignSettings(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetCampaigns - Список магазинов пользователя
func (c *Container) GetCampaigns(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetCampaignsByLogin - Магазины, доступные логину
func (c *Container) GetCampaignsByLogin(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

