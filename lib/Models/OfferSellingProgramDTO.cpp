

#include "OfferSellingProgramDTO.h"

using namespace Tiny;

OfferSellingProgramDTO::OfferSellingProgramDTO()
{
	sellingProgram = SellingProgramType();
	status = OfferSellingProgramStatusType();
}

OfferSellingProgramDTO::OfferSellingProgramDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferSellingProgramDTO::~OfferSellingProgramDTO()
{

}

void
OfferSellingProgramDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *sellingProgramKey = "sellingProgram";

    if(object.has_key(sellingProgramKey))
    {
        bourne::json value = object[sellingProgramKey];




        SellingProgramType* obj = &sellingProgram;
		obj->fromJson(value.dump());

    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        OfferSellingProgramStatusType* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
OfferSellingProgramDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["sellingProgram"] = getSellingProgram().toJson();






	object["status"] = getStatus().toJson();


    return object;

}

SellingProgramType
OfferSellingProgramDTO::getSellingProgram()
{
	return sellingProgram;
}

void
OfferSellingProgramDTO::setSellingProgram(SellingProgramType  sellingProgram)
{
	this->sellingProgram = sellingProgram;
}

OfferSellingProgramStatusType
OfferSellingProgramDTO::getStatus()
{
	return status;
}

void
OfferSellingProgramDTO::setStatus(OfferSellingProgramStatusType  status)
{
	this->status = status;
}



