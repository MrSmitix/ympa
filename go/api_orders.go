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

type OrdersAPI struct {
}

// Put /campaigns/:campaignId/orders/:orderId/cancellation/accept
// Отмена заказа покупателем 
func (api *OrdersAPI) AcceptOrderCancellation(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /campaigns/:campaignId/orders/:orderId
// Информация об одном заказе 
func (api *OrdersAPI) GetOrder(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /campaigns/:campaignId/orders
// Информация о нескольких заказах 
func (api *OrdersAPI) GetOrders(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /campaigns/:campaignId/orders/:orderId/deliverDigitalGoods
// Передача ключей цифровых товаров 
func (api *OrdersAPI) ProvideOrderDigitalCodes(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /campaigns/:campaignId/orders/:orderId/identifiers
// Передача кодов маркировки единиц товара 
func (api *OrdersAPI) ProvideOrderItemIdentifiers(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /campaigns/:campaignId/orders/:orderId/boxes
// Подготовка заказа 
func (api *OrdersAPI) SetOrderBoxLayout(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes
// Передача количества грузовых мест в заказе 
func (api *OrdersAPI) SetOrderShipmentBoxes(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /campaigns/:campaignId/orders/:orderId/items
// Удаление товара из заказа или уменьшение числа единиц 
func (api *OrdersAPI) UpdateOrderItems(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /campaigns/:campaignId/orders/:orderId/status
// Изменение статуса одного заказа 
func (api *OrdersAPI) UpdateOrderStatus(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /campaigns/:campaignId/orders/status-update
// Изменение статусов нескольких заказов 
func (api *OrdersAPI) UpdateOrderStatuses(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

