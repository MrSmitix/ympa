#include "RatingsApi.h"

using namespace Tiny;



        Response<
            GetQualityRatingDetailsResponse
        >
        RatingsApi::
        getQualityRatingDetails(
            
            long campaignId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/ratings/quality/details"; //campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetQualityRatingDetailsResponse obj(output_string);


            Response<GetQualityRatingDetailsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetQualityRatingResponse
        >
        RatingsApi::
        getQualityRatings(
            
            long businessId
            , 
            
            GetQualityRatingRequest getQualityRatingRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/ratings/quality"; //businessId 


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
            // Body     | getQualityRatingRequest



            payload = getQualityRatingRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetQualityRatingResponse obj(output_string);


            Response<GetQualityRatingResponse> response(obj, httpCode);
            return response;
        }



