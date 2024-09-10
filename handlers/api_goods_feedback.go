package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// DeleteGoodsFeedbackComment - Удаление комментария к отзыву
func (c *Container) DeleteGoodsFeedbackComment(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetGoodsFeedbackComments - Получение комментариев к отзыву
func (c *Container) GetGoodsFeedbackComments(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetGoodsFeedbacks - Получение отзывов о товарах продавца
func (c *Container) GetGoodsFeedbacks(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SkipGoodsFeedbacksReaction - Отказ от ответа на отзывы
func (c *Container) SkipGoodsFeedbacksReaction(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateGoodsFeedbackComment - Добавление нового или изменение созданного комментария
func (c *Container) UpdateGoodsFeedbackComment(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

