

#include "GetChatHistoryResponse.h"

using namespace Tiny;

GetChatHistoryResponse::GetChatHistoryResponse()
{
	status = ApiResponseStatusType();
	result = ChatMessagesResultDTO();
}

GetChatHistoryResponse::GetChatHistoryResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetChatHistoryResponse::~GetChatHistoryResponse()
{

}

void
GetChatHistoryResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        ApiResponseStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *resultKey = "result";

    if(object.has_key(resultKey))
    {
        bourne::json value = object[resultKey];




        ChatMessagesResultDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetChatHistoryResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetChatHistoryResponse::getStatus()
{
	return status;
}

void
GetChatHistoryResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

ChatMessagesResultDTO
GetChatHistoryResponse::getResult()
{
	return result;
}

void
GetChatHistoryResponse::setResult(ChatMessagesResultDTO  result)
{
	this->result = result;
}



