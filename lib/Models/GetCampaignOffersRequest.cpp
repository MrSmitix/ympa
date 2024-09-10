

#include "GetCampaignOffersRequest.h"

using namespace Tiny;

GetCampaignOffersRequest::GetCampaignOffersRequest()
{
	offerIds = std::list<std::string>();
	statuses = std::list<OfferCampaignStatusType>();
	categoryIds = std::list<int>();
	vendorNames = std::list<std::string>();
	tags = std::list<std::string>();
}

GetCampaignOffersRequest::GetCampaignOffersRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetCampaignOffersRequest::~GetCampaignOffersRequest()
{

}

void
GetCampaignOffersRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdsKey = "offerIds";

    if(object.has_key(offerIdsKey))
    {
        bourne::json value = object[offerIdsKey];


        std::list<std::string> offerIds_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            offerIds_list.push_back(element);
        }
        offerIds = offerIds_list;


    }

    const char *statusesKey = "statuses";

    if(object.has_key(statusesKey))
    {
        bourne::json value = object[statusesKey];


        std::list<OfferCampaignStatusType> statuses_list;
        OfferCampaignStatusType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            statuses_list.push_back(element);
        }
        statuses = statuses_list;


    }

    const char *categoryIdsKey = "categoryIds";

    if(object.has_key(categoryIdsKey))
    {
        bourne::json value = object[categoryIdsKey];


        std::list<int> categoryIds_list;
        int element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "int");


            categoryIds_list.push_back(element);
        }
        categoryIds = categoryIds_list;


    }

    const char *vendorNamesKey = "vendorNames";

    if(object.has_key(vendorNamesKey))
    {
        bourne::json value = object[vendorNamesKey];


        std::list<std::string> vendorNames_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            vendorNames_list.push_back(element);
        }
        vendorNames = vendorNames_list;


    }

    const char *tagsKey = "tags";

    if(object.has_key(tagsKey))
    {
        bourne::json value = object[tagsKey];


        std::list<std::string> tags_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            tags_list.push_back(element);
        }
        tags = tags_list;


    }


}

bourne::json
GetCampaignOffersRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> offerIds_list = getOfferIds();
    bourne::json offerIds_arr = bourne::json::array();

    for(auto& var : offerIds_list)
    {
        offerIds_arr.append(var);
    }
    object["offerIds"] = offerIds_arr;








    std::list<OfferCampaignStatusType> statuses_list = getStatuses();
    bourne::json statuses_arr = bourne::json::array();

    for(auto& var : statuses_list)
    {
        OfferCampaignStatusType obj = var;
        statuses_arr.append(obj.toJson());
    }
    object["statuses"] = statuses_arr;






    std::list<int> categoryIds_list = getCategoryIds();
    bourne::json categoryIds_arr = bourne::json::array();

    for(auto& var : categoryIds_list)
    {
        categoryIds_arr.append(var);
    }
    object["categoryIds"] = categoryIds_arr;








    std::list<std::string> vendorNames_list = getVendorNames();
    bourne::json vendorNames_arr = bourne::json::array();

    for(auto& var : vendorNames_list)
    {
        vendorNames_arr.append(var);
    }
    object["vendorNames"] = vendorNames_arr;








    std::list<std::string> tags_list = getTags();
    bourne::json tags_arr = bourne::json::array();

    for(auto& var : tags_list)
    {
        tags_arr.append(var);
    }
    object["tags"] = tags_arr;






    return object;

}

std::list<std::string>
GetCampaignOffersRequest::getOfferIds()
{
	return offerIds;
}

void
GetCampaignOffersRequest::setOfferIds(std::list <std::string> offerIds)
{
	this->offerIds = offerIds;
}

std::list<OfferCampaignStatusType>
GetCampaignOffersRequest::getStatuses()
{
	return statuses;
}

void
GetCampaignOffersRequest::setStatuses(std::list <OfferCampaignStatusType> statuses)
{
	this->statuses = statuses;
}

std::list<int>
GetCampaignOffersRequest::getCategoryIds()
{
	return categoryIds;
}

void
GetCampaignOffersRequest::setCategoryIds(std::list <int> categoryIds)
{
	this->categoryIds = categoryIds;
}

std::list<std::string>
GetCampaignOffersRequest::getVendorNames()
{
	return vendorNames;
}

void
GetCampaignOffersRequest::setVendorNames(std::list <std::string> vendorNames)
{
	this->vendorNames = vendorNames;
}

std::list<std::string>
GetCampaignOffersRequest::getTags()
{
	return tags;
}

void
GetCampaignOffersRequest::setTags(std::list <std::string> tags)
{
	this->tags = tags;
}



