

#include "ReportFormatType.h"

using namespace Tiny;

ReportFormatType::ReportFormatType()
{
}

ReportFormatType::ReportFormatType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReportFormatType::~ReportFormatType()
{

}

void
ReportFormatType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ReportFormatType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



