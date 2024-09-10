/*
 * UnitDTO.h
 *
 * Единица измерения.
 */

#ifndef _UnitDTO_H_
#define _UnitDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Единица измерения.
 *
 *  \ingroup Models
 *
 */

class UnitDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UnitDTO();
	UnitDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UnitDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор единицы измерения.
	 */
	long long getId();

	/*! \brief Set Идентификатор единицы измерения.
	 */
	void setId(long long  id);
	/*! \brief Get Сокращенное название единицы измерения.
	 */
	std::string getName();

	/*! \brief Set Сокращенное название единицы измерения.
	 */
	void setName(std::string  name);
	/*! \brief Get Полное название единицы измерения.
	 */
	std::string getFullName();

	/*! \brief Set Полное название единицы измерения.
	 */
	void setFullName(std::string  fullName);

private:
	long long id;
	std::string name;
	std::string fullName;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UnitDTO_H_ */
