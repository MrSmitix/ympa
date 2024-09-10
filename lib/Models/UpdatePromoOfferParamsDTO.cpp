

#include "UpdatePromoOfferParamsDTO.h"

using namespace Tiny;

UpdatePromoOfferParamsDTO::UpdatePromoOfferParamsDTO()
{
	discountParams = UpdatePromoOfferDiscountParamsDTO();
}

UpdatePromoOfferParamsDTO::UpdatePromoOfferParamsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdatePromoOfferParamsDTO::~UpdatePromoOfferParamsDTO()
{

}

void
UpdatePromoOfferParamsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *discountParamsKey = "discountParams";

    if(object.has_key(discountParamsKey))
    {
        bourne::json value = object[discountParamsKey];




        UpdatePromoOfferDiscountParamsDTO* obj = &discountParams;
		obj->fromJson(value.dump());

    }


}

bourne::json
UpdatePromoOfferParamsDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["discountParams"] = getDiscountParams().toJson();


    return object;

}

UpdatePromoOfferDiscountParamsDTO
UpdatePromoOfferParamsDTO::getDiscountParams()
{
	return discountParams;
}

void
UpdatePromoOfferParamsDTO::setDiscountParams(UpdatePromoOfferDiscountParamsDTO  discountParams)
{
	this->discountParams = discountParams;
}



