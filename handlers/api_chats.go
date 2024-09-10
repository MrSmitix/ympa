package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// CreateChat - Создание нового чата с покупателем
func (c *Container) CreateChat(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetChatHistory - Получение истории сообщений в чате
func (c *Container) GetChatHistory(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetChats - Получение доступных чатов
func (c *Container) GetChats(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SendFileToChat - Отправка файла в чат
func (c *Container) SendFileToChat(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SendMessageToChat - Отправка сообщения в чат
func (c *Container) SendMessageToChat(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

