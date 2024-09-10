/*
 * UpdateTimeDTO.h
 *
 * Время последнего обновления.
 */

#ifndef _UpdateTimeDTO_H_
#define _UpdateTimeDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Время последнего обновления.
 *
 *  \ingroup Models
 *
 */

class UpdateTimeDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateTimeDTO();
	UpdateTimeDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateTimeDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Время последнего обновления.
	 */
	std::string getUpdatedAt();

	/*! \brief Set Время последнего обновления.
	 */
	void setUpdatedAt(std::string  updatedAt);

private:
	std::string updatedAt;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateTimeDTO_H_ */
