
/*
 * FeedParameterDTO.h
 *
 * Параметр прайс-листа.
 */

#ifndef TINY_CPP_CLIENT_FeedParameterDTO_H_
#define TINY_CPP_CLIENT_FeedParameterDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Параметр прайс-листа.
 *
 *  \ingroup Models
 *
 */

class FeedParameterDTO{
public:

    /*! \brief Constructor.
	 */
    FeedParameterDTO();
    FeedParameterDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedParameterDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`. 
	 */
	bool isDeleted();

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
    bool deleted{};
    std::string name{};
    std::list<int> values;
};
}

#endif /* TINY_CPP_CLIENT_FeedParameterDTO_H_ */
