

#include "GetOfferMappingsRequest.h"

using namespace Tiny;

GetOfferMappingsRequest::GetOfferMappingsRequest()
{
	offerIds = std::list<std::string>();
	cardStatuses = std::list<OfferCardStatusType>();
	categoryIds = std::list<int>();
	vendorNames = std::list<std::string>();
	tags = std::list<std::string>();
	archived = bool(false);
}

GetOfferMappingsRequest::GetOfferMappingsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOfferMappingsRequest::~GetOfferMappingsRequest()
{

}

void
GetOfferMappingsRequest::fromJson(std::string jsonObj)
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

    const char *cardStatusesKey = "cardStatuses";

    if(object.has_key(cardStatusesKey))
    {
        bourne::json value = object[cardStatusesKey];


        std::list<OfferCardStatusType> cardStatuses_list;
        OfferCardStatusType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            cardStatuses_list.push_back(element);
        }
        cardStatuses = cardStatuses_list;


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

    const char *archivedKey = "archived";

    if(object.has_key(archivedKey))
    {
        bourne::json value = object[archivedKey];



        jsonToValue(&archived, value, "bool");


    }


}

bourne::json
GetOfferMappingsRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> offerIds_list = getOfferIds();
    bourne::json offerIds_arr = bourne::json::array();

    for(auto& var : offerIds_list)
    {
        offerIds_arr.append(var);
    }
    object["offerIds"] = offerIds_arr;








    std::list<OfferCardStatusType> cardStatuses_list = getCardStatuses();
    bourne::json cardStatuses_arr = bourne::json::array();

    for(auto& var : cardStatuses_list)
    {
        OfferCardStatusType obj = var;
        cardStatuses_arr.append(obj.toJson());
    }
    object["cardStatuses"] = cardStatuses_arr;






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









    object["archived"] = isArchived();



    return object;

}

std::list<std::string>
GetOfferMappingsRequest::getOfferIds()
{
	return offerIds;
}

void
GetOfferMappingsRequest::setOfferIds(std::list <std::string> offerIds)
{
	this->offerIds = offerIds;
}

std::list<OfferCardStatusType>
GetOfferMappingsRequest::getCardStatuses()
{
	return cardStatuses;
}

void
GetOfferMappingsRequest::setCardStatuses(std::list <OfferCardStatusType> cardStatuses)
{
	this->cardStatuses = cardStatuses;
}

std::list<int>
GetOfferMappingsRequest::getCategoryIds()
{
	return categoryIds;
}

void
GetOfferMappingsRequest::setCategoryIds(std::list <int> categoryIds)
{
	this->categoryIds = categoryIds;
}

std::list<std::string>
GetOfferMappingsRequest::getVendorNames()
{
	return vendorNames;
}

void
GetOfferMappingsRequest::setVendorNames(std::list <std::string> vendorNames)
{
	this->vendorNames = vendorNames;
}

std::list<std::string>
GetOfferMappingsRequest::getTags()
{
	return tags;
}

void
GetOfferMappingsRequest::setTags(std::list <std::string> tags)
{
	this->tags = tags;
}

bool
GetOfferMappingsRequest::isArchived()
{
	return archived;
}

void
GetOfferMappingsRequest::setArchived(bool  archived)
{
	this->archived = archived;
}



