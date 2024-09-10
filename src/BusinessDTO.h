/*
 * BusinessDTO.h
 *
 * Информация о кабинете.
 */

#ifndef _BusinessDTO_H_
#define _BusinessDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о кабинете.
 *
 *  \ingroup Models
 *
 */

class BusinessDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	BusinessDTO();
	BusinessDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BusinessDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор кабинета.
	 */
	long long getId();

	/*! \brief Set Идентификатор кабинета.
	 */
	void setId(long long  id);
	/*! \brief Get Название бизнеса.
	 */
	std::string getName();

	/*! \brief Set Название бизнеса.
	 */
	void setName(std::string  name);

private:
	long long id;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BusinessDTO_H_ */
