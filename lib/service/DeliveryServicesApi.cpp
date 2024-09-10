#include "DeliveryServicesApi.h"

using namespace Tiny;



        Response<
            GetDeliveryServicesResponse
        >
        DeliveryServicesApi::
        getDeliveryServices(
        )
        {
            std::string url = basepath + "/delivery/services"; //


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




            GetDeliveryServicesResponse obj(output_string);


            Response<GetDeliveryServicesResponse> response(obj, httpCode);
            return response;
        }



