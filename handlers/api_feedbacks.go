package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetFeedbackAndCommentUpdates - Новые и обновленные отзывы о магазине
// Deprecated
func (c *Container) GetFeedbackAndCommentUpdates(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

