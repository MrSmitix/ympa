

#include "GenerateShowsSalesReportRequest.h"

using namespace Tiny;

GenerateShowsSalesReportRequest::GenerateShowsSalesReportRequest()
{
	businessId = long(0);
	campaignId = long(0);
	dateFrom = std::string();
	dateTo = std::string();
	grouping = ShowsSalesGroupingType();
}

GenerateShowsSalesReportRequest::GenerateShowsSalesReportRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerateShowsSalesReportRequest::~GenerateShowsSalesReportRequest()
{

}

void
GenerateShowsSalesReportRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *businessIdKey = "businessId";

    if(object.has_key(businessIdKey))
    {
        bourne::json value = object[businessIdKey];



        jsonToValue(&businessId, value, "long");


    }

    const char *campaignIdKey = "campaignId";

    if(object.has_key(campaignIdKey))
    {
        bourne::json value = object[campaignIdKey];



        jsonToValue(&campaignId, value, "long");


    }

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

    const char *groupingKey = "grouping";

    if(object.has_key(groupingKey))
    {
        bourne::json value = object[groupingKey];




        ShowsSalesGroupingType* obj = &grouping;
		obj->fromJson(value.dump());

    }


}

bourne::json
GenerateShowsSalesReportRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["businessId"] = getBusinessId();






    object["campaignId"] = getCampaignId();







	object["dateFrom"] = getDateFrom().toJson();






	object["dateTo"] = getDateTo().toJson();






	object["grouping"] = getGrouping().toJson();


    return object;

}

long
GenerateShowsSalesReportRequest::getBusinessId()
{
	return businessId;
}

void
GenerateShowsSalesReportRequest::setBusinessId(long  businessId)
{
	this->businessId = businessId;
}

long
GenerateShowsSalesReportRequest::getCampaignId()
{
	return campaignId;
}

void
GenerateShowsSalesReportRequest::setCampaignId(long  campaignId)
{
	this->campaignId = campaignId;
}

Date
GenerateShowsSalesReportRequest::getDateFrom()
{
	return dateFrom;
}

void
GenerateShowsSalesReportRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GenerateShowsSalesReportRequest::getDateTo()
{
	return dateTo;
}

void
GenerateShowsSalesReportRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

ShowsSalesGroupingType
GenerateShowsSalesReportRequest::getGrouping()
{
	return grouping;
}

void
GenerateShowsSalesReportRequest::setGrouping(ShowsSalesGroupingType  grouping)
{
	this->grouping = grouping;
}



