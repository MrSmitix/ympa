/*
 * TariffParameterDTO.h
 *
 * Детали расчета конкретной услуги Маркета.
 */

#ifndef _TariffParameterDTO_H_
#define _TariffParameterDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Детали расчета конкретной услуги Маркета.
 *
 *  \ingroup Models
 *
 */

class TariffParameterDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	TariffParameterDTO();
	TariffParameterDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TariffParameterDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Название параметра.
	 */
	std::string getName();

	/*! \brief Set Название параметра.
	 */
	void setName(std::string  name);
	/*! \brief Get Значение параметра.
	 */
	std::string getValue();

	/*! \brief Set Значение параметра.
	 */
	void setValue(std::string  value);

private:
	std::string name;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TariffParameterDTO_H_ */
