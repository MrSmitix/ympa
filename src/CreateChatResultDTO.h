/*
 * CreateChatResultDTO.h
 *
 * Информация о созданном чате.
 */

#ifndef _CreateChatResultDTO_H_
#define _CreateChatResultDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о созданном чате.
 *
 *  \ingroup Models
 *
 */

class CreateChatResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateChatResultDTO();
	CreateChatResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateChatResultDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор чата.
	 */
	long long getChatId();

	/*! \brief Set Идентификатор чата.
	 */
	void setChatId(long long  chatId);

private:
	long long chatId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateChatResultDTO_H_ */
