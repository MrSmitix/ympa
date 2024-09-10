package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetCategoryContentParameters - Списки характеристик товаров по категориям
func (c *Container) GetCategoryContentParameters(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина
func (c *Container) GetOfferCardsContentStatus(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateOfferContent - Редактирование категорийных характеристик товара
func (c *Container) UpdateOfferContent(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

