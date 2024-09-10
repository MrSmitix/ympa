//
// OrderDeliveryAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

open class OrderDeliveryAPI {

    /**
     Информация о покупателе — физическом лице
     
     - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter orderId: (path) Идентификатор заказа. 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func getOrderBuyerInfo(campaignId: Int64, orderId: Int64, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: GetOrderBuyerInfoResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return getOrderBuyerInfoWithRequestBuilder(campaignId: campaignId, orderId: orderId).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Информация о покупателе — физическом лице
     - GET /campaigns/{campaignId}/orders/{orderId}/buyer
     - Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
     - OAuth:
       - type: oauth2
       - name: OAuth
     - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter orderId: (path) Идентификатор заказа. 
     - returns: RequestBuilder<GetOrderBuyerInfoResponse> 
     */
    open class func getOrderBuyerInfoWithRequestBuilder(campaignId: Int64, orderId: Int64) -> RequestBuilder<GetOrderBuyerInfoResponse> {
        var localVariablePath = "/campaigns/{campaignId}/orders/{orderId}/buyer"
        let campaignIdPreEscape = "\(APIHelper.mapValueToPathItem(campaignId))"
        let campaignIdPostEscape = campaignIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{campaignId}", with: campaignIdPostEscape, options: .literal, range: nil)
        let orderIdPreEscape = "\(APIHelper.mapValueToPathItem(orderId))"
        let orderIdPostEscape = orderIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{orderId}", with: orderIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<GetOrderBuyerInfoResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Изменение даты доставки заказа
     
     - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter orderId: (path) Идентификатор заказа. 
     - parameter setOrderDeliveryDateRequest: (body)  
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func setOrderDeliveryDate(campaignId: Int64, orderId: Int64, setOrderDeliveryDateRequest: SetOrderDeliveryDateRequest, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: EmptyApiResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return setOrderDeliveryDateWithRequestBuilder(campaignId: campaignId, orderId: orderId, setOrderDeliveryDateRequest: setOrderDeliveryDateRequest).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Изменение даты доставки заказа
     - PUT /campaigns/{campaignId}/orders/{orderId}/delivery/date
     - Метод изменяет дату доставки заказа в статусе `PROCESSING` или `DELIVERY`. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     - OAuth:
       - type: oauth2
       - name: OAuth
     - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter orderId: (path) Идентификатор заказа. 
     - parameter setOrderDeliveryDateRequest: (body)  
     - returns: RequestBuilder<EmptyApiResponse> 
     */
    open class func setOrderDeliveryDateWithRequestBuilder(campaignId: Int64, orderId: Int64, setOrderDeliveryDateRequest: SetOrderDeliveryDateRequest) -> RequestBuilder<EmptyApiResponse> {
        var localVariablePath = "/campaigns/{campaignId}/orders/{orderId}/delivery/date"
        let campaignIdPreEscape = "\(APIHelper.mapValueToPathItem(campaignId))"
        let campaignIdPostEscape = campaignIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{campaignId}", with: campaignIdPostEscape, options: .literal, range: nil)
        let orderIdPreEscape = "\(APIHelper.mapValueToPathItem(orderId))"
        let orderIdPostEscape = orderIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{orderId}", with: orderIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: setOrderDeliveryDateRequest)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "application/json",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<EmptyApiResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "PUT", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Передача трек‑номера посылки
     
     - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter orderId: (path) Идентификатор заказа. 
     - parameter setOrderDeliveryTrackCodeRequest: (body)  
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func setOrderDeliveryTrackCode(campaignId: Int64, orderId: Int64, setOrderDeliveryTrackCodeRequest: SetOrderDeliveryTrackCodeRequest, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: EmptyApiResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return setOrderDeliveryTrackCodeWithRequestBuilder(campaignId: campaignId, orderId: orderId, setOrderDeliveryTrackCodeRequest: setOrderDeliveryTrackCodeRequest).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Передача трек‑номера посылки
     - POST /campaigns/{campaignId}/orders/{orderId}/delivery/track
     - {% note warning \"Этот запрос только для DBS\" %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     - OAuth:
       - type: oauth2
       - name: OAuth
     - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter orderId: (path) Идентификатор заказа. 
     - parameter setOrderDeliveryTrackCodeRequest: (body)  
     - returns: RequestBuilder<EmptyApiResponse> 
     */
    open class func setOrderDeliveryTrackCodeWithRequestBuilder(campaignId: Int64, orderId: Int64, setOrderDeliveryTrackCodeRequest: SetOrderDeliveryTrackCodeRequest) -> RequestBuilder<EmptyApiResponse> {
        var localVariablePath = "/campaigns/{campaignId}/orders/{orderId}/delivery/track"
        let campaignIdPreEscape = "\(APIHelper.mapValueToPathItem(campaignId))"
        let campaignIdPostEscape = campaignIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{campaignId}", with: campaignIdPostEscape, options: .literal, range: nil)
        let orderIdPreEscape = "\(APIHelper.mapValueToPathItem(orderId))"
        let orderIdPostEscape = orderIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{orderId}", with: orderIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: setOrderDeliveryTrackCodeRequest)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "application/json",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<EmptyApiResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Продление срока хранения заказа
     
     - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter orderId: (path) Идентификатор заказа. 
     - parameter updateOrderStorageLimitRequest: (body)  
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func updateOrderStorageLimit(campaignId: Int64, orderId: Int64, updateOrderStorageLimitRequest: UpdateOrderStorageLimitRequest, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: EmptyApiResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return updateOrderStorageLimitWithRequestBuilder(campaignId: campaignId, orderId: orderId, updateOrderStorageLimitRequest: updateOrderStorageLimitRequest).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Продление срока хранения заказа
     - PUT /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit
     - Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе `PICKUP`. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре `outletStorageLimitDate` запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     - OAuth:
       - type: oauth2
       - name: OAuth
     - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter orderId: (path) Идентификатор заказа. 
     - parameter updateOrderStorageLimitRequest: (body)  
     - returns: RequestBuilder<EmptyApiResponse> 
     */
    open class func updateOrderStorageLimitWithRequestBuilder(campaignId: Int64, orderId: Int64, updateOrderStorageLimitRequest: UpdateOrderStorageLimitRequest) -> RequestBuilder<EmptyApiResponse> {
        var localVariablePath = "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit"
        let campaignIdPreEscape = "\(APIHelper.mapValueToPathItem(campaignId))"
        let campaignIdPostEscape = campaignIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{campaignId}", with: campaignIdPostEscape, options: .literal, range: nil)
        let orderIdPreEscape = "\(APIHelper.mapValueToPathItem(orderId))"
        let orderIdPostEscape = orderIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{orderId}", with: orderIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: updateOrderStorageLimitRequest)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "application/json",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<EmptyApiResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "PUT", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Передача кода подтверждения
     
     - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter orderId: (path) Идентификатор заказа. 
     - parameter verifyOrderEacRequest: (body)  
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func verifyOrderEac(campaignId: Int64, orderId: Int64, verifyOrderEacRequest: VerifyOrderEacRequest, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: VerifyOrderEacResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return verifyOrderEacWithRequestBuilder(campaignId: campaignId, orderId: orderId, verifyOrderEacRequest: verifyOrderEacRequest).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Передача кода подтверждения
     - PUT /campaigns/{campaignId}/orders/{orderId}/verifyEac
     - Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре `delivery`, вложенном в `order` будет возвращаться параметр `eacType` с типом `Enum` — тип кода подтверждения для передачи заказа.  Возможные значения: `MERCHANT_TO_COURIER` — магазин называет код курьеру, `COURIER_TO_MERCHANT` — курьер называет код магазину.  Параметр `eacType` возвращается при статусах заказа `COURIER_FOUND`, `COURIER_ARRIVED_TO_SENDER` и `DELIVERY_SERVICE_UNDELIVERED`. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     - OAuth:
       - type: oauth2
       - name: OAuth
     - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
     - parameter orderId: (path) Идентификатор заказа. 
     - parameter verifyOrderEacRequest: (body)  
     - returns: RequestBuilder<VerifyOrderEacResponse> 
     */
    open class func verifyOrderEacWithRequestBuilder(campaignId: Int64, orderId: Int64, verifyOrderEacRequest: VerifyOrderEacRequest) -> RequestBuilder<VerifyOrderEacResponse> {
        var localVariablePath = "/campaigns/{campaignId}/orders/{orderId}/verifyEac"
        let campaignIdPreEscape = "\(APIHelper.mapValueToPathItem(campaignId))"
        let campaignIdPostEscape = campaignIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{campaignId}", with: campaignIdPostEscape, options: .literal, range: nil)
        let orderIdPreEscape = "\(APIHelper.mapValueToPathItem(orderId))"
        let orderIdPostEscape = orderIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{orderId}", with: orderIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: verifyOrderEacRequest)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "application/json",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<VerifyOrderEacResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "PUT", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }
}
