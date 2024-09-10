

#include "UpdateOfferContentRequest.h"

using namespace Tiny;

UpdateOfferContentRequest::UpdateOfferContentRequest()
{
	offersContent = std::list<OfferContentDTO>();
}

UpdateOfferContentRequest::UpdateOfferContentRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOfferContentRequest::~UpdateOfferContentRequest()
{

}

void
UpdateOfferContentRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offersContentKey = "offersContent";

    if(object.has_key(offersContentKey))
    {
        bourne::json value = object[offersContentKey];


        std::list<OfferContentDTO> offersContent_list;
        OfferContentDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offersContent_list.push_back(element);
        }
        offersContent = offersContent_list;


    }


}

bourne::json
UpdateOfferContentRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OfferContentDTO> offersContent_list = getOffersContent();
    bourne::json offersContent_arr = bourne::json::array();

    for(auto& var : offersContent_list)
    {
        OfferContentDTO obj = var;
        offersContent_arr.append(obj.toJson());
    }
    object["offersContent"] = offersContent_arr;




    return object;

}

std::list<OfferContentDTO>
UpdateOfferContentRequest::getOffersContent()
{
	return offersContent;
}

void
UpdateOfferContentRequest::setOffersContent(std::list <OfferContentDTO> offersContent)
{
	this->offersContent = offersContent;
}



