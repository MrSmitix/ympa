

#include "GetCategoryContentParametersResponse.h"

using namespace Tiny;

GetCategoryContentParametersResponse::GetCategoryContentParametersResponse()
{
	status = ApiResponseStatusType();
	result = CategoryContentParametersDTO();
}

GetCategoryContentParametersResponse::GetCategoryContentParametersResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetCategoryContentParametersResponse::~GetCategoryContentParametersResponse()
{

}

void
GetCategoryContentParametersResponse::fromJson(std::string jsonObj)
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




        CategoryContentParametersDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetCategoryContentParametersResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetCategoryContentParametersResponse::getStatus()
{
	return status;
}

void
GetCategoryContentParametersResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

CategoryContentParametersDTO
GetCategoryContentParametersResponse::getResult()
{
	return result;
}

void
GetCategoryContentParametersResponse::setResult(CategoryContentParametersDTO  result)
{
	this->result = result;
}



