/*
 * FeedbackFactorDTO.h
 *
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. 
 */

#ifndef _FeedbackFactorDTO_H_
#define _FeedbackFactorDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
 *
 *  \ingroup Models
 *
 */

class FeedbackFactorDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedbackFactorDTO();
	FeedbackFactorDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedbackFactorDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор параметра.
	 */
	long long getId();

	/*! \brief Set Идентификатор параметра.
	 */
	void setId(long long  id);
	/*! \brief Get Название параметра. Например, `Скорость обработки заказа`.
	 */
	std::string getTitle();

	/*! \brief Set Название параметра. Например, `Скорость обработки заказа`.
	 */
	void setTitle(std::string  title);
	/*! \brief Get Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
	 */
	std::string getDescription();

	/*! \brief Set Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
	 */
	void setDescription(std::string  description);
	/*! \brief Get Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). 
	 */
	int getValue();

	/*! \brief Set Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). 
	 */
	void setValue(int  value);

private:
	long long id;
	std::string title;
	std::string description;
	int value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedbackFactorDTO_H_ */
