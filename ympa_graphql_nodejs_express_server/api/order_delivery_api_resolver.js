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

// order_delivery_api

export default {
    Query: {

        // @return GetOrderBuyerInfoResponse
        GetOrderBuyerInfo: ($campaignId, $orderId) => {
            return {
                "campaignId": "789",
                "orderId": "789"
            };
        },

    },

    Mutation: {

        // @return EmptyApiResponse
        SetOrderDeliveryDate: ($campaignId, $orderId, $setOrderDeliveryDateRequest) => {
            return {
                "campaignId": "789",
                "orderId": "789",
                "setOrderDeliveryDateRequest": ""
            };
        },

        // @return EmptyApiResponse
        SetOrderDeliveryTrackCode: ($campaignId, $orderId, $setOrderDeliveryTrackCodeRequest) => {
            return {
                "campaignId": "789",
                "orderId": "789",
                "setOrderDeliveryTrackCodeRequest": ""
            };
        },

        // @return EmptyApiResponse
        UpdateOrderStorageLimit: ($campaignId, $orderId, $updateOrderStorageLimitRequest) => {
            return {
                "campaignId": "789",
                "orderId": "789",
                "updateOrderStorageLimitRequest": ""
            };
        },

        // @return VerifyOrderEacResponse
        VerifyOrderEac: ($campaignId, $orderId, $verifyOrderEacRequest) => {
            return {
                "campaignId": "789",
                "orderId": "789",
                "verifyOrderEacRequest": ""
            };
        },

    }
}