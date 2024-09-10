

#include "AddOffersToArchiveErrorType.h"

using namespace Tiny;

AddOffersToArchiveErrorType::AddOffersToArchiveErrorType()
{
}

AddOffersToArchiveErrorType::AddOffersToArchiveErrorType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AddOffersToArchiveErrorType::~AddOffersToArchiveErrorType()
{

}

void
AddOffersToArchiveErrorType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AddOffersToArchiveErrorType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



