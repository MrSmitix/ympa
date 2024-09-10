

#include "GetCategoriesResponse.h"

using namespace Tiny;

GetCategoriesResponse::GetCategoriesResponse()
{
	status = ApiResponseStatusType();
	result = CategoryDTO();
}

GetCategoriesResponse::GetCategoriesResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetCategoriesResponse::~GetCategoriesResponse()
{

}

void
GetCategoriesResponse::fromJson(std::string jsonObj)
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




        CategoryDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetCategoriesResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetCategoriesResponse::getStatus()
{
	return status;
}

void
GetCategoriesResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

CategoryDTO
GetCategoriesResponse::getResult()
{
	return result;
}

void
GetCategoriesResponse::setResult(CategoryDTO  result)
{
	this->result = result;
}



