package handlers
import (
	"github.com/yandex-market/yandex-market-partner-api/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GenerateBoostConsolidatedReport - Отчет по бусту продаж
func (c *Container) GenerateBoostConsolidatedReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция»
func (c *Container) GenerateCompetitorsPositionReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GenerateGoodsFeedbackReport - Отчет по отзывам о товарах
func (c *Container) GenerateGoodsFeedbackReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GenerateGoodsMovementReport - Отчет по движению товаров
func (c *Container) GenerateGoodsMovementReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GenerateGoodsRealizationReport - Отчет по реализации
func (c *Container) GenerateGoodsRealizationReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GenerateGoodsTurnoverReport - Отчет по оборачиваемости
func (c *Container) GenerateGoodsTurnoverReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах
func (c *Container) GenerateMassOrderLabelsReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GeneratePricesReport - Отчет «Цены на рынке»
func (c *Container) GeneratePricesReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GenerateShelfsStatisticsReport - Отчет по полкам
func (c *Container) GenerateShelfsStatisticsReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GenerateShipmentListDocumentReport - Получение листа сборки
func (c *Container) GenerateShipmentListDocumentReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GenerateShowsSalesReport - Отчет «Аналитика продаж»
func (c *Container) GenerateShowsSalesReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GenerateStocksOnWarehousesReport - Отчет по остаткам на складах
func (c *Container) GenerateStocksOnWarehousesReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг
func (c *Container) GenerateUnitedMarketplaceServicesReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GenerateUnitedNettingReport - Отчет по платежам
func (c *Container) GenerateUnitedNettingReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GenerateUnitedOrdersReport - Отчет по заказам
func (c *Container) GenerateUnitedOrdersReport(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetReportInfo - Получение заданного отчета
func (c *Container) GetReportInfo(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

