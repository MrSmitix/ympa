

#include "FeedPublicationFullDTO.h"

using namespace Tiny;

FeedPublicationFullDTO::FeedPublicationFullDTO()
{
	fileTime = std::string();
	publishedTime = std::string();
}

FeedPublicationFullDTO::FeedPublicationFullDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedPublicationFullDTO::~FeedPublicationFullDTO()
{

}

void
FeedPublicationFullDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fileTimeKey = "fileTime";

    if(object.has_key(fileTimeKey))
    {
        bourne::json value = object[fileTimeKey];



        jsonToValue(&fileTime, value, "std::string");


    }

    const char *publishedTimeKey = "publishedTime";

    if(object.has_key(publishedTimeKey))
    {
        bourne::json value = object[publishedTimeKey];



        jsonToValue(&publishedTime, value, "std::string");


    }


}

bourne::json
FeedPublicationFullDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["fileTime"] = getFileTime();






    object["publishedTime"] = getPublishedTime();



    return object;

}

std::string
FeedPublicationFullDTO::getFileTime()
{
	return fileTime;
}

void
FeedPublicationFullDTO::setFileTime(std::string  fileTime)
{
	this->fileTime = fileTime;
}

std::string
FeedPublicationFullDTO::getPublishedTime()
{
	return publishedTime;
}

void
FeedPublicationFullDTO::setPublishedTime(std::string  publishedTime)
{
	this->publishedTime = publishedTime;
}



