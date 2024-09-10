

#include "RecipientType.h"

using namespace Tiny;

RecipientType::RecipientType()
{
}

RecipientType::RecipientType(std::string jsonString)
{
	this->fromJson(jsonString);
}

RecipientType::~RecipientType()
{

}

void
RecipientType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
RecipientType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



