#include "StocksApi.h"

using namespace Tiny;



        Response<
            GetWarehouseStocksResponse
        >
        StocksApi::
        getStocks(
            
            long campaignId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetWarehouseStocksRequest getWarehouseStocksRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offers/stocks"; //campaignId 


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
            // Body     | getWarehouseStocksRequest



            payload = getWarehouseStocksRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetWarehouseStocksResponse obj(output_string);


            Response<GetWarehouseStocksResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        StocksApi::
        updateStocks(
            
            long campaignId
            , 
            
            UpdateStocksRequest updateStocksRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offers/stocks"; //campaignId 


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
            // METHOD | PUT
            // Body     | updateStocksRequest



            payload = updateStocksRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }



