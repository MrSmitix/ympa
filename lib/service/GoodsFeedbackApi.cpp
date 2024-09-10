#include "GoodsFeedbackApi.h"

using namespace Tiny;



        Response<
            EmptyApiResponse
        >
        GoodsFeedbackApi::
        deleteGoodsFeedbackComment(
            
            long businessId
            , 
            
            DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/goods-feedback/comments/delete"; //businessId 


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
            // Body     | deleteGoodsFeedbackCommentRequest



            payload = deleteGoodsFeedbackCommentRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetGoodsFeedbackCommentsResponse
        >
        GoodsFeedbackApi::
        getGoodsFeedbackComments(
            
            long businessId
            , 
            
            GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/goods-feedback/comments"; //businessId 


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
            // Body     | getGoodsFeedbackCommentsRequest



            payload = getGoodsFeedbackCommentsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetGoodsFeedbackCommentsResponse obj(output_string);


            Response<GetGoodsFeedbackCommentsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetGoodsFeedbackResponse
        >
        GoodsFeedbackApi::
        getGoodsFeedbacks(
            
            long businessId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetGoodsFeedbackRequest getGoodsFeedbackRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/goods-feedback"; //businessId 


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
            // Body     | getGoodsFeedbackRequest



            payload = getGoodsFeedbackRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetGoodsFeedbackResponse obj(output_string);


            Response<GetGoodsFeedbackResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        GoodsFeedbackApi::
        skipGoodsFeedbacksReaction(
            
            long businessId
            , 
            
            SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/goods-feedback/skip-reaction"; //businessId 


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
            // Body     | skipGoodsFeedbackReactionRequest



            payload = skipGoodsFeedbackReactionRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UpdateGoodsFeedbackCommentResponse
        >
        GoodsFeedbackApi::
        updateGoodsFeedbackComment(
            
            long businessId
            , 
            
            UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/goods-feedback/comments/update"; //businessId 


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
            // Body     | updateGoodsFeedbackCommentRequest



            payload = updateGoodsFeedbackCommentRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdateGoodsFeedbackCommentResponse obj(output_string);


            Response<UpdateGoodsFeedbackCommentResponse> response(obj, httpCode);
            return response;
        }



