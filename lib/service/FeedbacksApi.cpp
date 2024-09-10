#include "FeedbacksApi.h"

using namespace Tiny;



        Response<
            GetFeedbackListResponse
        >
        FeedbacksApi::
        getFeedbackAndCommentUpdates(
            
            long campaignId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            Date fromDate
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/feedback/updates"; //campaignId 


            // Headers  | 

            // Query    | pageToken limit fromDate 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);
            addQueryParam("from_date",fromDate);

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




            GetFeedbackListResponse obj(output_string);


            Response<GetFeedbackListResponse> response(obj, httpCode);
            return response;
        }



