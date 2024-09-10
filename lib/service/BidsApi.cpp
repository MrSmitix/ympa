#include "BidsApi.h"

using namespace Tiny;



        Response<
            GetBidsInfoResponse
        >
        BidsApi::
        getBidsInfoForBusiness(
            
            long businessId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetBidsInfoRequest getBidsInfoRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/bids/info"; //businessId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

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
            // Body     | getBidsInfoRequest



            payload = getBidsInfoRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetBidsInfoResponse obj(output_string);


            Response<GetBidsInfoResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetBidsRecommendationsResponse
        >
        BidsApi::
        getBidsRecommendations(
            
            long businessId
            , 
            
            GetBidsRecommendationsRequest getBidsRecommendationsRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/bids/recommendations"; //businessId 


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
            // Body     | getBidsRecommendationsRequest



            payload = getBidsRecommendationsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetBidsRecommendationsResponse obj(output_string);


            Response<GetBidsRecommendationsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        BidsApi::
        putBidsForBusiness(
            
            long businessId
            , 
            
            PutSkuBidsRequest putSkuBidsRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/bids"; //businessId 


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
            // METHOD | PUT
            // Body     | putSkuBidsRequest



            payload = putSkuBidsRequest.toJson().dump();

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
        BidsApi::
        putBidsForCampaign(
            
            long campaignId
            , 
            
            PutSkuBidsRequest putSkuBidsRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/bids"; //campaignId 


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
            // Body     | putSkuBidsRequest



            payload = putSkuBidsRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }



