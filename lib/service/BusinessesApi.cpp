#include "BusinessesApi.h"

using namespace Tiny;



        Response<
            GetBusinessSettingsResponse
        >
        BusinessesApi::
        getBusinessSettings(
            
            long businessId
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/settings"; //businessId 


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
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetBusinessSettingsResponse obj(output_string);


            Response<GetBusinessSettingsResponse> response(obj, httpCode);
            return response;
        }



