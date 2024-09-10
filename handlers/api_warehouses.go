package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetFulfillmentWarehouses - Идентификаторы складов Маркета (FBY)
func (c *Container) GetFulfillmentWarehouses(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetWarehouses - Список складов и групп складов
func (c *Container) GetWarehouses(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

