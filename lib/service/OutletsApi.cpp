#include "OutletsApi.h"

using namespace Tiny;



        Response<
            CreateOutletResponse
        >
        OutletsApi::
        createOutlet(
            
            long campaignId
            , 
            
            ChangeOutletRequest changeOutletRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/outlets"; //campaignId 


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
            // Body     | changeOutletRequest



            payload = changeOutletRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CreateOutletResponse obj(output_string);


            Response<CreateOutletResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        OutletsApi::
        deleteOutlet(
            
            long campaignId
            , 
            
            long outletId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/outlets/{outletId}"; //campaignId outletId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_outletId("{");
                s_outletId.append("outletId");
                s_outletId.append("}");

                int pos = url.find(s_outletId);

                url.erase(pos, s_outletId.length());
                url.insert(pos, stringify(outletId));


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
            GetOutletResponse
        >
        OutletsApi::
        getOutlet(
            
            long campaignId
            , 
            
            long outletId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/outlets/{outletId}"; //campaignId outletId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaignId");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
                std::string s_outletId("{");
                s_outletId.append("outletId");
                s_outletId.append("}");

                int pos = url.find(s_outletId);

                url.erase(pos, s_outletId.length());
                url.insert(pos, stringify(outletId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetOutletResponse obj(output_string);


            Response<GetOutletResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetOutletsResponse
        >
        OutletsApi::
        getOutlets(
            
            long campaignId
            , 
            
            std::string pageToken
            , 
            
            long regionId
            , 
            
            std::string shopOutletCode
            , 
            
            long regionId2
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/outlets"; //campaignId 


            // Headers  | 

            // Query    | pageToken regionId shopOutletCode regionId2 
            addQueryParam("page_token",pageToken);
            addQueryParam("region_id",regionId);
            addQueryParam("shop_outlet_code",shopOutletCode);
            addQueryParam("regionId",regionId2);

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




            GetOutletsResponse obj(output_string);


            Response<GetOutletsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        OutletsApi::
        updateOutlet(
            
            long campaignId
            , 
            
            long outletId
            , 
            
            ChangeOutletRequest changeOutletRequest
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/outlets/{outletId}"; //campaignId outletId 


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
                std::string s_outletId("{");
                s_outletId.append("outletId");
                s_outletId.append("}");

                int pos = url.find(s_outletId);

                url.erase(pos, s_outletId.length());
                url.insert(pos, stringify(outletId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | changeOutletRequest



            payload = changeOutletRequest.toJson().dump();

            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }



