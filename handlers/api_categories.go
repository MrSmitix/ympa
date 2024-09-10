package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе
func (c *Container) GetCategoriesMaxSaleQuantum(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetCategoriesTree - Дерево категорий
func (c *Container) GetCategoriesTree(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

