

#include "GetOfferRecommendationsRequest.h"

using namespace Tiny;

GetOfferRecommendationsRequest::GetOfferRecommendationsRequest()
{
	offerIds = std::list<std::string>();
	cofinancePriceFilter = FieldStateType();
	recommendedCofinancePriceFilter = FieldStateType();
	competitivenessFilter = PriceCompetitivenessType();
}

GetOfferRecommendationsRequest::GetOfferRecommendationsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOfferRecommendationsRequest::~GetOfferRecommendationsRequest()
{

}

void
GetOfferRecommendationsRequest::fromJson(std::string jsonObj)
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

    const char *cofinancePriceFilterKey = "cofinancePriceFilter";

    if(object.has_key(cofinancePriceFilterKey))
    {
        bourne::json value = object[cofinancePriceFilterKey];




        FieldStateType* obj = &cofinancePriceFilter;
		obj->fromJson(value.dump());

    }

    const char *recommendedCofinancePriceFilterKey = "recommendedCofinancePriceFilter";

    if(object.has_key(recommendedCofinancePriceFilterKey))
    {
        bourne::json value = object[recommendedCofinancePriceFilterKey];




        FieldStateType* obj = &recommendedCofinancePriceFilter;
		obj->fromJson(value.dump());

    }

    const char *competitivenessFilterKey = "competitivenessFilter";

    if(object.has_key(competitivenessFilterKey))
    {
        bourne::json value = object[competitivenessFilterKey];




        PriceCompetitivenessType* obj = &competitivenessFilter;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetOfferRecommendationsRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> offerIds_list = getOfferIds();
    bourne::json offerIds_arr = bourne::json::array();

    for(auto& var : offerIds_list)
    {
        offerIds_arr.append(var);
    }
    object["offerIds"] = offerIds_arr;










	object["cofinancePriceFilter"] = getCofinancePriceFilter().toJson();






	object["recommendedCofinancePriceFilter"] = getRecommendedCofinancePriceFilter().toJson();






	object["competitivenessFilter"] = getCompetitivenessFilter().toJson();


    return object;

}

std::list<std::string>
GetOfferRecommendationsRequest::getOfferIds()
{
	return offerIds;
}

void
GetOfferRecommendationsRequest::setOfferIds(std::list <std::string> offerIds)
{
	this->offerIds = offerIds;
}

FieldStateType
GetOfferRecommendationsRequest::getCofinancePriceFilter()
{
	return cofinancePriceFilter;
}

void
GetOfferRecommendationsRequest::setCofinancePriceFilter(FieldStateType  cofinancePriceFilter)
{
	this->cofinancePriceFilter = cofinancePriceFilter;
}

FieldStateType
GetOfferRecommendationsRequest::getRecommendedCofinancePriceFilter()
{
	return recommendedCofinancePriceFilter;
}

void
GetOfferRecommendationsRequest::setRecommendedCofinancePriceFilter(FieldStateType  recommendedCofinancePriceFilter)
{
	this->recommendedCofinancePriceFilter = recommendedCofinancePriceFilter;
}

PriceCompetitivenessType
GetOfferRecommendationsRequest::getCompetitivenessFilter()
{
	return competitivenessFilter;
}

void
GetOfferRecommendationsRequest::setCompetitivenessFilter(PriceCompetitivenessType  competitivenessFilter)
{
	this->competitivenessFilter = competitivenessFilter;
}



