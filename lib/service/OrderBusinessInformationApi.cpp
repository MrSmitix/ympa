#include "OrderBusinessInformationApi.h"

using namespace Tiny;



        Response<
            GetBusinessBuyerInfoResponse
        >
        OrderBusinessInformationApi::
        getOrderBusinessBuyerInfo(
            
            long campaignId
            , 
            
            long orderId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/business-buyer"; //campaignId orderId 


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
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetBusinessBuyerInfoResponse obj(output_string);


            Response<GetBusinessBuyerInfoResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetBusinessDocumentsInfoResponse
        >
        OrderBusinessInformationApi::
        getOrderBusinessDocumentsInfo(
            
            long campaignId
            , 
            
            long orderId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/orders/{orderId}/documents"; //campaignId orderId 


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
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetBusinessDocumentsInfoResponse obj(output_string);


            Response<GetBusinessDocumentsInfoResponse> response(obj, httpCode);
            return response;
        }



