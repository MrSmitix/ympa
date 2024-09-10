#include "GoodsStatsApi.h"

using namespace Tiny;



        Response<
            GetGoodsStatsResponse
        >
        GoodsStatsApi::
        getGoodsStats(
            
            long campaignId
            , 
            
            GetGoodsStatsRequest getGoodsStatsRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/stats/skus"; //campaignId 


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
            // Body     | getGoodsStatsRequest



            payload = getGoodsStatsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetGoodsStatsResponse obj(output_string);


            Response<GetGoodsStatsResponse> response(obj, httpCode);
            return response;
        }



