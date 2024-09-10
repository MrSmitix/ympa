#include "CategoriesApi.h"

using namespace Tiny;



        Response<
            GetCategoriesMaxSaleQuantumResponse
        >
        CategoriesApi::
        getCategoriesMaxSaleQuantum(
            
            GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest
            
        )
        {
            std::string url = basepath + "/categories/max-sale-quantum"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getCategoriesMaxSaleQuantumRequest



            payload = getCategoriesMaxSaleQuantumRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetCategoriesMaxSaleQuantumResponse obj(output_string);


            Response<GetCategoriesMaxSaleQuantumResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCategoriesResponse
        >
        CategoriesApi::
        getCategoriesTree(
            
            GetCategoriesRequest getCategoriesRequest
            
        )
        {
            std::string url = basepath + "/categories/tree"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getCategoriesRequest



            payload = getCategoriesRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetCategoriesResponse obj(output_string);


            Response<GetCategoriesResponse> response(obj, httpCode);
            return response;
        }



