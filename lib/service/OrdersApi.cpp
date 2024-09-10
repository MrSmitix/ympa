#include "OrdersApi.h"

using namespace Tiny;



        Response<
            EmptyApiResponse
        >
        OrdersApi::
        acceptOrderCancellation(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            AcceptOrderCancellationRequest acceptOrderCancellationRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept"; //campaignId orderId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | acceptOrderCancellationRequest



            payload = acceptOrderCancellationRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOrderResponse
        >
        OrdersApi::
        getOrder(
            
            long campaignId
            , 
            
            long orderId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}"; //campaignId orderId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetOrderResponse obj(output_string);


            Response<GetOrderResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOrdersResponse
        >
        OrdersApi::
        getOrders(
            
            long campaignId
            , 
            std::list<long> orderIds
            
            , 
            Set<OrderStatusType> status
            
            , 
            Set<OrderSubstatusType> substatus
            
            , 
            
            Date fromDate
            , 
            
            Date toDate
            , 
            
            Date supplierShipmentDateFrom
            , 
            
            Date supplierShipmentDateTo
            , 
            
            std::string updatedAtFrom
            , 
            
            std::string updatedAtTo
            , 
            
            OrderDeliveryDispatchType dispatchType
            , 
            
            bool fake
            , 
            
            bool hasCis
            , 
            
            bool onlyWaitingForCancellationApprove
            , 
            
            bool onlyEstimatedDelivery
            , 
            
            OrderBuyerType buyerType
            , 
            
            int page
            , 
            
            int pageSize
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders"; //campaignId 


            // Headers  | 

            // Query    | orderIds status substatus fromDate toDate supplierShipmentDateFrom supplierShipmentDateTo updatedAtFrom updatedAtTo dispatchType fake hasCis onlyWaitingForCancellationApprove onlyEstimatedDelivery buyerType page pageSize pageToken limit 
            for (auto &x : orderIds){
                addQueryParam("orderIds", std::string(x));
            }
            for (auto &x : status){
                addQueryParam("status", std::string(x));
            }
            for (auto &x : substatus){
                addQueryParam("substatus", std::string(x));
            }
            addQueryParam("fromDate",fromDate);
            addQueryParam("toDate",toDate);
            addQueryParam("supplierShipmentDateFrom",supplierShipmentDateFrom);
            addQueryParam("supplierShipmentDateTo",supplierShipmentDateTo);
            addQueryParam("updatedAtFrom",updatedAtFrom);
            addQueryParam("updatedAtTo",updatedAtTo);
            addQueryParam("dispatchType",dispatchType);
            addQueryParam("fake",fake);
            addQueryParam("hasCis",hasCis);
            addQueryParam("onlyWaitingForCancellationApprove",onlyWaitingForCancellationApprove);
            addQueryParam("onlyEstimatedDelivery",onlyEstimatedDelivery);
            addQueryParam("buyerType",buyerType);
            addQueryParam("page",page);
            addQueryParam("pageSize",pageSize);
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetOrdersResponse obj(output_string);


            Response<GetOrdersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        OrdersApi::
        provideOrderDigitalCodes(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods"; //campaignId orderId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | provideOrderDigitalCodesRequest



            payload = provideOrderDigitalCodesRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ProvideOrderItemIdentifiersResponse
        >
        OrdersApi::
        provideOrderItemIdentifiers(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/identifiers"; //campaignId orderId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | provideOrderItemIdentifiersRequest



            payload = provideOrderItemIdentifiersRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProvideOrderItemIdentifiersResponse obj(output_string);


            Response<ProvideOrderItemIdentifiersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            SetOrderBoxLayoutResponse
        >
        OrdersApi::
        setOrderBoxLayout(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            SetOrderBoxLayoutRequest setOrderBoxLayoutRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/boxes"; //campaignId orderId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | setOrderBoxLayoutRequest



            payload = setOrderBoxLayoutRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SetOrderBoxLayoutResponse obj(output_string);


            Response<SetOrderBoxLayoutResponse> response(obj, httpCode);
            return response;
        }

        Response<
            SetOrderShipmentBoxesResponse
        >
        OrdersApi::
        setOrderShipmentBoxes(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            long shipmentId
            , 
            
            SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes"; //campaignId orderId shipmentId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));
                std::string s_shipmentId("{");
                s_shipmentId.append("shipmentId");
                s_shipmentId.append("}");

                int pos = url.find(s_shipmentId);

                url.erase(pos, s_shipmentId.length());
                url.insert(pos, stringify(shipmentId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | setOrderShipmentBoxesRequest



            payload = setOrderShipmentBoxesRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SetOrderShipmentBoxesResponse obj(output_string);


            Response<SetOrderShipmentBoxesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        OrdersApi::
        updateOrderItems(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            UpdateOrderItemRequest updateOrderItemRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/items"; //campaignId orderId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | updateOrderItemRequest



            payload = updateOrderItemRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            UpdateOrderStatusResponse
        >
        OrdersApi::
        updateOrderStatus(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            UpdateOrderStatusRequest updateOrderStatusRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/status"; //campaignId orderId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_orderId("{");
                s_orderId.append("orderId");
                s_orderId.append("}");

                int pos = url.find(s_orderId);

                url.erase(pos, s_orderId.length());
                url.insert(pos, stringify(orderId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | updateOrderStatusRequest



            payload = updateOrderStatusRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdateOrderStatusResponse obj(output_string);


            Response<UpdateOrderStatusResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UpdateOrderStatusesResponse
        >
        OrdersApi::
        updateOrderStatuses(
            
            long campaignId
            , 
            
            UpdateOrderStatusesRequest updateOrderStatusesRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/status-update"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | updateOrderStatusesRequest



            payload = updateOrderStatusesRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdateOrderStatusesResponse obj(output_string);


            Response<UpdateOrderStatusesResponse> response(obj, httpCode);
            return response;
        }



