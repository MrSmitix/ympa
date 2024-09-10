/*
 * PromoPeriodDTO.h
 *
 * Время проведения акции.
 */

#ifndef _PromoPeriodDTO_H_
#define _PromoPeriodDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Время проведения акции.
 *
 *  \ingroup Models
 *
 */

class PromoPeriodDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	PromoPeriodDTO();
	PromoPeriodDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PromoPeriodDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Дата и время начала акции.
	 */
	std::string getDateTimeFrom();

	/*! \brief Set Дата и время начала акции.
	 */
	void setDateTimeFrom(std::string  dateTimeFrom);
	/*! \brief Get Дата и время окончания акции.
	 */
	std::string getDateTimeTo();

	/*! \brief Set Дата и время окончания акции.
	 */
	void setDateTimeTo(std::string  dateTimeTo);

private:
	std::string dateTimeFrom;
	std::string dateTimeTo;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PromoPeriodDTO_H_ */
