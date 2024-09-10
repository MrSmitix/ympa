

#include "GetOfferCardsContentStatusRequest.h"

using namespace Tiny;

GetOfferCardsContentStatusRequest::GetOfferCardsContentStatusRequest()
{
	offerIds = std::list<std::string>();
	cardStatuses = std::list<OfferCardStatusType>();
	categoryIds = std::list<int>();
}

GetOfferCardsContentStatusRequest::GetOfferCardsContentStatusRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOfferCardsContentStatusRequest::~GetOfferCardsContentStatusRequest()
{

}

void
GetOfferCardsContentStatusRequest::fromJson(std::string jsonObj)
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


}

bourne::json
GetOfferCardsContentStatusRequest::toJson()
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






    return object;

}

Set<std::string>
GetOfferCardsContentStatusRequest::getOfferIds()
{
	return offerIds;
}

void
GetOfferCardsContentStatusRequest::setOfferIds(Set <std::string> offerIds)
{
	this->offerIds = offerIds;
}

Set<OfferCardStatusType>
GetOfferCardsContentStatusRequest::getCardStatuses()
{
	return cardStatuses;
}

void
GetOfferCardsContentStatusRequest::setCardStatuses(Set <OfferCardStatusType> cardStatuses)
{
	this->cardStatuses = cardStatuses;
}

Set<int>
GetOfferCardsContentStatusRequest::getCategoryIds()
{
	return categoryIds;
}

void
GetOfferCardsContentStatusRequest::setCategoryIds(Set <int> categoryIds)
{
	this->categoryIds = categoryIds;
}



