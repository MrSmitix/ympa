/*
 * OutletLicensesResponseDTO.h
 *
 * Ответ на запрос информации о лицензиях для точек продаж.
 */

#ifndef _OutletLicensesResponseDTO_H_
#define _OutletLicensesResponseDTO_H_


#include <string>
#include "FullOutletLicenseDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос информации о лицензиях для точек продаж.
 *
 *  \ingroup Models
 *
 */

class OutletLicensesResponseDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OutletLicensesResponseDTO();
	OutletLicensesResponseDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OutletLicensesResponseDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список лицензий.
	 */
	std::list<FullOutletLicenseDTO> getLicenses();

	/*! \brief Set Список лицензий.
	 */
	void setLicenses(std::list <FullOutletLicenseDTO> licenses);

private:
	std::list <FullOutletLicenseDTO>licenses;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OutletLicensesResponseDTO_H_ */
