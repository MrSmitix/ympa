

#include "LogisticPointType.h"

using namespace Tiny;

LogisticPointType::LogisticPointType()
{
}

LogisticPointType::LogisticPointType(std::string jsonString)
{
	this->fromJson(jsonString);
}

LogisticPointType::~LogisticPointType()
{

}

void
LogisticPointType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
LogisticPointType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



