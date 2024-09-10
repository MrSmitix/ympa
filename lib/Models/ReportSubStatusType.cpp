

#include "ReportSubStatusType.h"

using namespace Tiny;

ReportSubStatusType::ReportSubStatusType()
{
}

ReportSubStatusType::ReportSubStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReportSubStatusType::~ReportSubStatusType()
{

}

void
ReportSubStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ReportSubStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



