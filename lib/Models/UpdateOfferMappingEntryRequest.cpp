

#include "UpdateOfferMappingEntryRequest.h"

using namespace Tiny;

UpdateOfferMappingEntryRequest::UpdateOfferMappingEntryRequest()
{
	offerMappingEntries = std::list<UpdateOfferMappingEntryDTO>();
}

UpdateOfferMappingEntryRequest::UpdateOfferMappingEntryRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOfferMappingEntryRequest::~UpdateOfferMappingEntryRequest()
{

}

void
UpdateOfferMappingEntryRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerMappingEntriesKey = "offerMappingEntries";

    if(object.has_key(offerMappingEntriesKey))
    {
        bourne::json value = object[offerMappingEntriesKey];


        std::list<UpdateOfferMappingEntryDTO> offerMappingEntries_list;
        UpdateOfferMappingEntryDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offerMappingEntries_list.push_back(element);
        }
        offerMappingEntries = offerMappingEntries_list;


    }


}

bourne::json
UpdateOfferMappingEntryRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<UpdateOfferMappingEntryDTO> offerMappingEntries_list = getOfferMappingEntries();
    bourne::json offerMappingEntries_arr = bourne::json::array();

    for(auto& var : offerMappingEntries_list)
    {
        UpdateOfferMappingEntryDTO obj = var;
        offerMappingEntries_arr.append(obj.toJson());
    }
    object["offerMappingEntries"] = offerMappingEntries_arr;




    return object;

}

std::list<UpdateOfferMappingEntryDTO>
UpdateOfferMappingEntryRequest::getOfferMappingEntries()
{
	return offerMappingEntries;
}

void
UpdateOfferMappingEntryRequest::setOfferMappingEntries(std::list <UpdateOfferMappingEntryDTO> offerMappingEntries)
{
	this->offerMappingEntries = offerMappingEntries;
}



