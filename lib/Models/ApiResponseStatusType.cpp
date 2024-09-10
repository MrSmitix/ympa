

#include "ApiResponseStatusType.h"

using namespace Tiny;

ApiResponseStatusType::ApiResponseStatusType()
{
}

ApiResponseStatusType::ApiResponseStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ApiResponseStatusType::~ApiResponseStatusType()
{

}

void
ApiResponseStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ApiResponseStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



