#include "OutletLicensesApi.h"

using namespace Tiny;



        Response<
            EmptyApiResponse
        >
        OutletLicensesApi::
        deleteOutletLicenses(
            
            long campaignId
            , 
            Set<long> ids
            
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/outlets/licenses"; //campaignId 


            // Headers  | 

            // Query    | ids 
            for (auto &x : ids){
                addQueryParam("ids", std::string(x));
            }

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOutletLicensesResponse
        >
        OutletLicensesApi::
        getOutletLicenses(
            
            long campaignId
            , 
            Set<long> outletIds
            
            , 
            Set<long> ids
            
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/outlets/licenses"; //campaignId 


            // Headers  | 

            // Query    | outletIds ids 
            for (auto &x : outletIds){
                addQueryParam("outletIds", std::string(x));
            }
            for (auto &x : ids){
                addQueryParam("ids", std::string(x));
            }

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




            GetOutletLicensesResponse obj(output_string);


            Response<GetOutletLicensesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        OutletLicensesApi::
        updateOutletLicenses(
            
            long campaignId
            , 
            
            UpdateOutletLicenseRequest updateOutletLicenseRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/outlets/licenses"; //campaignId 


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
            // Body     | updateOutletLicenseRequest



            payload = updateOutletLicenseRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }



