/*
 * ParameterValueConstraintsDTO.h
 *
 * Ограничения на значения характеристик.
 */

#ifndef _ParameterValueConstraintsDTO_H_
#define _ParameterValueConstraintsDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ограничения на значения характеристик.
 *
 *  \ingroup Models
 *
 */

class ParameterValueConstraintsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ParameterValueConstraintsDTO();
	ParameterValueConstraintsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ParameterValueConstraintsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Минимальное число.
	 */
	double getMinValue();

	/*! \brief Set Минимальное число.
	 */
	void setMinValue(double  minValue);
	/*! \brief Get Максимальное число.
	 */
	double getMaxValue();

	/*! \brief Set Максимальное число.
	 */
	void setMaxValue(double  maxValue);
	/*! \brief Get Максимальная длина текста.
	 */
	int getMaxLength();

	/*! \brief Set Максимальная длина текста.
	 */
	void setMaxLength(int  maxLength);

private:
	double minValue;
	double maxValue;
	int maxLength;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ParameterValueConstraintsDTO_H_ */
