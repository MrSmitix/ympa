#include "BusinessOfferMappingsApi.h"

using namespace Tiny;



        Response<
            AddOffersToArchiveResponse
        >
        BusinessOfferMappingsApi::
        addOffersToArchive(
            
            long businessId
            , 
            
            AddOffersToArchiveRequest addOffersToArchiveRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-mappings/archive"; //businessId 


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
            // Body     | addOffersToArchiveRequest



            payload = addOffersToArchiveRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AddOffersToArchiveResponse obj(output_string);


            Response<AddOffersToArchiveResponse> response(obj, httpCode);
            return response;
        }

        Response<
            DeleteOffersResponse
        >
        BusinessOfferMappingsApi::
        deleteOffers(
            
            long businessId
            , 
            
            DeleteOffersRequest deleteOffersRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-mappings/delete"; //businessId 


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
            // Body     | deleteOffersRequest



            payload = deleteOffersRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeleteOffersResponse obj(output_string);


            Response<DeleteOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            DeleteOffersFromArchiveResponse
        >
        BusinessOfferMappingsApi::
        deleteOffersFromArchive(
            
            long businessId
            , 
            
            DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-mappings/unarchive"; //businessId 


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
            // Body     | deleteOffersFromArchiveRequest



            payload = deleteOffersFromArchiveRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeleteOffersFromArchiveResponse obj(output_string);


            Response<DeleteOffersFromArchiveResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOfferMappingsResponse
        >
        BusinessOfferMappingsApi::
        getOfferMappings(
            
            long businessId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetOfferMappingsRequest getOfferMappingsRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-mappings"; //businessId 


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
            // Body     | getOfferMappingsRequest



            payload = getOfferMappingsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetOfferMappingsResponse obj(output_string);


            Response<GetOfferMappingsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetSuggestedOfferMappingsResponse
        >
        BusinessOfferMappingsApi::
        getSuggestedOfferMappings(
            
            long businessId
            , 
            
            GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-mappings/suggestions"; //businessId 


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
            // Body     | getSuggestedOfferMappingsRequest



            payload = getSuggestedOfferMappingsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetSuggestedOfferMappingsResponse obj(output_string);


            Response<GetSuggestedOfferMappingsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UpdateOfferMappingsResponse
        >
        BusinessOfferMappingsApi::
        updateOfferMappings(
            
            long businessId
            , 
            
            UpdateOfferMappingsRequest updateOfferMappingsRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/offer-mappings/update"; //businessId 


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
            // Body     | updateOfferMappingsRequest



            payload = updateOfferMappingsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdateOfferMappingsResponse obj(output_string);


            Response<UpdateOfferMappingsResponse> response(obj, httpCode);
            return response;
        }



