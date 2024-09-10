

#include "GetWarehouseStocksResponse.h"

using namespace Tiny;

GetWarehouseStocksResponse::GetWarehouseStocksResponse()
{
	status = ApiResponseStatusType();
	result = GetWarehouseStocksDTO();
}

GetWarehouseStocksResponse::GetWarehouseStocksResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetWarehouseStocksResponse::~GetWarehouseStocksResponse()
{

}

void
GetWarehouseStocksResponse::fromJson(std::string jsonObj)
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




        GetWarehouseStocksDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetWarehouseStocksResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetWarehouseStocksResponse::getStatus()
{
	return status;
}

void
GetWarehouseStocksResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GetWarehouseStocksDTO
GetWarehouseStocksResponse::getResult()
{
	return result;
}

void
GetWarehouseStocksResponse::setResult(GetWarehouseStocksDTO  result)
{
	this->result = result;
}



