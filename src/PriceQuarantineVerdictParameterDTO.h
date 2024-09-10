/*
 * PriceQuarantineVerdictParameterDTO.h
 *
 * Параметр карантина.
 */

#ifndef _PriceQuarantineVerdictParameterDTO_H_
#define _PriceQuarantineVerdictParameterDTO_H_


#include <string>
#include "PriceQuarantineVerdictParamNameType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Параметр карантина.
 *
 *  \ingroup Models
 *
 */

class PriceQuarantineVerdictParameterDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	PriceQuarantineVerdictParameterDTO();
	PriceQuarantineVerdictParameterDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PriceQuarantineVerdictParameterDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	PriceQuarantineVerdictParamNameType getName();

	/*! \brief Set 
	 */
	void setName(PriceQuarantineVerdictParamNameType  name);
	/*! \brief Get Значение параметра.
	 */
	std::string getValue();

	/*! \brief Set Значение параметра.
	 */
	void setValue(std::string  value);

private:
	PriceQuarantineVerdictParamNameType name;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PriceQuarantineVerdictParameterDTO_H_ */
