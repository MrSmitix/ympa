/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

import (
	"github.com/gin-gonic/gin"
)

type PricesAPI struct {
}

// Get /campaigns/:campaignId/offer-prices
// Список цен 
// Deprecated
func (api *PricesAPI) GetPrices(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /campaigns/:campaignId/offer-prices
// Просмотр цен на указанные товары в магазине 
func (api *PricesAPI) GetPricesByOfferIds(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /campaigns/:campaignId/offer-prices/suggestions
// Цены для продвижения товаров 
// Deprecated
func (api *PricesAPI) GetSuggestedPrices(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /businesses/:businessId/offer-prices/updates
// Установка цен на товары во всех магазинах 
func (api *PricesAPI) UpdateBusinessPrices(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /campaigns/:campaignId/offer-prices/updates
// Установка цен на товары в конкретном магазине 
func (api *PricesAPI) UpdatePrices(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

