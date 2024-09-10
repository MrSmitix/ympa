

#include "GenerateGoodsRealizationReportRequest.h"

using namespace Tiny;

GenerateGoodsRealizationReportRequest::GenerateGoodsRealizationReportRequest()
{
	campaignId = long(0);
	year = int(0);
	month = int(0);
}

GenerateGoodsRealizationReportRequest::GenerateGoodsRealizationReportRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerateGoodsRealizationReportRequest::~GenerateGoodsRealizationReportRequest()
{

}

void
GenerateGoodsRealizationReportRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *campaignIdKey = "campaignId";

    if(object.has_key(campaignIdKey))
    {
        bourne::json value = object[campaignIdKey];



        jsonToValue(&campaignId, value, "long");


    }

    const char *yearKey = "year";

    if(object.has_key(yearKey))
    {
        bourne::json value = object[yearKey];



        jsonToValue(&year, value, "int");


    }

    const char *monthKey = "month";

    if(object.has_key(monthKey))
    {
        bourne::json value = object[monthKey];



        jsonToValue(&month, value, "int");


    }


}

bourne::json
GenerateGoodsRealizationReportRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["campaignId"] = getCampaignId();






    object["year"] = getYear();






    object["month"] = getMonth();



    return object;

}

long
GenerateGoodsRealizationReportRequest::getCampaignId()
{
	return campaignId;
}

void
GenerateGoodsRealizationReportRequest::setCampaignId(long  campaignId)
{
	this->campaignId = campaignId;
}

int
GenerateGoodsRealizationReportRequest::getYear()
{
	return year;
}

void
GenerateGoodsRealizationReportRequest::setYear(int  year)
{
	this->year = year;
}

int
GenerateGoodsRealizationReportRequest::getMonth()
{
	return month;
}

void
GenerateGoodsRealizationReportRequest::setMonth(int  month)
{
	this->month = month;
}



