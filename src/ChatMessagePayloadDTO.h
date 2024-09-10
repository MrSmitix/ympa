/*
 * ChatMessagePayloadDTO.h
 *
 * Информация о приложенных к сообщению файлах.
 */

#ifndef _ChatMessagePayloadDTO_H_
#define _ChatMessagePayloadDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о приложенных к сообщению файлах.
 *
 *  \ingroup Models
 *
 */

class ChatMessagePayloadDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatMessagePayloadDTO();
	ChatMessagePayloadDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatMessagePayloadDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Имя файла.
	 */
	std::string getName();

	/*! \brief Set Имя файла.
	 */
	void setName(std::string  name);
	/*! \brief Get Ссылка для скачивания файла.
	 */
	std::string getUrl();

	/*! \brief Set Ссылка для скачивания файла.
	 */
	void setUrl(std::string  url);
	/*! \brief Get Размер файла в байтах.
	 */
	int getSize();

	/*! \brief Set Размер файла в байтах.
	 */
	void setSize(int  size);

private:
	std::string name;
	std::string url;
	int size;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatMessagePayloadDTO_H_ */
