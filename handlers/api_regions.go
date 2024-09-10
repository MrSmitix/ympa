package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// SearchRegionChildren - Информация о дочерних регионах
func (c *Container) SearchRegionChildren(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SearchRegionsById - Информация о регионе
func (c *Container) SearchRegionsById(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SearchRegionsByName - Поиск регионов по их имени
func (c *Container) SearchRegionsByName(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

