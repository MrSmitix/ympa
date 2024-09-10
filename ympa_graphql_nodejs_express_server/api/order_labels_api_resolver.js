/**
 * 
 * Партнерский API Маркета
 * 
 * 
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 * 
 * Version: LATEST
 * 
 * Generated by OpenAPI Generator: https://openapi-generator.tech
 */

// package ympa_graphql_nodejs_express_server

// order_labels_api

export default {
    Query: {

        // @return String!
        GenerateOrderLabel: ($campaignId, $orderId, $shipmentId, $boxId, $format) => {
            return {
                "campaignId": "789",
                "orderId": "789",
                "shipmentId": "789",
                "boxId": "789",
                "format": ""
            };
        },

        // @return String!
        GenerateOrderLabels: ($campaignId, $orderId, $format) => {
            return {
                "campaignId": "789",
                "orderId": "789",
                "format": ""
            };
        },

        // @return GetOrderLabelsDataResponse
        GetOrderLabelsData: ($campaignId, $orderId) => {
            return {
                "campaignId": "789",
                "orderId": "789"
            };
        },

    },

    Mutation: {

    }
}