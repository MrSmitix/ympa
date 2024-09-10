

#include "GenerateUnitedOrdersRequest.h"

using namespace Tiny;

GenerateUnitedOrdersRequest::GenerateUnitedOrdersRequest()
{
	businessId = long(0);
	dateFrom = std::string();
	dateTo = std::string();
	campaignIds = std::list<long>();
	promoId = std::string();
}

GenerateUnitedOrdersRequest::GenerateUnitedOrdersRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerateUnitedOrdersRequest::~GenerateUnitedOrdersRequest()
{

}

void
GenerateUnitedOrdersRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *businessIdKey = "businessId";

    if(object.has_key(businessIdKey))
    {
        bourne::json value = object[businessIdKey];



        jsonToValue(&businessId, value, "long");


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

    const char *promoIdKey = "promoId";

    if(object.has_key(promoIdKey))
    {
        bourne::json value = object[promoIdKey];



        jsonToValue(&promoId, value, "std::string");


    }


}

bourne::json
GenerateUnitedOrdersRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["businessId"] = getBusinessId();







	object["dateFrom"] = getDateFrom().toJson();






	object["dateTo"] = getDateTo().toJson();




    std::list<long> campaignIds_list = getCampaignIds();
    bourne::json campaignIds_arr = bourne::json::array();

    for(auto& var : campaignIds_list)
    {
        campaignIds_arr.append(var);
    }
    object["campaignIds"] = campaignIds_arr;









    object["promoId"] = getPromoId();



    return object;

}

long
GenerateUnitedOrdersRequest::getBusinessId()
{
	return businessId;
}

void
GenerateUnitedOrdersRequest::setBusinessId(long  businessId)
{
	this->businessId = businessId;
}

Date
GenerateUnitedOrdersRequest::getDateFrom()
{
	return dateFrom;
}

void
GenerateUnitedOrdersRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GenerateUnitedOrdersRequest::getDateTo()
{
	return dateTo;
}

void
GenerateUnitedOrdersRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

std::list<long>
GenerateUnitedOrdersRequest::getCampaignIds()
{
	return campaignIds;
}

void
GenerateUnitedOrdersRequest::setCampaignIds(std::list <long> campaignIds)
{
	this->campaignIds = campaignIds;
}

std::string
GenerateUnitedOrdersRequest::getPromoId()
{
	return promoId;
}

void
GenerateUnitedOrdersRequest::setPromoId(std::string  promoId)
{
	this->promoId = promoId;
}



