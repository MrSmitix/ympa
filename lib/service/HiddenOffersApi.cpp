#include "HiddenOffersApi.h"

using namespace Tiny;



        Response<
            EmptyApiResponse
        >
        HiddenOffersApi::
        addHiddenOffers(
            
            long campaignId
            , 
            
            AddHiddenOffersRequest addHiddenOffersRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/hidden-offers"; //campaignId 


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
            // Body     | addHiddenOffersRequest



            payload = addHiddenOffersRequest.toJson().dump();

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
        HiddenOffersApi::
        deleteHiddenOffers(
            
            long campaignId
            , 
            
            DeleteHiddenOffersRequest deleteHiddenOffersRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/hidden-offers/delete"; //campaignId 


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
            // Body     | deleteHiddenOffersRequest



            payload = deleteHiddenOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetHiddenOffersResponse
        >
        HiddenOffersApi::
        getHiddenOffers(
            
            long campaignId
            , 
            std::list<std::string> offerId
            
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            int offset
            , 
            
            int page
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/hidden-offers"; //campaignId 


            // Headers  | 

            // Query    | offerId pageToken limit offset page pageSize 
            for (auto &x : offerId){
                addQueryParam("offer_id", std::string(x));
            }
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);
            addQueryParam("offset",offset);
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




            GetHiddenOffersResponse obj(output_string);


            Response<GetHiddenOffersResponse> response(obj, httpCode);
            return response;
        }



