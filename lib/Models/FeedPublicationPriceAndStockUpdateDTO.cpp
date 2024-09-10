

#include "FeedPublicationPriceAndStockUpdateDTO.h"

using namespace Tiny;

FeedPublicationPriceAndStockUpdateDTO::FeedPublicationPriceAndStockUpdateDTO()
{
	fileTime = std::string();
	publishedTime = std::string();
}

FeedPublicationPriceAndStockUpdateDTO::FeedPublicationPriceAndStockUpdateDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedPublicationPriceAndStockUpdateDTO::~FeedPublicationPriceAndStockUpdateDTO()
{

}

void
FeedPublicationPriceAndStockUpdateDTO::fromJson(std::string jsonObj)
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
FeedPublicationPriceAndStockUpdateDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["fileTime"] = getFileTime();






    object["publishedTime"] = getPublishedTime();



    return object;

}

std::string
FeedPublicationPriceAndStockUpdateDTO::getFileTime()
{
	return fileTime;
}

void
FeedPublicationPriceAndStockUpdateDTO::setFileTime(std::string  fileTime)
{
	this->fileTime = fileTime;
}

std::string
FeedPublicationPriceAndStockUpdateDTO::getPublishedTime()
{
	return publishedTime;
}

void
FeedPublicationPriceAndStockUpdateDTO::setPublishedTime(std::string  publishedTime)
{
	this->publishedTime = publishedTime;
}



