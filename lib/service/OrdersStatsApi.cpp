#include "OrdersStatsApi.h"

using namespace Tiny;



        Response<
            GetOrdersStatsResponse
        >
        OrdersStatsApi::
        getOrdersStats(
            
            long campaignId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetOrdersStatsRequest getOrdersStatsRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/stats/orders"; //campaignId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

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
            // Body     | getOrdersStatsRequest



            payload = getOrdersStatsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetOrdersStatsResponse obj(output_string);


            Response<GetOrdersStatsResponse> response(obj, httpCode);
            return response;
        }



