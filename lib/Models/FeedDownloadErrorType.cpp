

#include "FeedDownloadErrorType.h"

using namespace Tiny;

FeedDownloadErrorType::FeedDownloadErrorType()
{
}

FeedDownloadErrorType::FeedDownloadErrorType(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedDownloadErrorType::~FeedDownloadErrorType()
{

}

void
FeedDownloadErrorType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FeedDownloadErrorType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



