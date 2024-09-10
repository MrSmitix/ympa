#include "OrderDeliveryApi.h"

using namespace Tiny;



        Response<
            GetOrderBuyerInfoResponse
        >
        OrderDeliveryApi::
        getOrderBuyerInfo(
            
            long campaignId
            , 
            
            long orderId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/buyer"; //campaignId orderId 


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




            GetOrderBuyerInfoResponse obj(output_string);


            Response<GetOrderBuyerInfoResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        OrderDeliveryApi::
        setOrderDeliveryDate(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            SetOrderDeliveryDateRequest setOrderDeliveryDateRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/delivery/date"; //campaignId orderId 


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
            // Body     | setOrderDeliveryDateRequest



            payload = setOrderDeliveryDateRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        OrderDeliveryApi::
        setOrderDeliveryTrackCode(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/delivery/track"; //campaignId orderId 


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
            // Body     | setOrderDeliveryTrackCodeRequest



            payload = setOrderDeliveryTrackCodeRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        OrderDeliveryApi::
        updateOrderStorageLimit(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit"; //campaignId orderId 


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
            // Body     | updateOrderStorageLimitRequest



            payload = updateOrderStorageLimitRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            VerifyOrderEacResponse
        >
        OrderDeliveryApi::
        verifyOrderEac(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            VerifyOrderEacRequest verifyOrderEacRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/verifyEac"; //campaignId orderId 


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
            // Body     | verifyOrderEacRequest



            payload = verifyOrderEacRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            VerifyOrderEacResponse obj(output_string);


            Response<VerifyOrderEacResponse> response(obj, httpCode);
            return response;
        }



