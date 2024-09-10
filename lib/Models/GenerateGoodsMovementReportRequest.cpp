

#include "GenerateGoodsMovementReportRequest.h"

using namespace Tiny;

GenerateGoodsMovementReportRequest::GenerateGoodsMovementReportRequest()
{
	campaignId = long(0);
	dateFrom = std::string();
	dateTo = std::string();
	shopSku = std::string();
}

GenerateGoodsMovementReportRequest::GenerateGoodsMovementReportRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerateGoodsMovementReportRequest::~GenerateGoodsMovementReportRequest()
{

}

void
GenerateGoodsMovementReportRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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

    const char *shopSkuKey = "shopSku";

    if(object.has_key(shopSkuKey))
    {
        bourne::json value = object[shopSkuKey];



        jsonToValue(&shopSku, value, "std::string");


    }


}

bourne::json
GenerateGoodsMovementReportRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["campaignId"] = getCampaignId();







	object["dateFrom"] = getDateFrom().toJson();






	object["dateTo"] = getDateTo().toJson();





    object["shopSku"] = getShopSku();



    return object;

}

long
GenerateGoodsMovementReportRequest::getCampaignId()
{
	return campaignId;
}

void
GenerateGoodsMovementReportRequest::setCampaignId(long  campaignId)
{
	this->campaignId = campaignId;
}

Date
GenerateGoodsMovementReportRequest::getDateFrom()
{
	return dateFrom;
}

void
GenerateGoodsMovementReportRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GenerateGoodsMovementReportRequest::getDateTo()
{
	return dateTo;
}

void
GenerateGoodsMovementReportRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

std::string
GenerateGoodsMovementReportRequest::getShopSku()
{
	return shopSku;
}

void
GenerateGoodsMovementReportRequest::setShopSku(std::string  shopSku)
{
	this->shopSku = shopSku;
}



