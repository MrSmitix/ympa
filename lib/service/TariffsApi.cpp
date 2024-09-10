#include "TariffsApi.h"

using namespace Tiny;



        Response<
            CalculateTariffsResponse
        >
        TariffsApi::
        calculateTariffs(
            
            CalculateTariffsRequest calculateTariffsRequest
            
        )
        {
            std::string url = basepath + "/tariffs/calculate"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | calculateTariffsRequest



            payload = calculateTariffsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CalculateTariffsResponse obj(output_string);


            Response<CalculateTariffsResponse> response(obj, httpCode);
            return response;
        }



