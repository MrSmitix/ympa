#include "CampaignsApi.h"

using namespace Tiny;



        Response<
            GetCampaignResponse
        >
        CampaignsApi::
        getCampaign(
            
            long campaignId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}"; //campaignId 


            // Headers  | 

            // Query    | 

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




            GetCampaignResponse obj(output_string);


            Response<GetCampaignResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCampaignLoginsResponse
        >
        CampaignsApi::
        getCampaignLogins(
            
            long campaignId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/logins"; //campaignId 


            // Headers  | 

            // Query    | 

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




            GetCampaignLoginsResponse obj(output_string);


            Response<GetCampaignLoginsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCampaignRegionResponse
        >
        CampaignsApi::
        getCampaignRegion(
            
            long campaignId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/region"; //campaignId 


            // Headers  | 

            // Query    | 

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




            GetCampaignRegionResponse obj(output_string);


            Response<GetCampaignRegionResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCampaignSettingsResponse
        >
        CampaignsApi::
        getCampaignSettings(
            
            long campaignId
            
        )
        {
            std::string url = basepath + "/campaigns/{campaignId}/settings"; //campaignId 


            // Headers  | 

            // Query    | 

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




            GetCampaignSettingsResponse obj(output_string);


            Response<GetCampaignSettingsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCampaignsResponse
        >
        CampaignsApi::
        getCampaigns(
            
            int page
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/campaigns"; //


            // Headers  | 

            // Query    | page pageSize 
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




            GetCampaignsResponse obj(output_string);


            Response<GetCampaignsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetCampaignsResponse
        >
        CampaignsApi::
        getCampaignsByLogin(
            
            std::string login
            , 
            
            int page
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/campaigns/by_login/{login}"; //login 


            // Headers  | 

            // Query    | page pageSize 
            addQueryParam("page",page);
            addQueryParam("pageSize",pageSize);

            // Form     | 



                std::string s_login("{");
                s_login.append("login");
                s_login.append("}");

                int pos = url.find(s_login);

                url.erase(pos, s_login.length());
                url.insert(pos, stringify(login));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetCampaignsResponse obj(output_string);


            Response<GetCampaignsResponse> response(obj, httpCode);
            return response;
        }



