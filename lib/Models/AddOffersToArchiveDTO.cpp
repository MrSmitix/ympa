

#include "AddOffersToArchiveDTO.h"

using namespace Tiny;

AddOffersToArchiveDTO::AddOffersToArchiveDTO()
{
	notArchivedOffers = std::list<AddOffersToArchiveErrorDTO>();
}

AddOffersToArchiveDTO::AddOffersToArchiveDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

AddOffersToArchiveDTO::~AddOffersToArchiveDTO()
{

}

void
AddOffersToArchiveDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *notArchivedOffersKey = "notArchivedOffers";

    if(object.has_key(notArchivedOffersKey))
    {
        bourne::json value = object[notArchivedOffersKey];


        std::list<AddOffersToArchiveErrorDTO> notArchivedOffers_list;
        AddOffersToArchiveErrorDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            notArchivedOffers_list.push_back(element);
        }
        notArchivedOffers = notArchivedOffers_list;


    }


}

bourne::json
AddOffersToArchiveDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AddOffersToArchiveErrorDTO> notArchivedOffers_list = getNotArchivedOffers();
    bourne::json notArchivedOffers_arr = bourne::json::array();

    for(auto& var : notArchivedOffers_list)
    {
        AddOffersToArchiveErrorDTO obj = var;
        notArchivedOffers_arr.append(obj.toJson());
    }
    object["notArchivedOffers"] = notArchivedOffers_arr;




    return object;

}

std::list<AddOffersToArchiveErrorDTO>
AddOffersToArchiveDTO::getNotArchivedOffers()
{
	return notArchivedOffers;
}

void
AddOffersToArchiveDTO::setNotArchivedOffers(std::list <AddOffersToArchiveErrorDTO> notArchivedOffers)
{
	this->notArchivedOffers = notArchivedOffers;
}



