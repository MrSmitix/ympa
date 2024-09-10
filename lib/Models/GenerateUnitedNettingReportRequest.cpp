

#include "GenerateUnitedNettingReportRequest.h"

using namespace Tiny;

GenerateUnitedNettingReportRequest::GenerateUnitedNettingReportRequest()
{
	businessId = long(0);
	dateTimeFrom = std::string();
	dateTimeTo = std::string();
	dateFrom = std::string();
	dateTo = std::string();
	bankOrderId = long(0);
	bankOrderDateTime = std::string();
	placementPrograms = std::list<PlacementType>();
	inns = std::list<std::string>();
	campaignIds = std::list<long>();
}

GenerateUnitedNettingReportRequest::GenerateUnitedNettingReportRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerateUnitedNettingReportRequest::~GenerateUnitedNettingReportRequest()
{

}

void
GenerateUnitedNettingReportRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *businessIdKey = "businessId";

    if(object.has_key(businessIdKey))
    {
        bourne::json value = object[businessIdKey];



        jsonToValue(&businessId, value, "long");


    }

    const char *dateTimeFromKey = "dateTimeFrom";

    if(object.has_key(dateTimeFromKey))
    {
        bourne::json value = object[dateTimeFromKey];



        jsonToValue(&dateTimeFrom, value, "std::string");


    }

    const char *dateTimeToKey = "dateTimeTo";

    if(object.has_key(dateTimeToKey))
    {
        bourne::json value = object[dateTimeToKey];



        jsonToValue(&dateTimeTo, value, "std::string");


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

    const char *bankOrderIdKey = "bankOrderId";

    if(object.has_key(bankOrderIdKey))
    {
        bourne::json value = object[bankOrderIdKey];



        jsonToValue(&bankOrderId, value, "long");


    }

    const char *bankOrderDateTimeKey = "bankOrderDateTime";

    if(object.has_key(bankOrderDateTimeKey))
    {
        bourne::json value = object[bankOrderDateTimeKey];



        jsonToValue(&bankOrderDateTime, value, "std::string");


    }

    const char *placementProgramsKey = "placementPrograms";

    if(object.has_key(placementProgramsKey))
    {
        bourne::json value = object[placementProgramsKey];


        std::list<PlacementType> placementPrograms_list;
        PlacementType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            placementPrograms_list.push_back(element);
        }
        placementPrograms = placementPrograms_list;


    }

    const char *innsKey = "inns";

    if(object.has_key(innsKey))
    {
        bourne::json value = object[innsKey];


        std::list<std::string> inns_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            inns_list.push_back(element);
        }
        inns = inns_list;


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
GenerateUnitedNettingReportRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["businessId"] = getBusinessId();






    object["dateTimeFrom"] = getDateTimeFrom();






    object["dateTimeTo"] = getDateTimeTo();







	object["dateFrom"] = getDateFrom().toJson();






	object["dateTo"] = getDateTo().toJson();





    object["bankOrderId"] = getBankOrderId();






    object["bankOrderDateTime"] = getBankOrderDateTime();





    std::list<PlacementType> placementPrograms_list = getPlacementPrograms();
    bourne::json placementPrograms_arr = bourne::json::array();

    for(auto& var : placementPrograms_list)
    {
        PlacementType obj = var;
        placementPrograms_arr.append(obj.toJson());
    }
    object["placementPrograms"] = placementPrograms_arr;






    std::list<std::string> inns_list = getInns();
    bourne::json inns_arr = bourne::json::array();

    for(auto& var : inns_list)
    {
        inns_arr.append(var);
    }
    object["inns"] = inns_arr;








    std::list<long> campaignIds_list = getCampaignIds();
    bourne::json campaignIds_arr = bourne::json::array();

    for(auto& var : campaignIds_list)
    {
        campaignIds_arr.append(var);
    }
    object["campaignIds"] = campaignIds_arr;






    return object;

}

long
GenerateUnitedNettingReportRequest::getBusinessId()
{
	return businessId;
}

void
GenerateUnitedNettingReportRequest::setBusinessId(long  businessId)
{
	this->businessId = businessId;
}

std::string
GenerateUnitedNettingReportRequest::getDateTimeFrom()
{
	return dateTimeFrom;
}

void
GenerateUnitedNettingReportRequest::setDateTimeFrom(std::string  dateTimeFrom)
{
	this->dateTimeFrom = dateTimeFrom;
}

std::string
GenerateUnitedNettingReportRequest::getDateTimeTo()
{
	return dateTimeTo;
}

void
GenerateUnitedNettingReportRequest::setDateTimeTo(std::string  dateTimeTo)
{
	this->dateTimeTo = dateTimeTo;
}

Date
GenerateUnitedNettingReportRequest::getDateFrom()
{
	return dateFrom;
}

void
GenerateUnitedNettingReportRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GenerateUnitedNettingReportRequest::getDateTo()
{
	return dateTo;
}

void
GenerateUnitedNettingReportRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

long
GenerateUnitedNettingReportRequest::getBankOrderId()
{
	return bankOrderId;
}

void
GenerateUnitedNettingReportRequest::setBankOrderId(long  bankOrderId)
{
	this->bankOrderId = bankOrderId;
}

std::string
GenerateUnitedNettingReportRequest::getBankOrderDateTime()
{
	return bankOrderDateTime;
}

void
GenerateUnitedNettingReportRequest::setBankOrderDateTime(std::string  bankOrderDateTime)
{
	this->bankOrderDateTime = bankOrderDateTime;
}

std::list<PlacementType>
GenerateUnitedNettingReportRequest::getPlacementPrograms()
{
	return placementPrograms;
}

void
GenerateUnitedNettingReportRequest::setPlacementPrograms(std::list <PlacementType> placementPrograms)
{
	this->placementPrograms = placementPrograms;
}

std::list<std::string>
GenerateUnitedNettingReportRequest::getInns()
{
	return inns;
}

void
GenerateUnitedNettingReportRequest::setInns(std::list <std::string> inns)
{
	this->inns = inns;
}

std::list<long>
GenerateUnitedNettingReportRequest::getCampaignIds()
{
	return campaignIds;
}

void
GenerateUnitedNettingReportRequest::setCampaignIds(std::list <long> campaignIds)
{
	this->campaignIds = campaignIds;
}



