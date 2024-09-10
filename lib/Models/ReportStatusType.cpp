

#include "ReportStatusType.h"

using namespace Tiny;

ReportStatusType::ReportStatusType()
{
}

ReportStatusType::ReportStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReportStatusType::~ReportStatusType()
{

}

void
ReportStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ReportStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



