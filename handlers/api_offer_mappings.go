package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetOfferMappingEntries - Список товаров в каталоге
// Deprecated
func (c *Container) GetOfferMappingEntries(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetSuggestedOfferMappingEntries - Рекомендованные карточки для товаров
// Deprecated
func (c *Container) GetSuggestedOfferMappingEntries(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateOfferMappingEntries - Добавление и редактирование товаров в каталоге
// Deprecated
func (c *Container) UpdateOfferMappingEntries(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

