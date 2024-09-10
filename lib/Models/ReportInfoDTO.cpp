

#include "ReportInfoDTO.h"

using namespace Tiny;

ReportInfoDTO::ReportInfoDTO()
{
	status = ReportStatusType();
	subStatus = ReportSubStatusType();
	generationRequestedAt = std::string();
	generationFinishedAt = std::string();
	file = std::string();
	estimatedGenerationTime = long(0);
}

ReportInfoDTO::ReportInfoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReportInfoDTO::~ReportInfoDTO()
{

}

void
ReportInfoDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        ReportStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *subStatusKey = "subStatus";

    if(object.has_key(subStatusKey))
    {
        bourne::json value = object[subStatusKey];




        ReportSubStatusType* obj = &subStatus;
		obj->fromJson(value.dump());

    }

    const char *generationRequestedAtKey = "generationRequestedAt";

    if(object.has_key(generationRequestedAtKey))
    {
        bourne::json value = object[generationRequestedAtKey];



        jsonToValue(&generationRequestedAt, value, "std::string");


    }

    const char *generationFinishedAtKey = "generationFinishedAt";

    if(object.has_key(generationFinishedAtKey))
    {
        bourne::json value = object[generationFinishedAtKey];



        jsonToValue(&generationFinishedAt, value, "std::string");


    }

    const char *fileKey = "file";

    if(object.has_key(fileKey))
    {
        bourne::json value = object[fileKey];



        jsonToValue(&file, value, "std::string");


    }

    const char *estimatedGenerationTimeKey = "estimatedGenerationTime";

    if(object.has_key(estimatedGenerationTimeKey))
    {
        bourne::json value = object[estimatedGenerationTimeKey];



        jsonToValue(&estimatedGenerationTime, value, "long");


    }


}

bourne::json
ReportInfoDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["subStatus"] = getSubStatus().toJson();





    object["generationRequestedAt"] = getGenerationRequestedAt();






    object["generationFinishedAt"] = getGenerationFinishedAt();






    object["file"] = getFile();






    object["estimatedGenerationTime"] = getEstimatedGenerationTime();



    return object;

}

ReportStatusType
ReportInfoDTO::getStatus()
{
	return status;
}

void
ReportInfoDTO::setStatus(ReportStatusType  status)
{
	this->status = status;
}

ReportSubStatusType
ReportInfoDTO::getSubStatus()
{
	return subStatus;
}

void
ReportInfoDTO::setSubStatus(ReportSubStatusType  subStatus)
{
	this->subStatus = subStatus;
}

std::string
ReportInfoDTO::getGenerationRequestedAt()
{
	return generationRequestedAt;
}

void
ReportInfoDTO::setGenerationRequestedAt(std::string  generationRequestedAt)
{
	this->generationRequestedAt = generationRequestedAt;
}

std::string
ReportInfoDTO::getGenerationFinishedAt()
{
	return generationFinishedAt;
}

void
ReportInfoDTO::setGenerationFinishedAt(std::string  generationFinishedAt)
{
	this->generationFinishedAt = generationFinishedAt;
}

std::string
ReportInfoDTO::getFile()
{
	return file;
}

void
ReportInfoDTO::setFile(std::string  file)
{
	this->file = file;
}

long
ReportInfoDTO::getEstimatedGenerationTime()
{
	return estimatedGenerationTime;
}

void
ReportInfoDTO::setEstimatedGenerationTime(long  estimatedGenerationTime)
{
	this->estimatedGenerationTime = estimatedGenerationTime;
}



