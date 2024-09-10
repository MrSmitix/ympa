#include "ChatsApi.h"

using namespace Tiny;



        Response<
            CreateChatResponse
        >
        ChatsApi::
        createChat(
            
            long businessId
            , 
            
            CreateChatRequest createChatRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/chats/new"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createChatRequest



            payload = createChatRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CreateChatResponse obj(output_string);


            Response<CreateChatResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetChatHistoryResponse
        >
        ChatsApi::
        getChatHistory(
            
            long businessId
            , 
            
            long chatId
            , 
            
            GetChatHistoryRequest getChatHistoryRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/chats/history"; //businessId 


            // Headers  | 

            // Query    | chatId pageToken limit 
            addQueryParam("chatId",chatId);
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getChatHistoryRequest



            payload = getChatHistoryRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetChatHistoryResponse obj(output_string);


            Response<GetChatHistoryResponse> response(obj, httpCode);
            return response;
        }

        Response<
            GetChatsResponse
        >
        ChatsApi::
        getChats(
            
            long businessId
            , 
            
            GetChatsRequest getChatsRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/chats"; //businessId 


            // Headers  | 

            // Query    | pageToken limit 
            addQueryParam("page_token",pageToken);
            addQueryParam("limit",limit);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | getChatsRequest



            payload = getChatsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            GetChatsResponse obj(output_string);


            Response<GetChatsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        ChatsApi::
        sendFileToChat(
            
            long businessId
            , 
            
            long chatId
            , 
            
            std::string file
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/chats/file/send"; //businessId 


            // Headers  | 

            // Query    | chatId 
            addQueryParam("chatId",chatId);

            // Form     | file 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("file",file);


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




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }

        Response<
            EmptyApiResponse
        >
        ChatsApi::
        sendMessageToChat(
            
            long businessId
            , 
            
            long chatId
            , 
            
            SendMessageToChatRequest sendMessageToChatRequest
            
        )
        {
            std::string url = basepath + "/businesses/{businessId}/chats/message"; //businessId 


            // Headers  | 

            // Query    | chatId 
            addQueryParam("chatId",chatId);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("businessId");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | sendMessageToChatRequest



            payload = sendMessageToChatRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EmptyApiResponse obj(output_string);


            Response<EmptyApiResponse> response(obj, httpCode);
            return response;
        }



