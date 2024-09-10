

#include "GetQualityRatingRequest.h"

using namespace Tiny;

GetQualityRatingRequest::GetQualityRatingRequest()
{
	dateFrom = std::string();
	dateTo = std::string();
	campaignIds = std::list<long>();
}

GetQualityRatingRequest::GetQualityRatingRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetQualityRatingRequest::~GetQualityRatingRequest()
{

}

void
GetQualityRatingRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dateFromKey = "dateFrom";

    if(object.has_key(dateFromKey))
    {
        bourne::json value = object[dateFromKey];




        Date* obj = &dateFrom;
		obj->fromJson(value.dump());

    }

    const char *dateToKey = "dateTo";

    if(object.has_key(dateToKey))
    {
        bourne::json value = object[dateToKey];




        Date* obj = &dateTo;
		obj->fromJson(value.dump());

    }

    const char *campaignIdsKey = "campaignIds";

    if(object.has_key(campaignIdsKey))
    {
        bourne::json value = object[campaignIdsKey];


        std::list<long> campaignIds_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            campaignIds_list.push_back(element);
        }
        campaignIds = campaignIds_list;


    }


}

bourne::json
GetQualityRatingRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["dateFrom"] = getDateFrom().toJson();






	object["dateTo"] = getDateTo().toJson();




    std::list<long> campaignIds_list = getCampaignIds();
    bourne::json campaignIds_arr = bourne::json::array();

    for(auto& var : campaignIds_list)
    {
        campaignIds_arr.append(var);
    }
    object["campaignIds"] = campaignIds_arr;






    return object;

}

Date
GetQualityRatingRequest::getDateFrom()
{
	return dateFrom;
}

void
GetQualityRatingRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GetQualityRatingRequest::getDateTo()
{
	return dateTo;
}

void
GetQualityRatingRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

Set<long>
GetQualityRatingRequest::getCampaignIds()
{
	return campaignIds;
}

void
GetQualityRatingRequest::setCampaignIds(Set <long> campaignIds)
{
	this->campaignIds = campaignIds;
}



