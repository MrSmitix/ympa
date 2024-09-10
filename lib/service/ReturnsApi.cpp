#include "ReturnsApi.h"

using namespace Tiny;



        Response<
            GetReturnResponse
        >
        ReturnsApi::
        getReturn(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            long returnId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}"; //campaignId orderId returnId 


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
                std::string s_returnId("{");
                s_returnId.append("returnId");
                s_returnId.append("}");

                int pos = url.find(s_returnId);

                url.erase(pos, s_returnId.length());
                url.insert(pos, stringify(returnId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetReturnResponse obj(output_string);


            Response<GetReturnResponse> response(obj, httpCode);
            return response;
        }

        Response<
            std::string
        >
        ReturnsApi::
        getReturnApplication(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            long returnId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application"; //campaignId orderId returnId 


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
                std::string s_returnId("{");
                s_returnId.append("returnId");
                s_returnId.append("}");

                int pos = url.find(s_returnId);

                url.erase(pos, s_returnId.length());
                url.insert(pos, stringify(returnId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            std::string
        >
        ReturnsApi::
        getReturnPhoto(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            long returnId
            , 
            
            long itemId
            , 
            
            std::string imageHash
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}"; //campaignId orderId returnId itemId imageHash 


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
                std::string s_returnId("{");
                s_returnId.append("returnId");
                s_returnId.append("}");

                int pos = url.find(s_returnId);

                url.erase(pos, s_returnId.length());
                url.insert(pos, stringify(returnId));
                std::string s_itemId("{");
                s_itemId.append("itemId");
                s_itemId.append("}");

                int pos = url.find(s_itemId);

                url.erase(pos, s_itemId.length());
                url.insert(pos, stringify(itemId));
                std::string s_imageHash("{");
                s_imageHash.append("imageHash");
                s_imageHash.append("}");

                int pos = url.find(s_imageHash);

                url.erase(pos, s_imageHash.length());
                url.insert(pos, stringify(imageHash));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            GetReturnsResponse
        >
        ReturnsApi::
        getReturns(
            
            long campaignId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            std::list<long> orderIds
            
            , 
            std::list<RefundStatusType> statuses
            
            , 
            
            ReturnType type
            , 
            
            Date fromDate
            , 
            
            Date toDate
            , 
            
            Date fromDate2
            , 
            
            Date toDate2
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/returns"; //campaignId 


            // Headers  | 

            // Query    | pageToken limit orderIds statuses type fromDate toDate fromDate2 toDate2 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);
            for (auto &x : orderIds){
                addQueryParam("orderIds", std::string(x));
            }
            for (auto &x : statuses){
                addQueryParam("statuses", std::string(x));
            }
            addQueryParam("type",type);
            addQueryParam("fromDate",fromDate);
            addQueryParam("toDate",toDate);
            addQueryParam("from_date",fromDate2);
            addQueryParam("to_date",toDate2);

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




            GetReturnsResponse obj(output_string);


            Response<GetReturnsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        ReturnsApi::
        setReturnDecision(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            long returnId
            , 
            
            SetReturnDecisionRequest setReturnDecisionRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision"; //campaignId orderId returnId 


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
                std::string s_returnId("{");
                s_returnId.append("returnId");
                s_returnId.append("}");

                int pos = url.find(s_returnId);

                url.erase(pos, s_returnId.length());
                url.insert(pos, stringify(returnId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | setReturnDecisionRequest



            payload = setReturnDecisionRequest.toJson().dump();

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
        ReturnsApi::
        submitReturnDecision(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            long returnId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit"; //campaignId orderId returnId 


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
                std::string s_returnId("{");
                s_returnId.append("returnId");
                s_returnId.append("}");

                int pos = url.find(s_returnId);

                url.erase(pos, s_returnId.length());
                url.insert(pos, stringify(returnId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }



