

#include "GenerateReportDTO.h"

using namespace Tiny;

GenerateReportDTO::GenerateReportDTO()
{
	reportId = std::string();
	estimatedGenerationTime = long(0);
}

GenerateReportDTO::GenerateReportDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerateReportDTO::~GenerateReportDTO()
{

}

void
GenerateReportDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *reportIdKey = "reportId";

    if(object.has_key(reportIdKey))
    {
        bourne::json value = object[reportIdKey];



        jsonToValue(&reportId, value, "std::string");


    }

    const char *estimatedGenerationTimeKey = "estimatedGenerationTime";

    if(object.has_key(estimatedGenerationTimeKey))
    {
        bourne::json value = object[estimatedGenerationTimeKey];



        jsonToValue(&estimatedGenerationTime, value, "long");


    }


}

bourne::json
GenerateReportDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["reportId"] = getReportId();






    object["estimatedGenerationTime"] = getEstimatedGenerationTime();



    return object;

}

std::string
GenerateReportDTO::getReportId()
{
	return reportId;
}

void
GenerateReportDTO::setReportId(std::string  reportId)
{
	this->reportId = reportId;
}

long
GenerateReportDTO::getEstimatedGenerationTime()
{
	return estimatedGenerationTime;
}

void
GenerateReportDTO::setEstimatedGenerationTime(long  estimatedGenerationTime)
{
	this->estimatedGenerationTime = estimatedGenerationTime;
}



