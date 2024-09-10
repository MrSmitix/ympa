

#include "GetPromoMechanicsInfoDTO.h"

using namespace Tiny;

GetPromoMechanicsInfoDTO::GetPromoMechanicsInfoDTO()
{
	type = MechanicsType();
	promocodeInfo = GetPromoPromocodeInfoDTO();
}

GetPromoMechanicsInfoDTO::GetPromoMechanicsInfoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPromoMechanicsInfoDTO::~GetPromoMechanicsInfoDTO()
{

}

void
GetPromoMechanicsInfoDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        MechanicsType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *promocodeInfoKey = "promocodeInfo";

    if(object.has_key(promocodeInfoKey))
    {
        bourne::json value = object[promocodeInfoKey];




        GetPromoPromocodeInfoDTO* obj = &promocodeInfo;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetPromoMechanicsInfoDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();






	object["promocodeInfo"] = getPromocodeInfo().toJson();


    return object;

}

MechanicsType
GetPromoMechanicsInfoDTO::getType()
{
	return type;
}

void
GetPromoMechanicsInfoDTO::setType(MechanicsType  type)
{
	this->type = type;
}

GetPromoPromocodeInfoDTO
GetPromoMechanicsInfoDTO::getPromocodeInfo()
{
	return promocodeInfo;
}

void
GetPromoMechanicsInfoDTO::setPromocodeInfo(GetPromoPromocodeInfoDTO  promocodeInfo)
{
	this->promocodeInfo = promocodeInfo;
}



