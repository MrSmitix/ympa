/*
 * ParameterValueOptionDTO.h
 *
 * Значение характеристики.
 */

#ifndef _ParameterValueOptionDTO_H_
#define _ParameterValueOptionDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Значение характеристики.
 *
 *  \ingroup Models
 *
 */

class ParameterValueOptionDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ParameterValueOptionDTO();
	ParameterValueOptionDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ParameterValueOptionDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор значения.
	 */
	long long getId();

	/*! \brief Set Идентификатор значения.
	 */
	void setId(long long  id);
	/*! \brief Get Значение.
	 */
	std::string getValue();

	/*! \brief Set Значение.
	 */
	void setValue(std::string  value);
	/*! \brief Get Описание значения.
	 */
	std::string getDescription();

	/*! \brief Set Описание значения.
	 */
	void setDescription(std::string  description);

private:
	long long id;
	std::string value;
	std::string description;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ParameterValueOptionDTO_H_ */
