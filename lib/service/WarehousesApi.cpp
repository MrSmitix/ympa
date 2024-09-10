#include "WarehousesApi.h"

using namespace Tiny;



        Response<
            GetFulfillmentWarehousesResponse
        >
        WarehousesApi::
        getFulfillmentWarehouses(
        )
        {
            std::string url = basepath + "/warehouses"; //


            // Headers  | 

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetFulfillmentWarehousesResponse obj(output_string);


            Response<GetFulfillmentWarehousesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetWarehousesResponse
        >
        WarehousesApi::
        getWarehouses(
            
            long businessId
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/warehouses"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetWarehousesResponse obj(output_string);


            Response<GetWarehousesResponse> response(obj, httpCode);
            return response;
        }



