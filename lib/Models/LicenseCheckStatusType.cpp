

#include "LicenseCheckStatusType.h"

using namespace Tiny;

LicenseCheckStatusType::LicenseCheckStatusType()
{
}

LicenseCheckStatusType::LicenseCheckStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

LicenseCheckStatusType::~LicenseCheckStatusType()
{

}

void
LicenseCheckStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
LicenseCheckStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



