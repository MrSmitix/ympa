/*
 * UpdateOutletLicenseRequest.h
 *
 * Запрос на создание или изменение лицензий для точек продаж.
 */

#ifndef _UpdateOutletLicenseRequest_H_
#define _UpdateOutletLicenseRequest_H_


#include <string>
#include "OutletLicenseDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос на создание или изменение лицензий для точек продаж.
 *
 *  \ingroup Models
 *
 */

class UpdateOutletLicenseRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOutletLicenseRequest();
	UpdateOutletLicenseRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOutletLicenseRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
	 */
	std::list<OutletLicenseDTO> getLicenses();

	/*! \brief Set Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
	 */
	void setLicenses(std::list <OutletLicenseDTO> licenses);

private:
	std::list <OutletLicenseDTO>licenses;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateOutletLicenseRequest_H_ */
