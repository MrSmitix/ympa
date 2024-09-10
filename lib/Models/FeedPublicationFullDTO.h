
/*
 * FeedPublicationFullDTO.h
 *
 * Информация о последней публикации предложений из прайс-листа на Маркете. 
 */

#ifndef TINY_CPP_CLIENT_FeedPublicationFullDTO_H_
#define TINY_CPP_CLIENT_FeedPublicationFullDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о последней публикации предложений из прайс-листа на Маркете. 
 *
 *  \ingroup Models
 *
 */

class FeedPublicationFullDTO{
public:

    /*! \brief Constructor.
	 */
    FeedPublicationFullDTO();
    FeedPublicationFullDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedPublicationFullDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	std::string getFileTime();

	/*! \brief Set Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	void setFileTime(std::string  fileTime);
	/*! \brief Get Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	std::string getPublishedTime();

	/*! \brief Set Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	void setPublishedTime(std::string  publishedTime);


    private:
    std::string fileTime{};
    std::string publishedTime{};
};
}

#endif /* TINY_CPP_CLIENT_FeedPublicationFullDTO_H_ */
