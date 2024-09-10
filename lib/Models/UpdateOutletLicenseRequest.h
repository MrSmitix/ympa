
/*
 * UpdateOutletLicenseRequest.h
 *
 * Запрос на создание или изменение лицензий для точек продаж.
 */

#ifndef TINY_CPP_CLIENT_UpdateOutletLicenseRequest_H_
#define TINY_CPP_CLIENT_UpdateOutletLicenseRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OutletLicenseDTO.h"
#include <list>

namespace Tiny {


/*! \brief Запрос на создание или изменение лицензий для точек продаж.
 *
 *  \ingroup Models
 *
 */

class UpdateOutletLicenseRequest{
public:

    /*! \brief Constructor.
	 */
    UpdateOutletLicenseRequest();
    UpdateOutletLicenseRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateOutletLicenseRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
	 */
	std::list<OutletLicenseDTO> getLicenses();

	/*! \brief Set Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
	 */
	void setLicenses(std::list <OutletLicenseDTO> licenses);


    private:
    std::list<OutletLicenseDTO> licenses;
};
}

#endif /* TINY_CPP_CLIENT_UpdateOutletLicenseRequest_H_ */
