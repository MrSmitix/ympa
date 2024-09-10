

#include "GenerateUnitedMarketplaceServicesReportRequest.h"

using namespace Tiny;

GenerateUnitedMarketplaceServicesReportRequest::GenerateUnitedMarketplaceServicesReportRequest()
{
	businessId = long(0);
	dateTimeFrom = std::string();
	dateTimeTo = std::string();
	dateFrom = std::string();
	dateTo = std::string();
	yearFrom = int(0);
	monthFrom = int(0);
	yearTo = int(0);
	monthTo = int(0);
	placementPrograms = std::list<PlacementType>();
	inns = std::list<std::string>();
	campaignIds = std::list<long>();
}

GenerateUnitedMarketplaceServicesReportRequest::GenerateUnitedMarketplaceServicesReportRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerateUnitedMarketplaceServicesReportRequest::~GenerateUnitedMarketplaceServicesReportRequest()
{

}

void
GenerateUnitedMarketplaceServicesReportRequest::fromJson(std::string jsonObj)
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

    const char *yearFromKey = "yearFrom";

    if(object.has_key(yearFromKey))
    {
        bourne::json value = object[yearFromKey];



        jsonToValue(&yearFrom, value, "int");


    }

    const char *monthFromKey = "monthFrom";

    if(object.has_key(monthFromKey))
    {
        bourne::json value = object[monthFromKey];



        jsonToValue(&monthFrom, value, "int");


    }

    const char *yearToKey = "yearTo";

    if(object.has_key(yearToKey))
    {
        bourne::json value = object[yearToKey];



        jsonToValue(&yearTo, value, "int");


    }

    const char *monthToKey = "monthTo";

    if(object.has_key(monthToKey))
    {
        bourne::json value = object[monthToKey];



        jsonToValue(&monthTo, value, "int");


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
GenerateUnitedMarketplaceServicesReportRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["businessId"] = getBusinessId();






    object["dateTimeFrom"] = getDateTimeFrom();






    object["dateTimeTo"] = getDateTimeTo();







	object["dateFrom"] = getDateFrom().toJson();






	object["dateTo"] = getDateTo().toJson();





    object["yearFrom"] = getYearFrom();






    object["monthFrom"] = getMonthFrom();






    object["yearTo"] = getYearTo();






    object["monthTo"] = getMonthTo();





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
GenerateUnitedMarketplaceServicesReportRequest::getBusinessId()
{
	return businessId;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setBusinessId(long  businessId)
{
	this->businessId = businessId;
}

std::string
GenerateUnitedMarketplaceServicesReportRequest::getDateTimeFrom()
{
	return dateTimeFrom;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setDateTimeFrom(std::string  dateTimeFrom)
{
	this->dateTimeFrom = dateTimeFrom;
}

std::string
GenerateUnitedMarketplaceServicesReportRequest::getDateTimeTo()
{
	return dateTimeTo;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setDateTimeTo(std::string  dateTimeTo)
{
	this->dateTimeTo = dateTimeTo;
}

Date
GenerateUnitedMarketplaceServicesReportRequest::getDateFrom()
{
	return dateFrom;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GenerateUnitedMarketplaceServicesReportRequest::getDateTo()
{
	return dateTo;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

int
GenerateUnitedMarketplaceServicesReportRequest::getYearFrom()
{
	return yearFrom;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setYearFrom(int  yearFrom)
{
	this->yearFrom = yearFrom;
}

int
GenerateUnitedMarketplaceServicesReportRequest::getMonthFrom()
{
	return monthFrom;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setMonthFrom(int  monthFrom)
{
	this->monthFrom = monthFrom;
}

int
GenerateUnitedMarketplaceServicesReportRequest::getYearTo()
{
	return yearTo;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setYearTo(int  yearTo)
{
	this->yearTo = yearTo;
}

int
GenerateUnitedMarketplaceServicesReportRequest::getMonthTo()
{
	return monthTo;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setMonthTo(int  monthTo)
{
	this->monthTo = monthTo;
}

std::list<PlacementType>
GenerateUnitedMarketplaceServicesReportRequest::getPlacementPrograms()
{
	return placementPrograms;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setPlacementPrograms(std::list <PlacementType> placementPrograms)
{
	this->placementPrograms = placementPrograms;
}

std::list<std::string>
GenerateUnitedMarketplaceServicesReportRequest::getInns()
{
	return inns;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setInns(std::list <std::string> inns)
{
	this->inns = inns;
}

std::list<long>
GenerateUnitedMarketplaceServicesReportRequest::getCampaignIds()
{
	return campaignIds;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setCampaignIds(std::list <long> campaignIds)
{
	this->campaignIds = campaignIds;
}



