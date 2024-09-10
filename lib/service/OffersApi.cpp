#include "OffersApi.h"

using namespace Tiny;



        Response<
            DeleteCampaignOffersResponse
        >
        OffersApi::
        deleteCampaignOffers(
            
            long campaignId
            , 
            
            DeleteCampaignOffersRequest deleteCampaignOffersRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offers/delete"; //campaignId 


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
            // Body     | deleteCampaignOffersRequest



            payload = deleteCampaignOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeleteCampaignOffersResponse obj(output_string);


            Response<DeleteCampaignOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetAllOffersResponse
        >
        OffersApi::
        getAllOffers(
            
            long campaignId
            , 
            
            long feedId
            , 
            
            int chunk
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offers/all"; //campaignId 


            // Headers  | 

            // Query    | feedId chunk 
            addQueryParam("feedId",feedId);
            addQueryParam("chunk",chunk);

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




            GetAllOffersResponse obj(output_string);


            Response<GetAllOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCampaignOffersResponse
        >
        OffersApi::
        getCampaignOffers(
            
            long campaignId
            , 
            
            GetCampaignOffersRequest getCampaignOffersRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offers"; //campaignId 


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
            // Body     | getCampaignOffersRequest



            payload = getCampaignOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetCampaignOffersResponse obj(output_string);


            Response<GetCampaignOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOfferRecommendationsResponse
        >
        OffersApi::
        getOfferRecommendations(
            
            long businessId
            , 
            
            GetOfferRecommendationsRequest getOfferRecommendationsRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offers/recommendations"; //businessId 


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
            // Body     | getOfferRecommendationsRequest



            payload = getOfferRecommendationsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetOfferRecommendationsResponse obj(output_string);


            Response<GetOfferRecommendationsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOffersResponse
        >
        OffersApi::
        getOffers(
            
            long campaignId
            , 
            
            std::string query
            , 
            
            long feedId
            , 
            
            std::string shopCategoryId
            , 
            
            CurrencyType currency
            , 
            
            bool matched
            , 
            
            int page
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offers"; //campaignId 


            // Headers  | 

            // Query    | query feedId shopCategoryId currency matched page pageSize 
            addQueryParam("query",query);
            addQueryParam("feedId",feedId);
            addQueryParam("shopCategoryId",shopCategoryId);
            addQueryParam("currency",currency);
            addQueryParam("matched",matched);
            addQueryParam("page",page);
            addQueryParam("pageSize",pageSize);

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




            GetOffersResponse obj(output_string);


            Response<GetOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        OffersApi::
        updateCampaignOffers(
            
            long campaignId
            , 
            
            UpdateCampaignOffersRequest updateCampaignOffersRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offers/update"; //campaignId 


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
            // Body     | updateCampaignOffersRequest



            payload = updateCampaignOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }



