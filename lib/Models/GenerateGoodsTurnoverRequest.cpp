

#include "GenerateGoodsTurnoverRequest.h"

using namespace Tiny;

GenerateGoodsTurnoverRequest::GenerateGoodsTurnoverRequest()
{
	campaignId = long(0);
	date = std::string();
}

GenerateGoodsTurnoverRequest::GenerateGoodsTurnoverRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerateGoodsTurnoverRequest::~GenerateGoodsTurnoverRequest()
{

}

void
GenerateGoodsTurnoverRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *campaignIdKey = "campaignId";

    if(object.has_key(campaignIdKey))
    {
        bourne::json value = object[campaignIdKey];



        jsonToValue(&campaignId, value, "long");


    }

    const char *dateKey = "date";

    if(object.has_key(dateKey))
    {
        bourne::json value = object[dateKey];




        Date* obj = &date;
		obj->fromJson(value.dump());

    }


}

bourne::json
GenerateGoodsTurnoverRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["campaignId"] = getCampaignId();







	object["date"] = getDate().toJson();


    return object;

}

long
GenerateGoodsTurnoverRequest::getCampaignId()
{
	return campaignId;
}

void
GenerateGoodsTurnoverRequest::setCampaignId(long  campaignId)
{
	this->campaignId = campaignId;
}

Date
GenerateGoodsTurnoverRequest::getDate()
{
	return date;
}

void
GenerateGoodsTurnoverRequest::setDate(Date  date)
{
	this->date = date;
}



