/*
 * ApiErrorDTO.h
 *
 * Общий формат ошибки.
 */

#ifndef _ApiErrorDTO_H_
#define _ApiErrorDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Общий формат ошибки.
 *
 *  \ingroup Models
 *
 */

class ApiErrorDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ApiErrorDTO();
	ApiErrorDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ApiErrorDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Код ошибки.
	 */
	std::string getCode();

	/*! \brief Set Код ошибки.
	 */
	void setCode(std::string  code);
	/*! \brief Get Описание ошибки.
	 */
	std::string getMessage();

	/*! \brief Set Описание ошибки.
	 */
	void setMessage(std::string  message);

private:
	std::string code;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ApiErrorDTO_H_ */
