

#include "CalculateTariffsParametersDTO.h"

using namespace Tiny;

CalculateTariffsParametersDTO::CalculateTariffsParametersDTO()
{
	campaignId = long(0);
	sellingProgram = SellingProgramType();
	frequency = PaymentFrequencyType();
}

CalculateTariffsParametersDTO::CalculateTariffsParametersDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CalculateTariffsParametersDTO::~CalculateTariffsParametersDTO()
{

}

void
CalculateTariffsParametersDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *campaignIdKey = "campaignId";

    if(object.has_key(campaignIdKey))
    {
        bourne::json value = object[campaignIdKey];



        jsonToValue(&campaignId, value, "long");


    }

    const char *sellingProgramKey = "sellingProgram";

    if(object.has_key(sellingProgramKey))
    {
        bourne::json value = object[sellingProgramKey];




        SellingProgramType* obj = &sellingProgram;
		obj->fromJson(value.dump());

    }

    const char *frequencyKey = "frequency";

    if(object.has_key(frequencyKey))
    {
        bourne::json value = object[frequencyKey];




        PaymentFrequencyType* obj = &frequency;
		obj->fromJson(value.dump());

    }


}

bourne::json
CalculateTariffsParametersDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["campaignId"] = getCampaignId();







	object["sellingProgram"] = getSellingProgram().toJson();






	object["frequency"] = getFrequency().toJson();


    return object;

}

long
CalculateTariffsParametersDTO::getCampaignId()
{
	return campaignId;
}

void
CalculateTariffsParametersDTO::setCampaignId(long  campaignId)
{
	this->campaignId = campaignId;
}

SellingProgramType
CalculateTariffsParametersDTO::getSellingProgram()
{
	return sellingProgram;
}

void
CalculateTariffsParametersDTO::setSellingProgram(SellingProgramType  sellingProgram)
{
	this->sellingProgram = sellingProgram;
}

PaymentFrequencyType
CalculateTariffsParametersDTO::getFrequency()
{
	return frequency;
}

void
CalculateTariffsParametersDTO::setFrequency(PaymentFrequencyType  frequency)
{
	this->frequency = frequency;
}



