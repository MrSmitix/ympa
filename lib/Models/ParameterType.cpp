

#include "ParameterType.h"

using namespace Tiny;

ParameterType::ParameterType()
{
}

ParameterType::ParameterType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ParameterType::~ParameterType()
{

}

void
ParameterType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ParameterType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



