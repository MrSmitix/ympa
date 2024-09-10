/*
 * FeedParameterDTO.h
 *
 * Параметр прайс-листа.
 */

#ifndef _FeedParameterDTO_H_
#define _FeedParameterDTO_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Параметр прайс-листа.
 *
 *  \ingroup Models
 *
 */

class FeedParameterDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedParameterDTO();
	FeedParameterDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedParameterDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`. 
	 */
	bool getDeleted();

	/*! \brief Set Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`. 
	 */
	void setDeleted(bool  deleted);
	/*! \brief Get Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр. 
	 */
	std::string getName();

	/*! \brief Set Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр. 
	 */
	void setName(std::string  name);
	/*! \brief Get Значения параметра.  Используется вместе с параметром `name`. 
	 */
	std::list<int> getValues();

	/*! \brief Set Значения параметра.  Используется вместе с параметром `name`. 
	 */
	void setValues(std::list <int> values);

private:
	bool deleted;
	std::string name;
	std::list <int>values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedParameterDTO_H_ */
