package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetOrderBusinessBuyerInfo - Информация о покупателе — юридическом лице
func (c *Container) GetOrderBusinessBuyerInfo(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetOrderBusinessDocumentsInfo - Информация о документах
func (c *Container) GetOrderBusinessDocumentsInfo(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

