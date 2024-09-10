

#include "GetOutletResponse.h"

using namespace Tiny;

GetOutletResponse::GetOutletResponse()
{
	outlet = FullOutletDTO();
}

GetOutletResponse::GetOutletResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOutletResponse::~GetOutletResponse()
{

}

void
GetOutletResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *outletKey = "outlet";

    if(object.has_key(outletKey))
    {
        bourne::json value = object[outletKey];




        FullOutletDTO* obj = &outlet;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetOutletResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["outlet"] = getOutlet().toJson();


    return object;

}

FullOutletDTO
GetOutletResponse::getOutlet()
{
	return outlet;
}

void
GetOutletResponse::setOutlet(FullOutletDTO  outlet)
{
	this->outlet = outlet;
}



