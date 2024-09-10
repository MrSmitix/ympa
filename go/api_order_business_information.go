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

type OrderBusinessInformationAPI struct {
}

// Post /campaigns/:campaignId/orders/:orderId/business-buyer
// Информация о покупателе — юридическом лице 
func (api *OrderBusinessInformationAPI) GetOrderBusinessBuyerInfo(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /campaigns/:campaignId/orders/:orderId/documents
// Информация о документах 
func (api *OrderBusinessInformationAPI) GetOrderBusinessDocumentsInfo(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

