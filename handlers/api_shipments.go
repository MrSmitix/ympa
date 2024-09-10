package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// ConfirmShipment - Подтверждение отгрузки
func (c *Container) ConfirmShipment(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DownloadShipmentAct - Получение акта приема-передачи
func (c *Container) DownloadShipmentAct(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DownloadShipmentDiscrepancyAct - Получение акта расхождений
func (c *Container) DownloadShipmentDiscrepancyAct(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DownloadShipmentInboundAct - Получение фактического акта приема-передачи
func (c *Container) DownloadShipmentInboundAct(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS)
func (c *Container) DownloadShipmentPalletLabels(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
func (c *Container) DownloadShipmentReceptionTransferAct(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DownloadShipmentTransportationWaybill - Получение транспортной накладной
func (c *Container) DownloadShipmentTransportationWaybill(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetShipment - Получение информации об одной отгрузке
func (c *Container) GetShipment(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS)
func (c *Container) GetShipmentOrdersInfo(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SearchShipments - Получение информации о нескольких отгрузках
func (c *Container) SearchShipments(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SetShipmentPalletsCount - Передача количества упаковок в отгрузке
func (c *Container) SetShipmentPalletsCount(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// TransferOrdersFromShipment - Перенос заказов в следующую отгрузку
func (c *Container) TransferOrdersFromShipment(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

