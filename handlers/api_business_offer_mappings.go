package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AddOffersToArchive - Добавление товаров в архив
func (c *Container) AddOffersToArchive(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DeleteOffers - Удаление товаров из каталога
func (c *Container) DeleteOffers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DeleteOffersFromArchive - Удаление товаров из архива
func (c *Container) DeleteOffersFromArchive(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetOfferMappings - Информация о товарах в каталоге
func (c *Container) GetOfferMappings(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetSuggestedOfferMappings - Просмотр карточек на Маркете, которые подходят вашим товарам
func (c *Container) GetSuggestedOfferMappings(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateOfferMappings - Добавление товаров в каталог и изменение информации о них
func (c *Container) UpdateOfferMappings(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

