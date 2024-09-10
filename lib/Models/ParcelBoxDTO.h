
/*
 * ParcelBoxDTO.h
 *
 * Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 */

#ifndef TINY_CPP_CLIENT_ParcelBoxDTO_H_
#define TINY_CPP_CLIENT_ParcelBoxDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 *
 *  \ingroup Models
 *
 */

class ParcelBoxDTO{
public:

    /*! \brief Constructor.
	 */
    ParcelBoxDTO();
    ParcelBoxDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ParcelBoxDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
	 */
	long getId();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
	 */
	void setId(long  id);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
	 */
	std::string getFulfilmentId();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
	 */
	void setFulfilmentId(std::string  fulfilmentId);


    private:
    long id{};
    std::string fulfilmentId{};
};
}

#endif /* TINY_CPP_CLIENT_ParcelBoxDTO_H_ */
