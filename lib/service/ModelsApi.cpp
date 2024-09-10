#include "ModelsApi.h"

using namespace Tiny;



        Response<
            GetModelsResponse
        >
        ModelsApi::
        getModel(
            
            long modelId
            , 
            
            long regionId
            , 
            
            CurrencyType currency
            
        )
        {
            std::string url = basepath + "/models/{modelId}"; //modelId 


            // Headers  | 

            // Query    | regionId currency 
            addQueryParam("regionId",regionId);
            addQueryParam("currency",currency);

            // Form     | 



                std::string s_modelId("{");
                s_modelId.append("modelId");
                s_modelId.append("}");

                int pos = url.find(s_modelId);

                url.erase(pos, s_modelId.length());
                url.insert(pos, stringify(modelId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetModelsResponse obj(output_string);


            Response<GetModelsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetModelsOffersResponse
        >
        ModelsApi::
        getModelOffers(
            
            long modelId
            , 
            
            long regionId
            , 
            
            CurrencyType currency
            , 
            
            SortOrderType orderByPrice
            , 
            
            int count
            , 
            
            int page
            
        )
        {
            std::string url = basepath + "/models/{modelId}/offers"; //modelId 


            // Headers  | 

            // Query    | regionId currency orderByPrice count page 
            addQueryParam("regionId",regionId);
            addQueryParam("currency",currency);
            addQueryParam("orderByPrice",orderByPrice);
            addQueryParam("count",count);
            addQueryParam("page",page);

            // Form     | 



                std::string s_modelId("{");
                s_modelId.append("modelId");
                s_modelId.append("}");

                int pos = url.find(s_modelId);

                url.erase(pos, s_modelId.length());
                url.insert(pos, stringify(modelId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetModelsOffersResponse obj(output_string);


            Response<GetModelsOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetModelsResponse
        >
        ModelsApi::
        getModels(
            
            long regionId
            , 
            
            GetModelsRequest getModelsRequest
            , 
            
            CurrencyType currency
            
        )
        {
            std::string url = basepath + "/models"; //


            // Headers  | 

            // Query    | regionId currency 
            addQueryParam("regionId",regionId);
            addQueryParam("currency",currency);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getModelsRequest



            payload = getModelsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetModelsResponse obj(output_string);


            Response<GetModelsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetModelsOffersResponse
        >
        ModelsApi::
        getModelsOffers(
            
            long regionId
            , 
            
            GetModelsRequest getModelsRequest
            , 
            
            CurrencyType currency
            , 
            
            SortOrderType orderByPrice
            
        )
        {
            std::string url = basepath + "/models/offers"; //


            // Headers  | 

            // Query    | regionId currency orderByPrice 
            addQueryParam("regionId",regionId);
            addQueryParam("currency",currency);
            addQueryParam("orderByPrice",orderByPrice);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getModelsRequest



            payload = getModelsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetModelsOffersResponse obj(output_string);


            Response<GetModelsOffersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            SearchModelsResponse
        >
        ModelsApi::
        searchModels(
            
            std::string query
            , 
            
            long regionId
            , 
            
            CurrencyType currency
            , 
            
            int page
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/models"; //


            // Headers  | 

            // Query    | query regionId currency page pageSize 
            addQueryParam("query",query);
            addQueryParam("regionId",regionId);
            addQueryParam("currency",currency);
            addQueryParam("page",page);
            addQueryParam("pageSize",pageSize);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SearchModelsResponse obj(output_string);


            Response<SearchModelsResponse> response(obj, httpCode);
            return response;
        }



