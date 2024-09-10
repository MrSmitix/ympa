#include "PricesApi.h"

using namespace Tiny;



        Response<
            GetPricesResponse
        >
        PricesApi::
        getPrices(
            
            long campaignId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            bool archived
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offer-prices"; //campaignId 


            // Headers  | 

            // Query    | pageToken limit archived 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);
            addQueryParam("archived",archived);

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




            GetPricesResponse obj(output_string);


            Response<GetPricesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetPricesByOfferIdsResponse
        >
        PricesApi::
        getPricesByOfferIds(
            
            long campaignId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetPricesByOfferIdsRequest getPricesByOfferIdsRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offer-prices"; //campaignId 


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
            // Body     | getPricesByOfferIdsRequest



            payload = getPricesByOfferIdsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetPricesByOfferIdsResponse obj(output_string);


            Response<GetPricesByOfferIdsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            SuggestPricesResponse
        >
        PricesApi::
        getSuggestedPrices(
            
            long campaignId
            , 
            
            SuggestPricesRequest suggestPricesRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offer-prices/suggestions"; //campaignId 


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
            // Body     | suggestPricesRequest



            payload = suggestPricesRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SuggestPricesResponse obj(output_string);


            Response<SuggestPricesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        PricesApi::
        updateBusinessPrices(
            
            long businessId
            , 
            
            UpdateBusinessPricesRequest updateBusinessPricesRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-prices/updates"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | updateBusinessPricesRequest



            payload = updateBusinessPricesRequest.toJson().dump();

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
        PricesApi::
        updatePrices(
            
            long campaignId
            , 
            
            UpdatePricesRequest updatePricesRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offer-prices/updates"; //campaignId 


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
            // Body     | updatePricesRequest



            payload = updatePricesRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }



