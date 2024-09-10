
/*
 * OutletLicensesResponseDTO.h
 *
 * Ответ на запрос информации о лицензиях для точек продаж.
 */

#ifndef TINY_CPP_CLIENT_OutletLicensesResponseDTO_H_
#define TINY_CPP_CLIENT_OutletLicensesResponseDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FullOutletLicenseDTO.h"
#include <list>

namespace Tiny {


/*! \brief Ответ на запрос информации о лицензиях для точек продаж.
 *
 *  \ingroup Models
 *
 */

class OutletLicensesResponseDTO{
public:

    /*! \brief Constructor.
	 */
    OutletLicensesResponseDTO();
    OutletLicensesResponseDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OutletLicensesResponseDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список лицензий.
	 */
	std::list<FullOutletLicenseDTO> getLicenses();

	/*! \brief Set Список лицензий.
	 */
	void setLicenses(std::list <FullOutletLicenseDTO> licenses);


    private:
    std::list<FullOutletLicenseDTO> licenses;
};
}

#endif /* TINY_CPP_CLIENT_OutletLicensesResponseDTO_H_ */
