package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetReturn - Информация о невыкупе или возврате
func (c *Container) GetReturn(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetReturnApplication - Получение заявления на возврат
func (c *Container) GetReturnApplication(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetReturnPhoto - Получение фотографии возврата
func (c *Container) GetReturnPhoto(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetReturns - Список невыкупов и возвратов
func (c *Container) GetReturns(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SetReturnDecision - Принятие или изменение решения по возврату
func (c *Container) SetReturnDecision(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SubmitReturnDecision - Подтверждение решения по возврату
func (c *Container) SubmitReturnDecision(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

