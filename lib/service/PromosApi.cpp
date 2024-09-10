#include "PromosApi.h"

using namespace Tiny;



        Response<
            DeletePromoOffersResponse
        >
        PromosApi::
        deletePromoOffers(
            
            long businessId
            , 
            
            DeletePromoOffersRequest deletePromoOffersRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/promos/offers/delete"; //businessId 


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
            // Body     | deletePromoOffersRequest



            payload = deletePromoOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeletePromoOffersResponse obj(output_string);


            Response<DeletePromoOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetPromoOffersResponse
        >
        PromosApi::
        getPromoOffers(
            
            long businessId
            , 
            
            GetPromoOffersRequest getPromoOffersRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/promos/offers"; //businessId 


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
            // Body     | getPromoOffersRequest



            payload = getPromoOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetPromoOffersResponse obj(output_string);


            Response<GetPromoOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetPromosResponse
        >
        PromosApi::
        getPromos(
            
            long businessId
            , 
            
            GetPromosRequest getPromosRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/promos"; //businessId 


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
            // Body     | getPromosRequest



            payload = getPromosRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetPromosResponse obj(output_string);


            Response<GetPromosResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UpdatePromoOffersResponse
        >
        PromosApi::
        updatePromoOffers(
            
            long businessId
            , 
            
            UpdatePromoOffersRequest updatePromoOffersRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/promos/offers/update"; //businessId 


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
            // Body     | updatePromoOffersRequest



            payload = updatePromoOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdatePromoOffersResponse obj(output_string);


            Response<UpdatePromoOffersResponse> response(obj, httpCode);
            return response;
        }



