

#include "FeedDownloadDTO.h"

using namespace Tiny;

FeedDownloadDTO::FeedDownloadDTO()
{
	status = FeedStatusType();
	error = FeedDownloadErrorDTO();
}

FeedDownloadDTO::FeedDownloadDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedDownloadDTO::~FeedDownloadDTO()
{

}

void
FeedDownloadDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        FeedStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *errorKey = "error";

    if(object.has_key(errorKey))
    {
        bourne::json value = object[errorKey];




        FeedDownloadErrorDTO* obj = &error;
		obj->fromJson(value.dump());

    }


}

bourne::json
FeedDownloadDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["error"] = getError().toJson();


    return object;

}

FeedStatusType
FeedDownloadDTO::getStatus()
{
	return status;
}

void
FeedDownloadDTO::setStatus(FeedStatusType  status)
{
	this->status = status;
}

FeedDownloadErrorDTO
FeedDownloadDTO::getError()
{
	return error;
}

void
FeedDownloadDTO::setError(FeedDownloadErrorDTO  error)
{
	this->error = error;
}



