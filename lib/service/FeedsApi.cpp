#include "FeedsApi.h"

using namespace Tiny;



        Response<
            GetFeedResponse
        >
        FeedsApi::
        getFeed(
            
            long campaignId
            , 
            
            long feedId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/feeds/{feedId}"; //campaignId feedId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_feedId("{");
                s_feedId.append("feedId");
                s_feedId.append("}");

                int pos = url.find(s_feedId);

                url.erase(pos, s_feedId.length());
                url.insert(pos, stringify(feedId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetFeedResponse obj(output_string);


            Response<GetFeedResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetFeedIndexLogsResponse
        >
        FeedsApi::
        getFeedIndexLogs(
            
            long campaignId
            , 
            
            long feedId
            , 
            
            int limit
            , 
            
            std::string publishedTimeFrom
            , 
            
            std::string publishedTimeTo
            , 
            
            FeedIndexLogsStatusType status
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/feeds/{feedId}/index-logs"; //campaignId feedId 


            // Headers  | 

            // Query    | limit publishedTimeFrom publishedTimeTo status 
            addQueryParam("limit",limit);
            addQueryParam("published_time_from",publishedTimeFrom);
            addQueryParam("published_time_to",publishedTimeTo);
            addQueryParam("status",status);

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_feedId("{");
                s_feedId.append("feedId");
                s_feedId.append("}");

                int pos = url.find(s_feedId);

                url.erase(pos, s_feedId.length());
                url.insert(pos, stringify(feedId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetFeedIndexLogsResponse obj(output_string);


            Response<GetFeedIndexLogsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetFeedsResponse
        >
        FeedsApi::
        getFeeds(
            
            long campaignId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/feeds"; //campaignId 


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
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetFeedsResponse obj(output_string);


            Response<GetFeedsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        FeedsApi::
        refreshFeed(
            
            long campaignId
            , 
            
            long feedId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/feeds/{feedId}/refresh"; //campaignId feedId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_feedId("{");
                s_feedId.append("feedId");
                s_feedId.append("}");

                int pos = url.find(s_feedId);

                url.erase(pos, s_feedId.length());
                url.insert(pos, stringify(feedId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
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
        FeedsApi::
        setFeedParams(
            
            long campaignId
            , 
            
            long feedId
            , 
            
            SetFeedParamsRequest setFeedParamsRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/feeds/{feedId}/params"; //campaignId feedId 


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
                std::string s_feedId("{");
                s_feedId.append("feedId");
                s_feedId.append("}");

                int pos = url.find(s_feedId);

                url.erase(pos, s_feedId.length());
                url.insert(pos, stringify(feedId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | setFeedParamsRequest



            payload = setFeedParamsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }



