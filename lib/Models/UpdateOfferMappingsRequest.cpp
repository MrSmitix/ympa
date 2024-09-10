

#include "UpdateOfferMappingsRequest.h"

using namespace Tiny;

UpdateOfferMappingsRequest::UpdateOfferMappingsRequest()
{
	offerMappings = std::list<UpdateOfferMappingDTO>();
	onlyPartnerMediaContent = bool(false);
}

UpdateOfferMappingsRequest::UpdateOfferMappingsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOfferMappingsRequest::~UpdateOfferMappingsRequest()
{

}

void
UpdateOfferMappingsRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerMappingsKey = "offerMappings";

    if(object.has_key(offerMappingsKey))
    {
        bourne::json value = object[offerMappingsKey];


        std::list<UpdateOfferMappingDTO> offerMappings_list;
        UpdateOfferMappingDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offerMappings_list.push_back(element);
        }
        offerMappings = offerMappings_list;


    }

    const char *onlyPartnerMediaContentKey = "onlyPartnerMediaContent";

    if(object.has_key(onlyPartnerMediaContentKey))
    {
        bourne::json value = object[onlyPartnerMediaContentKey];



        jsonToValue(&onlyPartnerMediaContent, value, "bool");


    }


}

bourne::json
UpdateOfferMappingsRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<UpdateOfferMappingDTO> offerMappings_list = getOfferMappings();
    bourne::json offerMappings_arr = bourne::json::array();

    for(auto& var : offerMappings_list)
    {
        UpdateOfferMappingDTO obj = var;
        offerMappings_arr.append(obj.toJson());
    }
    object["offerMappings"] = offerMappings_arr;







    object["onlyPartnerMediaContent"] = isOnlyPartnerMediaContent();



    return object;

}

std::list<UpdateOfferMappingDTO>
UpdateOfferMappingsRequest::getOfferMappings()
{
	return offerMappings;
}

void
UpdateOfferMappingsRequest::setOfferMappings(std::list <UpdateOfferMappingDTO> offerMappings)
{
	this->offerMappings = offerMappings;
}

bool
UpdateOfferMappingsRequest::isOnlyPartnerMediaContent()
{
	return onlyPartnerMediaContent;
}

void
UpdateOfferMappingsRequest::setOnlyPartnerMediaContent(bool  onlyPartnerMediaContent)
{
	this->onlyPartnerMediaContent = onlyPartnerMediaContent;
}



