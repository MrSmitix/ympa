#include "RegionsApi.h"

using namespace Tiny;



        Response<
            GetRegionWithChildrenResponse
        >
        RegionsApi::
        searchRegionChildren(
            
            long regionId
            , 
            
            int page
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/regions/{regionId}/children"; //regionId 


            // Headers  | 

            // Query    | page pageSize 
            addQueryParam("page",page);
            addQueryParam("pageSize",pageSize);

            // Form     | 



                std::string s_regionId("{");
                s_regionId.append("regionId");
                s_regionId.append("}");

                int pos = url.find(s_regionId);

                url.erase(pos, s_regionId.length());
                url.insert(pos, stringify(regionId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetRegionWithChildrenResponse obj(output_string);


            Response<GetRegionWithChildrenResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetRegionsResponse
        >
        RegionsApi::
        searchRegionsById(
            
            long regionId
            
        )
        {
            std::string url = basepath + "/regions/{regionId}"; //regionId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_regionId("{");
                s_regionId.append("regionId");
                s_regionId.append("}");

                int pos = url.find(s_regionId);

                url.erase(pos, s_regionId.length());
                url.insert(pos, stringify(regionId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetRegionsResponse obj(output_string);


            Response<GetRegionsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetRegionsResponse
        >
        RegionsApi::
        searchRegionsByName(
            
            std::string name
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/regions"; //


            // Headers  | 

            // Query    | name pageToken limit 
            addQueryParam("name",name);
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetRegionsResponse obj(output_string);


            Response<GetRegionsResponse> response(obj, httpCode);
            return response;
        }



