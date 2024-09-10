

#include "OfferMappingEntriesDTO.h"

using namespace Tiny;

OfferMappingEntriesDTO::OfferMappingEntriesDTO()
{
	paging = ScrollingPagerDTO();
	offerMappingEntries = std::list<OfferMappingEntryDTO>();
}

OfferMappingEntriesDTO::OfferMappingEntriesDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferMappingEntriesDTO::~OfferMappingEntriesDTO()
{

}

void
OfferMappingEntriesDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pagingKey = "paging";

    if(object.has_key(pagingKey))
    {
        bourne::json value = object[pagingKey];




        ScrollingPagerDTO* obj = &paging;
		obj->fromJson(value.dump());

    }

    const char *offerMappingEntriesKey = "offerMappingEntries";

    if(object.has_key(offerMappingEntriesKey))
    {
        bourne::json value = object[offerMappingEntriesKey];


        std::list<OfferMappingEntryDTO> offerMappingEntries_list;
        OfferMappingEntryDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offerMappingEntries_list.push_back(element);
        }
        offerMappingEntries = offerMappingEntries_list;


    }


}

bourne::json
OfferMappingEntriesDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["paging"] = getPaging().toJson();




    std::list<OfferMappingEntryDTO> offerMappingEntries_list = getOfferMappingEntries();
    bourne::json offerMappingEntries_arr = bourne::json::array();

    for(auto& var : offerMappingEntries_list)
    {
        OfferMappingEntryDTO obj = var;
        offerMappingEntries_arr.append(obj.toJson());
    }
    object["offerMappingEntries"] = offerMappingEntries_arr;




    return object;

}

ScrollingPagerDTO
OfferMappingEntriesDTO::getPaging()
{
	return paging;
}

void
OfferMappingEntriesDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

std::list<OfferMappingEntryDTO>
OfferMappingEntriesDTO::getOfferMappingEntries()
{
	return offerMappingEntries;
}

void
OfferMappingEntriesDTO::setOfferMappingEntries(std::list <OfferMappingEntryDTO> offerMappingEntries)
{
	this->offerMappingEntries = offerMappingEntries;
}



