#include "PriceQuarantineApi.h"

using namespace Tiny;



        Response<
            EmptyApiResponse
        >
        PriceQuarantineApi::
        confirmBusinessPrices(
            
            long businessId
            , 
            
            ConfirmPricesRequest confirmPricesRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/price-quarantine/confirm"; //businessId 


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
            // Body     | confirmPricesRequest



            payload = confirmPricesRequest.toJson().dump();

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
        PriceQuarantineApi::
        confirmCampaignPrices(
            
            long campaignId
            , 
            
            ConfirmPricesRequest confirmPricesRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/price-quarantine/confirm"; //campaignId 


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
            // Body     | confirmPricesRequest



            payload = confirmPricesRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetQuarantineOffersResponse
        >
        PriceQuarantineApi::
        getBusinessQuarantineOffers(
            
            long businessId
            , 
            
            GetQuarantineOffersRequest getQuarantineOffersRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/price-quarantine"; //businessId 


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
            // Body     | getQuarantineOffersRequest



            payload = getQuarantineOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetQuarantineOffersResponse obj(output_string);


            Response<GetQuarantineOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetQuarantineOffersResponse
        >
        PriceQuarantineApi::
        getCampaignQuarantineOffers(
            
            long campaignId
            , 
            
            GetQuarantineOffersRequest getQuarantineOffersRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/price-quarantine"; //campaignId 


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
            // Body     | getQuarantineOffersRequest



            payload = getQuarantineOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetQuarantineOffersResponse obj(output_string);


            Response<GetQuarantineOffersResponse> response(obj, httpCode);
            return response;
        }



