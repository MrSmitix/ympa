

#include "OutletType.h"

using namespace Tiny;

OutletType::OutletType()
{
}

OutletType::OutletType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OutletType::~OutletType()
{

}

void
OutletType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OutletType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



