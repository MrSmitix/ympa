#include "OfferMappingsApi.h"

using namespace Tiny;



        Response<
            GetOfferMappingEntriesResponse
        >
        OfferMappingsApi::
        getOfferMappingEntries(
            
            long campaignId
            , 
            std::list<std::string> offerId
            
            , 
            std::list<std::string> shopSku
            
            , 
            
            OfferMappingKindType mappingKind
            , 
            std::list<OfferProcessingStatusType> status
            
            , 
            std::list<OfferAvailabilityStatusType> availability
            
            , 
            std::list<int> categoryId
            
            , 
            std::list<std::string> vendor
            
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offer-mapping-entries"; //campaignId 


            // Headers  | 

            // Query    | offerId shopSku mappingKind status availability categoryId vendor pageToken limit 
            for (auto &x : offerId){
                addQueryParam("offer_id", std::string(x));
            }
            for (auto &x : shopSku){
                addQueryParam("shop_sku", std::string(x));
            }
            addQueryParam("mapping_kind",mappingKind);
            for (auto &x : status){
                addQueryParam("status", std::string(x));
            }
            for (auto &x : availability){
                addQueryParam("availability", std::string(x));
            }
            for (auto &x : categoryId){
                addQueryParam("category_id", std::string(x));
            }
            for (auto &x : vendor){
                addQueryParam("vendor", std::string(x));
            }
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

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




            GetOfferMappingEntriesResponse obj(output_string);


            Response<GetOfferMappingEntriesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetSuggestedOfferMappingEntriesResponse
        >
        OfferMappingsApi::
        getSuggestedOfferMappingEntries(
            
            long campaignId
            , 
            
            GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offer-mapping-entries/suggestions"; //campaignId 


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
            // Body     | getSuggestedOfferMappingEntriesRequest



            payload = getSuggestedOfferMappingEntriesRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetSuggestedOfferMappingEntriesResponse obj(output_string);


            Response<GetSuggestedOfferMappingEntriesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        OfferMappingsApi::
        updateOfferMappingEntries(
            
            long campaignId
            , 
            
            UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/offer-mapping-entries/updates"; //campaignId 


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
            // Body     | updateOfferMappingEntryRequest



            payload = updateOfferMappingEntryRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }



