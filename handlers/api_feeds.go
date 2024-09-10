package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetFeed - Информация о прайс-листе
// Deprecated
func (c *Container) GetFeed(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetFeedIndexLogs - Отчет по индексации прайс-листа
// Deprecated
func (c *Container) GetFeedIndexLogs(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetFeeds - Список прайс-листов магазина
// Deprecated
func (c *Container) GetFeeds(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// RefreshFeed - Сообщить, что прайс-лист обновился
// Deprecated
func (c *Container) RefreshFeed(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SetFeedParams - Изменение параметров прайс-листа
// Deprecated
func (c *Container) SetFeedParams(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

