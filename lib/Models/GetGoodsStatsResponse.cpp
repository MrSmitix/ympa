

#include "GetGoodsStatsResponse.h"

using namespace Tiny;

GetGoodsStatsResponse::GetGoodsStatsResponse()
{
	status = ApiResponseStatusType();
	result = GoodsStatsDTO();
}

GetGoodsStatsResponse::GetGoodsStatsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetGoodsStatsResponse::~GetGoodsStatsResponse()
{

}

void
GetGoodsStatsResponse::fromJson(std::string jsonObj)
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




        GoodsStatsDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetGoodsStatsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetGoodsStatsResponse::getStatus()
{
	return status;
}

void
GetGoodsStatsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GoodsStatsDTO
GetGoodsStatsResponse::getResult()
{
	return result;
}

void
GetGoodsStatsResponse::setResult(GoodsStatsDTO  result)
{
	this->result = result;
}



