

#include "LicenseType.h"

using namespace Tiny;

LicenseType::LicenseType()
{
}

LicenseType::LicenseType(std::string jsonString)
{
	this->fromJson(jsonString);
}

LicenseType::~LicenseType()
{

}

void
LicenseType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
LicenseType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



