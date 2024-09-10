#include "OrderLabelsApi.h"

using namespace Tiny;



        Response<
            std::string
        >
        OrderLabelsApi::
        generateOrderLabel(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            long shipmentId
            , 
            
            long boxId
            , 
            
            PageFormatType format
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label"; //campaignId orderId shipmentId boxId 


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

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
                std::string s_shipmentId("{");
                s_shipmentId.append("shipmentId");
                s_shipmentId.append("}");

                int pos = url.find(s_shipmentId);

                url.erase(pos, s_shipmentId.length());
                url.insert(pos, stringify(shipmentId));
                std::string s_boxId("{");
                s_boxId.append("boxId");
                s_boxId.append("}");

                int pos = url.find(s_boxId);

                url.erase(pos, s_boxId.length());
                url.insert(pos, stringify(boxId));


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
        OrderLabelsApi::
        generateOrderLabels(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            PageFormatType format
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels"; //campaignId orderId 


            // Headers  | 

            // Query    | format 
            addQueryParam("format",format);

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



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            GetOrderLabelsDataResponse
        >
        OrderLabelsApi::
        getOrderLabelsData(
            
            long campaignId
            , 
            
            long orderId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data"; //campaignId orderId 


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




            GetOrderLabelsDataResponse obj(output_string);


            Response<GetOrderLabelsDataResponse> response(obj, httpCode);
            return response;
        }



