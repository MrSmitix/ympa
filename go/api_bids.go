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

type BidsAPI struct {
}

// Post /businesses/:businessId/bids/info
// Информация об установленных ставках 
func (api *BidsAPI) GetBidsInfoForBusiness(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /businesses/:businessId/bids/recommendations
// Рекомендованные ставки для заданных товаров 
func (api *BidsAPI) GetBidsRecommendations(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /businesses/:businessId/bids
// Включение буста продаж и установка ставок 
func (api *BidsAPI) PutBidsForBusiness(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /campaigns/:campaignId/bids
// Включение буста продаж и установка ставок для магазина 
func (api *BidsAPI) PutBidsForCampaign(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

