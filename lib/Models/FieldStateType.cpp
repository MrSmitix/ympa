

#include "FieldStateType.h"

using namespace Tiny;

FieldStateType::FieldStateType()
{
}

FieldStateType::FieldStateType(std::string jsonString)
{
	this->fromJson(jsonString);
}

FieldStateType::~FieldStateType()
{

}

void
FieldStateType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FieldStateType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



