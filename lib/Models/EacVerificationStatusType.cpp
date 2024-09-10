

#include "EacVerificationStatusType.h"

using namespace Tiny;

EacVerificationStatusType::EacVerificationStatusType()
{
}

EacVerificationStatusType::EacVerificationStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

EacVerificationStatusType::~EacVerificationStatusType()
{

}

void
EacVerificationStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
EacVerificationStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



