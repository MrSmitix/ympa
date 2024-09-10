

#include "GenerateShelfsStatisticsRequest.h"

using namespace Tiny;

GenerateShelfsStatisticsRequest::GenerateShelfsStatisticsRequest()
{
	businessId = long(0);
	dateFrom = std::string();
	dateTo = std::string();
	attributionType = ShelfsStatisticsAttributionType();
}

GenerateShelfsStatisticsRequest::GenerateShelfsStatisticsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerateShelfsStatisticsRequest::~GenerateShelfsStatisticsRequest()
{

}

void
GenerateShelfsStatisticsRequest::fromJson(std::string jsonObj)
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

    const char *attributionTypeKey = "attributionType";

    if(object.has_key(attributionTypeKey))
    {
        bourne::json value = object[attributionTypeKey];




        ShelfsStatisticsAttributionType* obj = &attributionType;
		obj->fromJson(value.dump());

    }


}

bourne::json
GenerateShelfsStatisticsRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["businessId"] = getBusinessId();







	object["dateFrom"] = getDateFrom().toJson();






	object["dateTo"] = getDateTo().toJson();






	object["attributionType"] = getAttributionType().toJson();


    return object;

}

long
GenerateShelfsStatisticsRequest::getBusinessId()
{
	return businessId;
}

void
GenerateShelfsStatisticsRequest::setBusinessId(long  businessId)
{
	this->businessId = businessId;
}

Date
GenerateShelfsStatisticsRequest::getDateFrom()
{
	return dateFrom;
}

void
GenerateShelfsStatisticsRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GenerateShelfsStatisticsRequest::getDateTo()
{
	return dateTo;
}

void
GenerateShelfsStatisticsRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

ShelfsStatisticsAttributionType
GenerateShelfsStatisticsRequest::getAttributionType()
{
	return attributionType;
}

void
GenerateShelfsStatisticsRequest::setAttributionType(ShelfsStatisticsAttributionType  attributionType)
{
	this->attributionType = attributionType;
}



