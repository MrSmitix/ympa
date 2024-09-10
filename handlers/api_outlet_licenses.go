package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// DeleteOutletLicenses - Удаление лицензий для точек продаж
func (c *Container) DeleteOutletLicenses(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetOutletLicenses - Информация о лицензиях для точек продаж
func (c *Container) GetOutletLicenses(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateOutletLicenses - Создание и изменение лицензий для точек продаж
func (c *Container) UpdateOutletLicenses(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

