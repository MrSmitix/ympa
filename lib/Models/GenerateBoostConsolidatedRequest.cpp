

#include "GenerateBoostConsolidatedRequest.h"

using namespace Tiny;

GenerateBoostConsolidatedRequest::GenerateBoostConsolidatedRequest()
{
	businessId = long(0);
	dateFrom = std::string();
	dateTo = std::string();
}

GenerateBoostConsolidatedRequest::GenerateBoostConsolidatedRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerateBoostConsolidatedRequest::~GenerateBoostConsolidatedRequest()
{

}

void
GenerateBoostConsolidatedRequest::fromJson(std::string jsonObj)
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


}

bourne::json
GenerateBoostConsolidatedRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["businessId"] = getBusinessId();







	object["dateFrom"] = getDateFrom().toJson();






	object["dateTo"] = getDateTo().toJson();


    return object;

}

long
GenerateBoostConsolidatedRequest::getBusinessId()
{
	return businessId;
}

void
GenerateBoostConsolidatedRequest::setBusinessId(long  businessId)
{
	this->businessId = businessId;
}

Date
GenerateBoostConsolidatedRequest::getDateFrom()
{
	return dateFrom;
}

void
GenerateBoostConsolidatedRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GenerateBoostConsolidatedRequest::getDateTo()
{
	return dateTo;
}

void
GenerateBoostConsolidatedRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}



