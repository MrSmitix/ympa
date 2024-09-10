

#include "ReturnType.h"

using namespace Tiny;

ReturnType::ReturnType()
{
}

ReturnType::ReturnType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReturnType::~ReturnType()
{

}

void
ReturnType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ReturnType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



