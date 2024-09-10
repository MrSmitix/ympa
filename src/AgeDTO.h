/*
 * AgeDTO.h
 *
 * Возраст в заданных единицах измерения.
 */

#ifndef _AgeDTO_H_
#define _AgeDTO_H_


#include <string>
#include "AgeUnitType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Возраст в заданных единицах измерения.
 *
 *  \ingroup Models
 *
 */

class AgeDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	AgeDTO();
	AgeDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AgeDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Значение. 
	 */
	long long getValue();

	/*! \brief Set Значение. 
	 */
	void setValue(long long  value);
	/*! \brief Get 
	 */
	AgeUnitType getAgeUnit();

	/*! \brief Set 
	 */
	void setAgeUnit(AgeUnitType  ageUnit);

private:
	long long value;
	AgeUnitType ageUnit;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AgeDTO_H_ */
