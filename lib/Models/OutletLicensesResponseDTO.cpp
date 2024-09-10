

#include "OutletLicensesResponseDTO.h"

using namespace Tiny;

OutletLicensesResponseDTO::OutletLicensesResponseDTO()
{
	licenses = std::list<FullOutletLicenseDTO>();
}

OutletLicensesResponseDTO::OutletLicensesResponseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OutletLicensesResponseDTO::~OutletLicensesResponseDTO()
{

}

void
OutletLicensesResponseDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *licensesKey = "licenses";

    if(object.has_key(licensesKey))
    {
        bourne::json value = object[licensesKey];


        std::list<FullOutletLicenseDTO> licenses_list;
        FullOutletLicenseDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            licenses_list.push_back(element);
        }
        licenses = licenses_list;


    }


}

bourne::json
OutletLicensesResponseDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<FullOutletLicenseDTO> licenses_list = getLicenses();
    bourne::json licenses_arr = bourne::json::array();

    for(auto& var : licenses_list)
    {
        FullOutletLicenseDTO obj = var;
        licenses_arr.append(obj.toJson());
    }
    object["licenses"] = licenses_arr;




    return object;

}

std::list<FullOutletLicenseDTO>
OutletLicensesResponseDTO::getLicenses()
{
	return licenses;
}

void
OutletLicensesResponseDTO::setLicenses(std::list <FullOutletLicenseDTO> licenses)
{
	this->licenses = licenses;
}



