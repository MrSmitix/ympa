

#include "FeedIndexLogsRecordDTO.h"

using namespace Tiny;

FeedIndexLogsRecordDTO::FeedIndexLogsRecordDTO()
{
	downloadTime = std::string();
	fileTime = std::string();
	generationId = long(0);
	indexType = FeedIndexLogsIndexType();
	publishedTime = std::string();
	status = FeedIndexLogsStatusType();
	error = FeedIndexLogsErrorDTO();
	offers = FeedIndexLogsOffersDTO();
}

FeedIndexLogsRecordDTO::FeedIndexLogsRecordDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedIndexLogsRecordDTO::~FeedIndexLogsRecordDTO()
{

}

void
FeedIndexLogsRecordDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *downloadTimeKey = "downloadTime";

    if(object.has_key(downloadTimeKey))
    {
        bourne::json value = object[downloadTimeKey];



        jsonToValue(&downloadTime, value, "std::string");


    }

    const char *fileTimeKey = "fileTime";

    if(object.has_key(fileTimeKey))
    {
        bourne::json value = object[fileTimeKey];



        jsonToValue(&fileTime, value, "std::string");


    }

    const char *generationIdKey = "generationId";

    if(object.has_key(generationIdKey))
    {
        bourne::json value = object[generationIdKey];



        jsonToValue(&generationId, value, "long");


    }

    const char *indexTypeKey = "indexType";

    if(object.has_key(indexTypeKey))
    {
        bourne::json value = object[indexTypeKey];




        FeedIndexLogsIndexType* obj = &indexType;
		obj->fromJson(value.dump());

    }

    const char *publishedTimeKey = "publishedTime";

    if(object.has_key(publishedTimeKey))
    {
        bourne::json value = object[publishedTimeKey];



        jsonToValue(&publishedTime, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        FeedIndexLogsStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *errorKey = "error";

    if(object.has_key(errorKey))
    {
        bourne::json value = object[errorKey];




        FeedIndexLogsErrorDTO* obj = &error;
		obj->fromJson(value.dump());

    }

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];




        FeedIndexLogsOffersDTO* obj = &offers;
		obj->fromJson(value.dump());

    }


}

bourne::json
FeedIndexLogsRecordDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["downloadTime"] = getDownloadTime();






    object["fileTime"] = getFileTime();






    object["generationId"] = getGenerationId();







	object["indexType"] = getIndexType().toJson();





    object["publishedTime"] = getPublishedTime();







	object["status"] = getStatus().toJson();






	object["error"] = getError().toJson();






	object["offers"] = getOffers().toJson();


    return object;

}

std::string
FeedIndexLogsRecordDTO::getDownloadTime()
{
	return downloadTime;
}

void
FeedIndexLogsRecordDTO::setDownloadTime(std::string  downloadTime)
{
	this->downloadTime = downloadTime;
}

std::string
FeedIndexLogsRecordDTO::getFileTime()
{
	return fileTime;
}

void
FeedIndexLogsRecordDTO::setFileTime(std::string  fileTime)
{
	this->fileTime = fileTime;
}

long
FeedIndexLogsRecordDTO::getGenerationId()
{
	return generationId;
}

void
FeedIndexLogsRecordDTO::setGenerationId(long  generationId)
{
	this->generationId = generationId;
}

FeedIndexLogsIndexType
FeedIndexLogsRecordDTO::getIndexType()
{
	return indexType;
}

void
FeedIndexLogsRecordDTO::setIndexType(FeedIndexLogsIndexType  indexType)
{
	this->indexType = indexType;
}

std::string
FeedIndexLogsRecordDTO::getPublishedTime()
{
	return publishedTime;
}

void
FeedIndexLogsRecordDTO::setPublishedTime(std::string  publishedTime)
{
	this->publishedTime = publishedTime;
}

FeedIndexLogsStatusType
FeedIndexLogsRecordDTO::getStatus()
{
	return status;
}

void
FeedIndexLogsRecordDTO::setStatus(FeedIndexLogsStatusType  status)
{
	this->status = status;
}

FeedIndexLogsErrorDTO
FeedIndexLogsRecordDTO::getError()
{
	return error;
}

void
FeedIndexLogsRecordDTO::setError(FeedIndexLogsErrorDTO  error)
{
	this->error = error;
}

FeedIndexLogsOffersDTO
FeedIndexLogsRecordDTO::getOffers()
{
	return offers;
}

void
FeedIndexLogsRecordDTO::setOffers(FeedIndexLogsOffersDTO  offers)
{
	this->offers = offers;
}



