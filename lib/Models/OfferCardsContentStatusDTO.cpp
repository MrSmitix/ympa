

#include "OfferCardsContentStatusDTO.h"

using namespace Tiny;

OfferCardsContentStatusDTO::OfferCardsContentStatusDTO()
{
	offerCards = std::list<OfferCardDTO>();
	paging = ForwardScrollingPagerDTO();
}

OfferCardsContentStatusDTO::OfferCardsContentStatusDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferCardsContentStatusDTO::~OfferCardsContentStatusDTO()
{

}

void
OfferCardsContentStatusDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerCardsKey = "offerCards";

    if(object.has_key(offerCardsKey))
    {
        bourne::json value = object[offerCardsKey];


        std::list<OfferCardDTO> offerCards_list;
        OfferCardDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offerCards_list.push_back(element);
        }
        offerCards = offerCards_list;


    }

    const char *pagingKey = "paging";

    if(object.has_key(pagingKey))
    {
        bourne::json value = object[pagingKey];




        ForwardScrollingPagerDTO* obj = &paging;
		obj->fromJson(value.dump());

    }


}

bourne::json
OfferCardsContentStatusDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OfferCardDTO> offerCards_list = getOfferCards();
    bourne::json offerCards_arr = bourne::json::array();

    for(auto& var : offerCards_list)
    {
        OfferCardDTO obj = var;
        offerCards_arr.append(obj.toJson());
    }
    object["offerCards"] = offerCards_arr;








	object["paging"] = getPaging().toJson();


    return object;

}

std::list<OfferCardDTO>
OfferCardsContentStatusDTO::getOfferCards()
{
	return offerCards;
}

void
OfferCardsContentStatusDTO::setOfferCards(std::list <OfferCardDTO> offerCards)
{
	this->offerCards = offerCards;
}

ForwardScrollingPagerDTO
OfferCardsContentStatusDTO::getPaging()
{
	return paging;
}

void
OfferCardsContentStatusDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}



