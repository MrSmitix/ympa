#include "ContentApi.h"

using namespace Tiny;



        Response<
            GetCategoryContentParametersResponse
        >
        ContentApi::
        getCategoryContentParameters(
            
            long categoryId
            
        )
        {
            std::string url = basepath + "/category/{categoryId}/parameters"; //categoryId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_categoryId("{");
                s_categoryId.append("categoryId");
                s_categoryId.append("}");

                int pos = url.find(s_categoryId);

                url.erase(pos, s_categoryId.length());
                url.insert(pos, stringify(categoryId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetCategoryContentParametersResponse obj(output_string);


            Response<GetCategoryContentParametersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOfferCardsContentStatusResponse
        >
        ContentApi::
        getOfferCardsContentStatus(
            
            long businessId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-cards"; //businessId 


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
            // Body     | getOfferCardsContentStatusRequest



            payload = getOfferCardsContentStatusRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetOfferCardsContentStatusResponse obj(output_string);


            Response<GetOfferCardsContentStatusResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UpdateOfferContentResponse
        >
        ContentApi::
        updateOfferContent(
            
            long businessId
            , 
            
            UpdateOfferContentRequest updateOfferContentRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-cards/update"; //businessId 


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
            // Body     | updateOfferContentRequest



            payload = updateOfferContentRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdateOfferContentResponse obj(output_string);


            Response<UpdateOfferContentResponse> response(obj, httpCode);
            return response;
        }



