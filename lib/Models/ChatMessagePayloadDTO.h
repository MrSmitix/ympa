
/*
 * ChatMessagePayloadDTO.h
 *
 * Информация о приложенных к сообщению файлах.
 */

#ifndef TINY_CPP_CLIENT_ChatMessagePayloadDTO_H_
#define TINY_CPP_CLIENT_ChatMessagePayloadDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о приложенных к сообщению файлах.
 *
 *  \ingroup Models
 *
 */

class ChatMessagePayloadDTO{
public:

    /*! \brief Constructor.
	 */
    ChatMessagePayloadDTO();
    ChatMessagePayloadDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatMessagePayloadDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string name{};
    std::string url{};
    int size{};
};
}

#endif /* TINY_CPP_CLIENT_ChatMessagePayloadDTO_H_ */
