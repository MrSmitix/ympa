/*
 * ParcelBoxDTO.h
 *
 * Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 */

#ifndef _ParcelBoxDTO_H_
#define _ParcelBoxDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 *
 *  \ingroup Models
 *
 */

class ParcelBoxDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ParcelBoxDTO();
	ParcelBoxDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ParcelBoxDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
	 */
	long long getId();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
	 */
	void setId(long long  id);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
	 */
	std::string getFulfilmentId();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
	 */
	void setFulfilmentId(std::string  fulfilmentId);

private:
	long long id;
	std::string fulfilmentId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ParcelBoxDTO_H_ */
