

#include "GetOfferMappingsResultDTO.h"

using namespace Tiny;

GetOfferMappingsResultDTO::GetOfferMappingsResultDTO()
{
	paging = ScrollingPagerDTO();
	offerMappings = std::list<GetOfferMappingDTO>();
}

GetOfferMappingsResultDTO::GetOfferMappingsResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOfferMappingsResultDTO::~GetOfferMappingsResultDTO()
{

}

void
GetOfferMappingsResultDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pagingKey = "paging";

    if(object.has_key(pagingKey))
    {
        bourne::json value = object[pagingKey];




        ScrollingPagerDTO* obj = &paging;
		obj->fromJson(value.dump());

    }

    const char *offerMappingsKey = "offerMappings";

    if(object.has_key(offerMappingsKey))
    {
        bourne::json value = object[offerMappingsKey];


        std::list<GetOfferMappingDTO> offerMappings_list;
        GetOfferMappingDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offerMappings_list.push_back(element);
        }
        offerMappings = offerMappings_list;


    }


}

bourne::json
GetOfferMappingsResultDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["paging"] = getPaging().toJson();




    std::list<GetOfferMappingDTO> offerMappings_list = getOfferMappings();
    bourne::json offerMappings_arr = bourne::json::array();

    for(auto& var : offerMappings_list)
    {
        GetOfferMappingDTO obj = var;
        offerMappings_arr.append(obj.toJson());
    }
    object["offerMappings"] = offerMappings_arr;




    return object;

}

ScrollingPagerDTO
GetOfferMappingsResultDTO::getPaging()
{
	return paging;
}

void
GetOfferMappingsResultDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

std::list<GetOfferMappingDTO>
GetOfferMappingsResultDTO::getOfferMappings()
{
	return offerMappings;
}

void
GetOfferMappingsResultDTO::setOfferMappings(std::list <GetOfferMappingDTO> offerMappings)
{
	this->offerMappings = offerMappings;
}



