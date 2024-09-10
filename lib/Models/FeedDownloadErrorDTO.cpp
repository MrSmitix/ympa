

#include "FeedDownloadErrorDTO.h"

using namespace Tiny;

FeedDownloadErrorDTO::FeedDownloadErrorDTO()
{
	httpStatusCode = int(0);
	type = FeedDownloadErrorType();
	description = std::string();
}

FeedDownloadErrorDTO::FeedDownloadErrorDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedDownloadErrorDTO::~FeedDownloadErrorDTO()
{

}

void
FeedDownloadErrorDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *httpStatusCodeKey = "httpStatusCode";

    if(object.has_key(httpStatusCodeKey))
    {
        bourne::json value = object[httpStatusCodeKey];



        jsonToValue(&httpStatusCode, value, "int");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        FeedDownloadErrorType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }


}

bourne::json
FeedDownloadErrorDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["httpStatusCode"] = getHttpStatusCode();







	object["type"] = getType().toJson();





    object["description"] = getDescription();



    return object;

}

int
FeedDownloadErrorDTO::getHttpStatusCode()
{
	return httpStatusCode;
}

void
FeedDownloadErrorDTO::setHttpStatusCode(int  httpStatusCode)
{
	this->httpStatusCode = httpStatusCode;
}

FeedDownloadErrorType
FeedDownloadErrorDTO::getType()
{
	return type;
}

void
FeedDownloadErrorDTO::setType(FeedDownloadErrorType  type)
{
	this->type = type;
}

std::string
FeedDownloadErrorDTO::getDescription()
{
	return description;
}

void
FeedDownloadErrorDTO::setDescription(std::string  description)
{
	this->description = description;
}



