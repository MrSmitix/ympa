

#include "GeneratePricesReportRequest.h"

using namespace Tiny;

GeneratePricesReportRequest::GeneratePricesReportRequest()
{
	businessId = long(0);
	campaignId = long(0);
	categoryIds = std::list<long>();
	creationDateFrom = std::string();
	creationDateTo = std::string();
}

GeneratePricesReportRequest::GeneratePricesReportRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GeneratePricesReportRequest::~GeneratePricesReportRequest()
{

}

void
GeneratePricesReportRequest::fromJson(std::string jsonObj)
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

    const char *categoryIdsKey = "categoryIds";

    if(object.has_key(categoryIdsKey))
    {
        bourne::json value = object[categoryIdsKey];


        std::list<long> categoryIds_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            categoryIds_list.push_back(element);
        }
        categoryIds = categoryIds_list;


    }

    const char *creationDateFromKey = "creationDateFrom";

    if(object.has_key(creationDateFromKey))
    {
        bourne::json value = object[creationDateFromKey];




        Date* obj = &creationDateFrom;
		obj->fromJson(value.dump());

    }

    const char *creationDateToKey = "creationDateTo";

    if(object.has_key(creationDateToKey))
    {
        bourne::json value = object[creationDateToKey];




        Date* obj = &creationDateTo;
		obj->fromJson(value.dump());

    }


}

bourne::json
GeneratePricesReportRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["businessId"] = getBusinessId();






    object["campaignId"] = getCampaignId();





    std::list<long> categoryIds_list = getCategoryIds();
    bourne::json categoryIds_arr = bourne::json::array();

    for(auto& var : categoryIds_list)
    {
        categoryIds_arr.append(var);
    }
    object["categoryIds"] = categoryIds_arr;










	object["creationDateFrom"] = getCreationDateFrom().toJson();






	object["creationDateTo"] = getCreationDateTo().toJson();


    return object;

}

long
GeneratePricesReportRequest::getBusinessId()
{
	return businessId;
}

void
GeneratePricesReportRequest::setBusinessId(long  businessId)
{
	this->businessId = businessId;
}

long
GeneratePricesReportRequest::getCampaignId()
{
	return campaignId;
}

void
GeneratePricesReportRequest::setCampaignId(long  campaignId)
{
	this->campaignId = campaignId;
}

std::list<long>
GeneratePricesReportRequest::getCategoryIds()
{
	return categoryIds;
}

void
GeneratePricesReportRequest::setCategoryIds(std::list <long> categoryIds)
{
	this->categoryIds = categoryIds;
}

Date
GeneratePricesReportRequest::getCreationDateFrom()
{
	return creationDateFrom;
}

void
GeneratePricesReportRequest::setCreationDateFrom(Date  creationDateFrom)
{
	this->creationDateFrom = creationDateFrom;
}

Date
GeneratePricesReportRequest::getCreationDateTo()
{
	return creationDateTo;
}

void
GeneratePricesReportRequest::setCreationDateTo(Date  creationDateTo)
{
	this->creationDateTo = creationDateTo;
}



